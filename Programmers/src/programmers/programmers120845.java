package programmers;

public class programmers120845 {
	
    public static void solution(int[] box, int n) {
        int answer = 0;
        answer = ((box[0] / n) * (box[1] / n)) * (box[2] / n);
        System.out.println(answer);
    }

    public static void main(String[] args) {
    	int[] box = {1, 1, 1};
		solution(box, 1);
		
		int[] box2 = {10, 8, 6};
		solution(box2, 3);
	}
}
