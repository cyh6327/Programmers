package programmers;

import java.lang.*;

public class programmers120822 {
	
	public static void solution(String my_string) {
        String answer = "";
        StringBuffer sb = new StringBuffer(my_string);
        answer = sb.reverse() + "";
        System.out.println(answer);
    }
	
	public static void main(String[] args) {
		solution("jaron");
		solution("bread");
	}

}
