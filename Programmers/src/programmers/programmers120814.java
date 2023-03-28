package programmers;

public class programmers120814 {
	
	public static void solution(int n) {
        int answer = 0;
        if(n <= 7) {
            answer = 1;
        } else {
            if(n%7==0) {
                answer = n/7;
            } else {
                answer = (n/7)+1;
            }
        }
        System.out.println(answer);
    }
	
	public static void main(String[] args) {
		solution(7);
		solution(1);
		solution(15);
	}

}
