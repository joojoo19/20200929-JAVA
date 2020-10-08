package myEx;

public class ArrayMax {
	public static void main(String[] args) {
		int[] arr1 = {1, 5, 2, 8};
		
		int max = 0;
		
		for(int i =0; i<arr1.length; i++) {
			if(max<=arr1[i]) {
				max = arr1[i];
				System.out.println(max);
			}
		}
		System.out.println(max);
		System.out.println(arr1.length);
	}
}
