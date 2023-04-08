package programmers;

public class programmers120837 {
	
	public static void solution(int hp) {
        int count = 0;
        
        while(hp != 0) {
            count = hp/5;
            hp -= 5*(hp/5);
            count += hp/3;
            hp -= 3*(hp/3);
            count += hp/1;
            hp -= 1*(hp/1);
        }
        
        System.out.println(count);
    }
	
	public static void main(String[] args) {
		solution(23);
		solution(24);
		solution(999);
	}

}
