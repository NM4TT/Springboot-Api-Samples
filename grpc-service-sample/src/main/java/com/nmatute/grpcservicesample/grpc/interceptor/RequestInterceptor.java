package com.nmatute.grpcservicesample.grpc.interceptor;

import org.lognet.springboot.grpc.GRpcGlobalInterceptor;

import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCall.Listener;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;

@GRpcGlobalInterceptor
public class RequestInterceptor implements ServerInterceptor{

    @Override
    public <ReqT, RespT> Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers,
            ServerCallHandler<ReqT, RespT> next) {
        
        //This interceptor obtains the request metadata before it reaches a service method.
        System.out.println("Catching request...");
        String metadata = headers.get(Metadata.Key.of("MY-METADATA", Metadata.ASCII_STRING_MARSHALLER));
        System.out.println("Client header: ".concat(metadata));

        return next.startCall(call, headers);
    }
    
}
