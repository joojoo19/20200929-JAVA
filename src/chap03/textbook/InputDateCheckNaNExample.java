package chap03.textbook;

public class InputDateCheckNaNExample {
	public static void main(String[] args) {
		String input = "3.14";
		double v = Double.valueOf(input);
		System.out.println(v);
		
		
		
		String userInput = "NaN"; // NaN과 Infinite 키워드는 변환 가능.
		double val = Double.valueOf( userInput );
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			val = 0.0;
		}
		
		currentBalance += val; //NaN과 숫자연산은  NaN 산출
		System.out.println(currentBalance);
		
		
		
	}
}
