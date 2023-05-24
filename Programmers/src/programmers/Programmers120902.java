package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Programmers120902 {
	
	public static void solution(String my_string) {
        List<String> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(my_string);
        while(st.hasMoreTokens()) { 
            list.add(st.nextToken());
        }
        
        int answer = Integer.parseInt(list.get(0));
        for(int i=0; i<list.size(); i++) {
             if(list.get(i).charAt(0) >= 48 && list.get(i).charAt(0) <= 57 && i!=0) {
                 if(list.get(i-1).equals("+"))
                     answer += Integer.parseInt(list.get(i));
                 else
                     answer -= Integer.parseInt(list.get(i));
            }
        }
        
        System.out.println(answer);
    }
	
	public static void main(String[] args) {
		solution("3 + 4");
		solution("1 + 2 + 3 - 1");
	}

}
