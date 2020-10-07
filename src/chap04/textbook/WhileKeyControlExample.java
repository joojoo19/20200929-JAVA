package chap04.textbook;

public class WhileKeyControlExample {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("------------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("------------------------");
				System.out.println("선택 : ");
			}
			keyCode = System.in.read(); 
			
			if(keyCode == 49) { // 1의 키코드는 49
				speed++;
				System.out.println("현재속도 : " + speed);
			} else if(keyCode == 50) {
				speed--;
				System.out.println("현재속도 : " + speed);
			} else if(keyCode ==51) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	} // 1의 키코드 → if(==49) → 13키코드 → run =false → 10키코드 →  run = false → keyCode = system.in.read();
	                             // enter의 13과 10키코드가 실행됨
}
