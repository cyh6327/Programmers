package programmers;

public class programmers120816 {
	
	public static void solution(int slice, int n) {
        int answer = 0;
        
        if(n%slice == 0) {
            answer = n/slice;
        } else {
            answer = (n/slice)+1;
        }
        System.out.println(answer);
	}
	
	public static void main(String[] args) {
		solution(7, 10);
		solution(4, 12);
	}

}
