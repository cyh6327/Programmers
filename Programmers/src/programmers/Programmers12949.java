package programmers;

import java.util.Arrays;

public class Programmers12949 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2}, {3,4}, {5,6}};
        int[][] arr2 = {{1,2}, {3,4}};
        System.out.println(Arrays.deepToString(solution(arr1, arr2)));

        int[][] arr3 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr4 = {{3, 3}, {3, 3}};
        System.out.println(Arrays.deepToString(solution(arr3, arr4)));
    }

    // O(n^3)
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int x = 0; x < arr1.length; x++) {
            for (int y = 0; y < arr1[0].length; y++) {
                int a1 = arr1[x][y];
                for (int z = 0; z < arr2[0].length; z++) {
                    int a2 = arr2[y][z];
                    int temp = answer[x][z];
                    answer[x][z] = temp + (a1 * a2);
                }
            }
        }

        return answer;
    }

    // 간소화 버전
    public static int[][] otherSolution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int x = 0; x < arr1.length; x++) {
            for (int y = 0; y < arr1[0].length; y++) {
                for (int z = 0; z < arr2[0].length; z++) {
                    answer[x][z] = answer[x][z] + arr1[x][y]*arr2[y][z];
                }
            }
        }

        return answer;
    }

}
