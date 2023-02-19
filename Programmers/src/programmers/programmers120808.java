package programmers;

public class programmers120808 {
	
	class Solution {
	    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
	        
	        int numer = (numer1 * denom2) + (numer2 * denom1);
	        int denom = denom1 * denom2;
	        int a, b, r, max;
	        
	        a = Math.max(numer, denom);
	        b = Math.min(numer, denom);
	        
	        if(numer % denom == 0) {
	            max = Math.min(numer, denom);
	        } else {
	            while(true) {
	                r = a%b;
	                a = b;
	                b = r;
	                if(r==0) {
	                    max = a;
	                    break;
	                }
	            }
	        }
	        
	        int[] answer = {numer/max, denom/max};
	        return answer;
	    }
	}

}
