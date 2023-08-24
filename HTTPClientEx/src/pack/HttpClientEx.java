package pack;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class HttpClientEx {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		
		HttpClient client = HttpClient.newHttpClient();
		String url = "https://codeouter.netlify.app/about";
		
		HttpRequest request = HttpRequest.newBuilder(new URI(url)).GET().build();
		
		HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
		
		System.out.println("Request for : " + response.uri());
		System.out.println("Status code : " + response.statusCode());
		System.out.println("Response Body : " + response.body());
		System.out.println("Version : " + response.version());
		System.out.println("Headers : " );
		
		Map<String , List<String>> maps = response.headers().map();
		maps.forEach((k,v)->System.out.println(k + " : " + v));
	}
}
