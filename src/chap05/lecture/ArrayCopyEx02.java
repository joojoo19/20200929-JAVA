package chap05.lecture;

public class ArrayCopyEx02 {
	public static void main(String[] args) {
		int[][] arr1 = {{3,4}, {88,99}, {2,1}};
		int[][] arr2 = new int[arr1.length][];
		
		for(int i =0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		arr1[0][0] = 100;
		// arr1과 arr2의 참조값이 같기 때문에 arr1의 항목값이 변화하면 
		// arr2의 항목값도 영향을 주어 변함.
		
		for(int[] arr : arr2) {
			for(int n: arr) {
				System.out.println(n);
			}
		}
		
	}
}
