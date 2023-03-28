package programmers;

import java.util.*;

public class programmers120847 {
	
    public static void solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);	// 배열을 오름차순으로 정렬
        
        // 배열을 list 타입으로 변경하기 위해 int형 배열을 Integer형 배열로 변경
        // 1. 배열을 스트림 타입으로 변경
        // 2. boxed() : int, long, double 요소를 Integer, Long, Double 요소로 박싱해서 Stream을 생성
        Integer[] arr = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        
        // Collections 인터페이스를 사용하기 위해 배열을 list 타입으로 변경
        List<Integer> list = Arrays.asList(arr);
        // list를 뒤집음
        Collections.reverse(list);
        
        answer = list.get(0) * list.get(1);
        
        System.out.println(answer);
    }
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		solution(arr);
		int[] arr2 = {0, 31, 24, 10, 1, 9};
		solution(arr2);
	}
}
