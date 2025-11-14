import java.net.*;
public class InetAddressDemo {
    public static void main(String[] args) {
        try{
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("Local host: "+localhost);
            System.out.println("Host name: "+localhost.getHostName());
            System.out.println("Address: "+localhost.getHostAddress());
            System.out.println("Decription: "+localhost.toString());
            System.out.println("Multicast: "+localhost.isMulticastAddress());
        }catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
