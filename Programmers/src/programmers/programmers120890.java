package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class programmers120890 {
	
	public static void solution(int[] array, int n) {
        
        int answer = 0;
        int min = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<array.length; i++) {
            map.put(array[i], Math.max(array[i], n)-Math.min(array[i], n));
        }
        
        min = Collections.min(map.values());
        
        Set<Entry<Integer, Integer>> entrySet = map.entrySet();
        
        for (Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() == min) {
                answer = entry.getKey();
                break;
            }
        }
        
        System.out.println(answer);
    }
	
	public static void main(String[] args) {
		int[] arr = {3, 10, 28};
		solution(arr, 20);
		
		int[] arr2 = {10, 11, 14, 12};
		solution(arr2, 13);
	}

}
