package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Programmers42576 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        mySolution(participant, completion);
        otherSolution(participant, completion);
    }

    public static void mySolution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        int cnt = 1;
        for(String str : completion) {
            cnt = map.getOrDefault(str, 1);
            if(map.containsKey(str)) cnt += 1;
            map.put(str, cnt);
        }

        Integer val = null;
        for(String str : participant) {
            val = map.get(str);
            if(val == null) {
                answer = str;
                break;
            }
            else {
                val = val-1;
                if(val == 0) map.remove(str);
                else map.put(str,val);
            }
        }

        System.out.println(answer);
    }

    public static void otherSolution(String[] participant, String[] completion) {
        Map<String, Long> participantMap = Arrays.asList(participant).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Arrays.stream(participant).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for(String name : completion) {

            Long value = participantMap.get(name) - 1L;

            if(value == 0L) {
                participantMap.remove(name);
            } else {
                participantMap.put(name, value);
            }
        }

        System.out.println(participantMap.keySet().iterator().next());
    }
}
