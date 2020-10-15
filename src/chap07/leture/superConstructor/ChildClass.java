package chap07.leture.superConstructor;

public class ChildClass extends ParentClass {
	public ChildClass() {
//		super();  // 부모클래스에 파라미터를 받은 클래스가 있으면 부모 클래스의 기본 생성자가 생기지 않음. 
		super(1); // 부모 클래스에 int i를 받는 클래스를 호출.
	}
	
	@Override
	void method1() {
		super.method1(){
			System.out.println("child method1");
		}
	}

}
