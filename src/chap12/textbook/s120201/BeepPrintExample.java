package chap12.textbook.s120201;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				for(int j = 0; j < 5; j++) {
					System.out.println("띵");
					try {
						Thread.sleep(500);
					} catch (Exception e2) {
					}
				}
			}
		}
	}
}
