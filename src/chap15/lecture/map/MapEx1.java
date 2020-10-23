package chap15.lecture.map;
import java.util.*;
public class MapEx1 {
public static void main(String[] args) {
	// (key, value)쌍 (Entry)로 저장.
	// dictionary
	// 순서가 없고 중복되지 않음.
	 
	Map<Integer, String> map = new HashMap<>();
	System.out.println("------ 추가 (입력) ------");
	map.put(100, "kim");
	map.put(30, "hong");
	map.put(22, "lee");
	map.put(11, "choi");
	map.put(200, "jin");
	System.out.println(map.size());
	
	System.out.println("------ 수정 ------");
	map.put(200, "park");
	System.out.println(map.size());
	
	System.out.println("------ 검색 ------");
	String v1 = map.get(100);
	System.out.println(v1);
	System.out.println(map.get(200));
	
	System.out.println("------ 삭제 ------");
	map.remove(200);
	System.out.println(map.size());
	
	System.out.println("------ 전체 탐색(향상된for문 keySet) ------");
	Set<Integer> keys = map.keySet();
	for(Integer key : keys) {
		System.out.println(key + " : " + map.get(key));
	}
	System.out.println("------ 전체 탐색(향상된for문 entrySet) ------");
	Set<Map.Entry<Integer, String>> entrys = map.entrySet();
	for(Map.Entry<Integer, String> entry : entrys) {
		System.out.println(entry.getKey()+ " : " + entry.getValue());
	}
	
}
}
