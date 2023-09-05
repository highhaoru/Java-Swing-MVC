public class Getterm {//创建住类
    public static void main(String[] args) {//主方法
        int x=20;//声明int型局部变量
        if(x>30){//判断变量x是否大于30
            System.out.println("a的值大于30");
        }else if(x>10){
            System.out.println("a的值大于10，但小于30");
        }else if(x>0){
            System.out.println("a的值大于0，但小于10");
        }else{
            System.out.println("a的值小于0");
        }

    }
}
