package programmers;

public class programmers120815 {
	
	public static void solution(int n) {
        int answer, r, max = 0;
        
        int p = 6;
        int n1 = n;
        
        // 유클리드 호제법으로 최대공약수(max) 구함
        while(true) {
            r = n1%p;
            n1 = p;
            p = r;
            if(r==0) {
                max = n1;
                break;
            }
        }
        // 정답은 n과 6(피자 조각수)의 최소공배수(=(n*6)/max)를 6(피자 조각수)으로 나눈 값
        answer = ((n*6)/max)/6;
        System.out.println(answer);
    }
	
	public static void main(String[] args) {
		solution(6);
		solution(10);
		solution(4);
	}

}
