import java.security.NoSuchAlgorithmException;
import java.util.NoSuchElementException;

/**
 * Rectangle Java class
 */
public class Rectangle {

    //Private member instances to store input values
    private int x;
    private int y;
     int height;
     int width;



    /**
     * Constructor
     * Creates a rectangle using the x, y coordinates of its lower left corner, its width and its height
     */
    public Rectangle(int x, int y, int height, int width) {
//Creating a rectangle with non-positive width or height should not be allowed
        if (height < 0) {
            throw new IllegalArgumentException("Height must be positive.");
        }
        if (width < 0) {
            throw new IllegalArgumentException("Width must be positive.");
        }

//although x and y are allowed to be negative.
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    /**
     * Method: overlap(Rectangle other).
     * Returns true if this rectangle overlaps with other, false otherwise.
     * Rectangles that touch each other are not considered to be overlappingg.
     */
    public boolean overlap(Rectangle other) {
        return (x < other.x + other.width && y < other.y + other.height && //fully overlap
                x + width > other.x && y + height > other.y );//partial overlap
    }

    /**
     * Method intersect(Rectangle other).
     * Returns a Rectangle object that represents the overlap of the two rectangles.
     * throws a NoSuchElementException with a helpful message, If no intersection exists.
     */
    public Rectangle intersect(Rectangle other) {
//Return type object rectangle
        Rectangle rectangle = null;

        /**
         * say (x1, y1), (x2, y2) are bottom-left and bottom-right corners of Rect1 respectively,
         * (x3, y3), (x4, y4) are those of Rect2.
         *
         * find the larger one of x1, x3 and the smaller one of x2, x4, say xL, xR respectively
         * if xL >= xR, then return no intersection else
         *
         * find the larger one of y1, y3 and the smaller one of y2, y4, say yT, yB respectively
         * if yT >= yB, then return no intersection else
         *
         * return (xL, yB, xR-xL, yB-yT).
         * */

//finding new coordinates
        int x2 = this.x + this.width;
        int x4 = other.x + other.width;
        int y1 = this.y - this.height;
        int y3 = other.y - other.height;

        try {
//find intersection:
            int xLeft = Math.max(this.x, other.x);//(x1,x3)变量
            int xRight = Math.min(x2, x4);
            if (xRight <= xLeft)
                throw new NoSuchElementException("No Rectangle intersect.");
            else {
                int yTop = Math.max(y1, y3);
                int yBottom = Math.min(this.y, other.y);//(y2,y4)
                if (yBottom <= yTop)
                    throw new NoSuchElementException("No Rectangle intersect.");
                else
                    rectangle = new Rectangle(xLeft, yBottom, xRight - xLeft, yBottom - yTop);
            }
        } catch (NoSuchElementException ex) {
//Throw the exception
            throw ex;
        }
        return rectangle;
    }

    /**
     * Method union(Rectangle other).
     * Returns a Rectangle object that represents the union of this rectangle and the other rectangle.
     * The union is the smallest rectangle that contains both rectangles.
     * Note that unlike the intersection, the union always exists.
     */
    public Rectangle union(Rectangle other) {
//find x point minimum
        int Xminimum = Math.min(this.x, other.x);
//find y point minimum
        int Yminimum = Math.min(this.y, other.y);
//find x point maximum
        int Xmaximum = Math.max((this.x + this.height), (other.x + other.height));
//find y point maximum
        int Ymaximum = Math.max((this.y + this.width), (other.y + other.width));
        int newHeight = Xmaximum - Xminimum;
        int newWidth = Ymaximum - Yminimum;
//Draw new rectangle with calculated points
        return new Rectangle(Xminimum, Yminimum, newHeight, newWidth);
    }


    /**
     * Method: toString() - override
     * Returns a String.
     * The string should be formatted exactly as: “x:2, y:3, w:4, h:5”
     */
    @Override
    public String toString() {
        return "x:" + this.x + ", y:" + y + ", w: " + width + ", h: " + height;
    }


    public static void main(String[] args) {
//rectangle1
        Rectangle rectangle1 = new Rectangle(100, 150, 100, 200);
//Print rectangle1
        System.out.println("Rectangle1 :");
        System.out.println(rectangle1);

//rectangle2
        Rectangle rectangle2 = new Rectangle(100, 150, 100, 200);
//Print rectangle2
        System.out.println("Rectangle2 :");
        System.out.println(rectangle2);

//Check overlapping
        if (rectangle1.overlap(rectangle2)) {
            System.out.println("There is overlapping");
        } else {
            System.out.println("There is no overlapping");
        }

//check Intersect
        try {
            System.out.println("Intersect: " + rectangle1.intersect(rectangle2));
        } catch (Exception e) {
            System.out.println("Intersect: " + e.getMessage());
        }

//Get Union
        System.out.println("Union: " + rectangle1.union(rectangle2));



    }
}