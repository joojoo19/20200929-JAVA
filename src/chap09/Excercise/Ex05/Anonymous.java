package chap09.Excercise.Ex05;

public class Anonymous {
	Vehicle field = new Vehicle() {
		//인터페이스를 받아서 구현할 때는 추상메소드를 구현해야함.
		@Override
		public void run() {
			System.out.println("자전거가 달립니다");
		}
	};
			
	void method1() {
		Vehicle localVar = new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("승용차가 달립니다");
			}
		};
				
		localVar.run();
	}
	void method2(Vehicle v) {
		v.run();
	}
}
