package chap18.textbook.s180405;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		String src = "src/chap18/textbook/s180405/FileCopy.java";
		String des = "file-copy.txt";
		
		//Reader, Writer사용해서 파일 복사
		
		Reader fr = new FileReader(src);
		Writer fw = new FileWriter(des);
		
		int rNo;
		char[] cbuf = new char[100];
		while((rNo = fr.read(cbuf)) != -1) {
			fw.write(cbuf, 0, rNo);
		}
		
		fw.flush();
		fr.close();
		fw.close();
	}
}
