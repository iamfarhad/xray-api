// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/log/config.proto

package com.xray.app.log;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.app.log.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.xray.app.log.LogType error_log_type = 1;</code>
   * @return The enum numeric value on the wire for errorLogType.
   */
  int getErrorLogTypeValue();
  /**
   * <code>.xray.app.log.LogType error_log_type = 1;</code>
   * @return The errorLogType.
   */
  com.xray.app.log.LogType getErrorLogType();

  /**
   * <code>.xray.common.log.Severity error_log_level = 2;</code>
   * @return The enum numeric value on the wire for errorLogLevel.
   */
  int getErrorLogLevelValue();
  /**
   * <code>.xray.common.log.Severity error_log_level = 2;</code>
   * @return The errorLogLevel.
   */
  com.xray.common.log.Severity getErrorLogLevel();

  /**
   * <code>string error_log_path = 3;</code>
   * @return The errorLogPath.
   */
  java.lang.String getErrorLogPath();
  /**
   * <code>string error_log_path = 3;</code>
   * @return The bytes for errorLogPath.
   */
  com.google.protobuf.ByteString
      getErrorLogPathBytes();

  /**
   * <code>.xray.app.log.LogType access_log_type = 4;</code>
   * @return The enum numeric value on the wire for accessLogType.
   */
  int getAccessLogTypeValue();
  /**
   * <code>.xray.app.log.LogType access_log_type = 4;</code>
   * @return The accessLogType.
   */
  com.xray.app.log.LogType getAccessLogType();

  /**
   * <code>string access_log_path = 5;</code>
   * @return The accessLogPath.
   */
  java.lang.String getAccessLogPath();
  /**
   * <code>string access_log_path = 5;</code>
   * @return The bytes for accessLogPath.
   */
  com.google.protobuf.ByteString
      getAccessLogPathBytes();

  /**
   * <code>bool enable_dns_log = 6;</code>
   * @return The enableDnsLog.
   */
  boolean getEnableDnsLog();

  /**
   * <code>string mask_address = 7;</code>
   * @return The maskAddress.
   */
  java.lang.String getMaskAddress();
  /**
   * <code>string mask_address = 7;</code>
   * @return The bytes for maskAddress.
   */
  com.google.protobuf.ByteString
      getMaskAddressBytes();
}
