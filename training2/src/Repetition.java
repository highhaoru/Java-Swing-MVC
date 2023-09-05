import java.util.Arrays;

public class Repetition {
    public static void main(String[] args) {
        int arr[]={7, 10,1};
        System.out.println("一堆数组中的元素分别为："+ Arrays.toString(arr));
        for(int x :arr){
            //foreach语句，int x引用的变量，arr指定要循环遍历的数组，最后将x输出
            System.out.println(x);
        }
    }
}
