/*
 * The Fibonacci numbers commonly denoted F(n) form a sequence,
 * called the Fibonacci sequence, such that each number is the
 * sum of the two preceding ones, starting from 0 and 1. That is,
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n)*/

import java.util.Scanner;
public class training3redo {

    // 0 1 1 2 3 5 8 13 21 34 55
    public static int fib(int n) {  // n=10

        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }

        int num = fib(n-1) + fib(n-2);  // fib(9) + fib(8)
        return num;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.println("output:" + fib(n));
    }
}

