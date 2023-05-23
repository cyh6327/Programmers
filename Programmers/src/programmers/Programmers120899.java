package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Programmers120899 {
	
	public static void solution(int[] array) {
        int[] answer = new int[2];
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        
        answer[0] = Collections.max(list);
        answer[1] = list.indexOf(answer[0]);
        
        System.out.println(Arrays.toString(answer));
    }
	
	public static void main(String[] args) {
		int[] arr = {1,8,3};
		solution(arr);
		
		int[] arr2 = {9, 10, 11, 8};
		solution(arr2);
	}

}
