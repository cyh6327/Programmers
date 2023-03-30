package programmers;

import java.util.*;

public class programmers120821 {
	
    public static List<Integer> solution(int[] num_list) {
        Integer[] arr = Arrays.stream(num_list).boxed().toArray(Integer[]::new);
        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);
        return list;
    }
    
    public static void main(String[] args) {
    	int[] arr = {1, 2, 3, 4, 5};
		System.out.println(solution(arr));
		
		int[] arr2 = {1, 1, 1, 1, 1, 2};
		System.out.println(solution(arr2));
		
		int[] arr3 = {1, 0, 1, 1, 1, 3, 5};
		System.out.println(solution(arr3));
	}

}
