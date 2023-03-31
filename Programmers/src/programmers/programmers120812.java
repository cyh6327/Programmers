package programmers;

import java.util.*;

public class programmers120812 {
	
    public static void solution(int[] array) {
        int answer, max = 0;
        
        Integer[] arr = Arrays.stream(array).boxed().toArray(Integer[]::new);
        // Collections 클래스를 사용하기 위해 배열을 list로 변환
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        
        // 매개변수인 배열 array의 중복값 제거
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        // set은 값을 꺼내려면 iterator를 사용해야 하므로 편하게 값을 꺼내기 위해 다시 배열로 변환
        Integer[] setArr = set.toArray(new Integer[0]);		// 중복값 제거된 배열
        List<Integer> result = new ArrayList<>();			// setArr의 각각의 원소들을 카운트한 개수를 담을 배열
        
        // Collections.frequency를 사용해 매개변수로 주어진 배열(list)에서 각각의 setArr의 원소와 일치하는 원소의 개수를 result에 담음
        for(int i=0; i<set.size(); i++) {
            result.add(i, Collections.frequency(list, setArr[i]));
        }
        
        // 주어진 배열에서 가장 많이 나온 값의 개수 = result 배열의 가장 큰 값
        max = Collections.max(result);
        
        // 최빈값이 2개 이상이면 리턴값은 -1
        if(Collections.frequency(result, max) >= 2)
            answer = -1;
        // result배열에서 max와 일치하는 index를 가져오고, setArr에서 해당 index의 값을 가져온 게 최빈값
        else
            answer = setArr[result.indexOf(max)];	
        
        System.out.println(answer);
    }

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 3, 3, 4};
		solution(arr);
		
		int[] arr2 = {1, 1, 2, 2};
		solution(arr2);
		
		int[] arr3 = {1};
		solution(arr3);
	}
}
