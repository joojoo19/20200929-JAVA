package chap05.excercise;

public class Excercise08 {
 public static void main(String[] args) {
	int[][] array = {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
	};
	
	int sum = 0;
	double avg = 0.0;
	int cnt = 0; 
	
	for(int i =0; i<array.length; i++) {
		for(int j =0; j<array[i].length; j++) {
			sum += array[i][j];
			cnt++; // for문을 수행한 카운트
			System.out.println("cnt : "+ cnt);
		}
	}
//	avg = (double) sum / (array[0].length+array[1].length+array[2].length);
	avg = (double) sum / cnt;
	
	System.out.println("sum : " + sum);
	System.out.println("avg : " + avg);
}
}
