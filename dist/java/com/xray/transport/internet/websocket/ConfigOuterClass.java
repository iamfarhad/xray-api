// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/websocket/config.proto

package com.xray.transport.internet.websocket;

public final class ConfigOuterClass {
  private ConfigOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_transport_internet_websocket_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_transport_internet_websocket_Config_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_transport_internet_websocket_Config_HeaderEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_transport_internet_websocket_Config_HeaderEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)transport/internet/websocket/config.pr" +
      "oto\022!xray.transport.internet.websocket\"\305" +
      "\001\n\006Config\022\014\n\004host\030\001 \001(\t\022\014\n\004path\030\002 \001(\t\022E\n" +
      "\006header\030\003 \003(\01325.xray.transport.internet." +
      "websocket.Config.HeaderEntry\022\035\n\025accept_p" +
      "roxy_protocol\030\004 \001(\010\022\n\n\002ed\030\005 \001(\r\032-\n\013Heade" +
      "rEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001B\205" +
      "\001\n%com.xray.transport.internet.websocket" +
      "P\001Z6github.com/xtls/xray-core/transport/" +
      "internet/websocket\252\002!Xray.Transport.Inte" +
      "rnet.Websocketb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_xray_transport_internet_websocket_Config_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xray_transport_internet_websocket_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_transport_internet_websocket_Config_descriptor,
        new java.lang.String[] { "Host", "Path", "Header", "AcceptProxyProtocol", "Ed", });
    internal_static_xray_transport_internet_websocket_Config_HeaderEntry_descriptor =
      internal_static_xray_transport_internet_websocket_Config_descriptor.getNestedTypes().get(0);
    internal_static_xray_transport_internet_websocket_Config_HeaderEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_transport_internet_websocket_Config_HeaderEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
