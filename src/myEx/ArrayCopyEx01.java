package myEx;

public class ArrayCopyEx01 {
public static void main(String[] args) {
	int[][] array1 = {{2, 4, 9},{33, 54, 65, 87}};
	int[][] array2 = new int[array1.length][];
	
	for(int i=0; i<array1.length; i++) {
		int[] newArr = new int[array1[i].length];
		for(int j=0; j<array1[i].length; j++) {
			newArr[j] =array1[i][j];
		}
		array2[i] = newArr;
	}
//	for(int[] arr : array2) {
//		for(int n : arr) {
//			System.out.println(n);
//		}
//	}
	
	for(int i=0; i<array2.length; i++) {
		for(int j=0; j<array2[i].length; j++) {
			System.out.println(array2[i][j]);
		}
	}
}
}
