package chap03.textbook;

public class AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
		
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit; // 1 - 7 * 0.1
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + "조각이 남는다.");
		
		System.out.println("--------------------------");
				int apple1 = 1;
				int totalPieces = apple * 10;
				int number1 = 7;
				int temp = totalPieces - number1;
				
				double result1 = temp/10.0;
				
				System.out.println("사과 한개에서");
				System.out.println("0.7 조각을 빼면, ");
				System.out.println(result1 + "조각이 남는다.");
				
	}
}
