package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers120903 {
	
	public static void solution(String[] s1, String[] s2) {
        int answer = 0;
        
        List<String> list = new ArrayList<>(Arrays.asList(s1));
        
        for(String str : s2) {
            if(list.contains(str))
                answer++;
        }
        System.out.println(answer);
    }

	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"}; 
		solution(s1, s2);
	}
}
