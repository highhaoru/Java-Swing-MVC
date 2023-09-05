public class StartOrEnd {
    public static void main(String[] args) {
        String num1 = "22045612";
        String num2 = "21304578";
        boolean b = num1.startsWith("22");
        boolean b2 = num1.endsWith("78");
        boolean b3 = num2.startsWith("22");
        boolean b4 = num2.endsWith("78");
        System.out.println("字符串num1是以'22'开始的吗？"+ b);
        System.out.println("字符串num1是以'78'结束的吗？"+ b2);
        System.out.println("字符串num2是以'22'开始的吗？"+ b3);
        System.out.println("字符串num2是以'78'结束的吗？"+ b4);
    }
}
