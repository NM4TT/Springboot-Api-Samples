package com.nmatute.springboot.grpcinterface.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.47.0)",
    comments = "Source: ChatServiceDefinition.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ChatServiceGrpc {

  private ChatServiceGrpc() {}

  public static final String SERVICE_NAME = "com.nmatute.springboot.grpcinterface.generated.ChatService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nmatute.springboot.grpcinterface.generated.SendMessage,
      com.nmatute.springboot.grpcinterface.generated.ReceiveMessage> getSendMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendMessage",
      requestType = com.nmatute.springboot.grpcinterface.generated.SendMessage.class,
      responseType = com.nmatute.springboot.grpcinterface.generated.ReceiveMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nmatute.springboot.grpcinterface.generated.SendMessage,
      com.nmatute.springboot.grpcinterface.generated.ReceiveMessage> getSendMessageMethod() {
    io.grpc.MethodDescriptor<com.nmatute.springboot.grpcinterface.generated.SendMessage, com.nmatute.springboot.grpcinterface.generated.ReceiveMessage> getSendMessageMethod;
    if ((getSendMessageMethod = ChatServiceGrpc.getSendMessageMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getSendMessageMethod = ChatServiceGrpc.getSendMessageMethod) == null) {
          ChatServiceGrpc.getSendMessageMethod = getSendMessageMethod =
              io.grpc.MethodDescriptor.<com.nmatute.springboot.grpcinterface.generated.SendMessage, com.nmatute.springboot.grpcinterface.generated.ReceiveMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nmatute.springboot.grpcinterface.generated.SendMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nmatute.springboot.grpcinterface.generated.ReceiveMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("sendMessage"))
              .build();
        }
      }
    }
    return getSendMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nmatute.springboot.grpcinterface.generated.SendMessage,
      com.nmatute.springboot.grpcinterface.generated.ReceiveMessage> getSendMultipleMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendMultipleMessages",
      requestType = com.nmatute.springboot.grpcinterface.generated.SendMessage.class,
      responseType = com.nmatute.springboot.grpcinterface.generated.ReceiveMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.nmatute.springboot.grpcinterface.generated.SendMessage,
      com.nmatute.springboot.grpcinterface.generated.ReceiveMessage> getSendMultipleMessagesMethod() {
    io.grpc.MethodDescriptor<com.nmatute.springboot.grpcinterface.generated.SendMessage, com.nmatute.springboot.grpcinterface.generated.ReceiveMessage> getSendMultipleMessagesMethod;
    if ((getSendMultipleMessagesMethod = ChatServiceGrpc.getSendMultipleMessagesMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getSendMultipleMessagesMethod = ChatServiceGrpc.getSendMultipleMessagesMethod) == null) {
          ChatServiceGrpc.getSendMultipleMessagesMethod = getSendMultipleMessagesMethod =
              io.grpc.MethodDescriptor.<com.nmatute.springboot.grpcinterface.generated.SendMessage, com.nmatute.springboot.grpcinterface.generated.ReceiveMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendMultipleMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nmatute.springboot.grpcinterface.generated.SendMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nmatute.springboot.grpcinterface.generated.ReceiveMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("sendMultipleMessages"))
              .build();
        }
      }
    }
    return getSendMultipleMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nmatute.springboot.grpcinterface.generated.SendMessage,
      com.nmatute.springboot.grpcinterface.generated.ReceiveMessage> getReceiveMultipleMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "receiveMultipleMessages",
      requestType = com.nmatute.springboot.grpcinterface.generated.SendMessage.class,
      responseType = com.nmatute.springboot.grpcinterface.generated.ReceiveMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.nmatute.springboot.grpcinterface.generated.SendMessage,
      com.nmatute.springboot.grpcinterface.generated.ReceiveMessage> getReceiveMultipleMessagesMethod() {
    io.grpc.MethodDescriptor<com.nmatute.springboot.grpcinterface.generated.SendMessage, com.nmatute.springboot.grpcinterface.generated.ReceiveMessage> getReceiveMultipleMessagesMethod;
    if ((getReceiveMultipleMessagesMethod = ChatServiceGrpc.getReceiveMultipleMessagesMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getReceiveMultipleMessagesMethod = ChatServiceGrpc.getReceiveMultipleMessagesMethod) == null) {
          ChatServiceGrpc.getReceiveMultipleMessagesMethod = getReceiveMultipleMessagesMethod =
              io.grpc.MethodDescriptor.<com.nmatute.springboot.grpcinterface.generated.SendMessage, com.nmatute.springboot.grpcinterface.generated.ReceiveMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "receiveMultipleMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nmatute.springboot.grpcinterface.generated.SendMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nmatute.springboot.grpcinterface.generated.ReceiveMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("receiveMultipleMessages"))
              .build();
        }
      }
    }
    return getReceiveMultipleMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nmatute.springboot.grpcinterface.generated.SendMessage,
      com.nmatute.springboot.grpcinterface.generated.ReceiveMessage> getSendAndReceiveMultipleMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendAndReceiveMultipleMessages",
      requestType = com.nmatute.springboot.grpcinterface.generated.SendMessage.class,
      responseType = com.nmatute.springboot.grpcinterface.generated.ReceiveMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.nmatute.springboot.grpcinterface.generated.SendMessage,
      com.nmatute.springboot.grpcinterface.generated.ReceiveMessage> getSendAndReceiveMultipleMessagesMethod() {
    io.grpc.MethodDescriptor<com.nmatute.springboot.grpcinterface.generated.SendMessage, com.nmatute.springboot.grpcinterface.generated.ReceiveMessage> getSendAndReceiveMultipleMessagesMethod;
    if ((getSendAndReceiveMultipleMessagesMethod = ChatServiceGrpc.getSendAndReceiveMultipleMessagesMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getSendAndReceiveMultipleMessagesMethod = ChatServiceGrpc.getSendAndReceiveMultipleMessagesMethod) == null) {
          ChatServiceGrpc.getSendAndReceiveMultipleMessagesMethod = getSendAndReceiveMultipleMessagesMethod =
              io.grpc.MethodDescriptor.<com.nmatute.springboot.grpcinterface.generated.SendMessage, com.nmatute.springboot.grpcinterface.generated.ReceiveMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendAndReceiveMultipleMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nmatute.springboot.grpcinterface.generated.SendMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nmatute.springboot.grpcinterface.generated.ReceiveMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("sendAndReceiveMultipleMessages"))
              .build();
        }
      }
    }
    return getSendAndReceiveMultipleMessagesMethod;
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
    public void sendMessage(com.nmatute.springboot.grpcinterface.generated.SendMessage request,
        io.grpc.stub.StreamObserver<com.nmatute.springboot.grpcinterface.generated.ReceiveMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     *Unidirectional Stream client -&gt; server
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.nmatute.springboot.grpcinterface.generated.SendMessage> sendMultipleMessages(
        io.grpc.stub.StreamObserver<com.nmatute.springboot.grpcinterface.generated.ReceiveMessage> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSendMultipleMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     *Unidirectional Stream server -&gt; client
     * </pre>
     */
    public void receiveMultipleMessages(com.nmatute.springboot.grpcinterface.generated.SendMessage request,
        io.grpc.stub.StreamObserver<com.nmatute.springboot.grpcinterface.generated.ReceiveMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReceiveMultipleMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     *Bidirectional Stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.nmatute.springboot.grpcinterface.generated.SendMessage> sendAndReceiveMultipleMessages(
        io.grpc.stub.StreamObserver<com.nmatute.springboot.grpcinterface.generated.ReceiveMessage> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSendAndReceiveMultipleMessagesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMessageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.nmatute.springboot.grpcinterface.generated.SendMessage,
                com.nmatute.springboot.grpcinterface.generated.ReceiveMessage>(
                  this, METHODID_SEND_MESSAGE)))
          .addMethod(
            getSendMultipleMessagesMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.nmatute.springboot.grpcinterface.generated.SendMessage,
                com.nmatute.springboot.grpcinterface.generated.ReceiveMessage>(
                  this, METHODID_SEND_MULTIPLE_MESSAGES)))
          .addMethod(
            getReceiveMultipleMessagesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.nmatute.springboot.grpcinterface.generated.SendMessage,
                com.nmatute.springboot.grpcinterface.generated.ReceiveMessage>(
                  this, METHODID_RECEIVE_MULTIPLE_MESSAGES)))
          .addMethod(
            getSendAndReceiveMultipleMessagesMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.nmatute.springboot.grpcinterface.generated.SendMessage,
                com.nmatute.springboot.grpcinterface.generated.ReceiveMessage>(
                  this, METHODID_SEND_AND_RECEIVE_MULTIPLE_MESSAGES)))
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
    public void sendMessage(com.nmatute.springboot.grpcinterface.generated.SendMessage request,
        io.grpc.stub.StreamObserver<com.nmatute.springboot.grpcinterface.generated.ReceiveMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Unidirectional Stream client -&gt; server
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.nmatute.springboot.grpcinterface.generated.SendMessage> sendMultipleMessages(
        io.grpc.stub.StreamObserver<com.nmatute.springboot.grpcinterface.generated.ReceiveMessage> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSendMultipleMessagesMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *Unidirectional Stream server -&gt; client
     * </pre>
     */
    public void receiveMultipleMessages(com.nmatute.springboot.grpcinterface.generated.SendMessage request,
        io.grpc.stub.StreamObserver<com.nmatute.springboot.grpcinterface.generated.ReceiveMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getReceiveMultipleMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Bidirectional Stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.nmatute.springboot.grpcinterface.generated.SendMessage> sendAndReceiveMultipleMessages(
        io.grpc.stub.StreamObserver<com.nmatute.springboot.grpcinterface.generated.ReceiveMessage> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSendAndReceiveMultipleMessagesMethod(), getCallOptions()), responseObserver);
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
    public com.nmatute.springboot.grpcinterface.generated.ReceiveMessage sendMessage(com.nmatute.springboot.grpcinterface.generated.SendMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Unidirectional Stream server -&gt; client
     * </pre>
     */
    public java.util.Iterator<com.nmatute.springboot.grpcinterface.generated.ReceiveMessage> receiveMultipleMessages(
        com.nmatute.springboot.grpcinterface.generated.SendMessage request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getReceiveMultipleMessagesMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.nmatute.springboot.grpcinterface.generated.ReceiveMessage> sendMessage(
        com.nmatute.springboot.grpcinterface.generated.SendMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_MESSAGE = 0;
  private static final int METHODID_RECEIVE_MULTIPLE_MESSAGES = 1;
  private static final int METHODID_SEND_MULTIPLE_MESSAGES = 2;
  private static final int METHODID_SEND_AND_RECEIVE_MULTIPLE_MESSAGES = 3;

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
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((com.nmatute.springboot.grpcinterface.generated.SendMessage) request,
              (io.grpc.stub.StreamObserver<com.nmatute.springboot.grpcinterface.generated.ReceiveMessage>) responseObserver);
          break;
        case METHODID_RECEIVE_MULTIPLE_MESSAGES:
          serviceImpl.receiveMultipleMessages((com.nmatute.springboot.grpcinterface.generated.SendMessage) request,
              (io.grpc.stub.StreamObserver<com.nmatute.springboot.grpcinterface.generated.ReceiveMessage>) responseObserver);
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
        case METHODID_SEND_MULTIPLE_MESSAGES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendMultipleMessages(
              (io.grpc.stub.StreamObserver<com.nmatute.springboot.grpcinterface.generated.ReceiveMessage>) responseObserver);
        case METHODID_SEND_AND_RECEIVE_MULTIPLE_MESSAGES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendAndReceiveMultipleMessages(
              (io.grpc.stub.StreamObserver<com.nmatute.springboot.grpcinterface.generated.ReceiveMessage>) responseObserver);
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
      return com.nmatute.springboot.grpcinterface.generated.ChatServiceProto.getDescriptor();
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
              .addMethod(getSendMessageMethod())
              .addMethod(getSendMultipleMessagesMethod())
              .addMethod(getReceiveMultipleMessagesMethod())
              .addMethod(getSendAndReceiveMultipleMessagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
