package io.grpc.examples;

import io.grpc.examples.greetingGrpc.greetingImplBase;
import io.grpc.stub.StreamObserver;

public class GreetingServiceImpl extends greetingImplBase {

	
	@Override
	public void greet(greetReq request, StreamObserver<greetResponse> responseObserver) {
		System.out.println(" cleint called greet method with request- "+request.getGreetTo());
	    greetResponse response=greetResponse.newBuilder().setResponseMessage("Hello -"+request.getGreetTo()).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
	
	
}
