package testing1;

import java.net.InetAddress;
import java.net.UnknownHostException;
 
public class IpToDomain {
 
    public static void main(String a[]){
     
        try {
            InetAddress host = InetAddress.getByName("192.168.3.27");
            System.out.println(host.getHostName());
            InetAddress addr = InetAddress.getByName("173.194.36.37");
            String host1 = addr.getHostName();
            String hostname = InetAddress.getByName("192.168.1.1").getHostName();
            
            System.out.println(host1+ "" + hostname);
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}