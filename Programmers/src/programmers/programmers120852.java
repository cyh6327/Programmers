package programmers;

import java.util.*;
import java.util.stream.*;

public class programmers120852 {

	public static void solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        int k = 2;
        
        while (n != 1) {
			if(n%k==0) {
				n /= k;
				list.add(k);
			} else {
				k++;
			}
		}
        
        Set<Integer> set  = list.stream()
            .collect(Collectors.toCollection(TreeSet::new));
            
        System.out.println(set);
    }
	
	public static void main(String[] args) {
		solution(12);
		solution(17);
		solution(420);
	}
	
}
