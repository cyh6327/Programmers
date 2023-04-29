package programmers;

import java.util.*;

public class programmers120850 {
	
	public static void solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++) {
            if(my_string.charAt(i) - '0' <= 9) {
                answer.add(my_string.charAt(i) - '0');
            }
        }
        
        Collections.sort(answer);
        
        System.out.println(answer);
    }

	public static void main(String[] args) {
		solution("hi12392");
		solution("p2o4i8gj2");
		solution("abcde0");
	}
}
