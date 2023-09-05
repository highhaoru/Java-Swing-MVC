import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner inn=new Scanner(System.in);
        System.out.println("请输入三角形的第一条边长a为:");

        int a=inn.nextInt();
        System.out.println("请输入三角形的第一条边长b为:");

        int b=inn.nextInt();
        System.out.println("请输入三角形的第一条边长c为:");

        int c=inn.nextInt();
            if((a+b>c) && (b+c>a) && (a+c>b)) {
                if(a==b && a==c) {
                System.out.println("可以构成一个等边三角形！");
            }else if((a==b) || (a==c) || (b==c)) {
                System.out.println("可以构成一个等腰三角形！");
            }else if((a*a+b*b==c*c) || (b*b+c*c==a*a) || (a*a+c*c==b*b)) {
                System.out.println("可以构成一个直角三角形！");
            }else {
                System.out.println("可以构成一个普通三角形！");
            }

            }else {
                System.out.println("对不起，您输入的边长不能构成三角形！");
                    }
            }

}
