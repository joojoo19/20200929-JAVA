package myEx;


public class lotto {
public static void main(String[] args) {

	int[] lotto = new int[6];
	
	for(int i=0; i<lotto.length; i++) {
		lotto[i] = (int)(Math.random()*45)+1;
		
		boolean isDuplicated = false;
		
		for(int j=0; j<i; j++) {
			if(lotto[i] == lotto[j]) {
				isDuplicated = true;
				System.out.println("중복됨" + lotto[i]);
				
			}
		}
		if(isDuplicated == true) {
			i--;
			continue;
		}
	}
	for(int i=0; i<lotto.length; i++) {
		System.out.print(" "+ lotto[i]);
	}
}
}
