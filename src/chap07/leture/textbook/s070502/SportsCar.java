package chap07.leture.textbook.s070502;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
		
//		@Override
//		public void stop() {  // 부모클래스에 stop()가 final키워드를 가지고 있어서 상속 안됨
//			System.out.println("스포츠카를 멈춤");
//			speed = 0;
//		}
	}
}
