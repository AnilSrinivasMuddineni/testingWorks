package testing1;

public class AddingSingleQuotes {

	public static void main(String[] args) {
		StringBuilder result = new StringBuilder();
	    String[] arr = new String[5];
	    arr[0] = "Anil";
	    arr[1] = "Srinivas";
	    arr[2] = "cnu";
	    for(String s: arr) {
	    	if(result.length()>0)
	    	result.append(",").append('\'').append(s).append('\'');
	    	else
    		result.append('\'').append(s).append('\'');
	    }
        System.out.println(result);
	}
	 

}
