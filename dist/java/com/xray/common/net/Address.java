// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/net/address.proto

package com.xray.common.net;

public final class Address {
  private Address() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_common_net_IPOrDomain_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_common_net_IPOrDomain_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030common/net/address.proto\022\017xray.common." +
      "net\"7\n\nIPOrDomain\022\014\n\002ip\030\001 \001(\014H\000\022\020\n\006domai" +
      "n\030\002 \001(\tH\000B\t\n\007addressBO\n\023com.xray.common." +
      "netP\001Z$github.com/xtls/xray-core/common/" +
      "net\252\002\017Xray.Common.Netb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_xray_common_net_IPOrDomain_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xray_common_net_IPOrDomain_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_common_net_IPOrDomain_descriptor,
        new java.lang.String[] { "Ip", "Domain", "Address", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
