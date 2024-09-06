package Junitpkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.junit.Test;

public class Responsecode {
	String link="https://www.google.com";
	
	@Test
	public void test() throws IOException, URISyntaxException
	{
		URI ob=new URI(link);                                                             //  URL ob=new URL(link);
		HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();             //  HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		con.connect(); 
		if(con.getResponseCode()==200)
		{
			System.out.println("successful----"+link);
		}
		else if(con.getResponseCode()==400)
		{
			System.out.println("brokenlink----"+link);
		}
		
		
		
	}

}
