package programmers;

import java.util.Arrays;

public class programmers120833 {
	
	public static void solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[(num2-num1)+1];
        
        for(int i=0; i<(num2-num1)+1; i++) {
            answer[i] = numbers[num1+i];
        }
        System.out.println(Arrays.toString(answer));
    }
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		solution(arr, 1, 3);
		
		int[] arr2 = {1,3,5};
		solution(arr2, 1, 2);
	}

}
