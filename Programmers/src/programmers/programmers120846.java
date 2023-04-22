package programmers;

public class programmers120846 {
	
	public static void solution(int n) {
        int answer = 0;
        int count = 0;	//약수의 개수
        
        if(n <= 3)
            answer = 0;
    
        for(int i=4; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                count = 0;
                if(i%2==0 || i%3==0 || ((i%5==0)&&(i!=5)) || ((i%7==0)&&(i!=7))) {
                    count += 1;
                }
                if(count >= 1){		//1과 n을 제외한 약수가 하나라도 있다면 약수가 3개 이상(=합성수)임
                    answer += 1;
                    break;
                }
            }
        }
        
        System.out.println(answer);
    }
	
	public static void main(String[] args) {
		solution(10);
		solution(15);
	}

}
