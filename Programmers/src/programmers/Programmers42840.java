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
    static int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();

        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        Map<String, Object> map = new HashMap<>();
        map.put("arr1", one);
        map.put("1", 0);
        map.put("arr2", two);
        map.put("2", 0);
        map.put("arr3", three);
        map.put("3", 0);

        int[] arr1 = (int[])map.get("arr1");
        int[] arr2 = (int[])map.get("arr2");
        int[] arr3 = (int[])map.get("arr3");

        for (int i = 0; i < answers.length; i++) {
            int num = answers[i];

            if (arr1[i % arr1.length] == num) {
                map.put("1", (int)map.get("1") + 1);
            }
            if (arr2[i % arr2.length] == num) {
                map.put("2", (int)map.get("2") + 1);
            }
            if (arr3[i % arr3.length] == num) {
                map.put("3", (int)map.get("3") + 1);
            }
        }

        int count1 = (int)map.get("1");
        int count2 = (int)map.get("2");
        int count3 = (int)map.get("3");

        int max = Math.max(count1, count2);
        max = Math.max(max, count3);

        for (String key : map.keySet()) {
            if (key.equals("1") || key.equals("2") || key.equals("3")) {
                if (Integer.parseInt(String.valueOf(map.get(key))) == max) {
                    answer.add(Integer.parseInt(key));
                }
            }
        }

        return answer.stream()
                .mapToInt(i -> i)
                .toArray();

    }
}
