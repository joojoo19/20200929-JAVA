package chap09.Excercise.Ex05;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run(); //field는 vehicle타입
		anony.method1();
		anony.method2(
				new Vehicle() {
					// 익명객체
					@Override
					public void run() {
						System.out.println("트럭이 달립니다");
					}
				}
				);
	}
}
