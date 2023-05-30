package programmers;

public class Programmers120908 {
	
	public static void solution(String str1, String str2) {
        int answer = 0;
        
        if(str1.contains(str2))
            answer = 1;
        else
            answer = 2;
        
        System.out.println(answer);
    }
	
	public static void main(String[] args) {
		solution("ab6CDE443fgh22iJKlmn1o", "6CD");
		solution("AbcAbcA", "AAA");
	}

}
