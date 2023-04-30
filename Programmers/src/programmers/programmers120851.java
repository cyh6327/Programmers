package programmers;

public class programmers120851 {

    public static void solution(String my_string) {
        int answer = 0;
        
        for(int i=0; i<my_string.length(); i++) {
            if(my_string.charAt(i)-'0' <= 9)
                answer += my_string.charAt(i)-'0';
        }
        System.out.println(answer);
    }
    
    public static void main(String[] args) {
		solution("aAb1B2cC34oOp");
		solution("1a2b3c4d123");
	}
}
