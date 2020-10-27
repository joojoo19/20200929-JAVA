package chap18.excercise.Ex07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "src/chap18/excercise/Ex07/AddLineNumberExample.java";

		FileReader reader = new FileReader(filePath);
		BufferedReader br = new BufferedReader(reader);
		
		String line;
		int lineNum = 0;
		
		while((line = br.readLine()) != null) {
		lineNum++;
		System.out.println(lineNum + ":"+line);
		}
		
		
		
		reader.close();
		br.close();
	}
}
