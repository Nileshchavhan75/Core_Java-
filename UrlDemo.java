import java.net.*;
public class UrlDemo {
    public static void main(String[] args) {
        try{
            URL url = new URL("http://www.google.com/index.html");
            System.out.println("protocol: "+url.getProtocol());
            System.out.println("Host: "+url.getHost());
            System.out.println("port: "+url.getPort());
            System.out.println("File: "+url.getFile());
            System.out.println("External File: "+url.toExternalForm());
        }catch(Exception e){
            System.out.println("Exception occur: "+e.getMessage());
        }
    }
}
