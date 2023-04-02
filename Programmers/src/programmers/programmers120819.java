package programmers;

import java.util.Arrays;

public class programmers120819 {

	public static void solution(int money) {
        int[] answer = new int[2];
        answer[0] = money/5500;
        answer[1] = money - (5500*answer[0]);
        System.out.println(Arrays.toString(answer));
    }
	
	public static void main(String[] args) {
		solution(5500);
		solution(15000);
	}
}
