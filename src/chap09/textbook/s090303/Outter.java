package chap09.textbook.s090303;

public class Outter {
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100;
//		localVariable = 100;
		
		class inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100;
//		localVariable = 100;
		class inner {
			int result = arg + localVariable;
		}
	}
}
