// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatServiceDefinition.proto

package com.nmatute.springboot.grpcinterface.generated;

public final class ChatServiceProto {
  private ChatServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_nmatute_springboot_grpcinterface_generated_SendMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_nmatute_springboot_grpcinterface_generated_SendMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_nmatute_springboot_grpcinterface_generated_ReceiveMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_nmatute_springboot_grpcinterface_generated_ReceiveMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ChatServiceDefinition.proto\022.com.nmatu" +
      "te.springboot.grpcinterface.generated\"*\n" +
      "\013SendMessage\022\n\n\002to\030\001 \001(\r\022\017\n\007message\030\002 \001(" +
      "\t\"/\n\016ReceiveMessage\022\014\n\004from\030\001 \001(\r\022\017\n\007mes" +
      "sage\030\002 \001(\t2\371\004\n\013ChatService\022\214\001\n\013sendMessa" +
      "ge\022;.com.nmatute.springboot.grpcinterfac" +
      "e.generated.SendMessage\032>.com.nmatute.sp" +
      "ringboot.grpcinterface.generated.Receive" +
      "Message\"\000\022\227\001\n\024sendMultipleMessages\022;.com" +
      ".nmatute.springboot.grpcinterface.genera" +
      "ted.SendMessage\032>.com.nmatute.springboot" +
      ".grpcinterface.generated.ReceiveMessage\"" +
      "\000(\001\022\232\001\n\027receiveMultipleMessages\022;.com.nm" +
      "atute.springboot.grpcinterface.generated" +
      ".SendMessage\032>.com.nmatute.springboot.gr" +
      "pcinterface.generated.ReceiveMessage\"\0000\001" +
      "\022\243\001\n\036sendAndReceiveMultipleMessages\022;.co" +
      "m.nmatute.springboot.grpcinterface.gener" +
      "ated.SendMessage\032>.com.nmatute.springboo" +
      "t.grpcinterface.generated.ReceiveMessage" +
      "\"\000(\0010\001BD\n.com.nmatute.springboot.grpcint" +
      "erface.generatedB\020ChatServiceProtoP\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_nmatute_springboot_grpcinterface_generated_SendMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_nmatute_springboot_grpcinterface_generated_SendMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_nmatute_springboot_grpcinterface_generated_SendMessage_descriptor,
        new java.lang.String[] { "To", "Message", });
    internal_static_com_nmatute_springboot_grpcinterface_generated_ReceiveMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_nmatute_springboot_grpcinterface_generated_ReceiveMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_nmatute_springboot_grpcinterface_generated_ReceiveMessage_descriptor,
        new java.lang.String[] { "From", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
