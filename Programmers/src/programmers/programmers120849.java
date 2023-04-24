package programmers;

public class programmers120849 {
	
    public static void solution(String my_string) {
        String answer = "";
        answer = my_string.replace("a","")
            .replace("e","")
            .replace("i","")
            .replace("o","")
            .replace("u","");
        System.out.println(answer);
    }
    
    public static void main(String[] args) {
		solution("bus");
		solution("nice to meet you");
	}

}
