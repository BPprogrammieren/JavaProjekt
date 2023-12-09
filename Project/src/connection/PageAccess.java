package connection;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class PageAccess {
	static HttpURLConnection connection;
	public static void main(String[] args){
		final String TOKEN = "fa1d7fd58a04dde9cd61869ed94a7ec40c5b9ba6";
		URL url;
		try {
			url = new URL("http://dronesim.facets-labs.com/api/dronetypes/69");
	
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestProperty("Authorization", TOKEN);
			connection.setRequestProperty("accept", "application/json");
			connection.setRequestMethod("GET");
			int responseCode = connection.getResponseCode();
			
//			System.out.println(responseCode);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
