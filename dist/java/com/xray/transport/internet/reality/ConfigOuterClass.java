// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/reality/config.proto

package com.xray.transport.internet.reality;

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
    internal_static_xray_transport_internet_reality_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_transport_internet_reality_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'transport/internet/reality/config.prot" +
      "o\022\037xray.transport.internet.reality\"\321\002\n\006C" +
      "onfig\022\014\n\004show\030\001 \001(\010\022\014\n\004dest\030\002 \001(\t\022\014\n\004typ" +
      "e\030\003 \001(\t\022\014\n\004xver\030\004 \001(\004\022\024\n\014server_names\030\005 " +
      "\003(\t\022\023\n\013private_key\030\006 \001(\014\022\026\n\016min_client_v" +
      "er\030\007 \001(\014\022\026\n\016max_client_ver\030\010 \001(\014\022\025\n\rmax_" +
      "time_diff\030\t \001(\004\022\021\n\tshort_ids\030\n \003(\014\022\023\n\013Fi" +
      "ngerprint\030\025 \001(\t\022\023\n\013server_name\030\026 \001(\t\022\022\n\n" +
      "public_key\030\027 \001(\014\022\020\n\010short_id\030\030 \001(\014\022\020\n\010sp" +
      "ider_x\030\031 \001(\t\022\020\n\010spider_y\030\032 \003(\003\022\026\n\016master" +
      "_key_log\030\033 \001(\tB\177\n#com.xray.transport.int" +
      "ernet.realityP\001Z4github.com/xtls/xray-co" +
      "re/transport/internet/reality\252\002\037Xray.Tra" +
      "nsport.Internet.Realityb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_xray_transport_internet_reality_Config_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xray_transport_internet_reality_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_transport_internet_reality_Config_descriptor,
        new java.lang.String[] { "Show", "Dest", "Type", "Xver", "ServerNames", "PrivateKey", "MinClientVer", "MaxClientVer", "MaxTimeDiff", "ShortIds", "Fingerprint", "ServerName", "PublicKey", "ShortId", "SpiderX", "SpiderY", "MasterKeyLog", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
