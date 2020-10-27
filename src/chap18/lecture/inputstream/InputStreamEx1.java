package chap18.lecture.inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx1 {
public static void main(String[] args) throws Exception {
	String path = "src/chap18/lecture/inputstream/InputStreamEx1.java";
	InputStream is = new FileInputStream(path);
	
	int cnt = 0;
	int r = 0;
	while((r = is.read()) != -1) {  // read() : 파일로부터 1byte만 읽어서 리턴. 1byte씩 읽다가 읽을 파일이 없으면 -1리턴.
		System.out.print((char)r);
		cnt++;
	}
	System.out.println(cnt);
	
	is.close();
}
}
