package programmers;

public class programmers120820 {
	
    public static int solution(int age) {
        int answer = (2022-age)+1;
        return answer;
    }
    
    public static void main(String[] args) {
		System.out.println(solution(40));
		System.out.println(solution(23));
	}
}
