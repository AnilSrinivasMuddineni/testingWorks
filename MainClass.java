package testing1;


public class MainClass {

	public static void main(String[] args) throws Exception {
				
		/*SingletonExample singletonExample = SingletonExample.SingletonExampleMethod();
		System.out.println(singletonExample.s);
		System.out.println((singletonExample.s).toUpperCase());
		SingletonExample singletonExample1 = SingletonExample.SingletonExampleMethod();
		System.out.println((singletonExample1.s));*/
		TestSingleton singleton = TestSingleton.getInstance();
		
		System.out.println(singleton.getString());
		
		TestSingleton duplicate  =(TestSingleton) singleton.clone();
		System.out.println(duplicate.getString());
	}
}
