/*
* The Fibonacci numbers commonly denoted F(n) form a sequence,
* called the Fibonacci sequence, such that each number is the
* sum of the two preceding ones, starting from 0 and 1. That is,
* F(0) = 0, F(1) = 1
* F(n) = F(n - 1) + F(n - 2), for n > 1.
* Given n, calculate F(n)*/

import java.util.Scanner;
public class Training3 {

    public static int fib(int n){
        int first = 0, second = 1, third = -1;
        if(n == 0){
            return first;
        }
        else if(n == 1){
            return second;
        }
        else{
            for(int i = 2;i<=n;i++){
                third = first + second;
                first = second;
                second = third;
            }
            return third;
        }
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.println("output:" + fib(n));
    }
}
