package programmers;

import java.util.*;

public class programmers120888 {
	
	public static void solution(String my_string) {
	        
	        String answer = "";
		    Set<Character> set = new LinkedHashSet<Character>();
	        
	        for(int i=0; i<my_string.length(); i++) {
	            set.add(my_string.charAt(i));
	        }
	        
	        for(Character c : set) {
	            answer += c;
	        }
	        
	        System.out.println(answer);
	        
	    }
	
	public static void main(String[] args) {
		solution("people");
		solution("We are the world"	);
	}

}
