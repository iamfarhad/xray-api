// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/proxyman/config.proto

package com.xray.app.proxyman;

/**
 * Protobuf type {@code xray.app.proxyman.InboundHandlerConfig}
 */
public final class InboundHandlerConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.app.proxyman.InboundHandlerConfig)
    InboundHandlerConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InboundHandlerConfig.newBuilder() to construct.
  private InboundHandlerConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InboundHandlerConfig() {
    tag_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InboundHandlerConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InboundHandlerConfig(
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
            java.lang.String s = input.readStringRequireUtf8();

            tag_ = s;
            break;
          }
          case 18: {
            com.xray.common.serial.TypedMessage.Builder subBuilder = null;
            if (receiverSettings_ != null) {
              subBuilder = receiverSettings_.toBuilder();
            }
            receiverSettings_ = input.readMessage(com.xray.common.serial.TypedMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(receiverSettings_);
              receiverSettings_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.xray.common.serial.TypedMessage.Builder subBuilder = null;
            if (proxySettings_ != null) {
              subBuilder = proxySettings_.toBuilder();
            }
            proxySettings_ = input.readMessage(com.xray.common.serial.TypedMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(proxySettings_);
              proxySettings_ = subBuilder.buildPartial();
            }

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
    return com.xray.app.proxyman.Config.internal_static_xray_app_proxyman_InboundHandlerConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xray.app.proxyman.Config.internal_static_xray_app_proxyman_InboundHandlerConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xray.app.proxyman.InboundHandlerConfig.class, com.xray.app.proxyman.InboundHandlerConfig.Builder.class);
  }

  public static final int TAG_FIELD_NUMBER = 1;
  private volatile java.lang.Object tag_;
  /**
   * <code>string tag = 1;</code>
   * @return The tag.
   */
  @java.lang.Override
  public java.lang.String getTag() {
    java.lang.Object ref = tag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tag_ = s;
      return s;
    }
  }
  /**
   * <code>string tag = 1;</code>
   * @return The bytes for tag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTagBytes() {
    java.lang.Object ref = tag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECEIVER_SETTINGS_FIELD_NUMBER = 2;
  private com.xray.common.serial.TypedMessage receiverSettings_;
  /**
   * <code>.xray.common.serial.TypedMessage receiver_settings = 2;</code>
   * @return Whether the receiverSettings field is set.
   */
  @java.lang.Override
  public boolean hasReceiverSettings() {
    return receiverSettings_ != null;
  }
  /**
   * <code>.xray.common.serial.TypedMessage receiver_settings = 2;</code>
   * @return The receiverSettings.
   */
  @java.lang.Override
  public com.xray.common.serial.TypedMessage getReceiverSettings() {
    return receiverSettings_ == null ? com.xray.common.serial.TypedMessage.getDefaultInstance() : receiverSettings_;
  }
  /**
   * <code>.xray.common.serial.TypedMessage receiver_settings = 2;</code>
   */
  @java.lang.Override
  public com.xray.common.serial.TypedMessageOrBuilder getReceiverSettingsOrBuilder() {
    return getReceiverSettings();
  }

  public static final int PROXY_SETTINGS_FIELD_NUMBER = 3;
  private com.xray.common.serial.TypedMessage proxySettings_;
  /**
   * <code>.xray.common.serial.TypedMessage proxy_settings = 3;</code>
   * @return Whether the proxySettings field is set.
   */
  @java.lang.Override
  public boolean hasProxySettings() {
    return proxySettings_ != null;
  }
  /**
   * <code>.xray.common.serial.TypedMessage proxy_settings = 3;</code>
   * @return The proxySettings.
   */
  @java.lang.Override
  public com.xray.common.serial.TypedMessage getProxySettings() {
    return proxySettings_ == null ? com.xray.common.serial.TypedMessage.getDefaultInstance() : proxySettings_;
  }
  /**
   * <code>.xray.common.serial.TypedMessage proxy_settings = 3;</code>
   */
  @java.lang.Override
  public com.xray.common.serial.TypedMessageOrBuilder getProxySettingsOrBuilder() {
    return getProxySettings();
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
    if (!getTagBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tag_);
    }
    if (receiverSettings_ != null) {
      output.writeMessage(2, getReceiverSettings());
    }
    if (proxySettings_ != null) {
      output.writeMessage(3, getProxySettings());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTagBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tag_);
    }
    if (receiverSettings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getReceiverSettings());
    }
    if (proxySettings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getProxySettings());
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
    if (!(obj instanceof com.xray.app.proxyman.InboundHandlerConfig)) {
      return super.equals(obj);
    }
    com.xray.app.proxyman.InboundHandlerConfig other = (com.xray.app.proxyman.InboundHandlerConfig) obj;

    if (!getTag()
        .equals(other.getTag())) return false;
    if (hasReceiverSettings() != other.hasReceiverSettings()) return false;
    if (hasReceiverSettings()) {
      if (!getReceiverSettings()
          .equals(other.getReceiverSettings())) return false;
    }
    if (hasProxySettings() != other.hasProxySettings()) return false;
    if (hasProxySettings()) {
      if (!getProxySettings()
          .equals(other.getProxySettings())) return false;
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
    hash = (37 * hash) + TAG_FIELD_NUMBER;
    hash = (53 * hash) + getTag().hashCode();
    if (hasReceiverSettings()) {
      hash = (37 * hash) + RECEIVER_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getReceiverSettings().hashCode();
    }
    if (hasProxySettings()) {
      hash = (37 * hash) + PROXY_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getProxySettings().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xray.app.proxyman.InboundHandlerConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.proxyman.InboundHandlerConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.proxyman.InboundHandlerConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.proxyman.InboundHandlerConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.proxyman.InboundHandlerConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.proxyman.InboundHandlerConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.proxyman.InboundHandlerConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.app.proxyman.InboundHandlerConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.app.proxyman.InboundHandlerConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xray.app.proxyman.InboundHandlerConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.app.proxyman.InboundHandlerConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.app.proxyman.InboundHandlerConfig parseFrom(
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
  public static Builder newBuilder(com.xray.app.proxyman.InboundHandlerConfig prototype) {
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
   * Protobuf type {@code xray.app.proxyman.InboundHandlerConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.app.proxyman.InboundHandlerConfig)
      com.xray.app.proxyman.InboundHandlerConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xray.app.proxyman.Config.internal_static_xray_app_proxyman_InboundHandlerConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xray.app.proxyman.Config.internal_static_xray_app_proxyman_InboundHandlerConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xray.app.proxyman.InboundHandlerConfig.class, com.xray.app.proxyman.InboundHandlerConfig.Builder.class);
    }

    // Construct using com.xray.app.proxyman.InboundHandlerConfig.newBuilder()
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
      tag_ = "";

      if (receiverSettingsBuilder_ == null) {
        receiverSettings_ = null;
      } else {
        receiverSettings_ = null;
        receiverSettingsBuilder_ = null;
      }
      if (proxySettingsBuilder_ == null) {
        proxySettings_ = null;
      } else {
        proxySettings_ = null;
        proxySettingsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xray.app.proxyman.Config.internal_static_xray_app_proxyman_InboundHandlerConfig_descriptor;
    }

    @java.lang.Override
    public com.xray.app.proxyman.InboundHandlerConfig getDefaultInstanceForType() {
      return com.xray.app.proxyman.InboundHandlerConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.xray.app.proxyman.InboundHandlerConfig build() {
      com.xray.app.proxyman.InboundHandlerConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xray.app.proxyman.InboundHandlerConfig buildPartial() {
      com.xray.app.proxyman.InboundHandlerConfig result = new com.xray.app.proxyman.InboundHandlerConfig(this);
      result.tag_ = tag_;
      if (receiverSettingsBuilder_ == null) {
        result.receiverSettings_ = receiverSettings_;
      } else {
        result.receiverSettings_ = receiverSettingsBuilder_.build();
      }
      if (proxySettingsBuilder_ == null) {
        result.proxySettings_ = proxySettings_;
      } else {
        result.proxySettings_ = proxySettingsBuilder_.build();
      }
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
      if (other instanceof com.xray.app.proxyman.InboundHandlerConfig) {
        return mergeFrom((com.xray.app.proxyman.InboundHandlerConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xray.app.proxyman.InboundHandlerConfig other) {
      if (other == com.xray.app.proxyman.InboundHandlerConfig.getDefaultInstance()) return this;
      if (!other.getTag().isEmpty()) {
        tag_ = other.tag_;
        onChanged();
      }
      if (other.hasReceiverSettings()) {
        mergeReceiverSettings(other.getReceiverSettings());
      }
      if (other.hasProxySettings()) {
        mergeProxySettings(other.getProxySettings());
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
      com.xray.app.proxyman.InboundHandlerConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xray.app.proxyman.InboundHandlerConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object tag_ = "";
    /**
     * <code>string tag = 1;</code>
     * @return The tag.
     */
    public java.lang.String getTag() {
      java.lang.Object ref = tag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string tag = 1;</code>
     * @return The bytes for tag.
     */
    public com.google.protobuf.ByteString
        getTagBytes() {
      java.lang.Object ref = tag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tag = 1;</code>
     * @param value The tag to set.
     * @return This builder for chaining.
     */
    public Builder setTag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tag_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string tag = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTag() {
      
      tag_ = getDefaultInstance().getTag();
      onChanged();
      return this;
    }
    /**
     * <code>string tag = 1;</code>
     * @param value The bytes for tag to set.
     * @return This builder for chaining.
     */
    public Builder setTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tag_ = value;
      onChanged();
      return this;
    }

    private com.xray.common.serial.TypedMessage receiverSettings_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xray.common.serial.TypedMessage, com.xray.common.serial.TypedMessage.Builder, com.xray.common.serial.TypedMessageOrBuilder> receiverSettingsBuilder_;
    /**
     * <code>.xray.common.serial.TypedMessage receiver_settings = 2;</code>
     * @return Whether the receiverSettings field is set.
     */
    public boolean hasReceiverSettings() {
      return receiverSettingsBuilder_ != null || receiverSettings_ != null;
    }
    /**
     * <code>.xray.common.serial.TypedMessage receiver_settings = 2;</code>
     * @return The receiverSettings.
     */
    public com.xray.common.serial.TypedMessage getReceiverSettings() {
      if (receiverSettingsBuilder_ == null) {
        return receiverSettings_ == null ? com.xray.common.serial.TypedMessage.getDefaultInstance() : receiverSettings_;
      } else {
        return receiverSettingsBuilder_.getMessage();
      }
    }
    /**
     * <code>.xray.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    public Builder setReceiverSettings(com.xray.common.serial.TypedMessage value) {
      if (receiverSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        receiverSettings_ = value;
        onChanged();
      } else {
        receiverSettingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.xray.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    public Builder setReceiverSettings(
        com.xray.common.serial.TypedMessage.Builder builderForValue) {
      if (receiverSettingsBuilder_ == null) {
        receiverSettings_ = builderForValue.build();
        onChanged();
      } else {
        receiverSettingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.xray.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    public Builder mergeReceiverSettings(com.xray.common.serial.TypedMessage value) {
      if (receiverSettingsBuilder_ == null) {
        if (receiverSettings_ != null) {
          receiverSettings_ =
            com.xray.common.serial.TypedMessage.newBuilder(receiverSettings_).mergeFrom(value).buildPartial();
        } else {
          receiverSettings_ = value;
        }
        onChanged();
      } else {
        receiverSettingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.xray.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    public Builder clearReceiverSettings() {
      if (receiverSettingsBuilder_ == null) {
        receiverSettings_ = null;
        onChanged();
      } else {
        receiverSettings_ = null;
        receiverSettingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.xray.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    public com.xray.common.serial.TypedMessage.Builder getReceiverSettingsBuilder() {
      
      onChanged();
      return getReceiverSettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>.xray.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    public com.xray.common.serial.TypedMessageOrBuilder getReceiverSettingsOrBuilder() {
      if (receiverSettingsBuilder_ != null) {
        return receiverSettingsBuilder_.getMessageOrBuilder();
      } else {
        return receiverSettings_ == null ?
            com.xray.common.serial.TypedMessage.getDefaultInstance() : receiverSettings_;
      }
    }
    /**
     * <code>.xray.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xray.common.serial.TypedMessage, com.xray.common.serial.TypedMessage.Builder, com.xray.common.serial.TypedMessageOrBuilder> 
        getReceiverSettingsFieldBuilder() {
      if (receiverSettingsBuilder_ == null) {
        receiverSettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.xray.common.serial.TypedMessage, com.xray.common.serial.TypedMessage.Builder, com.xray.common.serial.TypedMessageOrBuilder>(
                getReceiverSettings(),
                getParentForChildren(),
                isClean());
        receiverSettings_ = null;
      }
      return receiverSettingsBuilder_;
    }

    private com.xray.common.serial.TypedMessage proxySettings_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xray.common.serial.TypedMessage, com.xray.common.serial.TypedMessage.Builder, com.xray.common.serial.TypedMessageOrBuilder> proxySettingsBuilder_;
    /**
     * <code>.xray.common.serial.TypedMessage proxy_settings = 3;</code>
     * @return Whether the proxySettings field is set.
     */
    public boolean hasProxySettings() {
      return proxySettingsBuilder_ != null || proxySettings_ != null;
    }
    /**
     * <code>.xray.common.serial.TypedMessage proxy_settings = 3;</code>
     * @return The proxySettings.
     */
    public com.xray.common.serial.TypedMessage getProxySettings() {
      if (proxySettingsBuilder_ == null) {
        return proxySettings_ == null ? com.xray.common.serial.TypedMessage.getDefaultInstance() : proxySettings_;
      } else {
        return proxySettingsBuilder_.getMessage();
      }
    }
    /**
     * <code>.xray.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    public Builder setProxySettings(com.xray.common.serial.TypedMessage value) {
      if (proxySettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        proxySettings_ = value;
        onChanged();
      } else {
        proxySettingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.xray.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    public Builder setProxySettings(
        com.xray.common.serial.TypedMessage.Builder builderForValue) {
      if (proxySettingsBuilder_ == null) {
        proxySettings_ = builderForValue.build();
        onChanged();
      } else {
        proxySettingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.xray.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    public Builder mergeProxySettings(com.xray.common.serial.TypedMessage value) {
      if (proxySettingsBuilder_ == null) {
        if (proxySettings_ != null) {
          proxySettings_ =
            com.xray.common.serial.TypedMessage.newBuilder(proxySettings_).mergeFrom(value).buildPartial();
        } else {
          proxySettings_ = value;
        }
        onChanged();
      } else {
        proxySettingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.xray.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    public Builder clearProxySettings() {
      if (proxySettingsBuilder_ == null) {
        proxySettings_ = null;
        onChanged();
      } else {
        proxySettings_ = null;
        proxySettingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.xray.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    public com.xray.common.serial.TypedMessage.Builder getProxySettingsBuilder() {
      
      onChanged();
      return getProxySettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>.xray.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    public com.xray.common.serial.TypedMessageOrBuilder getProxySettingsOrBuilder() {
      if (proxySettingsBuilder_ != null) {
        return proxySettingsBuilder_.getMessageOrBuilder();
      } else {
        return proxySettings_ == null ?
            com.xray.common.serial.TypedMessage.getDefaultInstance() : proxySettings_;
      }
    }
    /**
     * <code>.xray.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xray.common.serial.TypedMessage, com.xray.common.serial.TypedMessage.Builder, com.xray.common.serial.TypedMessageOrBuilder> 
        getProxySettingsFieldBuilder() {
      if (proxySettingsBuilder_ == null) {
        proxySettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.xray.common.serial.TypedMessage, com.xray.common.serial.TypedMessage.Builder, com.xray.common.serial.TypedMessageOrBuilder>(
                getProxySettings(),
                getParentForChildren(),
                isClean());
        proxySettings_ = null;
      }
      return proxySettingsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:xray.app.proxyman.InboundHandlerConfig)
  }

  // @@protoc_insertion_point(class_scope:xray.app.proxyman.InboundHandlerConfig)
  private static final com.xray.app.proxyman.InboundHandlerConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xray.app.proxyman.InboundHandlerConfig();
  }

  public static com.xray.app.proxyman.InboundHandlerConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InboundHandlerConfig>
      PARSER = new com.google.protobuf.AbstractParser<InboundHandlerConfig>() {
    @java.lang.Override
    public InboundHandlerConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InboundHandlerConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InboundHandlerConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InboundHandlerConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xray.app.proxyman.InboundHandlerConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

