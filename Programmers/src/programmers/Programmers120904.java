package programmers;

public class Programmers120904 {
	
	public static void solution(int num, int k) {
        int answer = -1;
        String str = num + "";

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == (char)(k +'0')) {
                answer = i+1;
                break;
            }
        }
        
        System.out.println(answer);
    }

	public static void main(String[] args) {
		solution(29183, 1);
		solution(232443, 4);
		solution(123456, 7);
	}
}
