package chap05.lecture;

public class MatrixAarrayEx01 {
	public static void main(String[] args) {
		int[][] matrix = new int[3][2]; // 행열. 인티저배열을 저장하는 배열.

		int[] arr = new int[3];
		System.out.println(arr.length);

		System.out.println(matrix[0].length); // 2.
		System.out.println(matrix[1].length); // 2
		System.out.println(matrix[2].length); // 2

		arr[0] = 99;
		arr[1] = 88;
		arr[2] = 77;

		matrix[0][0] = 9;
		matrix[2][0] = 1;

//		matrix[2][2] = 2; 존재하지 않은 행열
//		matrix[3][0] = 3; 존재하지 않은 행열

	}
}
