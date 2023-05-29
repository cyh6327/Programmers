package programmers;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Programmers120907 {
	
	public static void solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int i = 0;
        int sum = 0;
        
        for(String str : quiz) {
            StringTokenizer st = new StringTokenizer(str);
            int num1 = Integer.parseInt(st.nextToken());
            String sign = st.nextToken();
            int num2 = Integer.parseInt(st.nextToken());
            String equal = st.nextToken();
            int result = Integer.parseInt(st.nextToken());
            
            if(sign.equals("+"))
                sum = num1 + num2;
            else
                sum = num1 - num2;
            
            if(sum == result)
                answer[i] = "O";
            else
                answer[i] = "X";
            
            i++;
        }
        
        System.out.println(Arrays.toString(answer));
    }
	
	public static void main(String[] args) {
		String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
		solution(quiz);
		
		String[] quiz2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
		solution(quiz2);
	}

}
