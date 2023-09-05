//trim()方法返回字符串的副本，忽略前导空格和尾部空格。
public class Blak {
    public static void main(String[] args) {
        String str = "   Java   class   ";
        System.out.println("字符串原来的长度：" + str.length());
        //将str去掉前导和尾部的孔个厚的结果输出
        System.out.println("去掉空格后的长度：" + str.trim().length());
    }
}
