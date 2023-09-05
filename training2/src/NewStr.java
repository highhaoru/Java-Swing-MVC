/*
replace()方法可实现将指定的字符或字符串替换成新的字符或字符串。
语法如下：
oldChar: 要替换的字符或字符串。
newChar: 用于替换原来字符串的内容。
replace()方法返回的结果是一个新的字符串。
如果字符串oldChar没有出现在该对象表达式中的字符串序列中，则将原字符串返回。
此功能会修改该程序中所有的相同字符。
*/
public class NewStr {
    public static void main(String[] args) {
        String str ="address";
        //字符串str中的字符“a”替换成“A”后返回的新字符串newstr
        String newstr = str.replace("a","A");
        System.out.println(newstr);
    }
}
