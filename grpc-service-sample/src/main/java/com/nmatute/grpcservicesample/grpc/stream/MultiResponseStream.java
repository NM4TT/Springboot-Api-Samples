package com.nmatute.grpcservicesample.grpc.stream;

import java.util.Random;

import com.nmatute.grpcinterface.generated.SendMessage;
import com.nmatute.grpcinterface.generated.ReceiveMessage;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MultiResponseStream implements StreamObserver<SendMessage>{

    private Random random = new Random();

    //We need to inject the stream observer for sending responses to client
    private final StreamObserver<ReceiveMessage> responseObserver;


    @Override
    public void onNext(SendMessage value) {
        System.out.println("MultiResponseStream - New message received: ".concat(value.toString()));

        //Once we've received a request, we can send several responses to client
        ReceiveMessage response = null;
        for(int i=0;i<10;i++){
            response = ReceiveMessage.newBuilder()
                                .setFrom(random.nextInt())
                                .setMessage("Hi bidirectional stream from server ".concat(String.valueOf(random.nextInt())))
                                .build();
            this.responseObserver.onNext(response);
        }
        //Also it's possible to close the stream executing onCompleted();
        //this.responseObserver.onCompleted();
        
    }

    @Override
    public void onError(Throwable t) {
        System.out.println("MultiResponseStream - An error ocurred: ".concat(t.getMessage()));
    }

    @Override
    public void onCompleted() {
        ReceiveMessage response = null;
        for(int i=0;i<10;i++){
            response = ReceiveMessage.newBuilder()
                                .setFrom(random.nextInt())
                                .setMessage("Hi bidirectional stream from server when complete "
                                    .concat(String.valueOf(random.nextInt())))
                                .build();
            this.responseObserver.onNext(response);
        }
        this.responseObserver.onCompleted();
    }
    
}
