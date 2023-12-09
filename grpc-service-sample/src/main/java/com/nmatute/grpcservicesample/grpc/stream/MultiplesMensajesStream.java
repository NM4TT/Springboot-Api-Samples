package com.nmatute.grpcservicesample.grpc.stream;

import java.util.Random;

import com.nmatute.grpcinterface.generated.SendMessage;
import com.nmatute.grpcinterface.generated.ReceiveMessage;

import io.grpc.stub.StreamObserver;

public class MultiplesMensajesStream implements StreamObserver<SendMessage>{
    private StreamObserver<ReceiveMessage> responseObserver;
    private Random random = new Random();

    //Necesitamos inyectar el stream observer para poder responder al cliente el mensaje
    public MultiplesMensajesStream(StreamObserver<ReceiveMessage> responseObserver){
        this.responseObserver = responseObserver;
    }

    @Override
    public void onNext(SendMessage value) {
        System.out.println("MultiplesMensajesStream - Nuevo mensaje recibido: "+value);
        
    }

    @Override
    public void onError(Throwable t) {
        System.out.println("MultiplesMensajesStream - Ocurrio un error: "+t.getMessage());
        
    }

    @Override
    public void onCompleted() {
        //Los streams unidireccionales de cliente a servidor, solo requieren una respuesta del servidor.
        ReceiveMessage respuesta = ReceiveMessage.newBuilder()
                                    .setFrom(random.nextInt())
                                    .setMessage("Hola mundo desde el servidor: "+random.nextInt())
                                    .build();

        this.responseObserver.onNext(respuesta);
        this.responseObserver.onCompleted();
    }
    
}
