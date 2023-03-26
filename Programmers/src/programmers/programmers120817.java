package programmers;

public class programmers120817 {
	
    public static double solution(int[] numbers) {
        double answer = 0;
        for(int num : numbers) {
            answer += num;
        }
        answer = (double)answer/numbers.length;
        return answer;
    }

    public static void main(String[] args) {
    	int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    	System.out.println(solution(arr1));
    	int[] arr2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
    	System.out.println(solution(arr2));
	}
}
