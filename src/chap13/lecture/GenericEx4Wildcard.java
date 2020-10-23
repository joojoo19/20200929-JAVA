package chap13.lecture;
import chap13.textbook.s130601.*;
public class GenericEx4Wildcard {
public static void main(String[] args) {
	Course<Person> coursePerson = new Course<Person>("일반인", 5);
	Course<Student> courseStudent = new Course<Student>("학생", 5);
	
	Person p = new Person("일반");
	Student s = new Student("학생");
	p = s;
	
	courseStudent.add(new Student("hong"));
	coursePerson.add(new Person("kim"));
	coursePerson.add(new Student("choi"));
	
//	coursePerson = courseStudent;
	coursePerson.add(new Person("lee")); 
	
	System.out.println("종료");
	System.out.println("wildcard");
	Course<? super Student> courseW0 = new Course<Object>("a", 1);
	Course<? super Student> courseW1 = new Course<Person>("a", 1);
	Course<? super Student> courseW2 = new Course<Student>("a", 1);
	
//	Course<? super Student> courseW3 = new Course<HighStudent>("a", 1);
	//Student 클래스의 상위 클래스가 아니라서 에러.
	
	 courseW1.add(new Student("a"));
	 
	 Course<Object> co = (Course<Object>) courseW0;
	 co.add(new Object());
//	 courseW0.add(new Object());
	 courseW1.add(new Student("a"));
	 courseW2.add(new Student("a"));
	 
	 System.out.println("종료2");
	 
	 Course<? extends Student> courseE1 = new Course<Student>("a", 1);
	 Course<? extends Student> courseE2 = new Course<HighStudent>("a", 1);
}
}
