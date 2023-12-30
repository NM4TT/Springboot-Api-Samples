package com.nmatute.grpcservicesample.grpc.stream;

import java.util.Random;

import com.nmatute.grpcinterface.generated.SendMessage;
import com.nmatute.grpcinterface.generated.ReceiveMessage;

import io.grpc.stub.StreamObserver;

public class MultiRequestStream implements StreamObserver<SendMessage>{
    private StreamObserver<ReceiveMessage> responseObserver;
    private Random random = new Random();

    //We need to inject the stream observer for sending a response to the client
    public MultiRequestStream(StreamObserver<ReceiveMessage> responseObserver){
        this.responseObserver = responseObserver;
    }

    @Override
    public void onNext(SendMessage value) {
        System.out.println("MultiRequestStream - New message received: ".concat(value.toString()));
        
    }

    @Override
    public void onError(Throwable t) {
        System.out.println("MultiRequestStream - An error ocurred: ".concat(t.getMessage()));
    }

    @Override
    public void onCompleted() {
        //Unidirectional streams client to server only require a response from server.
        ReceiveMessage response = ReceiveMessage.newBuilder()
                                    .setFrom(random.nextInt())
                                    .setMessage("Hello World From Server: ".concat(String.valueOf(random.nextInt())))
                                    .build();

        this.responseObserver.onNext(response);
        this.responseObserver.onCompleted();
    }
    
}
