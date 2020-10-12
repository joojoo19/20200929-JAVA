package chap05;

public class ArrayCopyEx03 {
	public static void main(String[] args) {
		int[][] arr1 = {{3,4},{88,99},{2,1}};
		int[][] arr2 = new int[arr1.length][];
		
		// 참조값을 새로 만들어서 복사하는 법.
		// arr1의 값을 변화 시켜도 arr2의 참조값이 다르기 때문에 영향을 받지 않음.
		for(int i=0; i<arr1.length; i++) {
			int[] newArr = new int[arr1[i].length]; // 새로운 행 생성
			
			for(int j=0; j<arr1[i].length; j++) {
				newArr[j] = arr1[i][j]; // 새로운 열 생성
			}
			arr2[i] =newArr;
		}
		arr1[0][0] =100;
		
		for(int[] arr : arr2) { // int[]arr 각각의 원소 {3,4}, {88,99}, {2,1} 
			for(int n : arr) { // int n은 각 원소의 항목값을 선택.
				System.out.println(n);
			}
		}
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
	}
}
