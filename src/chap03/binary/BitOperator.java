package chap03.binary;

public class BitOperator {
	public static void main(String[] args) {
		 // ~ 반전(단항)
		int i = 10; // 0000 0000 0000 0000 0000 0000 0000 1010
		int j = ~i; // 1111 1111 1111 1111 1111 1111 1111 0101
		System.out.println(j);
		
		 // 이항
		 // & and : 같은 자리의 bit가 1인 경우만 1, 나머지 0
		 // | or : 같은 자리의 bit가 0인 경우만 0, 나머지 1
		 // ^ xor : 같은 자리의 bit가 다를 경우 1, 같으면 0
		 // 피연산자 : integer
		 // 결과 : integr
		
		int a = 45;    // 0010 1101 
		int b = 25;    // 0001 1001
		int c = a & b; // 0000 1001 → 9
		System.out.println(c); 
		
		c = a | b;     // 0011 1101 → 61
		System.out.println(c);
		
		c = a ^ b;      // 0011 0100 → 52
	    System.out.println(c);
	    
	    // bit shift 연산자
	    // << : 각 bit를 왼쪽으로 옮김. 오른쪽은 0으로 채움.
	    // >> : 각 bit를 오른쪽으로 옮김, 왼쪽은 msb(most significant bit) 최상위 비트로 채움. +일때는 0으로채우고 -일때는 1로 채움.
	    // >>> : 각 bit를 오른쪽으로 옮김, 왼쪽은 무조건 0으로 채움.
	    
	    int val = 1; // 0000 0000 0000 0000 0000 0000 0000 00001
	    int res = val << 1; // val이 가지고 있는 값에 1을 한 칸씩 왼쪽으로 옮김. (x2한 것과 같음)
	    System.out.println(res); // <<2 x4한 것과 같음. <<3 x8한 것과 같음.
	    
	    val = 98; // >>1 /2와 같음. >>2 /4와 같음. >>3 /8과 같음
	    res = val >>2;
	    System.out.println(res);
	    
	    val = -17;
	    res = val >> 1;
	    System.out.println(res);
	    
	    val = 98;
	    res = val >>> 2;
	    System.out.println(res);
	    
	    val = -17;
	    res = val >>> 1;
	    System.out.println(res);
	   
	    
	    
	   
	    
	    
	}   
	
	 
}
