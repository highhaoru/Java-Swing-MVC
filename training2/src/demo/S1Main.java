package demo;

import java.util.Arrays;

public class S1Main {
    public static void main(String[] args) {

        Structure1 s = new Structure1();



        int[] input = {10, 5, 4, 7, 1, 100, 2};
        int target = 3;

        // Two sum





        int[] result = s.twoSum(input, target);
        System.out.println(Arrays.toString(result));


    }
}
