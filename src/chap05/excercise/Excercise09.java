package chap05.excercise;

import java.util.Scanner;

public class Excercise09 {
	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) { // 항상 실행됨.
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.println("선택>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("학생수>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum]; // 학생수 입력으로 배열의 값을 설정.
			} else if (selectNo == 2) {
				for(int i=0; i<studentNum; i++) {
				System.out.println("scores[" + i + "] :");
				scores[i] = scanner.nextInt();}
				
			} else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]:" + scores[i]);
				}
				
			} else if(selectNo == 4) {
				int sum = 0;
				int max = Integer.MIN_VALUE; // 데이터 타입이 표현할 수 있는 범위중 가장 작은 수.
				double avg = 0.0;
				
				for(int i =0; i<scores.length; i++) {
					if(max <=scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				avg = (double) sum / scores.length;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
			}

			else if (selectNo == 5) {
				run = false;
			}
		}
			System.out.println("프로그램 종료");
		
	}
}
