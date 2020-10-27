package chap18.lecture.filterstream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterEx1 {
	public static void main(String[] args) throws Exception {
		String path = "outputStreamReader.txt";
		FileOutputStream fos = new FileOutputStream(path);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		
		osw.write("한");
		
		osw.close();
		fos.close();

	}
}
