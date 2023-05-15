package programmers;

public class programmers120892 {
	
    public static void solution(String cipher, int code) {
        String answer = "";
        for(int i=1; i<=cipher.length()/code; i++) {
            answer += cipher.charAt((i*code)-1);
        }
        System.out.println(answer);
    }
    
    public static void main(String[] args) {
		solution("dfjardstddetckdaccccdegk", 4);
		solution("pfqallllabwaoclk", 2);
	}

}
