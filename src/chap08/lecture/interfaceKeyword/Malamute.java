package chap08.lecture.interfaceKeyword;

public class Malamute extends KindaDog implements Pet {
@Override
public void bark() {
	System.out.println("웡웡");
}
@Override
	public void sit() {
	System.out.println("댕댕이가 앉습니다");
		
	}
}
