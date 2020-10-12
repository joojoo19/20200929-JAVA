package chap05.textbook;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		               // 원본배열, 시작인덱스, 카피본배열, 카피본 시작인덱스, 복사 할 개수
		for(int i =0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ",");
		}
	}
}
