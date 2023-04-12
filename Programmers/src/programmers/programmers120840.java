package programmers;

import java.math.*;

public class programmers120840 {
	
	public static void solution(int balls, int share) {
        
        BigInteger answer = new BigInteger("0");
        
        BigInteger n = new BigInteger("1");
        BigInteger m = new BigInteger("1");
        BigInteger nm = new BigInteger("1");
        
        for(int i=1; i<=balls; i++) {
        	n = n.multiply(BigInteger.valueOf(i));
        }
        
        for(int j=1; j<=share; j++) {
        	m = m.multiply(BigInteger.valueOf(j));
        }
        
        for(int k=1; k<=balls-share; k++) {
        	nm = nm.multiply(BigInteger.valueOf(k));
        }
        
        answer = n.divide(nm.multiply(m));
        
        System.out.println(answer);
    }

	public static void main(String[] args) {
		solution(3, 2);
		solution(5, 3);
	}

}
