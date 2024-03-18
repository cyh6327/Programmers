package programmers;

public class Programmers120909 {
	
    public static void solution(int n) {
        int answer = 0;
        if(Math.sqrt(n) == (int)Math.sqrt(n))
            answer = 1;
        else
            answer = 2;
        System.out.println(answer);
    }
    
    public static void main(String[] args) {
		solution(144);
		solution(976);
	}

}
