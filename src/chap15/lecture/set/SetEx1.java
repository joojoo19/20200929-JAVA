package chap15.lecture.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		// 순서가 없고, 중복되지 않음
		Set<String> set = new HashSet<String>();
		
		// 추가
		set.add("java");
		set.add("html");
		set.add("css");
		set.add("jsp");
		set.add("dbms");
		set.add(new String("java")); //중복된건 들어가지 않음		
		System.out.println(set.size());
		
		// 삭제
		set.remove("jquery");
		System.out.println(set.size());
		set.remove("html"); // set.remove(new String("html"));과 같음.
		System.out.println(set.size());
		
		// 순서가 없어서 수정할 수 없음.
		
		// 검색(모두 탐색) 순서가 없어서 모두 탐색해야함.
		for(String s : set) {
			System.out.println(s);
		} 
		System.out.println("---------Iterator---------");
		Iterator<String> iter = set.iterator(); // 탐색용 메소드
//		iter.hasNext();
//		iter.next(); // 다음 탐색을 알려줌.
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
		
	}	
	
}
