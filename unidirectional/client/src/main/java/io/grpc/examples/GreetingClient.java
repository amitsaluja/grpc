package io.grpc.examples;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreetingClient {
  public static void main(String[] args) {
	  ManagedChannel channel=ManagedChannelBuilder.forAddress("localhost",8080).usePlaintext(true).build();
	 /*
	 greetingGrpc.greetingBlockingStub stub= greetingGrpc.newBlockingStub(channel);
     greetResponse response=  stub.greet(greetReq.newBuilder().setGreetTo("  Chanpreet !!!").build());
    */
	//  System.out.println("GOT Response from server-"+response.getResponseMessage());
  }
}
