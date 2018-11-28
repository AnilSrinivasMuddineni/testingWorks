package testing1;


public class TestingInterfaceImpl implements TestingInterface{

	@Override
	public void declaredMethod2(String name, String age) {
		System.out.println("declaredMethod2"+name);
		System.out.println("declaredMethod2"+age);
	}

	public void TestingInterfaceImplMethod() {
		System.out.println("TestingInterfaceImpl called");
	}
	public static void main(String[] args) {
		TestingInterface.checkingInterface("Anil" , "from Impl Class");
	}
	
}
