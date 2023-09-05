/*
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed
32-bit integer range [-231, 231 - 1], then return 0.

in java and explain each line
*/

import java.util.Scanner;

public class Training2 {
    //this function returns reverse of the integer
    public static  Integer reverse(Integer num ) {


        String numInStr = Integer.toString(num);//convert number into string

        // 类型存储上下限有关，哪个-1是和计算机编码还有符号有关
        long min = - (long)Math.pow(2,31);//minimum value of an integer

        long max = (long)Math.pow(2,31) - 1;//maximum value of integer

        int isNegative = 0;//if entered number is negative then value of isNegative = 1如果不写这一步对整个程序有什么影响吗

        if(numInStr.charAt(0) == '-')//if entered number is negative
        {
            isNegative = 1;
            numInStr = numInStr.substring(1);//remove '-' sign from string [number in string form]
        }
//从int到if这段意思就是保持int的值永远为正数？

        String revNumInStr = "";//this will store the reversed number in string format

        // 数组和String第一位都是从0开始。所以要-1
        for(int i=numInStr.length()-1; i >= 0; i--)//iterate the number(string format) in reversed manner
        {
            // 123
            // 321
            revNumInStr += numInStr.charAt(i);//add each character in the reversed number(string)
        }
//这里不是很懂，for这行里的功能是直接把输入数字给reverse吗？for循环里的又是干嘛的？


        long reversedNum =  Long.parseLong(revNumInStr); //convert reversed number into Long format (Long format can store values larger than Integer)

        if(isNegative == 1)//if entered number is negative then reverse of it will also be negative
        {
            reversedNum = -reversedNum;
        }

        if (reversedNum > max || reversedNum < min )//check if reversed number is in range of Integer or not
        {
            return 0;//if reversed number is not in Integer range
        }

        else
        {
            return (int)reversedNum;//if number is in integer range return the reversed number
        }

    }


    public int reverseRedo(int num) {

        // 321
        // 123

        // Loop
        // 321 % 10 = 1 2 3
        // 321 / 10 = 32
        // result * 10 + 1 2 3

        // 321 -> 0

        int result = 0;
        boolean isNegative = num < 0;

        // 移除负号
        if(isNegative) {
            num *= -1;
        }
        while(num != 0) {
            int remainder = num % 10;
            result = result * 10 + remainder;
            num /= 10;
        }
        // 添加负号
        if(isNegative) {
            result *= -1;
        }

        return result;
    }

    //driver function to check all other function
    public static void main(String[] args)
    {
        int num = -567;
        int reversedNum = reverse(num);

        System.out.println("Reverse of entered number is: ");

        System.out.println(reversedNum);
    }
}
