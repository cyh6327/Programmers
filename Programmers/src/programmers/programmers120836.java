package programmers;

public class programmers120836 {
	
	public static void solution(int n) {
        int count = 0;
        
        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                count += 1;
            }
        }
        
        System.out.println(count);
    }
	
	public static void main(String[] args) {
		solution(20);
		solution(100);
	}

}
