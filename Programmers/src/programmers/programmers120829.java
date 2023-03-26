package programmers;

public class programmers120829 {
	
    public static int solution(int angle) {
        int answer = 0;
        if(angle > 90) {
            if(angle < 180)
                answer = 3;
            else
                answer = 4;
        } else {
            if(angle == 90)
                answer = 2;
            else
                answer = 1;
        }
        return answer;
    }
    
    public static void main(String[] args) {
		System.out.println(solution(70));
		System.out.println(solution(91));
		System.out.println(solution(180));
	}

}
