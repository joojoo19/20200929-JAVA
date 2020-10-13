package chap06.textbook.s060901;

public class Car {
	//필드
	String model;
	int speed;
	
	//생성자
	
Car(String moedl) {
	this.model = model;
}

//메소드
void setSpeed(int speed) {
	this.speed = speed; // 파라미터와 혼동되기 때문에 this를 생략하면 안됨.
}

void run() {
	for(int i=0; i<=50; i+=10) {
		this.setSpeed(i);
		System.out.println(this.model +"가 달립니다. (시속 : " + this.speed + "km/h)");
	}
}
}
