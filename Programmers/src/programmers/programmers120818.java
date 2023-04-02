package programmers;

public class programmers120818 {
	
	public static void solution(int price) {
        int answer = 0;
        
        if(price >= 100000) {
            answer = (int)(price - (price * 0.05));
            if(price >= 300000) {
                answer = (int)(price - (price * 0.1));
                if(price >= 500000) {
                    answer = (int)(price - (price * 0.2));
                }
            }
        } else {
            answer = price;
        }
        
        System.out.println(answer);
    }
	
	public static void main(String[] args) {
		solution(150000);
		solution(580000);
	}

}
