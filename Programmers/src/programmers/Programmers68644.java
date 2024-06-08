package programmers;
import java.util.*;

public class Programmers68644 {
    public static void main(String[] args) {
        int numbers[] = {2,1,3,4,1};
        System.out.println(Arrays.toString(solution(numbers)));

        int numbers2[] = {5,0,2,7};
        System.out.println(Arrays.toString(solution(numbers2)));
    }

    // O(n²)
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
