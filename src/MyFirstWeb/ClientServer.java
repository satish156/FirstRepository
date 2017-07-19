package MyFirstWeb;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.tomcat.jni.Socket;

public class ClientServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http://www.javatpoint.com");
			System.out.println("server " +url.getProtocol());
			HttpURLConnection huc=(HttpURLConnection)url.openConnection();  
			for(int i=1;i<=8;i++){  
			System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));  
			}  
			huc.disconnect();  
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
