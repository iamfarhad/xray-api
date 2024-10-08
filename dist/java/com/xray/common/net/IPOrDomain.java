// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/net/address.proto

package com.xray.common.net;

/**
 * <pre>
 * Address of a network host. It may be either an IP address or a domain
 * address.
 * </pre>
 *
 * Protobuf type {@code xray.common.net.IPOrDomain}
 */
public final class IPOrDomain extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.common.net.IPOrDomain)
    IPOrDomainOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IPOrDomain.newBuilder() to construct.
  private IPOrDomain(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IPOrDomain() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IPOrDomain();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IPOrDomain(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            addressCase_ = 1;
            address_ = input.readBytes();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            addressCase_ = 2;
            address_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.xray.common.net.Address.internal_static_xray_common_net_IPOrDomain_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xray.common.net.Address.internal_static_xray_common_net_IPOrDomain_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xray.common.net.IPOrDomain.class, com.xray.common.net.IPOrDomain.Builder.class);
  }

  private int addressCase_ = 0;
  private java.lang.Object address_;
  public enum AddressCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    IP(1),
    DOMAIN(2),
    ADDRESS_NOT_SET(0);
    private final int value;
    private AddressCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AddressCase valueOf(int value) {
      return forNumber(value);
    }

    public static AddressCase forNumber(int value) {
      switch (value) {
        case 1: return IP;
        case 2: return DOMAIN;
        case 0: return ADDRESS_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public AddressCase
  getAddressCase() {
    return AddressCase.forNumber(
        addressCase_);
  }

  public static final int IP_FIELD_NUMBER = 1;
  /**
   * <pre>
   * IP address. Must by either 4 or 16 bytes.
   * </pre>
   *
   * <code>bytes ip = 1;</code>
   * @return The ip.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIp() {
    if (addressCase_ == 1) {
      return (com.google.protobuf.ByteString) address_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int DOMAIN_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Domain address.
   * </pre>
   *
   * <code>string domain = 2;</code>
   * @return The domain.
   */
  public java.lang.String getDomain() {
    java.lang.Object ref = "";
    if (addressCase_ == 2) {
      ref = address_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (addressCase_ == 2) {
        address_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Domain address.
   * </pre>
   *
   * <code>string domain = 2;</code>
   * @return The bytes for domain.
   */
  public com.google.protobuf.ByteString
      getDomainBytes() {
    java.lang.Object ref = "";
    if (addressCase_ == 2) {
      ref = address_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (addressCase_ == 2) {
        address_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (addressCase_ == 1) {
      output.writeBytes(
          1, (com.google.protobuf.ByteString) address_);
    }
    if (addressCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, address_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (addressCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            1, (com.google.protobuf.ByteString) address_);
    }
    if (addressCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, address_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.xray.common.net.IPOrDomain)) {
      return super.equals(obj);
    }
    com.xray.common.net.IPOrDomain other = (com.xray.common.net.IPOrDomain) obj;

    if (!getAddressCase().equals(other.getAddressCase())) return false;
    switch (addressCase_) {
      case 1:
        if (!getIp()
            .equals(other.getIp())) return false;
        break;
      case 2:
        if (!getDomain()
            .equals(other.getDomain())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (addressCase_) {
      case 1:
        hash = (37 * hash) + IP_FIELD_NUMBER;
        hash = (53 * hash) + getIp().hashCode();
        break;
      case 2:
        hash = (37 * hash) + DOMAIN_FIELD_NUMBER;
        hash = (53 * hash) + getDomain().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xray.common.net.IPOrDomain parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.common.net.IPOrDomain parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.common.net.IPOrDomain parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.common.net.IPOrDomain parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.common.net.IPOrDomain parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.common.net.IPOrDomain parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.common.net.IPOrDomain parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.common.net.IPOrDomain parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.common.net.IPOrDomain parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xray.common.net.IPOrDomain parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.common.net.IPOrDomain parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.common.net.IPOrDomain parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.xray.common.net.IPOrDomain prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Address of a network host. It may be either an IP address or a domain
   * address.
   * </pre>
   *
   * Protobuf type {@code xray.common.net.IPOrDomain}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.common.net.IPOrDomain)
      com.xray.common.net.IPOrDomainOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xray.common.net.Address.internal_static_xray_common_net_IPOrDomain_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xray.common.net.Address.internal_static_xray_common_net_IPOrDomain_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xray.common.net.IPOrDomain.class, com.xray.common.net.IPOrDomain.Builder.class);
    }

    // Construct using com.xray.common.net.IPOrDomain.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      addressCase_ = 0;
      address_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xray.common.net.Address.internal_static_xray_common_net_IPOrDomain_descriptor;
    }

    @java.lang.Override
    public com.xray.common.net.IPOrDomain getDefaultInstanceForType() {
      return com.xray.common.net.IPOrDomain.getDefaultInstance();
    }

    @java.lang.Override
    public com.xray.common.net.IPOrDomain build() {
      com.xray.common.net.IPOrDomain result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xray.common.net.IPOrDomain buildPartial() {
      com.xray.common.net.IPOrDomain result = new com.xray.common.net.IPOrDomain(this);
      if (addressCase_ == 1) {
        result.address_ = address_;
      }
      if (addressCase_ == 2) {
        result.address_ = address_;
      }
      result.addressCase_ = addressCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.xray.common.net.IPOrDomain) {
        return mergeFrom((com.xray.common.net.IPOrDomain)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xray.common.net.IPOrDomain other) {
      if (other == com.xray.common.net.IPOrDomain.getDefaultInstance()) return this;
      switch (other.getAddressCase()) {
        case IP: {
          setIp(other.getIp());
          break;
        }
        case DOMAIN: {
          addressCase_ = 2;
          address_ = other.address_;
          onChanged();
          break;
        }
        case ADDRESS_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.xray.common.net.IPOrDomain parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xray.common.net.IPOrDomain) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int addressCase_ = 0;
    private java.lang.Object address_;
    public AddressCase
        getAddressCase() {
      return AddressCase.forNumber(
          addressCase_);
    }

    public Builder clearAddress() {
      addressCase_ = 0;
      address_ = null;
      onChanged();
      return this;
    }


    /**
     * <pre>
     * IP address. Must by either 4 or 16 bytes.
     * </pre>
     *
     * <code>bytes ip = 1;</code>
     * @return The ip.
     */
    public com.google.protobuf.ByteString getIp() {
      if (addressCase_ == 1) {
        return (com.google.protobuf.ByteString) address_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * IP address. Must by either 4 or 16 bytes.
     * </pre>
     *
     * <code>bytes ip = 1;</code>
     * @param value The ip to set.
     * @return This builder for chaining.
     */
    public Builder setIp(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  addressCase_ = 1;
      address_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IP address. Must by either 4 or 16 bytes.
     * </pre>
     *
     * <code>bytes ip = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIp() {
      if (addressCase_ == 1) {
        addressCase_ = 0;
        address_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * Domain address.
     * </pre>
     *
     * <code>string domain = 2;</code>
     * @return The domain.
     */
    @java.lang.Override
    public java.lang.String getDomain() {
      java.lang.Object ref = "";
      if (addressCase_ == 2) {
        ref = address_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (addressCase_ == 2) {
          address_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Domain address.
     * </pre>
     *
     * <code>string domain = 2;</code>
     * @return The bytes for domain.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDomainBytes() {
      java.lang.Object ref = "";
      if (addressCase_ == 2) {
        ref = address_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (addressCase_ == 2) {
          address_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Domain address.
     * </pre>
     *
     * <code>string domain = 2;</code>
     * @param value The domain to set.
     * @return This builder for chaining.
     */
    public Builder setDomain(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  addressCase_ = 2;
      address_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Domain address.
     * </pre>
     *
     * <code>string domain = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDomain() {
      if (addressCase_ == 2) {
        addressCase_ = 0;
        address_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Domain address.
     * </pre>
     *
     * <code>string domain = 2;</code>
     * @param value The bytes for domain to set.
     * @return This builder for chaining.
     */
    public Builder setDomainBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      addressCase_ = 2;
      address_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:xray.common.net.IPOrDomain)
  }

  // @@protoc_insertion_point(class_scope:xray.common.net.IPOrDomain)
  private static final com.xray.common.net.IPOrDomain DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xray.common.net.IPOrDomain();
  }

  public static com.xray.common.net.IPOrDomain getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IPOrDomain>
      PARSER = new com.google.protobuf.AbstractParser<IPOrDomain>() {
    @java.lang.Override
    public IPOrDomain parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IPOrDomain(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IPOrDomain> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IPOrDomain> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xray.common.net.IPOrDomain getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

