// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/config.proto

package com.xray.transport.internet;

public interface TransportConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.transport.internet.TransportConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of network that this settings supports.
   * Deprecated. Use the string form below.
   * </pre>
   *
   * <code>.xray.transport.internet.TransportProtocol protocol = 1 [deprecated = true];</code>
   * @return The enum numeric value on the wire for protocol.
   */
  @java.lang.Deprecated int getProtocolValue();
  /**
   * <pre>
   * Type of network that this settings supports.
   * Deprecated. Use the string form below.
   * </pre>
   *
   * <code>.xray.transport.internet.TransportProtocol protocol = 1 [deprecated = true];</code>
   * @return The protocol.
   */
  @java.lang.Deprecated com.xray.transport.internet.TransportProtocol getProtocol();

  /**
   * <pre>
   * Type of network that this settings supports.
   * </pre>
   *
   * <code>string protocol_name = 3;</code>
   * @return The protocolName.
   */
  java.lang.String getProtocolName();
  /**
   * <pre>
   * Type of network that this settings supports.
   * </pre>
   *
   * <code>string protocol_name = 3;</code>
   * @return The bytes for protocolName.
   */
  com.google.protobuf.ByteString
      getProtocolNameBytes();

  /**
   * <pre>
   * Specific settings. Must be of the transports.
   * </pre>
   *
   * <code>.xray.common.serial.TypedMessage settings = 2;</code>
   * @return Whether the settings field is set.
   */
  boolean hasSettings();
  /**
   * <pre>
   * Specific settings. Must be of the transports.
   * </pre>
   *
   * <code>.xray.common.serial.TypedMessage settings = 2;</code>
   * @return The settings.
   */
  com.xray.common.serial.TypedMessage getSettings();
  /**
   * <pre>
   * Specific settings. Must be of the transports.
   * </pre>
   *
   * <code>.xray.common.serial.TypedMessage settings = 2;</code>
   */
  com.xray.common.serial.TypedMessageOrBuilder getSettingsOrBuilder();
}
