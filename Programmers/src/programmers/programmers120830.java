package programmers;

public class programmers120830 {

    public static int solution(int n, int k) {
        int answer = 0;
        int free = 0;
        
        if(n/10 >= 1) {
            free = n/10;
        }
        
        answer = (12000 * n) + (2000 * (k-free));
        return answer;
    }
    
    public static void main(String[] args) {
		System.out.println(solution(10, 3));
		System.out.println(solution(64, 6));
	}
}
