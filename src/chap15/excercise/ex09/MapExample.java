package chap15.excercise.ex09;
import java.util.*;
public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hone", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;

//       keySet		
//		Set<String> keys = map.keySet();
//		for(String key : keys) {
//			int value = map.get(key);
//			totalScore += value;
//			if(maxScore < value) {
//				maxScore = value;
//				name = key;
//			}
//		}

//      entrySet		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			String id = entry.getKey();
			int score = entry.getValue();
			
			totalScore += score;
			if(score >maxScore) {
				maxScore = score;
				name = id;
			}
		}

		int avg = totalScore / map.size();
		
		System.out.println("평균점수 : " + avg);
		System.out.println("최고점수 : " + maxScore);
		System.out.println("최고 점수를 받은 아이디 : " + name);
	}

}
