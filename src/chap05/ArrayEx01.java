package chap05;

public class ArrayEx01 {
	public static void main(String[] args) {
		int i1 = 30;
		int i2 = 50;
		int i3 = 20;
		int i4 = 70;
		
		int[] arr1; // 배열 참조타입
		arr1 = new int[3]; // 새로운 저장공간에 몇 개를 저장 할 수 있는지 값을 넣음.
		                   // 기본 값은 0.
		System.out.println(arr1[0]); 
		System.out.println(arr1[1]); 
		System.out.println(arr1[2]); 
//		System.out.println(arr1[3]); // 3개의 인덱스를 저장하고 있어서 컴파일 에러
		
		arr1[0] = 99;
		arr1[1] = 88;
		arr1[2] = 77;
		System.out.println(arr1[0]); 
		System.out.println(arr1[1]); 
		System.out.println(arr1[2]);
		
		int[] arr2;
		arr2 = arr1;
		arr2[0] = 55;
		
		System.out.println(arr2[0]); 
		System.out.println(arr1[0]); 

	
	}
}
