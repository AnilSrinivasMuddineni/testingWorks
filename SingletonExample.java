package testing1;

 class SingletonExample {

		private static SingletonExample singletonExample;
		public String s = null;
		
		private SingletonExample() {
			 s = "this is what singleton class  is pppp :)";
	  }
	  
	  public static SingletonExample SingletonExampleMethod() {
		  if(singletonExample ==null)
		   singletonExample = new SingletonExample();
		  return singletonExample;
	  }
	  
	  public String inSingleton(int value) {
		  return "why SingletonExample ... ?"+s;
	  }

	/*public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}*/

	@Override
	public String toString() {
		return "SingletonExample [inSingleton()=" + inSingleton(0) + "]";
	}
	  
	
	
	  
}


   class ForSingletonObjCreation {
	
	   public static void main(String [] args) {
		   SingletonExample singletonExample = SingletonExample.SingletonExampleMethod();
		   
	   }
	   
	   
}
