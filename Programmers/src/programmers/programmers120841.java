package programmers;

public class programmers120841 {
	
	public static void solution(int[] dot) {
        int answer = 0;
        if(dot[0] > 0) {
            if(dot[1] > 0) {
                answer = 1;
            } else {
                answer = 4;
            }
        } else {
            if(dot[1] > 0) {
                answer = 2;
            } else {
                answer = 3;
            }
        }
        System.out.println(answer);
    }
	
	public static void main(String[] args) {
		int[] arr = {2,4};
		solution(arr);
		int[] arr2 = {-7,9};
		solution(arr2);
	}

}
