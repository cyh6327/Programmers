package programmers;

import java.util.*;

public class Programmers42840 {
    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution(answers)));

        int[] answers2 = {1,3,2,4,2};
        System.out.println(Arrays.toString(solution(answers2)));
    }

    // O(N)
    /*
    왜 패턴 배열을 만들어놓고 굳이 map에 같이 넣어버려서 굳이 왜 꺼내 썼지 ,,
    문제 풀기 급급하다가 이상한 것도 모르고 막 휘갈겨 버렸다
    처음에 %연산 하면 될 걸 이상한 roop 변수 만들어서 계산하려고 하고
    이래서 다른 사람 풀이를 봐야되는구나
    그래야 먼가 내 코드가 응가같다는 싸한 느낌을 받을 수 있으니까 ,,
    많이 보고 많이 흡수해야지
     */
    static int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();

        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);

        for (int i = 0; i < answers.length; i++) {
            int num = answers[i];

            if (one[i % one.length] == num) {
                map.put(1, map.get(1) + 1);
            }
            if (two[i % two.length] == num) {
                map.put(2, map.get(2) + 1);
            }
            if (three[i % three.length] == num) {
                map.put(3, map.get(3) + 1);
            }
        }

        int count1 = map.get(1);
        int count2 = map.get(2);
        int count3 = map.get(3);

        int max = Math.max(count1, count2);
        max = Math.max(max, count3);

        for (Integer key : map.keySet()) {
                if (map.get(key) == max) {
                    answer.add(key);
                }
        }

        return answer.stream()
                .mapToInt(i -> i)
                .toArray();

    }
}
