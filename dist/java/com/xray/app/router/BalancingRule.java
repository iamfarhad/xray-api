// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/router/config.proto

package com.xray.app.router;

/**
 * Protobuf type {@code xray.app.router.BalancingRule}
 */
public final class BalancingRule extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.app.router.BalancingRule)
    BalancingRuleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BalancingRule.newBuilder() to construct.
  private BalancingRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BalancingRule() {
    tag_ = "";
    outboundSelector_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    strategy_ = "";
    fallbackTag_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BalancingRule();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BalancingRule(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              outboundSelector_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            outboundSelector_.add(s);
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            strategy_ = s;
            break;
          }
          case 34: {
            com.xray.common.serial.TypedMessage.Builder subBuilder = null;
            if (strategySettings_ != null) {
              subBuilder = strategySettings_.toBuilder();
            }
            strategySettings_ = input.readMessage(com.xray.common.serial.TypedMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(strategySettings_);
              strategySettings_ = subBuilder.buildPartial();
            }

            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            fallbackTag_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        outboundSelector_ = outboundSelector_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.xray.app.router.ConfigOuterClass.internal_static_xray_app_router_BalancingRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xray.app.router.ConfigOuterClass.internal_static_xray_app_router_BalancingRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xray.app.router.BalancingRule.class, com.xray.app.router.BalancingRule.Builder.class);
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

  public static final int OUTBOUND_SELECTOR_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList outboundSelector_;
  /**
   * <code>repeated string outbound_selector = 2;</code>
   * @return A list containing the outboundSelector.
   */
  public com.google.protobuf.ProtocolStringList
      getOutboundSelectorList() {
    return outboundSelector_;
  }
  /**
   * <code>repeated string outbound_selector = 2;</code>
   * @return The count of outboundSelector.
   */
  public int getOutboundSelectorCount() {
    return outboundSelector_.size();
  }
  /**
   * <code>repeated string outbound_selector = 2;</code>
   * @param index The index of the element to return.
   * @return The outboundSelector at the given index.
   */
  public java.lang.String getOutboundSelector(int index) {
    return outboundSelector_.get(index);
  }
  /**
   * <code>repeated string outbound_selector = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the outboundSelector at the given index.
   */
  public com.google.protobuf.ByteString
      getOutboundSelectorBytes(int index) {
    return outboundSelector_.getByteString(index);
  }

  public static final int STRATEGY_FIELD_NUMBER = 3;
  private volatile java.lang.Object strategy_;
  /**
   * <code>string strategy = 3;</code>
   * @return The strategy.
   */
  @java.lang.Override
  public java.lang.String getStrategy() {
    java.lang.Object ref = strategy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      strategy_ = s;
      return s;
    }
  }
  /**
   * <code>string strategy = 3;</code>
   * @return The bytes for strategy.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStrategyBytes() {
    java.lang.Object ref = strategy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      strategy_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STRATEGY_SETTINGS_FIELD_NUMBER = 4;
  private com.xray.common.serial.TypedMessage strategySettings_;
  /**
   * <code>.xray.common.serial.TypedMessage strategy_settings = 4;</code>
   * @return Whether the strategySettings field is set.
   */
  @java.lang.Override
  public boolean hasStrategySettings() {
    return strategySettings_ != null;
  }
  /**
   * <code>.xray.common.serial.TypedMessage strategy_settings = 4;</code>
   * @return The strategySettings.
   */
  @java.lang.Override
  public com.xray.common.serial.TypedMessage getStrategySettings() {
    return strategySettings_ == null ? com.xray.common.serial.TypedMessage.getDefaultInstance() : strategySettings_;
  }
  /**
   * <code>.xray.common.serial.TypedMessage strategy_settings = 4;</code>
   */
  @java.lang.Override
  public com.xray.common.serial.TypedMessageOrBuilder getStrategySettingsOrBuilder() {
    return getStrategySettings();
  }

  public static final int FALLBACK_TAG_FIELD_NUMBER = 5;
  private volatile java.lang.Object fallbackTag_;
  /**
   * <code>string fallback_tag = 5;</code>
   * @return The fallbackTag.
   */
  @java.lang.Override
  public java.lang.String getFallbackTag() {
    java.lang.Object ref = fallbackTag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fallbackTag_ = s;
      return s;
    }
  }
  /**
   * <code>string fallback_tag = 5;</code>
   * @return The bytes for fallbackTag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFallbackTagBytes() {
    java.lang.Object ref = fallbackTag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fallbackTag_ = b;
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
    if (!getTagBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tag_);
    }
    for (int i = 0; i < outboundSelector_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, outboundSelector_.getRaw(i));
    }
    if (!getStrategyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, strategy_);
    }
    if (strategySettings_ != null) {
      output.writeMessage(4, getStrategySettings());
    }
    if (!getFallbackTagBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, fallbackTag_);
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
    {
      int dataSize = 0;
      for (int i = 0; i < outboundSelector_.size(); i++) {
        dataSize += computeStringSizeNoTag(outboundSelector_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getOutboundSelectorList().size();
    }
    if (!getStrategyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, strategy_);
    }
    if (strategySettings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getStrategySettings());
    }
    if (!getFallbackTagBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, fallbackTag_);
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
    if (!(obj instanceof com.xray.app.router.BalancingRule)) {
      return super.equals(obj);
    }
    com.xray.app.router.BalancingRule other = (com.xray.app.router.BalancingRule) obj;

    if (!getTag()
        .equals(other.getTag())) return false;
    if (!getOutboundSelectorList()
        .equals(other.getOutboundSelectorList())) return false;
    if (!getStrategy()
        .equals(other.getStrategy())) return false;
    if (hasStrategySettings() != other.hasStrategySettings()) return false;
    if (hasStrategySettings()) {
      if (!getStrategySettings()
          .equals(other.getStrategySettings())) return false;
    }
    if (!getFallbackTag()
        .equals(other.getFallbackTag())) return false;
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
    if (getOutboundSelectorCount() > 0) {
      hash = (37 * hash) + OUTBOUND_SELECTOR_FIELD_NUMBER;
      hash = (53 * hash) + getOutboundSelectorList().hashCode();
    }
    hash = (37 * hash) + STRATEGY_FIELD_NUMBER;
    hash = (53 * hash) + getStrategy().hashCode();
    if (hasStrategySettings()) {
      hash = (37 * hash) + STRATEGY_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getStrategySettings().hashCode();
    }
    hash = (37 * hash) + FALLBACK_TAG_FIELD_NUMBER;
    hash = (53 * hash) + getFallbackTag().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xray.app.router.BalancingRule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.router.BalancingRule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.router.BalancingRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.router.BalancingRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.router.BalancingRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.router.BalancingRule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.router.BalancingRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.app.router.BalancingRule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.app.router.BalancingRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xray.app.router.BalancingRule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.app.router.BalancingRule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.app.router.BalancingRule parseFrom(
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
  public static Builder newBuilder(com.xray.app.router.BalancingRule prototype) {
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
   * Protobuf type {@code xray.app.router.BalancingRule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.app.router.BalancingRule)
      com.xray.app.router.BalancingRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xray.app.router.ConfigOuterClass.internal_static_xray_app_router_BalancingRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xray.app.router.ConfigOuterClass.internal_static_xray_app_router_BalancingRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xray.app.router.BalancingRule.class, com.xray.app.router.BalancingRule.Builder.class);
    }

    // Construct using com.xray.app.router.BalancingRule.newBuilder()
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

      outboundSelector_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      strategy_ = "";

      if (strategySettingsBuilder_ == null) {
        strategySettings_ = null;
      } else {
        strategySettings_ = null;
        strategySettingsBuilder_ = null;
      }
      fallbackTag_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xray.app.router.ConfigOuterClass.internal_static_xray_app_router_BalancingRule_descriptor;
    }

    @java.lang.Override
    public com.xray.app.router.BalancingRule getDefaultInstanceForType() {
      return com.xray.app.router.BalancingRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.xray.app.router.BalancingRule build() {
      com.xray.app.router.BalancingRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xray.app.router.BalancingRule buildPartial() {
      com.xray.app.router.BalancingRule result = new com.xray.app.router.BalancingRule(this);
      int from_bitField0_ = bitField0_;
      result.tag_ = tag_;
      if (((bitField0_ & 0x00000001) != 0)) {
        outboundSelector_ = outboundSelector_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.outboundSelector_ = outboundSelector_;
      result.strategy_ = strategy_;
      if (strategySettingsBuilder_ == null) {
        result.strategySettings_ = strategySettings_;
      } else {
        result.strategySettings_ = strategySettingsBuilder_.build();
      }
      result.fallbackTag_ = fallbackTag_;
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
      if (other instanceof com.xray.app.router.BalancingRule) {
        return mergeFrom((com.xray.app.router.BalancingRule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xray.app.router.BalancingRule other) {
      if (other == com.xray.app.router.BalancingRule.getDefaultInstance()) return this;
      if (!other.getTag().isEmpty()) {
        tag_ = other.tag_;
        onChanged();
      }
      if (!other.outboundSelector_.isEmpty()) {
        if (outboundSelector_.isEmpty()) {
          outboundSelector_ = other.outboundSelector_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureOutboundSelectorIsMutable();
          outboundSelector_.addAll(other.outboundSelector_);
        }
        onChanged();
      }
      if (!other.getStrategy().isEmpty()) {
        strategy_ = other.strategy_;
        onChanged();
      }
      if (other.hasStrategySettings()) {
        mergeStrategySettings(other.getStrategySettings());
      }
      if (!other.getFallbackTag().isEmpty()) {
        fallbackTag_ = other.fallbackTag_;
        onChanged();
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
      com.xray.app.router.BalancingRule parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xray.app.router.BalancingRule) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

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

    private com.google.protobuf.LazyStringList outboundSelector_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureOutboundSelectorIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        outboundSelector_ = new com.google.protobuf.LazyStringArrayList(outboundSelector_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string outbound_selector = 2;</code>
     * @return A list containing the outboundSelector.
     */
    public com.google.protobuf.ProtocolStringList
        getOutboundSelectorList() {
      return outboundSelector_.getUnmodifiableView();
    }
    /**
     * <code>repeated string outbound_selector = 2;</code>
     * @return The count of outboundSelector.
     */
    public int getOutboundSelectorCount() {
      return outboundSelector_.size();
    }
    /**
     * <code>repeated string outbound_selector = 2;</code>
     * @param index The index of the element to return.
     * @return The outboundSelector at the given index.
     */
    public java.lang.String getOutboundSelector(int index) {
      return outboundSelector_.get(index);
    }
    /**
     * <code>repeated string outbound_selector = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the outboundSelector at the given index.
     */
    public com.google.protobuf.ByteString
        getOutboundSelectorBytes(int index) {
      return outboundSelector_.getByteString(index);
    }
    /**
     * <code>repeated string outbound_selector = 2;</code>
     * @param index The index to set the value at.
     * @param value The outboundSelector to set.
     * @return This builder for chaining.
     */
    public Builder setOutboundSelector(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureOutboundSelectorIsMutable();
      outboundSelector_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string outbound_selector = 2;</code>
     * @param value The outboundSelector to add.
     * @return This builder for chaining.
     */
    public Builder addOutboundSelector(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureOutboundSelectorIsMutable();
      outboundSelector_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string outbound_selector = 2;</code>
     * @param values The outboundSelector to add.
     * @return This builder for chaining.
     */
    public Builder addAllOutboundSelector(
        java.lang.Iterable<java.lang.String> values) {
      ensureOutboundSelectorIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, outboundSelector_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string outbound_selector = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOutboundSelector() {
      outboundSelector_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string outbound_selector = 2;</code>
     * @param value The bytes of the outboundSelector to add.
     * @return This builder for chaining.
     */
    public Builder addOutboundSelectorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureOutboundSelectorIsMutable();
      outboundSelector_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object strategy_ = "";
    /**
     * <code>string strategy = 3;</code>
     * @return The strategy.
     */
    public java.lang.String getStrategy() {
      java.lang.Object ref = strategy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        strategy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string strategy = 3;</code>
     * @return The bytes for strategy.
     */
    public com.google.protobuf.ByteString
        getStrategyBytes() {
      java.lang.Object ref = strategy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        strategy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string strategy = 3;</code>
     * @param value The strategy to set.
     * @return This builder for chaining.
     */
    public Builder setStrategy(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      strategy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string strategy = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStrategy() {
      
      strategy_ = getDefaultInstance().getStrategy();
      onChanged();
      return this;
    }
    /**
     * <code>string strategy = 3;</code>
     * @param value The bytes for strategy to set.
     * @return This builder for chaining.
     */
    public Builder setStrategyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      strategy_ = value;
      onChanged();
      return this;
    }

    private com.xray.common.serial.TypedMessage strategySettings_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xray.common.serial.TypedMessage, com.xray.common.serial.TypedMessage.Builder, com.xray.common.serial.TypedMessageOrBuilder> strategySettingsBuilder_;
    /**
     * <code>.xray.common.serial.TypedMessage strategy_settings = 4;</code>
     * @return Whether the strategySettings field is set.
     */
    public boolean hasStrategySettings() {
      return strategySettingsBuilder_ != null || strategySettings_ != null;
    }
    /**
     * <code>.xray.common.serial.TypedMessage strategy_settings = 4;</code>
     * @return The strategySettings.
     */
    public com.xray.common.serial.TypedMessage getStrategySettings() {
      if (strategySettingsBuilder_ == null) {
        return strategySettings_ == null ? com.xray.common.serial.TypedMessage.getDefaultInstance() : strategySettings_;
      } else {
        return strategySettingsBuilder_.getMessage();
      }
    }
    /**
     * <code>.xray.common.serial.TypedMessage strategy_settings = 4;</code>
     */
    public Builder setStrategySettings(com.xray.common.serial.TypedMessage value) {
      if (strategySettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        strategySettings_ = value;
        onChanged();
      } else {
        strategySettingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.xray.common.serial.TypedMessage strategy_settings = 4;</code>
     */
    public Builder setStrategySettings(
        com.xray.common.serial.TypedMessage.Builder builderForValue) {
      if (strategySettingsBuilder_ == null) {
        strategySettings_ = builderForValue.build();
        onChanged();
      } else {
        strategySettingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.xray.common.serial.TypedMessage strategy_settings = 4;</code>
     */
    public Builder mergeStrategySettings(com.xray.common.serial.TypedMessage value) {
      if (strategySettingsBuilder_ == null) {
        if (strategySettings_ != null) {
          strategySettings_ =
            com.xray.common.serial.TypedMessage.newBuilder(strategySettings_).mergeFrom(value).buildPartial();
        } else {
          strategySettings_ = value;
        }
        onChanged();
      } else {
        strategySettingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.xray.common.serial.TypedMessage strategy_settings = 4;</code>
     */
    public Builder clearStrategySettings() {
      if (strategySettingsBuilder_ == null) {
        strategySettings_ = null;
        onChanged();
      } else {
        strategySettings_ = null;
        strategySettingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.xray.common.serial.TypedMessage strategy_settings = 4;</code>
     */
    public com.xray.common.serial.TypedMessage.Builder getStrategySettingsBuilder() {
      
      onChanged();
      return getStrategySettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>.xray.common.serial.TypedMessage strategy_settings = 4;</code>
     */
    public com.xray.common.serial.TypedMessageOrBuilder getStrategySettingsOrBuilder() {
      if (strategySettingsBuilder_ != null) {
        return strategySettingsBuilder_.getMessageOrBuilder();
      } else {
        return strategySettings_ == null ?
            com.xray.common.serial.TypedMessage.getDefaultInstance() : strategySettings_;
      }
    }
    /**
     * <code>.xray.common.serial.TypedMessage strategy_settings = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xray.common.serial.TypedMessage, com.xray.common.serial.TypedMessage.Builder, com.xray.common.serial.TypedMessageOrBuilder> 
        getStrategySettingsFieldBuilder() {
      if (strategySettingsBuilder_ == null) {
        strategySettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.xray.common.serial.TypedMessage, com.xray.common.serial.TypedMessage.Builder, com.xray.common.serial.TypedMessageOrBuilder>(
                getStrategySettings(),
                getParentForChildren(),
                isClean());
        strategySettings_ = null;
      }
      return strategySettingsBuilder_;
    }

    private java.lang.Object fallbackTag_ = "";
    /**
     * <code>string fallback_tag = 5;</code>
     * @return The fallbackTag.
     */
    public java.lang.String getFallbackTag() {
      java.lang.Object ref = fallbackTag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fallbackTag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fallback_tag = 5;</code>
     * @return The bytes for fallbackTag.
     */
    public com.google.protobuf.ByteString
        getFallbackTagBytes() {
      java.lang.Object ref = fallbackTag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fallbackTag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fallback_tag = 5;</code>
     * @param value The fallbackTag to set.
     * @return This builder for chaining.
     */
    public Builder setFallbackTag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fallbackTag_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fallback_tag = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFallbackTag() {
      
      fallbackTag_ = getDefaultInstance().getFallbackTag();
      onChanged();
      return this;
    }
    /**
     * <code>string fallback_tag = 5;</code>
     * @param value The bytes for fallbackTag to set.
     * @return This builder for chaining.
     */
    public Builder setFallbackTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fallbackTag_ = value;
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


    // @@protoc_insertion_point(builder_scope:xray.app.router.BalancingRule)
  }

  // @@protoc_insertion_point(class_scope:xray.app.router.BalancingRule)
  private static final com.xray.app.router.BalancingRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xray.app.router.BalancingRule();
  }

  public static com.xray.app.router.BalancingRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BalancingRule>
      PARSER = new com.google.protobuf.AbstractParser<BalancingRule>() {
    @java.lang.Override
    public BalancingRule parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BalancingRule(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BalancingRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BalancingRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xray.app.router.BalancingRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

