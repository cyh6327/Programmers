package programmers;

public class Programmers120906 {
	
	public static void solution(int n) {
        int answer = 0;
        while(n!=0) {
            answer += n%10;
            n/=10;
        }
        System.out.println(answer);
    }
	
	public static void main(String[] args) {
		solution(1234);
		solution(930211);
	}

}
