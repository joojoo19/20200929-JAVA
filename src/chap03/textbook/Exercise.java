package chap03.textbook;

public class Exercise {
	public static void main(String[] args) {
		System.out.println("------- 4번 ---------");
		int pencils = 534;
		int students = 30; 
		
		// 학생 한 명이 가지는 연필 수
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		// 남은 연필 수
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
		
		System.out.println("------- 5번 ---------");
		
		int value = 356;
		System.out.println(value - 56);
		
		System.out.println("------- 6번 ---------");
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (double)(lengthTop+lengthBottom)*height/2;
		
		System.out.println("------- 7번 ---------");
		int x =10;
		int y = 5;
		
		System.out.println((x>7) && (y<=5));
		System.out.println((x%3 == 2) || (y%2 != 1));
		
		System.out.println("------- 8번 ---------");
		
		double a = 5.0;
		double b = 0.0;
		
		double z = x % y;
		
		if(Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else { double result = z + 10;
		System.out.println("결과 : " + result);
		}
	}
}
