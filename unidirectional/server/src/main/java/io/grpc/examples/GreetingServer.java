package io.grpc.examples;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GreetingServer {

	
	public static void main(String[] args) throws IOException ,InterruptedException{
		System.out.println("Starting server");
	   Server server=ServerBuilder.forPort(8080).addService(new GreetingServiceImpl()).build();
	   server.start();
	   System.out.println("Started, Awaiting terminsation");
	   
	   server.awaitTermination();
	   
   }
}
