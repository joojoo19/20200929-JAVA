package chap02.textbook;

public class Exercise {
	public static void main(String[] args) {
		// 1번 문제
				int newVar;
//				System.out.println(newVar);
				
				// 2번 문제
				int modelName;
				int $value;
				int _age;
				
				// 3번 문제
				// byte   short,char   int    long
				//                     float  double
				// boolean
				
				// 4번 문제
				int age;
				age = 10;
				double price = 3.14;
				// 타입: int, double
				// 변수명: age, price
				// 리터럴: 10, 3.14;
				
				
				
				// 5번 문제
				byte byteValue = 10;
				char charValue = 'A';
				
//				short shortValue = charValue;
				// 같은 2byte지만 저장방식이 다름.
				
				
				// 6번 문제
				int intValue = 10;
//				char charValue = 'A';
				double doubleValue = 5.7;
				String strValue = "A";
				
				// 기본타입과 참조타입간의 형변환 불가
//				char var = (char) strValue; 
			
				
				// 7번 문제
//				char var3 = '';
				// 하나의 문자를 갖어야함.
				
				// 8번 문제
//				byte byteValue = 10;
				float floatValue = 2.5F;
//				double doubleValue = 2.5;
				
//				byte result = byteValue + byteValue; // 정수형의 연산의 결과값은 int
				// 위에 연산을 컴파일 에러가 나지 않게 밑에 2가지로 바꿀 수 있음.
				int result = byteValue + byteValue;
				byte result2 = (byte) (byteValue + byteValue);
			}
		}
