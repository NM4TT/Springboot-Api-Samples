// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatServiceDefinition.proto

package generated;

public interface ReceiveMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:generated.ReceiveMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 from = 1;</code>
   * @return The from.
   */
  int getFrom();

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
