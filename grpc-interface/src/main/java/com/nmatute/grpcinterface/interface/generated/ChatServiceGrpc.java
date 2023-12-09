package generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.47.0)",
    comments = "Source: ChatServiceDefinition.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ChatServiceGrpc {

  private ChatServiceGrpc() {}

  public static final String SERVICE_NAME = "generated.ChatService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.SendMessage,
      generated.ReceiveMessage> getEnviarMensajeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "enviarMensaje",
      requestType = generated.SendMessage.class,
      responseType = generated.ReceiveMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.SendMessage,
      generated.ReceiveMessage> getEnviarMensajeMethod() {
    io.grpc.MethodDescriptor<generated.SendMessage, generated.ReceiveMessage> getEnviarMensajeMethod;
    if ((getEnviarMensajeMethod = ChatServiceGrpc.getEnviarMensajeMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getEnviarMensajeMethod = ChatServiceGrpc.getEnviarMensajeMethod) == null) {
          ChatServiceGrpc.getEnviarMensajeMethod = getEnviarMensajeMethod =
              io.grpc.MethodDescriptor.<generated.SendMessage, generated.ReceiveMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "enviarMensaje"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.SendMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ReceiveMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("enviarMensaje"))
              .build();
        }
      }
    }
    return getEnviarMensajeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.SendMessage,
      generated.ReceiveMessage> getEnviarMultiplesMensajesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "enviarMultiplesMensajes",
      requestType = generated.SendMessage.class,
      responseType = generated.ReceiveMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<generated.SendMessage,
      generated.ReceiveMessage> getEnviarMultiplesMensajesMethod() {
    io.grpc.MethodDescriptor<generated.SendMessage, generated.ReceiveMessage> getEnviarMultiplesMensajesMethod;
    if ((getEnviarMultiplesMensajesMethod = ChatServiceGrpc.getEnviarMultiplesMensajesMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getEnviarMultiplesMensajesMethod = ChatServiceGrpc.getEnviarMultiplesMensajesMethod) == null) {
          ChatServiceGrpc.getEnviarMultiplesMensajesMethod = getEnviarMultiplesMensajesMethod =
              io.grpc.MethodDescriptor.<generated.SendMessage, generated.ReceiveMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "enviarMultiplesMensajes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.SendMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ReceiveMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("enviarMultiplesMensajes"))
              .build();
        }
      }
    }
    return getEnviarMultiplesMensajesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.SendMessage,
      generated.ReceiveMessage> getRecibirMultiplesRespuestasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "recibirMultiplesRespuestas",
      requestType = generated.SendMessage.class,
      responseType = generated.ReceiveMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generated.SendMessage,
      generated.ReceiveMessage> getRecibirMultiplesRespuestasMethod() {
    io.grpc.MethodDescriptor<generated.SendMessage, generated.ReceiveMessage> getRecibirMultiplesRespuestasMethod;
    if ((getRecibirMultiplesRespuestasMethod = ChatServiceGrpc.getRecibirMultiplesRespuestasMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getRecibirMultiplesRespuestasMethod = ChatServiceGrpc.getRecibirMultiplesRespuestasMethod) == null) {
          ChatServiceGrpc.getRecibirMultiplesRespuestasMethod = getRecibirMultiplesRespuestasMethod =
              io.grpc.MethodDescriptor.<generated.SendMessage, generated.ReceiveMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "recibirMultiplesRespuestas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.SendMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ReceiveMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("recibirMultiplesRespuestas"))
              .build();
        }
      }
    }
    return getRecibirMultiplesRespuestasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.SendMessage,
      generated.ReceiveMessage> getEnviarRecibirMultiplesMensajesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "enviarRecibirMultiplesMensajes",
      requestType = generated.SendMessage.class,
      responseType = generated.ReceiveMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<generated.SendMessage,
      generated.ReceiveMessage> getEnviarRecibirMultiplesMensajesMethod() {
    io.grpc.MethodDescriptor<generated.SendMessage, generated.ReceiveMessage> getEnviarRecibirMultiplesMensajesMethod;
    if ((getEnviarRecibirMultiplesMensajesMethod = ChatServiceGrpc.getEnviarRecibirMultiplesMensajesMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getEnviarRecibirMultiplesMensajesMethod = ChatServiceGrpc.getEnviarRecibirMultiplesMensajesMethod) == null) {
          ChatServiceGrpc.getEnviarRecibirMultiplesMensajesMethod = getEnviarRecibirMultiplesMensajesMethod =
              io.grpc.MethodDescriptor.<generated.SendMessage, generated.ReceiveMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "enviarRecibirMultiplesMensajes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.SendMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ReceiveMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("enviarRecibirMultiplesMensajes"))
              .build();
        }
      }
    }
    return getEnviarRecibirMultiplesMensajesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChatServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChatServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChatServiceStub>() {
        @java.lang.Override
        public ChatServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChatServiceStub(channel, callOptions);
        }
      };
    return ChatServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChatServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChatServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChatServiceBlockingStub>() {
        @java.lang.Override
        public ChatServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChatServiceBlockingStub(channel, callOptions);
        }
      };
    return ChatServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChatServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChatServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChatServiceFutureStub>() {
        @java.lang.Override
        public ChatServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChatServiceFutureStub(channel, callOptions);
        }
      };
    return ChatServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ChatServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Unary Communication
     * </pre>
     */
    public void enviarMensaje(generated.SendMessage request,
        io.grpc.stub.StreamObserver<generated.ReceiveMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnviarMensajeMethod(), responseObserver);
    }

    /**
     * <pre>
     *Unidirectional Stream client -&gt; server
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.SendMessage> enviarMultiplesMensajes(
        io.grpc.stub.StreamObserver<generated.ReceiveMessage> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getEnviarMultiplesMensajesMethod(), responseObserver);
    }

    /**
     * <pre>
     *Unidirectional Stream server -&gt; client
     * </pre>
     */
    public void recibirMultiplesRespuestas(generated.SendMessage request,
        io.grpc.stub.StreamObserver<generated.ReceiveMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecibirMultiplesRespuestasMethod(), responseObserver);
    }

    /**
     * <pre>
     *Bidirectional Stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.SendMessage> enviarRecibirMultiplesMensajes(
        io.grpc.stub.StreamObserver<generated.ReceiveMessage> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getEnviarRecibirMultiplesMensajesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnviarMensajeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                generated.SendMessage,
                generated.ReceiveMessage>(
                  this, METHODID_ENVIAR_MENSAJE)))
          .addMethod(
            getEnviarMultiplesMensajesMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                generated.SendMessage,
                generated.ReceiveMessage>(
                  this, METHODID_ENVIAR_MULTIPLES_MENSAJES)))
          .addMethod(
            getRecibirMultiplesRespuestasMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                generated.SendMessage,
                generated.ReceiveMessage>(
                  this, METHODID_RECIBIR_MULTIPLES_RESPUESTAS)))
          .addMethod(
            getEnviarRecibirMultiplesMensajesMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                generated.SendMessage,
                generated.ReceiveMessage>(
                  this, METHODID_ENVIAR_RECIBIR_MULTIPLES_MENSAJES)))
          .build();
    }
  }

  /**
   */
  public static final class ChatServiceStub extends io.grpc.stub.AbstractAsyncStub<ChatServiceStub> {
    private ChatServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChatServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary Communication
     * </pre>
     */
    public void enviarMensaje(generated.SendMessage request,
        io.grpc.stub.StreamObserver<generated.ReceiveMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnviarMensajeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Unidirectional Stream client -&gt; server
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.SendMessage> enviarMultiplesMensajes(
        io.grpc.stub.StreamObserver<generated.ReceiveMessage> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getEnviarMultiplesMensajesMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *Unidirectional Stream server -&gt; client
     * </pre>
     */
    public void recibirMultiplesRespuestas(generated.SendMessage request,
        io.grpc.stub.StreamObserver<generated.ReceiveMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getRecibirMultiplesRespuestasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Bidirectional Stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.SendMessage> enviarRecibirMultiplesMensajes(
        io.grpc.stub.StreamObserver<generated.ReceiveMessage> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getEnviarRecibirMultiplesMensajesMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ChatServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ChatServiceBlockingStub> {
    private ChatServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChatServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary Communication
     * </pre>
     */
    public generated.ReceiveMessage enviarMensaje(generated.SendMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnviarMensajeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Unidirectional Stream server -&gt; client
     * </pre>
     */
    public java.util.Iterator<generated.ReceiveMessage> recibirMultiplesRespuestas(
        generated.SendMessage request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getRecibirMultiplesRespuestasMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChatServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ChatServiceFutureStub> {
    private ChatServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChatServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary Communication
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.ReceiveMessage> enviarMensaje(
        generated.SendMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnviarMensajeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENVIAR_MENSAJE = 0;
  private static final int METHODID_RECIBIR_MULTIPLES_RESPUESTAS = 1;
  private static final int METHODID_ENVIAR_MULTIPLES_MENSAJES = 2;
  private static final int METHODID_ENVIAR_RECIBIR_MULTIPLES_MENSAJES = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChatServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChatServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENVIAR_MENSAJE:
          serviceImpl.enviarMensaje((generated.SendMessage) request,
              (io.grpc.stub.StreamObserver<generated.ReceiveMessage>) responseObserver);
          break;
        case METHODID_RECIBIR_MULTIPLES_RESPUESTAS:
          serviceImpl.recibirMultiplesRespuestas((generated.SendMessage) request,
              (io.grpc.stub.StreamObserver<generated.ReceiveMessage>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENVIAR_MULTIPLES_MENSAJES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.enviarMultiplesMensajes(
              (io.grpc.stub.StreamObserver<generated.ReceiveMessage>) responseObserver);
        case METHODID_ENVIAR_RECIBIR_MULTIPLES_MENSAJES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.enviarRecibirMultiplesMensajes(
              (io.grpc.stub.StreamObserver<generated.ReceiveMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ChatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChatServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.ChatServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChatService");
    }
  }

  private static final class ChatServiceFileDescriptorSupplier
      extends ChatServiceBaseDescriptorSupplier {
    ChatServiceFileDescriptorSupplier() {}
  }

  private static final class ChatServiceMethodDescriptorSupplier
      extends ChatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChatServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ChatServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChatServiceFileDescriptorSupplier())
              .addMethod(getEnviarMensajeMethod())
              .addMethod(getEnviarMultiplesMensajesMethod())
              .addMethod(getRecibirMultiplesRespuestasMethod())
              .addMethod(getEnviarRecibirMultiplesMensajesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
