package testing1;

public class IndentNumber {

	public static void main(String[] args) {

		String code ="IND-10006-A";
		try {
		    char[] indentChar = code.toCharArray(); 
		    System.out.println(Character.isDigit(indentChar[indentChar.length - 1]));
        	    if (Character.isDigit(indentChar[indentChar.length - 1])) {
        		code += "-A";
        		System.out.println(code.toUpperCase());
        	    }else {
        	    	System.out.println(code.substring(0, code.length() - 1));
        	    	System.out.println((char)(code.substring(code.length() - 1).toCharArray()[0]+1));
        			code = code.substring(0, code.length() - 1)+ (char) (code.substring(code.length() - 1).toCharArray()[0] + 1);
        			System.out.println("indent code for replaced order is " + code);
        		    System.out.println( code.toUpperCase());
        		}
        		 
		}catch(Exception e) {
		    e.printStackTrace();
		}
	    
	}

}
