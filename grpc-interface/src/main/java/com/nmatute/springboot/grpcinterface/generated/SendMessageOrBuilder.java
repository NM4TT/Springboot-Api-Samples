// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatServiceDefinition.proto

package com.nmatute.springboot.grpcinterface.generated;

public interface SendMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.nmatute.springboot.grpcinterface.generated.SendMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 to = 1;</code>
   * @return The to.
   */
  int getTo();

  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
