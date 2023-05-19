package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers120897 {
	
	public static void solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=1; i<=n; i++) {
            if(list.contains(i))
                break;
            if(n%i == 0) {
                list.add(i);
                if(i!=n/i)
                	list.add(n/i);
            }
        }
        Collections.sort(list);
        
        System.out.println(list);
    }
	
	public static void main(String[] args) {
		solution(24);
		solution(29);
		solution(100);
	}

}
