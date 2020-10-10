package myEx.chapex;

public class Ex01 {
	public static void main(String[] args) {
		short s = 100;
		int res = -s;
		 System.out.println(res);
		 
		 int x = 10, y = 9, z = ++x + y++;
		   System.out.println(z); 
           System.out.println(x); 
           System.out.println(y);
           
        int a = 10;
        int b = 9;
        int c = ++a + b++;
		   System.out.println(c); 
           System.out.println(a); 
           System.out.println(b);
		 
		 int d = ~10;
		 System.out.println(d);
		 
		 char c1 = 'A' + 1; // 리터럴 + 리터럴, 65+1=66, 문자 B가 변수초기값.
         char c2 = 'A'; // char type 산술연산은 int type으로 변환.
         int c3 = c2 + 1; // 변수 c2에 1을 더하면 c2는 int type으로 변환되고 1과 
//                                           연산을 하기 때문에 산출 타입은 int
//        char c3 = (char) (c2 + 1);
		 System.out.println(c3);
		 
		 String userInput = "NaN"; // NaN과 Infinite 키워드는 string으로 변환 가능.
		    double val = Double.valueOf( userInput );
		    double currentBalance = 10000.0;
		    if(Double.isNaN(val)) {   val = 0.0;   } // NaN검사 실행코드
            currentBalance += val;
            System.out.println(currentBalance);
            
            
          

		 
	}
}
