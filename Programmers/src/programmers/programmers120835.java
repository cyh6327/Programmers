package programmers;

import java.util.*;

public class programmers120835 {
	
	public static void solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        int[] copy = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(copy);
        
        int i = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int p : copy) {
            map.put(p, copy.length - i);
            i++;
        }
        
        for(int j=0; j<map.size(); j++) {
            answer[j] = map.get(emergency[j]);
        }
        
        System.out.println(Arrays.toString(answer));
    }
	
	public static void main(String[] args) {
		int[] arr = {3, 76, 24};
		solution(arr);
		
		int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
		solution(arr2);
		
		int[] arr3 = {30, 10, 23, 6, 100};
		solution(arr3);
	}

}
