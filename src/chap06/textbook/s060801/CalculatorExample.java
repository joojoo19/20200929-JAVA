package chap06.textbook.s060801;

public class CalculatorExample {
public static void main(String[] args) {
	Calculator myCalc = new Calculator();
	myCalc.powerOn(); // 정의된 파라미터가 없어서 그냥 사용.
	
	int result1 = myCalc.plus(5, 6); //파라미터가 int타입의 값을 2개 넣어주고 사용.
	System.out.println("result1 : " +result1);
	
	byte x = 10;
	byte y =4;
	double result2 = myCalc.divide(x, y);
	System.out.println("result2 : " + result2);
	
	myCalc.powerOff();
}
}
