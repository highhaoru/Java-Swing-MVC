public class Division {
    public static void main(String[] args) {
        String str = "192.168.0.1";
        //按照“.”进行分割，使用转义字符“\\.”
        String[]firstArray = str.split("\\.");
        String[]secondArray = str.split("\\.",2);
        System.out.println("str的原值为：["+str+"]");
        System.out.print("全部分割的结果：");
        for(String a:firstArray){
            System.out.print("["+a+"]");
        }
        System.out.println();//换行
        //输出分割两次的结果
        System.out.print("分割两次的结果：");
        for(String a:secondArray){
            System.out.print("["+a+"]");
        } System.out.println();
    }
}
