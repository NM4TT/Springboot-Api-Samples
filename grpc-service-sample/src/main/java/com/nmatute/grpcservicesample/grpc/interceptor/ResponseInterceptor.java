package com.nmatute.grpcservicesample.grpc.interceptor;

import org.lognet.springboot.grpc.GRpcGlobalInterceptor;

import io.grpc.ForwardingServerCall;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCall.Listener;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;

@GRpcGlobalInterceptor
public class ResponseInterceptor implements ServerInterceptor {

    @Override
    public <ReqT, RespT> Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers,
            ServerCallHandler<ReqT, RespT> next) {
    
        //This interceptor obtains the response before it is send back to client
         return next.startCall(new ResponseHandler<>(call),headers);
    }
    

    private class ResponseHandler<ReqT, RespT> extends ForwardingServerCall.SimpleForwardingServerCall<ReqT, RespT>{

        ResponseHandler(ServerCall<ReqT, RespT> serverCall) {
            super(serverCall);
        }

        @Override
        public void sendMessage(RespT message) {
            //Before the response is sent, we could do some logging for debug
            System.out.println("This is the response: ".concat(message.toString()));

            super.sendMessage(message);
        }

        @Override
        public void sendHeaders(Metadata headers) { 
            //We add metadata before the response is sent.
            headers.put(Metadata.Key.of("MY-METADATA", Metadata.ASCII_STRING_MARSHALLER),"HelloWorldServer");
            super.sendHeaders(headers);
        }
    }
}
