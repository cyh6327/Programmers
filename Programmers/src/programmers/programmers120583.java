package programmers;

import java.util.*;

public class programmers120583 {
	
	public static void solution(int[] array, int n) {
        int answer = 0;
        
        Integer[] arr = Arrays.stream(array).boxed().toArray(Integer[]::new);
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        
        answer = Collections.frequency(list, n);
        
        System.out.println(answer);
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 3, 4, 5};
		solution(arr, 1);
		
		int[] arr2 = {0, 2, 3, 4};
		solution(arr2, 1);
	}

}
