package programmers;

import java.lang.Math;
import java.util.Arrays;

public class programmers120813 {
	
    public static void solution(int n) {
        int[] answer = new int[(int)Math.round(n/2.0)];
        int j = 1;
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = j;
            j += 2;
        }
        
        System.out.println(Arrays.toString(answer));
    }

    public static void main(String[] args) {
		solution(10);
		solution(15);
	}
}
