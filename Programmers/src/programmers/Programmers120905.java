package programmers;

import java.util.ArrayList;
import java.util.List;

public class Programmers120905 {
	
	public static void solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        
        for(int num : numlist) {
            if(num == n || num%n == 0) {
                list.add(num);
            }
        }
        System.out.println(list);
    }
	
	public static void main(String[] args) {
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		solution(3, numlist);
	}

}
