package chap04.excercise;

public class Excercise04 {
	public static void main(String[] args) {

	
		
		while(true) {
			int a = (int)(Math.random()*6)+1;
			int b = (int)(Math.random()*6)+1;
			int c = a+b;
			System.out.println(c);
			if(c == 5) {
			    break;}
		}
		
	}
}
