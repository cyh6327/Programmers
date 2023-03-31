package programmers;

import java.util.*;

public class programmers120811 {
	
    public static void solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array);
        answer = array[array.length/2];
            
        System.out.println(answer);
    }
    
    public static void main(String[] args) {
    	int[] arr = {1, 2, 7, 10, 11};
		solution(arr);
		
		int[] arr2 = {9, -1, 0};
		solution(arr2);
	}

}
