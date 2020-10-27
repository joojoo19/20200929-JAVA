package chap18.textbook.s180501;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in; // 표준입력(키보드)
		Reader reader = new InputStreamReader(is); // 바이트 단위를 문자로 출력.
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo=reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		reader.close();
	}
}
