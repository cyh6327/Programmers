package programmers;

import java.util.*;

public class programmers120889 {
	
    public static void solution(int[] sides) {
        int answer = 0;
        int max = 0;
        
        Integer[] arr = Arrays.stream(sides).boxed().toArray(Integer[]::new);
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
        max = Collections.max(list);
        list.remove(Integer.valueOf(max));
        
        if(list.get(0)+list.get(1) > max) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        System.out.println(answer);
    }
    
    public static void main(String[] args) {
    	int[] arr = {1,2,3};
		solution(arr);
		
		int[] arr2 = {3,6,2};
		solution(arr2);
		
		int[] arr3 = {199,72,222};
		solution(arr3);
	}

}
