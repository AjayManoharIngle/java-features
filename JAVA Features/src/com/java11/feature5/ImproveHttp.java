package com.java11.feature5;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient.Version;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ImproveHttp {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// prviously java9 different packge to import 
		// from 11 onwards it is present in jva.net
		
		var uri = "https://postman-echo.com/get?uname=ajayingle&pwd=Ajay@1234";
		HttpRequest req = HttpRequest.newBuilder()
				.uri(URI.create(uri))
				.GET()
				.version(Version.HTTP_2)
				.build();
		
		HttpClient client = HttpClient.newBuilder().build();
		HttpResponse<String> resp = client.send(req,BodyHandlers.ofString());
		System.out.println(resp.statusCode());
		System.out.println(resp.body());
	}

}
