package programmers;

public class programmers120848 {
	
	public static void solution(int n) {
        int num = 1;
        int count = 1;
        
        while(true) {
            num *= count;
            if(num > n) {
                count -= 1;
                break;
            } else if(num == n) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
	
	public static void main(String[] args) {
		solution(3628800);
		solution(7);
	}

}
