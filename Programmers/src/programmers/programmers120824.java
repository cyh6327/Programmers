package programmers;

import java.util.Arrays;

public class programmers120824 {
	
	public static void solution(int[] num_list) {
        int[] answer = new int[2];
        int eCnt = 0;   //짝수 개수
        int oCnt = 0;   //홀수 개수
        
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i]%2 == 0) {
                eCnt += 1;
            } else {
                oCnt += 1;
            }
        }
        
        answer[0] = eCnt;
        answer[1] = oCnt;
        
        System.out.println(Arrays.toString(answer));
    }
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		solution(arr);
		int[] arr2 = {1,3,5,7};
		solution(arr2);
	}

}
