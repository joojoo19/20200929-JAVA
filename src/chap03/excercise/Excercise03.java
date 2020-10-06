package chap03.excercise;

public class Excercise03 {
	public static void main(String[] args) {
		int score = 85;
		String result = (!(score>90)) ? "가" : "나";
		               // !(false) →→  truee
		System.out.println(result);
	}
}
