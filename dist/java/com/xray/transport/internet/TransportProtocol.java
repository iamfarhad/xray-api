// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/config.proto

package com.xray.transport.internet;

/**
 * Protobuf enum {@code xray.transport.internet.TransportProtocol}
 */
public enum TransportProtocol
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TCP = 0;</code>
   */
  TCP(0),
  /**
   * <code>UDP = 1;</code>
   */
  UDP(1),
  /**
   * <code>MKCP = 2;</code>
   */
  MKCP(2),
  /**
   * <code>WebSocket = 3;</code>
   */
  WebSocket(3),
  /**
   * <code>HTTP = 4;</code>
   */
  HTTP(4),
  /**
   * <code>HTTPUpgrade = 6;</code>
   */
  HTTPUpgrade(6),
  /**
   * <code>SplitHTTP = 7;</code>
   */
  SplitHTTP(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TCP = 0;</code>
   */
  public static final int TCP_VALUE = 0;
  /**
   * <code>UDP = 1;</code>
   */
  public static final int UDP_VALUE = 1;
  /**
   * <code>MKCP = 2;</code>
   */
  public static final int MKCP_VALUE = 2;
  /**
   * <code>WebSocket = 3;</code>
   */
  public static final int WebSocket_VALUE = 3;
  /**
   * <code>HTTP = 4;</code>
   */
  public static final int HTTP_VALUE = 4;
  /**
   * <code>HTTPUpgrade = 6;</code>
   */
  public static final int HTTPUpgrade_VALUE = 6;
  /**
   * <code>SplitHTTP = 7;</code>
   */
  public static final int SplitHTTP_VALUE = 7;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TransportProtocol valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TransportProtocol forNumber(int value) {
    switch (value) {
      case 0: return TCP;
      case 1: return UDP;
      case 2: return MKCP;
      case 3: return WebSocket;
      case 4: return HTTP;
      case 6: return HTTPUpgrade;
      case 7: return SplitHTTP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TransportProtocol>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TransportProtocol> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TransportProtocol>() {
          public TransportProtocol findValueByNumber(int number) {
            return TransportProtocol.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.xray.transport.internet.Config.getDescriptor().getEnumTypes().get(0);
  }

  private static final TransportProtocol[] VALUES = values();

  public static TransportProtocol valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TransportProtocol(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:xray.transport.internet.TransportProtocol)
}

