package programmers;

public class Programmers120895 {

	public static void solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char[] arr = my_string.toCharArray();
        char n1 = arr[num1];
        char n2 = arr[num2];
        arr[num1] = n2;
        arr[num2] = n1;
        
        for(char c : arr) {
            answer += c;
        }
        
        System.out.println(answer);
    }
	
	public static void main(String[] args) {
		solution("hello", 1, 2);
		solution("I love you", 3, 6);
	}
}
