package com.xray.app.proxyman.command;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.1)",
    comments = "Source: app/proxyman/command/command.proto")
public final class HandlerServiceGrpc {

  private HandlerServiceGrpc() {}

  public static final String SERVICE_NAME = "xray.app.proxyman.command.HandlerService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAddInboundMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.xray.app.proxyman.command.AddInboundRequest,
      com.xray.app.proxyman.command.AddInboundResponse> METHOD_ADD_INBOUND = getAddInboundMethod();

  private static volatile io.grpc.MethodDescriptor<com.xray.app.proxyman.command.AddInboundRequest,
      com.xray.app.proxyman.command.AddInboundResponse> getAddInboundMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.xray.app.proxyman.command.AddInboundRequest,
      com.xray.app.proxyman.command.AddInboundResponse> getAddInboundMethod() {
    io.grpc.MethodDescriptor<com.xray.app.proxyman.command.AddInboundRequest, com.xray.app.proxyman.command.AddInboundResponse> getAddInboundMethod;
    if ((getAddInboundMethod = HandlerServiceGrpc.getAddInboundMethod) == null) {
      synchronized (HandlerServiceGrpc.class) {
        if ((getAddInboundMethod = HandlerServiceGrpc.getAddInboundMethod) == null) {
          HandlerServiceGrpc.getAddInboundMethod = getAddInboundMethod = 
              io.grpc.MethodDescriptor.<com.xray.app.proxyman.command.AddInboundRequest, com.xray.app.proxyman.command.AddInboundResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "xray.app.proxyman.command.HandlerService", "AddInbound"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xray.app.proxyman.command.AddInboundRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xray.app.proxyman.command.AddInboundResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HandlerServiceMethodDescriptorSupplier("AddInbound"))
                  .build();
          }
        }
     }
     return getAddInboundMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRemoveInboundMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.xray.app.proxyman.command.RemoveInboundRequest,
      com.xray.app.proxyman.command.RemoveInboundResponse> METHOD_REMOVE_INBOUND = getRemoveInboundMethod();

  private static volatile io.grpc.MethodDescriptor<com.xray.app.proxyman.command.RemoveInboundRequest,
      com.xray.app.proxyman.command.RemoveInboundResponse> getRemoveInboundMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.xray.app.proxyman.command.RemoveInboundRequest,
      com.xray.app.proxyman.command.RemoveInboundResponse> getRemoveInboundMethod() {
    io.grpc.MethodDescriptor<com.xray.app.proxyman.command.RemoveInboundRequest, com.xray.app.proxyman.command.RemoveInboundResponse> getRemoveInboundMethod;
    if ((getRemoveInboundMethod = HandlerServiceGrpc.getRemoveInboundMethod) == null) {
      synchronized (HandlerServiceGrpc.class) {
        if ((getRemoveInboundMethod = HandlerServiceGrpc.getRemoveInboundMethod) == null) {
          HandlerServiceGrpc.getRemoveInboundMethod = getRemoveInboundMethod = 
              io.grpc.MethodDescriptor.<com.xray.app.proxyman.command.RemoveInboundRequest, com.xray.app.proxyman.command.RemoveInboundResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "xray.app.proxyman.command.HandlerService", "RemoveInbound"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xray.app.proxyman.command.RemoveInboundRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xray.app.proxyman.command.RemoveInboundResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HandlerServiceMethodDescriptorSupplier("RemoveInbound"))
                  .build();
          }
        }
     }
     return getRemoveInboundMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAlterInboundMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.xray.app.proxyman.command.AlterInboundRequest,
      com.xray.app.proxyman.command.AlterInboundResponse> METHOD_ALTER_INBOUND = getAlterInboundMethod();

