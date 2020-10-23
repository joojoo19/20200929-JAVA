package chap15.excercise.ex08;

import java.util.*;

public class HashSrtExample {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();

		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
//		set.add(new Student(1, "조민우"));
		set.remove(new Student(1, "조민우"));
		Iterator<Student> iterator = set.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + " : " + student.name);
		}
	}
}
