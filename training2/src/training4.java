/*Given an array nums.
We define a running sum of an array as
runningSum[i] = sum(nums[0]...nums[i]).
Return the running sum of nums.
*/

import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Scanner;

public class training4 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4};

        int[] result = new int[array.length];

        for(int i=0;i < array.length;i++) {

            int sum =0;
            for(int j=0; j<=i; j++){
                sum = sum + array[j];
            }
            result[i] = sum;
        }

        System.out.println(Arrays.toString(result));


//        int n,i,j,k,m,sum=0;
//        int result[] = new int[n]; //To store the result value
//
//        for(j=0;j<n;j++){
//            for(k=0;k<=j;k++){
//                sum = sum + arr[k];
//            }
//            result[j] = sum;
//            sum=0;
//        }
//        for(m=0;m<n;m++){
//            System.out.print(result[m] + " "); //To print the result array
//        }

    }
}

