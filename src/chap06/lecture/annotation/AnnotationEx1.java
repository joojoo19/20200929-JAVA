package chap06.lecture.annotation;

@MyAnnotation
public class AnnotationEx1 {
	
	
	@MyAnnotation
	private int i;
	// 주석들...
	// anntation 
	
	@Override
	@MyAnnotation
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@MyAnnotation(value = "abc", number = 5, names = {"c", "d"})  // ("abc")와 같음
	public static void  mymethod() {
		
	}
}
