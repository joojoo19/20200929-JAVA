package myEx;

public class VarEx {
	public static void main(String[] args) {
		int a = 5;
        for(int b=1; b<=3; b++) {
               System.out.println("내부 a: " + a);
               System.out.println("내부 b: " + b);
         }
           System.out.println("외부 a: " + a);
//           System.out.println("외부 b: " + b);
	}

}
