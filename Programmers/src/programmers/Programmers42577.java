package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Programmers42577 {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123","456","789"};
        String[] phone_book3 = {"12","123","1235","567","88"};

//        System.out.println(mySolution(phone_book));
//        System.out.println(mySolution(phone_book2));
//        System.out.println(mySolution(phone_book3));

        System.out.println(otherSolution(phone_book));

        System.out.println(otherSolution2(phone_book2));
    }

    // 실패한 코드
    static boolean mySolution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);

        Loop1 :
        for(int i=0; i<phone_book.length; i++) {
            Loop2 :
            for(int j=1; j<phone_book.length-(i+1); j++) {
                if(phone_book[i+j].startsWith(phone_book[i])) {
                    answer = false;
                    break Loop1;
                }
            }
        }

        return answer;
    }

    // 해쉬 이용 풀이
    static boolean otherSolution(String[] phoneBook) {
        boolean answer = true;

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < phoneBook.length; i++) {
            map.put(phoneBook[i], i);
        }

        for(int i = 0; i < phoneBook.length; i++) {
            for(int j = 1; j < phoneBook[i].length(); j++) {
                String s = phoneBook[i].substring(0,j);
                if(map.containsKey(s)) {
                    answer = false;
                    return answer;
                }
            }
        }

        return answer;
    }

    // 사전순으로 정렬했기 때문에 만약 현재 원소가 다음 원소의 접두어가 아니라면, 현재 원소 이후의 모든 원소들과 비교할 필요가 없다..!
    // ex) String[] phone_book2 = {"123","456","789"}; 에서 "123".startsWith("456") == false 이면 "123".startsWith("789") 도 false
    static boolean otherSolution2(String[] phoneBook) {
        Arrays.sort(phoneBook);
        boolean result = true;
        for (int i=0; i<phoneBook.length-1; i++) {
            if (phoneBook[i+1].contains(phoneBook[i])) {
                result = false;
                break;
            }
        }
        return result;
    }
}
