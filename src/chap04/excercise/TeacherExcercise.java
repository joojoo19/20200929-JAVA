package chap04.excercise;

public class TeacherExcercise {
	public static void main(String[] args) {
		System.out.println("----------- 3번 ----------");
		// 3의 배수의 합
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}

		System.out.println(sum);

		System.out.println("----------- 4번 ----------");

		while (true) {
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;

			System.out.println("(" + dice1 + "," + dice2 + ")");
			if ((dice1 + dice2) == 5) {
				break;
			}
		}

		System.out.println("----------- 5번 ----------");
		// 4x + 5y = 60
		// 1, 1 
		// 1, 2
		//   :
		// 1, 10
		// 5, 1
		//   :
		// 10, 10
		// 구구단과 유사하게..
		for(int x=1; x<=10; x++) {
			for(int y =1; y <=10; y++) {
				int s = (4 *x) + (5 * y);
				if (s == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
		}
		}

		System.out.println("----------- 6번 ----------");
		 for(int i =0; i<=5; i++) {
			 for(int j = 0; j<=i; j++) {
				 System.out.print("*"); // print :  옆으로 출력
			 }
			 System.out.println();
		 }

	}
}
