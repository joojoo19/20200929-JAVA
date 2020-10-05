package chap03.binary;

public class ConcatOperator {
  public static void main(String[] args) {
	// 연결연산자 concatenate
	  int a = 3;
	  int b = 5;
	  int c = a + b;
	  
	  String s = "9";
	  String d = a + s;
	  
	  System.out.println(d);
	  
	  String e = a + b + s; // ( 3+5정수) + str "9"
	  System.out.println(e);
	  
	  String f = s + b + a; // "9" + "5" + "3" 처음 시작이 str이면 산출도 str
	  System.out.println(f);
	  
}
}