  private static volatile io.grpc.MethodDescriptor<com.xray.app.proxyman.command.AlterInboundRequest,
      com.xray.app.proxyman.command.AlterInboundResponse> getAlterInboundMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.xray.app.proxyman.command.AlterInboundRequest,
      com.xray.app.proxyman.command.AlterInboundResponse> getAlterInboundMethod() {
    io.grpc.MethodDescriptor<com.xray.app.proxyman.command.AlterInboundRequest, com.xray.app.proxyman.command.AlterInboundResponse> getAlterInboundMethod;
    if ((getAlterInboundMethod = HandlerServiceGrpc.getAlterInboundMethod) == null) {
      synchronized (HandlerServiceGrpc.class) {
        if ((getAlterInboundMethod = HandlerServiceGrpc.getAlterInboundMethod) == null) {
          HandlerServiceGrpc.getAlterInboundMethod = getAlterInboundMethod = 
              io.grpc.MethodDescriptor.<com.xray.app.proxyman.command.AlterInboundRequest, com.xray.app.proxyman.command.AlterInboundResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "xray.app.proxyman.command.HandlerService", "AlterInbound"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xray.app.proxyman.command.AlterInboundRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xray.app.proxyman.command.AlterInboundResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HandlerServiceMethodDescriptorSupplier("AlterInbound"))
                  .build();
          }
        }
     }
     return getAlterInboundMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAddOutboundMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.xray.app.proxyman.command.AddOutboundRequest,
      com.xray.app.proxyman.command.AddOutboundResponse> METHOD_ADD_OUTBOUND = getAddOutboundMethod();

  private static volatile io.grpc.MethodDescriptor<com.xray.app.proxyman.command.AddOutboundRequest,
      com.xray.app.proxyman.command.AddOutboundResponse> getAddOutboundMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.xray.app.proxyman.command.AddOutboundRequest,
      com.xray.app.proxyman.command.AddOutboundResponse> getAddOutboundMethod() {
    io.grpc.MethodDescriptor<com.xray.app.proxyman.command.AddOutboundRequest, com.xray.app.proxyman.command.AddOutboundResponse> getAddOutboundMethod;
    if ((getAddOutboundMethod = HandlerServiceGrpc.getAddOutboundMethod) == null) {
      synchronized (HandlerServiceGrpc.class) {
        if ((getAddOutboundMethod = HandlerServiceGrpc.getAddOutboundMethod) == null) {
          HandlerServiceGrpc.getAddOutboundMethod = getAddOutboundMethod = 
              io.grpc.MethodDescriptor.<com.xray.app.proxyman.command.AddOutboundRequest, com.xray.app.proxyman.command.AddOutboundResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "xray.app.proxyman.command.HandlerService", "AddOutbound"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xray.app.proxyman.command.AddOutboundRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xray.app.proxyman.command.AddOutboundResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HandlerServiceMethodDescriptorSupplier("AddOutbound"))
                  .build();
          }
        }
     }
     return getAddOutboundMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRemoveOutboundMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.xray.app.proxyman.command.RemoveOutboundRequest,
      com.xray.app.proxyman.command.RemoveOutboundResponse> METHOD_REMOVE_OUTBOUND = getRemoveOutboundMethod();

  private static volatile io.grpc.MethodDescriptor<com.xray.app.proxyman.command.RemoveOutboundRequest,
      com.xray.app.proxyman.command.RemoveOutboundResponse> getRemoveOutboundMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.xray.app.proxyman.command.RemoveOutboundRequest,
      com.xray.app.proxyman.command.RemoveOutboundResponse> getRemoveOutboundMethod() {
    io.grpc.MethodDescriptor<com.xray.app.proxyman.command.RemoveOutboundRequest, com.xray.app.proxyman.command.RemoveOutboundResponse> getRemoveOutboundMethod;
    if ((getRemoveOutboundMethod = HandlerServiceGrpc.getRemoveOutboundMethod) == null) {
      synchronized (HandlerServiceGrpc.class) {
        if ((getRemoveOutboundMethod = HandlerServiceGrpc.getRemoveOutboundMethod) == null) {
          HandlerServiceGrpc.getRemoveOutboundMethod = getRemoveOutboundMethod = 
              io.grpc.MethodDescriptor.<com.xray.app.proxyman.command.RemoveOutboundRequest, com.xray.app.proxyman.command.RemoveOutboundResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "xray.app.proxyman.command.HandlerService", "RemoveOutbound"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xray.app.proxyman.command.RemoveOutboundRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xray.app.proxyman.command.RemoveOutboundResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HandlerServiceMethodDescriptorSupplier("RemoveOutbound"))
                  .build();
          }
        }
     }
     return getRemoveOutboundMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAlterOutboundMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.xray.app.proxyman.command.AlterOutboundRequest,
      com.xray.app.proxyman.command.AlterOutboundResponse> METHOD_ALTER_OUTBOUND = getAlterOutboundMethod();

