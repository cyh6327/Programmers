package programmers;

public class programmers120810 {
	
    public static int solution(int num1, int num2) {
        int answer = num1 % num2;
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(3, 2));
		System.out.println(solution(10, 5));
	}

}
