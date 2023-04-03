package programmers;

public class programmers120826 {
	
    public static void solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replaceAll(letter, "");
        System.out.println(answer);
    }
    
    public static void main(String[] args) {
		solution("abcdef", "f");
		solution("BCBdbe", "B");
	}
}
