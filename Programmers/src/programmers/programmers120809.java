package programmers;

import java.util.Arrays;

public class programmers120809 {
	
    public static void solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        
        System.out.println(Arrays.toString(answer));
    }
    
    public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		solution(arr);
		
		int[] arr2 = {1, 2, 100, -99, 1, 2, 3};
		solution(arr2);
	}

}
