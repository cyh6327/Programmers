package programmers;

import java.util.Map;
import java.util.TreeMap;

public class Programmers120896 {
	
	public static void solution(String s) {
        String answer = "";
        
        Map<Character, Integer> map = new TreeMap<>();
        for(int i=0; i<s.length(); i++) {
            int cnt = map.getOrDefault(s.charAt(i), 1);
            if(map.containsKey(s.charAt(i)))
                cnt++;
            map.put(s.charAt(i), cnt);
        }
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1))
                answer += entry.getKey();
        }
        
        System.out.println(answer);
    }

	public static void main(String[] args) {
		solution("abcabcadc");
		solution("abdc");
		solution("hello");
	}
	
}
