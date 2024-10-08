// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/config.proto

package com.xray.core;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.core.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Inbound handler configurations. Must have at least one item.
   * </pre>
   *
   * <code>repeated .xray.core.InboundHandlerConfig inbound = 1;</code>
   */
  java.util.List<com.xray.core.InboundHandlerConfig> 
      getInboundList();
  /**
   * <pre>
   * Inbound handler configurations. Must have at least one item.
   * </pre>
   *
   * <code>repeated .xray.core.InboundHandlerConfig inbound = 1;</code>
   */
  com.xray.core.InboundHandlerConfig getInbound(int index);
  /**
   * <pre>
   * Inbound handler configurations. Must have at least one item.
   * </pre>
   *
   * <code>repeated .xray.core.InboundHandlerConfig inbound = 1;</code>
   */
  int getInboundCount();
  /**
   * <pre>
   * Inbound handler configurations. Must have at least one item.
   * </pre>
   *
   * <code>repeated .xray.core.InboundHandlerConfig inbound = 1;</code>
   */
  java.util.List<? extends com.xray.core.InboundHandlerConfigOrBuilder> 
      getInboundOrBuilderList();
  /**
   * <pre>
   * Inbound handler configurations. Must have at least one item.
   * </pre>
   *
   * <code>repeated .xray.core.InboundHandlerConfig inbound = 1;</code>
   */
  com.xray.core.InboundHandlerConfigOrBuilder getInboundOrBuilder(
      int index);

  /**
   * <pre>
   * Outbound handler configurations. Must have at least one item. The first
   * item is used as default for routing.
   * </pre>
   *
   * <code>repeated .xray.core.OutboundHandlerConfig outbound = 2;</code>
   */
  java.util.List<com.xray.core.OutboundHandlerConfig> 
      getOutboundList();
  /**
   * <pre>
   * Outbound handler configurations. Must have at least one item. The first
   * item is used as default for routing.
   * </pre>
   *
   * <code>repeated .xray.core.OutboundHandlerConfig outbound = 2;</code>
   */
  com.xray.core.OutboundHandlerConfig getOutbound(int index);
  /**
   * <pre>
   * Outbound handler configurations. Must have at least one item. The first
   * item is used as default for routing.
   * </pre>
   *
   * <code>repeated .xray.core.OutboundHandlerConfig outbound = 2;</code>
   */
  int getOutboundCount();
  /**
   * <pre>
   * Outbound handler configurations. Must have at least one item. The first
   * item is used as default for routing.
   * </pre>
   *
   * <code>repeated .xray.core.OutboundHandlerConfig outbound = 2;</code>
   */
  java.util.List<? extends com.xray.core.OutboundHandlerConfigOrBuilder> 
      getOutboundOrBuilderList();
  /**
   * <pre>
   * Outbound handler configurations. Must have at least one item. The first
   * item is used as default for routing.
   * </pre>
   *
   * <code>repeated .xray.core.OutboundHandlerConfig outbound = 2;</code>
   */
  com.xray.core.OutboundHandlerConfigOrBuilder getOutboundOrBuilder(
      int index);

  /**
   * <pre>
   * App is for configurations of all features in Xray. A feature must
   * implement the Feature interface, and its config type must be registered
   * through common.RegisterConfig.
   * </pre>
   *
   * <code>repeated .xray.common.serial.TypedMessage app = 4;</code>
   */
  java.util.List<com.xray.common.serial.TypedMessage> 
      getAppList();
  /**
   * <pre>
   * App is for configurations of all features in Xray. A feature must
   * implement the Feature interface, and its config type must be registered
   * through common.RegisterConfig.
   * </pre>
   *
   * <code>repeated .xray.common.serial.TypedMessage app = 4;</code>
   */
  com.xray.common.serial.TypedMessage getApp(int index);
  /**
   * <pre>
   * App is for configurations of all features in Xray. A feature must
   * implement the Feature interface, and its config type must be registered
   * through common.RegisterConfig.
   * </pre>
   *
   * <code>repeated .xray.common.serial.TypedMessage app = 4;</code>
   */
  int getAppCount();
  /**
   * <pre>
   * App is for configurations of all features in Xray. A feature must
   * implement the Feature interface, and its config type must be registered
   * through common.RegisterConfig.
   * </pre>
   *
   * <code>repeated .xray.common.serial.TypedMessage app = 4;</code>
   */
  java.util.List<? extends com.xray.common.serial.TypedMessageOrBuilder> 
      getAppOrBuilderList();
  /**
   * <pre>
   * App is for configurations of all features in Xray. A feature must
   * implement the Feature interface, and its config type must be registered
   * through common.RegisterConfig.
   * </pre>
   *
   * <code>repeated .xray.common.serial.TypedMessage app = 4;</code>
   */
  com.xray.common.serial.TypedMessageOrBuilder getAppOrBuilder(
      int index);

  /**
   * <pre>
   * Configuration for extensions. The config may not work if corresponding
   * extension is not loaded into Xray. Xray will ignore such config during
   * initialization.
   * </pre>
   *
   * <code>repeated .xray.common.serial.TypedMessage extension = 6;</code>
   */
  java.util.List<com.xray.common.serial.TypedMessage> 
      getExtensionList();
  /**
   * <pre>
   * Configuration for extensions. The config may not work if corresponding
   * extension is not loaded into Xray. Xray will ignore such config during
   * initialization.
   * </pre>
   *
   * <code>repeated .xray.common.serial.TypedMessage extension = 6;</code>
   */
  com.xray.common.serial.TypedMessage getExtension(int index);
  /**
   * <pre>
   * Configuration for extensions. The config may not work if corresponding
   * extension is not loaded into Xray. Xray will ignore such config during
   * initialization.
   * </pre>
   *
   * <code>repeated .xray.common.serial.TypedMessage extension = 6;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Configuration for extensions. The config may not work if corresponding
   * extension is not loaded into Xray. Xray will ignore such config during
   * initialization.
   * </pre>
   *
   * <code>repeated .xray.common.serial.TypedMessage extension = 6;</code>
   */
  java.util.List<? extends com.xray.common.serial.TypedMessageOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Configuration for extensions. The config may not work if corresponding
   * extension is not loaded into Xray. Xray will ignore such config during
   * initialization.
   * </pre>
   *
   * <code>repeated .xray.common.serial.TypedMessage extension = 6;</code>
   */
  com.xray.common.serial.TypedMessageOrBuilder getExtensionOrBuilder(
      int index);
}
