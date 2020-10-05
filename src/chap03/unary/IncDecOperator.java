package chap03.unary;

public class IncDecOperator {
	public static void main(String[] args) {
		// 증가연산자 increment
		// ++
		//변수가 가진 값에서 1을 더한 후 변수에 다시 대입
		
		// 감소연산자 decrement
		// --
		// 변수가 가진 값에서 1을 뺀 후 변수에 다시 대입
		
		int var1 = 5;
		int var2 = 5;
		
		var1++;
		var2--;
		
		System.out.println(var1);
		System.out.println(var2);
		
		// 연산자의 위치
		// 연산자가 뒤에 오면 사용한 후 할당
		// 연산자가 앞에 오면 할당 후 사용
		
		int var3 = 5;
		int var4 = 5;
		
		int var5 = 3 + (var3++); // var3은 5, 3 + 5의 결과값을 내고 +1
		System.out.println(var5);
		System.out.println(var3);
		
		// int var6 = 3 + (++var4); // var4에 +1한 값 6을 할당해서 계산. 3 + 6
	    var4++;
		int var6 = 3 + var4;
 
		System.out.println(var6);
		System.out.println(var4);
		
		
		
	}
}
