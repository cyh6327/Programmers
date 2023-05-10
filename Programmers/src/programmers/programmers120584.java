package programmers;

import java.util.Arrays;

public class programmers120584 {

	public static void solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int i = 0;
        
        for(String str : strlist) {
            answer[i] = str.length();
            i++;
        }
        
        System.out.println(Arrays.toString(answer));
    }
	
	public static void main(String[] args) {
		String[] arr = {"We", "are", "the", "world!"};
		solution(arr);
		
		String[] arr2 = {"I", "Love", "Programmers."};
		solution(arr2);
	}
}
