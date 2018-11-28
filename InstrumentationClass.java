package testing1;
import java.lang.instrument.Instrumentation;

import org.json.JSONException;
import org.json.JSONObject;

 public class InstrumentationClass {

    public static void main(String [] args) {
    	 JSONObject object = new JSONObject();
         try {
			     object.put("name", "Deepa");
			     object.put("Reg No", new Integer(12345));
		         object.put("Mark", new Double(99));
		         object.put("mail", "deepa@ebullitent.com");
		         object.put("City", "Chennai");
		} catch (JSONException e) {
			e.printStackTrace();
		}
         int length = object.length();
         System.out.println(length);
         System.out.println(C.getObjectSize(object));
    }
}
 
 class C {
	 
	    private static Instrumentation instrumentation;

	    public static void premain(String args, Instrumentation inst) {
	        instrumentation = inst;
	    }

	    public static long getObjectSize(Object o) {
	        return instrumentation.getObjectSize(o);
	    }
	}