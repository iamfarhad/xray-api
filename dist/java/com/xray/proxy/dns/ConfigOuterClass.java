// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/dns/config.proto

package com.xray.proxy.dns;

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
    internal_static_xray_proxy_dns_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_proxy_dns_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026proxy/dns/config.proto\022\016xray.proxy.dns" +
      "\032\034common/net/destination.proto\"]\n\006Config" +
      "\022)\n\006server\030\001 \001(\0132\031.xray.common.net.Endpo" +
      "int\022\022\n\nuser_level\030\002 \001(\r\022\024\n\014non_IP_query\030" +
      "\003 \001(\tBL\n\022com.xray.proxy.dnsP\001Z#github.co" +
      "m/xtls/xray-core/proxy/dns\252\002\016Xray.Proxy." +
      "Dnsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xray.common.net.Destination.getDescriptor(),
        });
    internal_static_xray_proxy_dns_Config_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xray_proxy_dns_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_proxy_dns_Config_descriptor,
        new java.lang.String[] { "Server", "UserLevel", "NonIPQuery", });
    com.xray.common.net.Destination.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
