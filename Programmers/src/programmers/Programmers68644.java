package programmers;
import java.util.*;

public class Programmers68644 {
    public static void main(String[] args) {
        int numbers[] = {2,1,3,4,1};
        System.out.println(Arrays.toString(solution(numbers)));

        int numbers2[] = {5,0,2,7};
        System.out.println(Arrays.toString(solution(numbers2)));
    }

    /*
        O(N²logN)
        Set의 최대 크기를 k라고 가정, stream 의 sort() 메서드의 시간 복잡도는 O(klogk)
        아래 메서드에서 k = N²(N = numbers.length)
        즉 최종 시간복잡도는 O(N²logN)
     */
    public static int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            int first = numbers[i];
            for(int j=i+1; j<numbers.length; j++) {
                int sum = first + numbers[j];
                set.add(sum);
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
