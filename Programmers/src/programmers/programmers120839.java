package programmers;

import java.util.*;

public class programmers120839 {
	
	public static void solution(String rsp) {
        String answer = "";
        
        Map<Character, Integer> map = new HashMap<>();
        map.put('2',0);
        map.put('0',5);
        map.put('5',2);
        
        for(int i=0; i<rsp.length(); i++) {
            answer += map.get(rsp.charAt(i));
        }
        
        System.out.println(answer);
    }
	
	public static void main(String[] args) {
		solution("2");
		solution("205");
	}
}
