package programmers;

public class programmers120825 {
	
	public static void solution(String my_string, int n) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++) {
            for(int j=0; j<n; j++) {
                answer += my_string.charAt(i);
            }
        }
        
        System.out.println(answer);
    }
	
	public static void main(String[] args) {
		solution("hello", 3);
	}

}
