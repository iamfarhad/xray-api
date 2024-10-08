// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/headers/srtp/config.proto

package com.xray.transport.internet.headers.srtp;

/**
 * Protobuf type {@code xray.transport.internet.headers.srtp.Config}
 */
public final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.transport.internet.headers.srtp.Config)
    ConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Config();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Config(
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

            version_ = input.readUInt32();
            break;
          }
          case 16: {

            padding_ = input.readBool();
            break;
          }
          case 24: {

            extension_ = input.readBool();
            break;
          }
          case 32: {

            csrcCount_ = input.readUInt32();
            break;
          }
          case 40: {

            marker_ = input.readBool();
            break;
          }
          case 48: {

            payloadType_ = input.readUInt32();
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
    return com.xray.transport.internet.headers.srtp.ConfigOuterClass.internal_static_xray_transport_internet_headers_srtp_Config_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xray.transport.internet.headers.srtp.ConfigOuterClass.internal_static_xray_transport_internet_headers_srtp_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xray.transport.internet.headers.srtp.Config.class, com.xray.transport.internet.headers.srtp.Config.Builder.class);
  }

  public static final int VERSION_FIELD_NUMBER = 1;
  private int version_;
  /**
   * <code>uint32 version = 1;</code>
   * @return The version.
   */
  @java.lang.Override
  public int getVersion() {
    return version_;
  }

  public static final int PADDING_FIELD_NUMBER = 2;
  private boolean padding_;
  /**
   * <code>bool padding = 2;</code>
   * @return The padding.
   */
  @java.lang.Override
  public boolean getPadding() {
    return padding_;
  }

  public static final int EXTENSION_FIELD_NUMBER = 3;
  private boolean extension_;
  /**
   * <code>bool extension = 3;</code>
   * @return The extension.
   */
  @java.lang.Override
  public boolean getExtension() {
    return extension_;
  }

  public static final int CSRC_COUNT_FIELD_NUMBER = 4;
  private int csrcCount_;
  /**
   * <code>uint32 csrc_count = 4;</code>
   * @return The csrcCount.
   */
  @java.lang.Override
  public int getCsrcCount() {
    return csrcCount_;
  }

  public static final int MARKER_FIELD_NUMBER = 5;
  private boolean marker_;
  /**
   * <code>bool marker = 5;</code>
   * @return The marker.
   */
  @java.lang.Override
  public boolean getMarker() {
    return marker_;
  }

  public static final int PAYLOAD_TYPE_FIELD_NUMBER = 6;
  private int payloadType_;
  /**
   * <code>uint32 payload_type = 6;</code>
   * @return The payloadType.
   */
  @java.lang.Override
  public int getPayloadType() {
    return payloadType_;
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
    if (version_ != 0) {
      output.writeUInt32(1, version_);
    }
    if (padding_ != false) {
      output.writeBool(2, padding_);
    }
    if (extension_ != false) {
      output.writeBool(3, extension_);
    }
    if (csrcCount_ != 0) {
      output.writeUInt32(4, csrcCount_);
    }
    if (marker_ != false) {
      output.writeBool(5, marker_);
    }
    if (payloadType_ != 0) {
      output.writeUInt32(6, payloadType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (version_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, version_);
    }
    if (padding_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, padding_);
    }
    if (extension_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, extension_);
    }
    if (csrcCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, csrcCount_);
    }
    if (marker_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, marker_);
    }
    if (payloadType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, payloadType_);
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
    if (!(obj instanceof com.xray.transport.internet.headers.srtp.Config)) {
      return super.equals(obj);
    }
    com.xray.transport.internet.headers.srtp.Config other = (com.xray.transport.internet.headers.srtp.Config) obj;

    if (getVersion()
        != other.getVersion()) return false;
    if (getPadding()
        != other.getPadding()) return false;
    if (getExtension()
        != other.getExtension()) return false;
    if (getCsrcCount()
        != other.getCsrcCount()) return false;
    if (getMarker()
        != other.getMarker()) return false;
    if (getPayloadType()
        != other.getPayloadType()) return false;
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
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion();
    hash = (37 * hash) + PADDING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPadding());
    hash = (37 * hash) + EXTENSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getExtension());
    hash = (37 * hash) + CSRC_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCsrcCount();
    hash = (37 * hash) + MARKER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMarker());
    hash = (37 * hash) + PAYLOAD_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getPayloadType();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xray.transport.internet.headers.srtp.Config parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.transport.internet.headers.srtp.Config parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.transport.internet.headers.srtp.Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.transport.internet.headers.srtp.Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.transport.internet.headers.srtp.Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.transport.internet.headers.srtp.Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.transport.internet.headers.srtp.Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.transport.internet.headers.srtp.Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.transport.internet.headers.srtp.Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xray.transport.internet.headers.srtp.Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.transport.internet.headers.srtp.Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.transport.internet.headers.srtp.Config parseFrom(
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
  public static Builder newBuilder(com.xray.transport.internet.headers.srtp.Config prototype) {
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
   * Protobuf type {@code xray.transport.internet.headers.srtp.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.transport.internet.headers.srtp.Config)
      com.xray.transport.internet.headers.srtp.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xray.transport.internet.headers.srtp.ConfigOuterClass.internal_static_xray_transport_internet_headers_srtp_Config_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xray.transport.internet.headers.srtp.ConfigOuterClass.internal_static_xray_transport_internet_headers_srtp_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xray.transport.internet.headers.srtp.Config.class, com.xray.transport.internet.headers.srtp.Config.Builder.class);
    }

    // Construct using com.xray.transport.internet.headers.srtp.Config.newBuilder()
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
      version_ = 0;

      padding_ = false;

      extension_ = false;

      csrcCount_ = 0;

      marker_ = false;

      payloadType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xray.transport.internet.headers.srtp.ConfigOuterClass.internal_static_xray_transport_internet_headers_srtp_Config_descriptor;
    }

    @java.lang.Override
    public com.xray.transport.internet.headers.srtp.Config getDefaultInstanceForType() {
      return com.xray.transport.internet.headers.srtp.Config.getDefaultInstance();
    }

    @java.lang.Override
    public com.xray.transport.internet.headers.srtp.Config build() {
      com.xray.transport.internet.headers.srtp.Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xray.transport.internet.headers.srtp.Config buildPartial() {
      com.xray.transport.internet.headers.srtp.Config result = new com.xray.transport.internet.headers.srtp.Config(this);
      result.version_ = version_;
      result.padding_ = padding_;
      result.extension_ = extension_;
      result.csrcCount_ = csrcCount_;
      result.marker_ = marker_;
      result.payloadType_ = payloadType_;
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
      if (other instanceof com.xray.transport.internet.headers.srtp.Config) {
        return mergeFrom((com.xray.transport.internet.headers.srtp.Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xray.transport.internet.headers.srtp.Config other) {
      if (other == com.xray.transport.internet.headers.srtp.Config.getDefaultInstance()) return this;
      if (other.getVersion() != 0) {
        setVersion(other.getVersion());
      }
      if (other.getPadding() != false) {
        setPadding(other.getPadding());
      }
      if (other.getExtension() != false) {
        setExtension(other.getExtension());
      }
      if (other.getCsrcCount() != 0) {
        setCsrcCount(other.getCsrcCount());
      }
      if (other.getMarker() != false) {
        setMarker(other.getMarker());
      }
      if (other.getPayloadType() != 0) {
        setPayloadType(other.getPayloadType());
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
      com.xray.transport.internet.headers.srtp.Config parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xray.transport.internet.headers.srtp.Config) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int version_ ;
    /**
     * <code>uint32 version = 1;</code>
     * @return The version.
     */
    @java.lang.Override
    public int getVersion() {
      return version_;
    }
    /**
     * <code>uint32 version = 1;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(int value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 version = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      
      version_ = 0;
      onChanged();
      return this;
    }

    private boolean padding_ ;
    /**
     * <code>bool padding = 2;</code>
     * @return The padding.
     */
    @java.lang.Override
    public boolean getPadding() {
      return padding_;
    }
    /**
     * <code>bool padding = 2;</code>
     * @param value The padding to set.
     * @return This builder for chaining.
     */
    public Builder setPadding(boolean value) {
      
      padding_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool padding = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPadding() {
      
      padding_ = false;
      onChanged();
      return this;
    }

    private boolean extension_ ;
    /**
     * <code>bool extension = 3;</code>
     * @return The extension.
     */
    @java.lang.Override
    public boolean getExtension() {
      return extension_;
    }
    /**
     * <code>bool extension = 3;</code>
     * @param value The extension to set.
     * @return This builder for chaining.
     */
    public Builder setExtension(boolean value) {
      
      extension_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool extension = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearExtension() {
      
      extension_ = false;
      onChanged();
      return this;
    }

    private int csrcCount_ ;
    /**
     * <code>uint32 csrc_count = 4;</code>
     * @return The csrcCount.
     */
    @java.lang.Override
    public int getCsrcCount() {
      return csrcCount_;
    }
    /**
     * <code>uint32 csrc_count = 4;</code>
     * @param value The csrcCount to set.
     * @return This builder for chaining.
     */
    public Builder setCsrcCount(int value) {
      
      csrcCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 csrc_count = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCsrcCount() {
      
      csrcCount_ = 0;
      onChanged();
      return this;
    }

    private boolean marker_ ;
    /**
     * <code>bool marker = 5;</code>
     * @return The marker.
     */
    @java.lang.Override
    public boolean getMarker() {
      return marker_;
    }
    /**
     * <code>bool marker = 5;</code>
     * @param value The marker to set.
     * @return This builder for chaining.
     */
    public Builder setMarker(boolean value) {
      
      marker_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool marker = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearMarker() {
      
      marker_ = false;
      onChanged();
      return this;
    }

    private int payloadType_ ;
    /**
     * <code>uint32 payload_type = 6;</code>
     * @return The payloadType.
     */
    @java.lang.Override
    public int getPayloadType() {
      return payloadType_;
    }
    /**
     * <code>uint32 payload_type = 6;</code>
     * @param value The payloadType to set.
     * @return This builder for chaining.
     */
    public Builder setPayloadType(int value) {
      
      payloadType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 payload_type = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearPayloadType() {
      
      payloadType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:xray.transport.internet.headers.srtp.Config)
  }

  // @@protoc_insertion_point(class_scope:xray.transport.internet.headers.srtp.Config)
  private static final com.xray.transport.internet.headers.srtp.Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xray.transport.internet.headers.srtp.Config();
  }

  public static com.xray.transport.internet.headers.srtp.Config getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Config>
      PARSER = new com.google.protobuf.AbstractParser<Config>() {
    @java.lang.Override
    public Config parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Config(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Config> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Config> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xray.transport.internet.headers.srtp.Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

