package testing1;

final class TestSingleton  extends Object {

	private static TestSingleton singleton=null;
	
	
	private TestSingleton() {}
	
	
	public static TestSingleton getInstance() {
		if(singleton==null) {
			singleton= new TestSingleton();
		}
		return singleton;
	}
	
	
	public static String getString() {
		return "This is singleton return method";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
}