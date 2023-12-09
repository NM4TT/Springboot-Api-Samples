package com.nmatute.grpcservicesample.service;

import com.nmatute.grpcinterface.generated.ReceiveMessage;
import com.nmatute.grpcinterface.generated.SendMessage;
import com.nmatute.grpcinterface.generated.ChatServiceGrpc.ChatServiceImplBase;
import com.nmatute.grpcservicesample.grpc.stream.MultiplesMensajesStream;
import com.nmatute.grpcservicesample.grpc.stream.MultiplesRespuestasStream;

import java.util.Random;

import org.lognet.springboot.grpc.GRpcService;

import io.grpc.stub.StreamObserver;

@GRpcService
public class ChatService extends ChatServiceImplBase{

    @Override
    public void enviarMensaje(SendMessage request, StreamObserver<ReceiveMessage> responseObserver) {
        //Crea la respuesta
        ReceiveMessage response = ReceiveMessage.newBuilder()
                                        .setFrom(1)
                                        .setMessage("Hello back!")
                                        .build();

        //Envia el mensaje
        responseObserver.onNext(response);

        //Cierra la conexión
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<SendMessage> enviarMultiplesMensajes(StreamObserver<ReceiveMessage> responseObserver) {
        return new MultiplesMensajesStream(responseObserver);
        /*
         * Una solución alternativa es crear una clase anomina, esto es hacer el new StreamObserver e implementar los métodos necesarios. 
         */
        //return new StreamObserver<SendMessage>(){} 
    }

    @Override
    public StreamObserver<SendMessage> enviarRecibirMultiplesMensajes(StreamObserver<ReceiveMessage> responseObserver) {
        return new MultiplesRespuestasStream(responseObserver);
    }

    @Override
    public void recibirMultiplesRespuestas(SendMessage request, StreamObserver<ReceiveMessage> responseObserver) {
        Random random = new Random();
        ReceiveMessage mensajeRespuesta = null;
        for(int i=0;i<10;i++){
            mensajeRespuesta = ReceiveMessage.newBuilder()
                                .setFrom(random.nextInt())
                                .setMessage("Hola stream desde servidor "+random.nextInt())
                                .build();
            responseObserver.onNext(mensajeRespuesta);
        }

        responseObserver.onCompleted();
    }
    
}
