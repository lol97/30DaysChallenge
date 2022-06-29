package simplilearn.anotate;

import java.lang.reflect.Method;

public class CallAnotation {
	@MyCustomAnotation(value = 90)
	public void sayHello() {
		System.out.println("hello hello");
	}
	
	public static void main(String[] args) throws Exception{
		CallAnotation callAnotation = new CallAnotation();
		Method method = callAnotation.getClass().getMethod("sayHello");
		MyCustomAnotation annotation = method.getAnnotation(MyCustomAnotation.class);
		System.out.println("value : "+annotation.value());
	}
}
