package myEx;

public class ArrayCreateByValueListEx {
	public static void main(String[] args) {
		int sum1 = add(new int[] {98, 88, 56, 34, 77});
		System.out.println(sum1);
		
	}
	public static int 
	add(int[]arr) {
		int sum = 0;
		for(int i = 0; i<5; i++) {
	
			sum += arr[i];
		}
		
		return sum;
	}
}
