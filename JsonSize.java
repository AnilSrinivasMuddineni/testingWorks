package testing1;
import org.json.*; 

public class JsonSize {

	public static void main(String args[]) throws JSONException {
        JSONObject object = new JSONObject();
 
        object.put("name", "Deepa");
        object.put("Reg No", new Integer(12345));
        object.put("Mark", new Double(99));
        object.put("mail", "deepa@ebullitent.com");
        object.put("City", "Chennai");
        
        System.out.println("size is :"+ object);

        
	}
}
