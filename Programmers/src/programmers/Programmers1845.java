package programmers;

import java.util.Arrays;

public class Programmers1845 {
    public static void main(String[] args) {
        int arr[] = {3,3,3,2,2,2};
        solution(arr);
    }

    public static void solution(int[] nums) {
        int answer = 0;

        int max = nums.length/2;
        int distinct = Arrays.stream(nums).distinct().toArray().length;

        if(distinct >= max) answer = max;
        else answer = distinct;

        System.out.println(answer);
    }
}
