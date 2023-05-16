package programmers;

public class programmers120893 {
	
	public static void solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++) {
            if((int)my_string.charAt(i) > 90)
                answer += (char)((int)my_string.charAt(i) - 32) + "";
            else
                answer += (char)((int)my_string.charAt(i) + 32) + "";
        }
        
        System.out.println(answer);
    }
	
	public static void main(String[] args) {
		solution("cccCCC");
		solution("abCdEfghIJ");
	}

}
