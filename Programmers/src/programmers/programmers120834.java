package programmers;

public class programmers120834 {
	
	public static void solution(int age) {
        String answer = "";
        String strAge = age + "";
        for(int i=0; i<strAge.length(); i++) {
            answer += (char)((int)strAge.charAt(i) + 49);
        }
        System.out.println(answer);
    }
	
	public static void main(String[] args) {
		solution(23);
		solution(51);
		solution(100);
	}

}
