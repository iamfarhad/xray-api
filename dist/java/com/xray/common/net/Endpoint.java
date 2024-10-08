// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/net/destination.proto

package com.xray.common.net;

/**
 * <pre>
 * Endpoint of a network connection.
 * </pre>
 *
 * Protobuf type {@code xray.common.net.Endpoint}
 */
public final class Endpoint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.common.net.Endpoint)
    EndpointOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Endpoint.newBuilder() to construct.
  private Endpoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Endpoint() {
    network_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Endpoint();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Endpoint(
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
          case 8: {
            int rawValue = input.readEnum();

            network_ = rawValue;
            break;
          }
          case 18: {
            com.xray.common.net.IPOrDomain.Builder subBuilder = null;
            if (address_ != null) {
              subBuilder = address_.toBuilder();
            }
            address_ = input.readMessage(com.xray.common.net.IPOrDomain.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(address_);
              address_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            port_ = input.readUInt32();
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
    return com.xray.common.net.Destination.internal_static_xray_common_net_Endpoint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xray.common.net.Destination.internal_static_xray_common_net_Endpoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xray.common.net.Endpoint.class, com.xray.common.net.Endpoint.Builder.class);
  }

  public static final int NETWORK_FIELD_NUMBER = 1;
  private int network_;
  /**
   * <code>.xray.common.net.Network network = 1;</code>
   * @return The enum numeric value on the wire for network.
   */
  @java.lang.Override public int getNetworkValue() {
    return network_;
  }
  /**
   * <code>.xray.common.net.Network network = 1;</code>
   * @return The network.
   */
  @java.lang.Override public com.xray.common.net.Network getNetwork() {
    @SuppressWarnings("deprecation")
    com.xray.common.net.Network result = com.xray.common.net.Network.valueOf(network_);
    return result == null ? com.xray.common.net.Network.UNRECOGNIZED : result;
  }

  public static final int ADDRESS_FIELD_NUMBER = 2;
  private com.xray.common.net.IPOrDomain address_;
  /**
   * <code>.xray.common.net.IPOrDomain address = 2;</code>
   * @return Whether the address field is set.
   */
  @java.lang.Override
  public boolean hasAddress() {
    return address_ != null;
  }
  /**
   * <code>.xray.common.net.IPOrDomain address = 2;</code>
   * @return The address.
   */
  @java.lang.Override
  public com.xray.common.net.IPOrDomain getAddress() {
    return address_ == null ? com.xray.common.net.IPOrDomain.getDefaultInstance() : address_;
  }
  /**
   * <code>.xray.common.net.IPOrDomain address = 2;</code>
   */
  @java.lang.Override
  public com.xray.common.net.IPOrDomainOrBuilder getAddressOrBuilder() {
    return getAddress();
  }

  public static final int PORT_FIELD_NUMBER = 3;
  private int port_;
  /**
   * <code>uint32 port = 3;</code>
   * @return The port.
   */
  @java.lang.Override
  public int getPort() {
    return port_;
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
    if (network_ != com.xray.common.net.Network.Unknown.getNumber()) {
      output.writeEnum(1, network_);
    }
    if (address_ != null) {
      output.writeMessage(2, getAddress());
    }
    if (port_ != 0) {
      output.writeUInt32(3, port_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (network_ != com.xray.common.net.Network.Unknown.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, network_);
    }
    if (address_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAddress());
    }
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, port_);
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
    if (!(obj instanceof com.xray.common.net.Endpoint)) {
      return super.equals(obj);
    }
    com.xray.common.net.Endpoint other = (com.xray.common.net.Endpoint) obj;

    if (network_ != other.network_) return false;
    if (hasAddress() != other.hasAddress()) return false;
    if (hasAddress()) {
      if (!getAddress()
          .equals(other.getAddress())) return false;
    }
    if (getPort()
        != other.getPort()) return false;
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
    hash = (37 * hash) + NETWORK_FIELD_NUMBER;
    hash = (53 * hash) + network_;
    if (hasAddress()) {
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
    }
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xray.common.net.Endpoint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.common.net.Endpoint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.common.net.Endpoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.common.net.Endpoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.common.net.Endpoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.common.net.Endpoint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.common.net.Endpoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.common.net.Endpoint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.common.net.Endpoint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xray.common.net.Endpoint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.common.net.Endpoint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.common.net.Endpoint parseFrom(
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
  public static Builder newBuilder(com.xray.common.net.Endpoint prototype) {
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
   * Endpoint of a network connection.
   * </pre>
   *
   * Protobuf type {@code xray.common.net.Endpoint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.common.net.Endpoint)
      com.xray.common.net.EndpointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xray.common.net.Destination.internal_static_xray_common_net_Endpoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xray.common.net.Destination.internal_static_xray_common_net_Endpoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xray.common.net.Endpoint.class, com.xray.common.net.Endpoint.Builder.class);
    }

    // Construct using com.xray.common.net.Endpoint.newBuilder()
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
      network_ = 0;

      if (addressBuilder_ == null) {
        address_ = null;
      } else {
        address_ = null;
        addressBuilder_ = null;
      }
      port_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xray.common.net.Destination.internal_static_xray_common_net_Endpoint_descriptor;
    }

    @java.lang.Override
    public com.xray.common.net.Endpoint getDefaultInstanceForType() {
      return com.xray.common.net.Endpoint.getDefaultInstance();
    }

    @java.lang.Override
    public com.xray.common.net.Endpoint build() {
      com.xray.common.net.Endpoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xray.common.net.Endpoint buildPartial() {
      com.xray.common.net.Endpoint result = new com.xray.common.net.Endpoint(this);
      result.network_ = network_;
      if (addressBuilder_ == null) {
        result.address_ = address_;
      } else {
        result.address_ = addressBuilder_.build();
      }
      result.port_ = port_;
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
      if (other instanceof com.xray.common.net.Endpoint) {
        return mergeFrom((com.xray.common.net.Endpoint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xray.common.net.Endpoint other) {
      if (other == com.xray.common.net.Endpoint.getDefaultInstance()) return this;
      if (other.network_ != 0) {
        setNetworkValue(other.getNetworkValue());
      }
      if (other.hasAddress()) {
        mergeAddress(other.getAddress());
      }
      if (other.getPort() != 0) {
        setPort(other.getPort());
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
      com.xray.common.net.Endpoint parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xray.common.net.Endpoint) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int network_ = 0;
    /**
     * <code>.xray.common.net.Network network = 1;</code>
     * @return The enum numeric value on the wire for network.
     */
    @java.lang.Override public int getNetworkValue() {
      return network_;
    }
    /**
     * <code>.xray.common.net.Network network = 1;</code>
     * @param value The enum numeric value on the wire for network to set.
     * @return This builder for chaining.
     */
    public Builder setNetworkValue(int value) {
      
      network_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.xray.common.net.Network network = 1;</code>
     * @return The network.
     */
    @java.lang.Override
    public com.xray.common.net.Network getNetwork() {
      @SuppressWarnings("deprecation")
      com.xray.common.net.Network result = com.xray.common.net.Network.valueOf(network_);
      return result == null ? com.xray.common.net.Network.UNRECOGNIZED : result;
    }
    /**
     * <code>.xray.common.net.Network network = 1;</code>
     * @param value The network to set.
     * @return This builder for chaining.
     */
    public Builder setNetwork(com.xray.common.net.Network value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      network_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.xray.common.net.Network network = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNetwork() {
      
      network_ = 0;
      onChanged();
      return this;
    }

    private com.xray.common.net.IPOrDomain address_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xray.common.net.IPOrDomain, com.xray.common.net.IPOrDomain.Builder, com.xray.common.net.IPOrDomainOrBuilder> addressBuilder_;
    /**
     * <code>.xray.common.net.IPOrDomain address = 2;</code>
     * @return Whether the address field is set.
     */
    public boolean hasAddress() {
      return addressBuilder_ != null || address_ != null;
    }
    /**
     * <code>.xray.common.net.IPOrDomain address = 2;</code>
     * @return The address.
     */
    public com.xray.common.net.IPOrDomain getAddress() {
      if (addressBuilder_ == null) {
        return address_ == null ? com.xray.common.net.IPOrDomain.getDefaultInstance() : address_;
      } else {
        return addressBuilder_.getMessage();
      }
    }
    /**
     * <code>.xray.common.net.IPOrDomain address = 2;</code>
     */
    public Builder setAddress(com.xray.common.net.IPOrDomain value) {
      if (addressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        address_ = value;
        onChanged();
      } else {
        addressBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.xray.common.net.IPOrDomain address = 2;</code>
     */
    public Builder setAddress(
        com.xray.common.net.IPOrDomain.Builder builderForValue) {
      if (addressBuilder_ == null) {
        address_ = builderForValue.build();
        onChanged();
      } else {
        addressBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.xray.common.net.IPOrDomain address = 2;</code>
     */
    public Builder mergeAddress(com.xray.common.net.IPOrDomain value) {
      if (addressBuilder_ == null) {
        if (address_ != null) {
          address_ =
            com.xray.common.net.IPOrDomain.newBuilder(address_).mergeFrom(value).buildPartial();
        } else {
          address_ = value;
        }
        onChanged();
      } else {
        addressBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.xray.common.net.IPOrDomain address = 2;</code>
     */
    public Builder clearAddress() {
      if (addressBuilder_ == null) {
        address_ = null;
        onChanged();
      } else {
        address_ = null;
        addressBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.xray.common.net.IPOrDomain address = 2;</code>
     */
    public com.xray.common.net.IPOrDomain.Builder getAddressBuilder() {
      
      onChanged();
      return getAddressFieldBuilder().getBuilder();
    }
    /**
     * <code>.xray.common.net.IPOrDomain address = 2;</code>
     */
    public com.xray.common.net.IPOrDomainOrBuilder getAddressOrBuilder() {
      if (addressBuilder_ != null) {
        return addressBuilder_.getMessageOrBuilder();
      } else {
        return address_ == null ?
            com.xray.common.net.IPOrDomain.getDefaultInstance() : address_;
      }
    }
    /**
     * <code>.xray.common.net.IPOrDomain address = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xray.common.net.IPOrDomain, com.xray.common.net.IPOrDomain.Builder, com.xray.common.net.IPOrDomainOrBuilder> 
        getAddressFieldBuilder() {
      if (addressBuilder_ == null) {
        addressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.xray.common.net.IPOrDomain, com.xray.common.net.IPOrDomain.Builder, com.xray.common.net.IPOrDomainOrBuilder>(
                getAddress(),
                getParentForChildren(),
                isClean());
        address_ = null;
      }
      return addressBuilder_;
    }

    private int port_ ;
    /**
     * <code>uint32 port = 3;</code>
     * @return The port.
     */
    @java.lang.Override
    public int getPort() {
      return port_;
    }
    /**
     * <code>uint32 port = 3;</code>
     * @param value The port to set.
     * @return This builder for chaining.
     */
    public Builder setPort(int value) {
      
      port_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 port = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPort() {
      
      port_ = 0;
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


    // @@protoc_insertion_point(builder_scope:xray.common.net.Endpoint)
  }

  // @@protoc_insertion_point(class_scope:xray.common.net.Endpoint)
  private static final com.xray.common.net.Endpoint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xray.common.net.Endpoint();
  }

  public static com.xray.common.net.Endpoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Endpoint>
      PARSER = new com.google.protobuf.AbstractParser<Endpoint>() {
    @java.lang.Override
    public Endpoint parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Endpoint(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Endpoint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Endpoint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xray.common.net.Endpoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

