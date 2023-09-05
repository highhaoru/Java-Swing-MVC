//substring(int beginIndex, int endIndex)
//beginIndex: 开始截取子字符串的索引位置。
//endIndex: 子字符串在整个字符串中的结束位置。
public class Subs {
    public static void main(String[] args) {
        String str ="hello word";
        String substr = str.substring(0,3);
        System.out.println(substr);
    }
}
