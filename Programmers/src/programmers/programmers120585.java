package programmers;

public class programmers120585 {
	
    public static void solution(int[] array, int height) {
        int answer = 0;
        
        for(int i=0; i<array.length; i++) {
            if(array[i] > height) {
                answer += 1;
            }
        }
        
        System.out.println(answer);
    }
    
    public static void main(String[] args) {
    	int[] arr = {149, 180, 192, 170};
		solution(arr, 167);
		
		int[] arr2 = {180, 120, 140};
		solution(arr2, 190);
	}

}
