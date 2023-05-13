package programmers;

public class programmers120891 {
	
	public static void solution(int order) {
        int answer = 0;
        String str = order + "";
        for(int i=0; i<str.length(); i++) {
            if((int)(str.charAt(i)-'0')%3 == 0 && str.charAt(i) != '0') {
                answer++;
            }
        }
        System.out.println(answer);
    }
	
	public static void main(String[] args) {
		solution(3);
		solution(29423);
	}

}
