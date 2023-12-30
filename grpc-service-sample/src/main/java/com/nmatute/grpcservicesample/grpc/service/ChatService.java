package com.nmatute.grpcservicesample.grpc.service;

import com.nmatute.grpcinterface.generated.ReceiveMessage;
import com.nmatute.grpcinterface.generated.SendMessage;
import com.nmatute.grpcinterface.generated.ChatServiceGrpc.ChatServiceImplBase;
import com.nmatute.grpcservicesample.grpc.stream.MultiRequestStream;
import com.nmatute.grpcservicesample.grpc.stream.MultiResponseStream;

import java.util.Random;

import org.lognet.springboot.grpc.GRpcService;

import io.grpc.stub.StreamObserver;

@GRpcService
public class ChatService extends ChatServiceImplBase{

    @Override
    public void sendMessage(SendMessage request, StreamObserver<ReceiveMessage> responseObserver) {
        //Creates response
        ReceiveMessage response = ReceiveMessage.newBuilder()
                                        .setFrom(1)
                                        .setMessage("Hello back!")
                                        .build();

        //Sends resposne
        responseObserver.onNext(response);

        //Closes connection
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<SendMessage> sendMultipleMessages(StreamObserver<ReceiveMessage> responseObserver) {
        return new MultiRequestStream(responseObserver);
        /*
         * An alternative solution is to create an anonym class. 
         * This means to define the StreamObserver and implement the required methods
         */
        //return new StreamObserver<SendMessage>(){} 
    }

    @Override
    public StreamObserver<SendMessage> sendAndReceiveMultipleMessages(StreamObserver<ReceiveMessage> responseObserver) {
        return new MultiResponseStream(responseObserver);
    }

    @Override
    public void receiveMultipleMessages(SendMessage request, StreamObserver<ReceiveMessage> responseObserver) {
        Random random = new Random();
        ReceiveMessage responseMessage = null;
        for(int i=0;i<10;i++){
            responseMessage = ReceiveMessage.newBuilder()
                                .setFrom(random.nextInt())
                                .setMessage("Hi stream from server ".concat(String.valueOf(random.nextInt())))
                                .build();
            responseObserver.onNext(responseMessage);
        }

        responseObserver.onCompleted();
    }
    
}
