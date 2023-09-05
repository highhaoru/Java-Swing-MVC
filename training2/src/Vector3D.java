/**
 * This class represents a 3D vector with x, y, z as its coordinate.
 */
public class Vector3D {

    private double x, y, z;

    /**
     * Constructor taking values for x, y and z.
     *
     * @param x
     * @param y
     * @param z
     */
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // getter methods for x, y and z

    /**
     * Return the x coordinate.
     *
     * @return  the x coordinate
     */
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    // returns a String containing values of x, y and z formatted to 2 digits
    // after decimal point
    public String toString() {

        return String.format("(%.2f, %.2f, %.2f)", x, y, z);

    }



    // returns the magnitude of the vector
    public double getMagnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // returns a vector which is the normalized version of this vector
    public Vector3D normalize() {
        // finding magnitude
        double magnitude = getMagnitude();
        // if magnitude is 0, cannot be normalized, so throwing exception
        if (magnitude == 0) {
            throw new IllegalStateException();
        }
        // otherwise creating and returning a new vector, in which values of x,
        // y and z are divided by magnitude
        return new Vector3D(x / magnitude, y / magnitude, z / magnitude);
    }

    // returns a new vector which is the sum of this vector and other
    public Vector3D add(Vector3D other) {
        return new Vector3D(x + other.x, y + other.y, z + other.z);
    }

    // returns a new vector which is the product of this vector and a constant
    public Vector3D multiply(double constant) {
        return new Vector3D(x * constant, y * constant, z * constant);
    }

    // returns a double which is the dot product of this vector and other
    public double dotProduct(Vector3D other) {
        return x * other.x + y * other.y + z * other.z;
    }

    // returns the angle between this vector and other in DEGREES

    /**
     * Return the angle between this vector and the other vector.
     *
     * @param other the other vector to compare with
     * @return  the angle
     */
    public double angleBetween(Vector3D other) {
        // finding magnitudes of both vectors
        double mag1 = getMagnitude();
        double mag2 = other.getMagnitude();
        // if either value is 0, throwing IllegalStateException
        if (mag1 * mag2 == 0) {
            throw new IllegalStateException();
        }
        // using given equation, finding cosine of angle between vectors
        double cosTheta = dotProduct(other) / (mag1 * mag2);
        // finding angle from cosine
        double theta = Math.acos(cosTheta);
        // converting angle in radians into degrees and returning it
        return Math.toDegrees(theta);
    }

//    //main method for testing
//    public static void main(String[] args) {
//        //creating two vectors and testing different methods
//        Vector3D v1 = new Vector3D(5, 3, 4);
//        Vector3D v2 = new Vector3D(1, 6, 9);
//
//        System.out.println("v1: " + v1);
//        System.out.println("v1 normalized: " + v1.normalize());
//        System.out.println("v1 magnitude: " + v1.getMagnitude());
//        System.out.println("v1 multiply 5: " + v1.multiply(5));
//
//        System.out.println("v2: " + v2);
//        System.out.println("v2 normalized: " + v2.normalize());
//        System.out.println("v2 magnitude: " + v2.getMagnitude());
//        System.out.println("v2 multiply 5: " + v2.multiply(5));
//
//        System.out.println("v1 dotProduct v2: " + v1.dotProduct(v2));
//        System.out.println("v1 add v2: " + v1.add(v2));
//        System.out.println("angle between v1 and v2: " + v1.angleBetween(v2));
//    }

}
