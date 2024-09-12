// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/config.proto

package com.xray.transport.internet;

/**
 * Protobuf enum {@code xray.transport.internet.DomainStrategy}
 */
public enum DomainStrategy
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>AS_IS = 0;</code>
   */
  AS_IS(0),
  /**
   * <code>USE_IP = 1;</code>
   */
  USE_IP(1),
  /**
   * <code>USE_IP4 = 2;</code>
   */
  USE_IP4(2),
  /**
   * <code>USE_IP6 = 3;</code>
   */
  USE_IP6(3),
  /**
   * <code>USE_IP46 = 4;</code>
   */
  USE_IP46(4),
  /**
   * <code>USE_IP64 = 5;</code>
   */
  USE_IP64(5),
  /**
   * <code>FORCE_IP = 6;</code>
   */
  FORCE_IP(6),
  /**
   * <code>FORCE_IP4 = 7;</code>
   */
  FORCE_IP4(7),
  /**
   * <code>FORCE_IP6 = 8;</code>
   */
  FORCE_IP6(8),
  /**
   * <code>FORCE_IP46 = 9;</code>
   */
  FORCE_IP46(9),
  /**
   * <code>FORCE_IP64 = 10;</code>
   */
  FORCE_IP64(10),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>AS_IS = 0;</code>
   */
  public static final int AS_IS_VALUE = 0;
  /**
   * <code>USE_IP = 1;</code>
   */
  public static final int USE_IP_VALUE = 1;
  /**
   * <code>USE_IP4 = 2;</code>
   */
  public static final int USE_IP4_VALUE = 2;
  /**
   * <code>USE_IP6 = 3;</code>
   */
  public static final int USE_IP6_VALUE = 3;
  /**
   * <code>USE_IP46 = 4;</code>
   */
  public static final int USE_IP46_VALUE = 4;
  /**
   * <code>USE_IP64 = 5;</code>
   */
  public static final int USE_IP64_VALUE = 5;
  /**
   * <code>FORCE_IP = 6;</code>
   */
  public static final int FORCE_IP_VALUE = 6;
  /**
   * <code>FORCE_IP4 = 7;</code>
   */
  public static final int FORCE_IP4_VALUE = 7;
  /**
   * <code>FORCE_IP6 = 8;</code>
   */
  public static final int FORCE_IP6_VALUE = 8;
  /**
   * <code>FORCE_IP46 = 9;</code>
   */
  public static final int FORCE_IP46_VALUE = 9;
  /**
   * <code>FORCE_IP64 = 10;</code>
   */
  public static final int FORCE_IP64_VALUE = 10;


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
  public static DomainStrategy valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DomainStrategy forNumber(int value) {
    switch (value) {
      case 0: return AS_IS;
      case 1: return USE_IP;
      case 2: return USE_IP4;
      case 3: return USE_IP6;
      case 4: return USE_IP46;
      case 5: return USE_IP64;
      case 6: return FORCE_IP;
      case 7: return FORCE_IP4;
      case 8: return FORCE_IP6;
      case 9: return FORCE_IP46;
      case 10: return FORCE_IP64;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DomainStrategy>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DomainStrategy> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DomainStrategy>() {
          public DomainStrategy findValueByNumber(int number) {
            return DomainStrategy.forNumber(number);
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
    return com.xray.transport.internet.Config.getDescriptor().getEnumTypes().get(1);
  }

  private static final DomainStrategy[] VALUES = values();

  public static DomainStrategy valueOf(
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

  private DomainStrategy(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:xray.transport.internet.DomainStrategy)
}

