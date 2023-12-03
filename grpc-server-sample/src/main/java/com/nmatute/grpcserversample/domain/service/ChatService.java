package com.nmatute.grpcserversample.domain.service;

import java.util.Random;

import org.lognet.springboot.grpc.GRpcService;


import com.nmatute.grpcclientsample.generated.ChatServiceGrpc.ChatServiceImplBase;
import com.nmatute.grpcclientsample.generated.EnviarMensaje;
import com.nmatute.grpcclientsample.generated.RecibirMensaje;

import io.grpc.stub.StreamObserver;

@GRpcService
public class ChatService extends ChatServiceImplBase {
    
    private Random random = new Random();

    /**
     * Unary method
     * Receives 1 request
     * Sends 1 response
     */
    @Override
    public void enviarMensaje(EnviarMensaje request, 
        StreamObserver<RecibirMensaje> responseObserver) {

        RecibirMensaje response = RecibirMensaje.newBuilder()
            .setFrom(123)
            .setMessage("Hi!")
            .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted(); // close connection
    }

    /**
     * Unidirectional method client -> server
     * Receives X requests (through a stream)
     * Sends 1 response
     */
    @Override
    public StreamObserver<EnviarMensaje> enviarMultiplesMensajes(StreamObserver<RecibirMensaje> responseObserver) {
        
        return new StreamObserver<EnviarMensaje>() {

            @Override
            public void onNext(EnviarMensaje value) {
                System.out.println("MultipleMessagesStream - Nuevo mensaje recibido: " + value);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("MultipleMessagesStream - Error");
            }

            @Override
            public void onCompleted() {
                RecibirMensaje response = RecibirMensaje.newBuilder()
                    .setFrom(0)
                    .setMessage("Hi from server!")
                    .build();
                responseObserver.onNext(response);
            }
            
        };

    }

    /**
     * Bidirectional
     * Receives X requests (through a stream)
     * Sends X responses (through a stream)
     */
    @Override
    public StreamObserver<EnviarMensaje> enviarRecibirMultiplesMensajes(
            StreamObserver<RecibirMensaje> responseObserver) {
        
        return new StreamObserver<EnviarMensaje>() {

            @Override
            public void onNext(EnviarMensaje value) {
                RecibirMensaje response = null;

                for (int i = 0; i < 20; i++) {
                    response = RecibirMensaje.newBuilder()
                        .setFrom(random.nextInt())
                        .setMessage("Hi bidirectional Stream from server")
                        .build();
                    responseObserver.onNext(response);
                }

            }

            @Override
            public void onError(Throwable t) {
                System.err.println("MultipleMessagesStream - Error");
            }

            @Override
            public void onCompleted() {
                RecibirMensaje response = null;

                for (int i = 0; i < 20; i++) {
                    response = RecibirMensaje.newBuilder()
                        .setFrom(random.nextInt())
                        .setMessage("Hi bidirectional Stream from server")
                        .build();
                    responseObserver.onNext(response);
                }
            }
            
        };

    }

    /**
     * Unidirectional method server -> client
     * Receives 1 request
     * Sends X responses (through a stream)
     */
    @Override
    public void recibirMultiplesRespuestas(EnviarMensaje request, StreamObserver<RecibirMensaje> responseObserver) {
        
        RecibirMensaje response = null;

        for (int i = 0; i < 20; i++) {
            response = RecibirMensaje.newBuilder()
            .setFrom(123)
            .setMessage("Hi!")
            .build();
            responseObserver.onNext(response);
        }

        responseObserver.onCompleted(); // close connection
    }

}