  private static volatile io.grpc.MethodDescriptor<com.xray.app.proxyman.command.AlterOutboundRequest,
      com.xray.app.proxyman.command.AlterOutboundResponse> getAlterOutboundMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.xray.app.proxyman.command.AlterOutboundRequest,
      com.xray.app.proxyman.command.AlterOutboundResponse> getAlterOutboundMethod() {
    io.grpc.MethodDescriptor<com.xray.app.proxyman.command.AlterOutboundRequest, com.xray.app.proxyman.command.AlterOutboundResponse> getAlterOutboundMethod;
    if ((getAlterOutboundMethod = HandlerServiceGrpc.getAlterOutboundMethod) == null) {
      synchronized (HandlerServiceGrpc.class) {
        if ((getAlterOutboundMethod = HandlerServiceGrpc.getAlterOutboundMethod) == null) {
          HandlerServiceGrpc.getAlterOutboundMethod = getAlterOutboundMethod = 
              io.grpc.MethodDescriptor.<com.xray.app.proxyman.command.AlterOutboundRequest, com.xray.app.proxyman.command.AlterOutboundResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "xray.app.proxyman.command.HandlerService", "AlterOutbound"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xray.app.proxyman.command.AlterOutboundRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xray.app.proxyman.command.AlterOutboundResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HandlerServiceMethodDescriptorSupplier("AlterOutbound"))
                  .build();
          }
        }
     }
     return getAlterOutboundMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HandlerServiceStub newStub(io.grpc.Channel channel) {
    return new HandlerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HandlerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HandlerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HandlerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HandlerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HandlerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addInbound(com.xray.app.proxyman.command.AddInboundRequest request,
        io.grpc.stub.StreamObserver<com.xray.app.proxyman.command.AddInboundResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddInboundMethod(), responseObserver);
    }

