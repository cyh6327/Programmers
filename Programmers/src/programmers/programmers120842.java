package programmers;

import java.util.Arrays;

public class programmers120842 {
	
	public static void solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int k = 0;
        
        for(int i=0; i<num_list.length/n; i++) {
            for(int j=0; j<n; j++) {
                answer[i][j] = num_list[k];
                k += 1;
            }
        }
        
        System.out.println(Arrays.deepToString(answer));
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		solution(arr, 2);
		
		int[] arr2 = {100, 95, 2, 4, 5, 6, 18, 33, 948};
		solution(arr2, 3);
	}

}
