package chap04.excercise;

public class Excercise03 {
	public static void main(String[] args) {
		// 1~100까지 3의 배수
		int sum = 0;
		

		for(int i =3; i<=100; i = i+2) {
		  sum += i;
		  i++;
		}
		System.out.println(sum);
	}
}
