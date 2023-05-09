package programmers;

import java.util.*;

public class programmers120853 {
	
	public static void solution(String s) {
        int answer = 0;
		int prevToken = 0;
		
		StringTokenizer st = new StringTokenizer(s);
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			if(!token.equals("Z")) {
				prevToken = Integer.parseInt(token);
				answer += prevToken;
			} else {
				answer -= prevToken;
			}
		}
        System.out.println(answer);
    }
	
	public static void main(String[] args) {
		solution("1 2 Z 3");
		solution("10 20 30 40");
		solution("10 Z 20 Z 1");
	}

}
