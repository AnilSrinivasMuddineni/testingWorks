package testing1;

public class ClassForCallingTestingInterfaceImplClass extends TestingInterfaceImpl {
	
	
	public static void main(String[] args) {
		ClassForCallingTestingInterfaceImplClass testingInterfaceImpl = new ClassForCallingTestingInterfaceImplClass();
		
		TestingInterfaceImpl testingInterface = new TestingInterfaceImpl();
		testingInterfaceImpl.TestingInterfaceImplMethod();
		testingInterfaceImpl.normalMethod();
		testingInterface.declaredMethod1(" anil", " declred method");
		TestingInterface.checkingInterface("Anil" , "from Impl Class");
	}
	
	public void normalMethod() {
		System.out.println("ClassForCallingTestingInterfaceImplClass method");
	}
	
}
