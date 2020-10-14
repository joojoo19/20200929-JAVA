package chap06.textbook.s061005;

public class Singleton {
	private static Singleton singleton = new Singleton(); // 내부에서 생성자를 만듦.
	
	private Singleton() { //private : 생성자는 밖에서 접근하지 못하게 함
		
	}
		static Singleton getInstance() { 
			return singleton; //내부에 생성된 생성자를 리턴.
		}

}
