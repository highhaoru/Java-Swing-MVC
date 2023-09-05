public class Matrix {
    public static void main(String[] args) {
        int a[][]=new int[3][4];//定义二维数组
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0; j < a[i].length;j++){//循环遍历数组中的每个元素
                System.out.println(a[i][j]);//将数组中的元素输出
            }
        }
        System.out.println();
    }
}
