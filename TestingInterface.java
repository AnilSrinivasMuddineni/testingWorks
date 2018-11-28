package testing1;

public interface TestingInterface {

	
	
	public static void checkingInterface(String name,String age) {
		System.out.println(name);
		System.out.println(age);
	}
	
	default public void declaredMethod1(String name,String age) {
		System.out.println("declaredMethod1 name"+ name);
		System.out.println("declaredMethod1 age"+age);
	}
	
	public void declaredMethod2(String name,String age);
}
