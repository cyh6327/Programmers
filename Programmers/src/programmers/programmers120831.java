package programmers;

public class programmers120831 {
	
    public static int solution(int n) {
        int answer = 0;
        for(int i=2; i<=n; i+=2) {
            answer += i;
        }
        return answer;
    }
    
    public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(4));
	}

}