    /**
     */
    public void removeInbound(com.xray.app.proxyman.command.RemoveInboundRequest request,
        io.grpc.stub.StreamObserver<com.xray.app.proxyman.command.RemoveInboundResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveInboundMethod(), responseObserver);
    }

    /**
     */
    public void alterInbound(com.xray.app.proxyman.command.AlterInboundRequest request,
        io.grpc.stub.StreamObserver<com.xray.app.proxyman.command.AlterInboundResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAlterInboundMethod(), responseObserver);
    }

    /**
     */
    public void addOutbound(com.xray.app.proxyman.command.AddOutboundRequest request,
        io.grpc.stub.StreamObserver<com.xray.app.proxyman.command.AddOutboundResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddOutboundMethod(), responseObserver);
    }

    /**
     */
    public void removeOutbound(com.xray.app.proxyman.command.RemoveOutboundRequest request,
        io.grpc.stub.StreamObserver<com.xray.app.proxyman.command.RemoveOutboundResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveOutboundMethod(), responseObserver);
    }

    /**
     */
    public void alterOutbound(com.xray.app.proxyman.command.AlterOutboundRequest request,
        io.grpc.stub.StreamObserver<com.xray.app.proxyman.command.AlterOutboundResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAlterOutboundMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddInboundMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.xray.app.proxyman.command.AddInboundRequest,
                com.xray.app.proxyman.command.AddInboundResponse>(
                  this, METHODID_ADD_INBOUND)))
          .addMethod(
            getRemoveInboundMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.xray.app.proxyman.command.RemoveInboundRequest,
                com.xray.app.proxyman.command.RemoveInboundResponse>(
                  this, METHODID_REMOVE_INBOUND)))
          .addMethod(
            getAlterInboundMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.xray.app.proxyman.command.AlterInboundRequest,
                com.xray.app.proxyman.command.AlterInboundResponse>(
                  this, METHODID_ALTER_INBOUND)))
          .addMethod(
            getAddOutboundMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.xray.app.proxyman.command.AddOutboundRequest,
                com.xray.app.proxyman.command.AddOutboundResponse>(
                  this, METHODID_ADD_OUTBOUND)))
          .addMethod(
            getRemoveOutboundMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.xray.app.proxyman.command.RemoveOutboundRequest,
                com.xray.app.proxyman.command.RemoveOutboundResponse>(
                  this, METHODID_REMOVE_OUTBOUND)))
          .addMethod(
            getAlterOutboundMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.xray.app.proxyman.command.AlterOutboundRequest,
                com.xray.app.proxyman.command.AlterOutboundResponse>(
                  this, METHODID_ALTER_OUTBOUND)))
          .build();
    }
  }

  /**
   */
  public static final class HandlerServiceStub extends io.grpc.stub.AbstractStub<HandlerServiceStub> {
    private HandlerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HandlerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HandlerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HandlerServiceStub(channel, callOptions);
    }

    /**
     */
    public void addInbound(com.xray.app.proxyman.command.AddInboundRequest request,
        io.grpc.stub.StreamObserver<com.xray.app.proxyman.command.AddInboundResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddInboundMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeInbound(com.xray.app.proxyman.command.RemoveInboundRequest request,
        io.grpc.stub.StreamObserver<com.xray.app.proxyman.command.RemoveInboundResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveInboundMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void alterInbound(com.xray.app.proxyman.command.AlterInboundRequest request,
        io.grpc.stub.StreamObserver<com.xray.app.proxyman.command.AlterInboundResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAlterInboundMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addOutbound(com.xray.app.proxyman.command.AddOutboundRequest request,
        io.grpc.stub.StreamObserver<com.xray.app.proxyman.command.AddOutboundResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddOutboundMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeOutbound(com.xray.app.proxyman.command.RemoveOutboundRequest request,
        io.grpc.stub.StreamObserver<com.xray.app.proxyman.command.RemoveOutboundResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveOutboundMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void alterOutbound(com.xray.app.proxyman.command.AlterOutboundRequest request,
        io.grpc.stub.StreamObserver<com.xray.app.proxyman.command.AlterOutboundResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAlterOutboundMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HandlerServiceBlockingStub extends io.grpc.stub.AbstractStub<HandlerServiceBlockingStub> {
    private HandlerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HandlerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HandlerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HandlerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.xray.app.proxyman.command.AddInboundResponse addInbound(com.xray.app.proxyman.command.AddInboundRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddInboundMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xray.app.proxyman.command.RemoveInboundResponse removeInbound(com.xray.app.proxyman.command.RemoveInboundRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveInboundMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xray.app.proxyman.command.AlterInboundResponse alterInbound(com.xray.app.proxyman.command.AlterInboundRequest request) {
      return blockingUnaryCall(
          getChannel(), getAlterInboundMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xray.app.proxyman.command.AddOutboundResponse addOutbound(com.xray.app.proxyman.command.AddOutboundRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddOutboundMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xray.app.proxyman.command.RemoveOutboundResponse removeOutbound(com.xray.app.proxyman.command.RemoveOutboundRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveOutboundMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xray.app.proxyman.command.AlterOutboundResponse alterOutbound(com.xray.app.proxyman.command.AlterOutboundRequest request) {
      return blockingUnaryCall(
          getChannel(), getAlterOutboundMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HandlerServiceFutureStub extends io.grpc.stub.AbstractStub<HandlerServiceFutureStub> {
    private HandlerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HandlerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HandlerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HandlerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xray.app.proxyman.command.AddInboundResponse> addInbound(
        com.xray.app.proxyman.command.AddInboundRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddInboundMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xray.app.proxyman.command.RemoveInboundResponse> removeInbound(
        com.xray.app.proxyman.command.RemoveInboundRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveInboundMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xray.app.proxyman.command.AlterInboundResponse> alterInbound(
        com.xray.app.proxyman.command.AlterInboundRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAlterInboundMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xray.app.proxyman.command.AddOutboundResponse> addOutbound(
        com.xray.app.proxyman.command.AddOutboundRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddOutboundMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xray.app.proxyman.command.RemoveOutboundResponse> removeOutbound(
        com.xray.app.proxyman.command.RemoveOutboundRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveOutboundMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xray.app.proxyman.command.AlterOutboundResponse> alterOutbound(
        com.xray.app.proxyman.command.AlterOutboundRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAlterOutboundMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_INBOUND = 0;
  private static final int METHODID_REMOVE_INBOUND = 1;
  private static final int METHODID_ALTER_INBOUND = 2;
  private static final int METHODID_ADD_OUTBOUND = 3;
  private static final int METHODID_REMOVE_OUTBOUND = 4;
  private static final int METHODID_ALTER_OUTBOUND = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HandlerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HandlerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_INBOUND:
          serviceImpl.addInbound((com.xray.app.proxyman.command.AddInboundRequest) request,
              (io.grpc.stub.StreamObserver<com.xray.app.proxyman.command.AddInboundResponse>) responseObserver);
          break;
        case METHODID_REMOVE_INBOUND:
          serviceImpl.removeInbound((com.xray.app.proxyman.command.RemoveInboundRequest) request,
              (io.grpc.stub.StreamObserver<com.xray.app.proxyman.command.RemoveInboundResponse>) responseObserver);
          break;
        case METHODID_ALTER_INBOUND:
          serviceImpl.alterInbound((com.xray.app.proxyman.command.AlterInboundRequest) request,
              (io.grpc.stub.StreamObserver<com.xray.app.proxyman.command.AlterInboundResponse>) responseObserver);
          break;
        case METHODID_ADD_OUTBOUND:
          serviceImpl.addOutbound((com.xray.app.proxyman.command.AddOutboundRequest) request,
              (io.grpc.stub.StreamObserver<com.xray.app.proxyman.command.AddOutboundResponse>) responseObserver);
          break;
        case METHODID_REMOVE_OUTBOUND:
          serviceImpl.removeOutbound((com.xray.app.proxyman.command.RemoveOutboundRequest) request,
              (io.grpc.stub.StreamObserver<com.xray.app.proxyman.command.RemoveOutboundResponse>) responseObserver);
          break;
        case METHODID_ALTER_OUTBOUND:
          serviceImpl.alterOutbound((com.xray.app.proxyman.command.AlterOutboundRequest) request,
              (io.grpc.stub.StreamObserver<com.xray.app.proxyman.command.AlterOutboundResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HandlerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HandlerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xray.app.proxyman.command.Command.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HandlerService");
    }
  }

  private static final class HandlerServiceFileDescriptorSupplier
      extends HandlerServiceBaseDescriptorSupplier {
    HandlerServiceFileDescriptorSupplier() {}
  }

  private static final class HandlerServiceMethodDescriptorSupplier
      extends HandlerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HandlerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HandlerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HandlerServiceFileDescriptorSupplier())
              .addMethod(getAddInboundMethod())
              .addMethod(getRemoveInboundMethod())
              .addMethod(getAlterInboundMethod())
              .addMethod(getAddOutboundMethod())
              .addMethod(getRemoveOutboundMethod())
              .addMethod(getAlterOutboundMethod())
              .build();
        }
      }
    }
    return result;
  }
}
