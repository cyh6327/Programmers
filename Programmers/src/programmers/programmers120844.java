package programmers;

import java.util.Arrays;

public class programmers120844 {

	public static void solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int temp = 0;
        if(direction.equals("right")) {
            temp = numbers[numbers.length-1];   //3
            answer[0] = temp;
            for(int i=1; i<=numbers.length-1; i++) {
                answer[i] = numbers[i-1];
            }
        } else {
            temp = numbers[0];
            answer[answer.length-1] = temp;
            for(int j=0; j<numbers.length-1; j++) {
                answer[j] = numbers[j+1];
            }
        }
        System.out.println(Arrays.toString(answer));
    }
	
	public static void main(String[] args) {
		int[] numbers = {1,2,3};
		solution(numbers, "right");
		
		int[] numbers2 = {4, 455, 6, 4, -1, 45, 6};
		solution(numbers2, "left");
	}
}
