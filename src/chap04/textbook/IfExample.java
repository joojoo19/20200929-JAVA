package chap04.textbook;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		if (score < 90) 
			System.out.println("점수가 90보다 작습니다."); // if문에 실행문
			System.out.println("등급은 B입니다."); // if문의 실행문이 아님. 무조건 출력
		
	}
}
