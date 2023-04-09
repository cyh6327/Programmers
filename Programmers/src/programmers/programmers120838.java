package programmers;

import java.util.*;

public class programmers120838 {
	
	public static void solution(String letter) {
        String answer = "";
        
        String morse = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',"
				+ "'--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',"
				+ "'--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',"
				+ "'...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',"
				+ "'-.--':'y','--..':'z'";
		
		List<String> list = new ArrayList<>();
		Map<String, String> map = new HashMap<>();
		
		// 1차로 ',' 기준으로 문자열을 분리해서 list에 add
		StringTokenizer st = new StringTokenizer(morse, ",");
		while (st.hasMoreTokens()) {
	         list.add(st.nextToken());
	    }
		
		// 2차로 ':' 기준으로 문자열을 분리한 배열 생성하면서 '' 제거 후 map에 넣음
		String[] arr = {};
		for(String str : list) {
			arr = str.split(":");
			map.put(arr[0].replaceAll("\'", ""), arr[1].replaceAll("\'", ""));
		}
		
		// 주어진 매개변수 letter를 공백 단위로 쪼개서 해당 토큰을 key로 가지는 value를 가져와서 answer에 누적시킴
		StringTokenizer st2 = new StringTokenizer(letter);
		while (st2.hasMoreTokens()) {
            answer += map.get(st2.nextToken());
	    }
        
        System.out.println(answer);
    }
	
	public static void main(String[] args) {
		solution(".... . .-.. .-.. ---");
		solution(".--. -.-- - .... --- -.");
	}

}
