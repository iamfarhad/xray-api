// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/observatory/burst/config.proto

package com.xray.app.observatory.burst;

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
    internal_static_xray_core_app_observatory_burst_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_core_app_observatory_burst_Config_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_core_app_observatory_burst_HealthPingConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_core_app_observatory_burst_HealthPingConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"app/observatory/burst/config.proto\022\037xr" +
      "ay.core.app.observatory.burst\"j\n\006Config\022" +
      "\030\n\020subject_selector\030\002 \003(\t\022F\n\013ping_config" +
      "\030\003 \001(\01321.xray.core.app.observatory.burst" +
      ".HealthPingConfig\"w\n\020HealthPingConfig\022\023\n" +
      "\013destination\030\001 \001(\t\022\024\n\014connectivity\030\002 \001(\t" +
      "\022\020\n\010interval\030\003 \001(\003\022\025\n\rsamplingCount\030\004 \001(" +
      "\005\022\017\n\007timeout\030\005 \001(\003Bp\n\036com.xray.app.obser" +
      "vatory.burstP\001Z/github.com/xtls/xray-cor" +
      "e/app/observatory/burst\252\002\032Xray.App.Obser" +
      "vatory.Burstb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_xray_core_app_observatory_burst_Config_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xray_core_app_observatory_burst_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_core_app_observatory_burst_Config_descriptor,
        new java.lang.String[] { "SubjectSelector", "PingConfig", });
    internal_static_xray_core_app_observatory_burst_HealthPingConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_xray_core_app_observatory_burst_HealthPingConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_core_app_observatory_burst_HealthPingConfig_descriptor,
        new java.lang.String[] { "Destination", "Connectivity", "Interval", "SamplingCount", "Timeout", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
