// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/observatory/burst/config.proto

package com.xray.app.observatory.burst;

/**
 * Protobuf type {@code xray.core.app.observatory.burst.Config}
 */
public final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.core.app.observatory.burst.Config)
    ConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
    subjectSelector_ = com.google.protobuf.LazyStringArrayList.EMPTY;
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              subjectSelector_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            subjectSelector_.add(s);
            break;
          }
          case 26: {
            com.xray.app.observatory.burst.HealthPingConfig.Builder subBuilder = null;
            if (pingConfig_ != null) {
              subBuilder = pingConfig_.toBuilder();
            }
            pingConfig_ = input.readMessage(com.xray.app.observatory.burst.HealthPingConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pingConfig_);
              pingConfig_ = subBuilder.buildPartial();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        subjectSelector_ = subjectSelector_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.xray.app.observatory.burst.ConfigOuterClass.internal_static_xray_core_app_observatory_burst_Config_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xray.app.observatory.burst.ConfigOuterClass.internal_static_xray_core_app_observatory_burst_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xray.app.observatory.burst.Config.class, com.xray.app.observatory.burst.Config.Builder.class);
  }

  public static final int SUBJECT_SELECTOR_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList subjectSelector_;
  /**
   * <pre>
   * &#64;Document The selectors for outbound under observation
   * </pre>
   *
   * <code>repeated string subject_selector = 2;</code>
   * @return A list containing the subjectSelector.
   */
  public com.google.protobuf.ProtocolStringList
      getSubjectSelectorList() {
    return subjectSelector_;
  }
  /**
   * <pre>
   * &#64;Document The selectors for outbound under observation
   * </pre>
   *
   * <code>repeated string subject_selector = 2;</code>
   * @return The count of subjectSelector.
   */
  public int getSubjectSelectorCount() {
    return subjectSelector_.size();
  }
  /**
   * <pre>
   * &#64;Document The selectors for outbound under observation
   * </pre>
   *
   * <code>repeated string subject_selector = 2;</code>
   * @param index The index of the element to return.
   * @return The subjectSelector at the given index.
   */
  public java.lang.String getSubjectSelector(int index) {
    return subjectSelector_.get(index);
  }
  /**
   * <pre>
   * &#64;Document The selectors for outbound under observation
   * </pre>
   *
   * <code>repeated string subject_selector = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the subjectSelector at the given index.
   */
  public com.google.protobuf.ByteString
      getSubjectSelectorBytes(int index) {
    return subjectSelector_.getByteString(index);
  }

  public static final int PING_CONFIG_FIELD_NUMBER = 3;
  private com.xray.app.observatory.burst.HealthPingConfig pingConfig_;
  /**
   * <code>.xray.core.app.observatory.burst.HealthPingConfig ping_config = 3;</code>
   * @return Whether the pingConfig field is set.
   */
  @java.lang.Override
  public boolean hasPingConfig() {
    return pingConfig_ != null;
  }
  /**
   * <code>.xray.core.app.observatory.burst.HealthPingConfig ping_config = 3;</code>
   * @return The pingConfig.
   */
  @java.lang.Override
  public com.xray.app.observatory.burst.HealthPingConfig getPingConfig() {
    return pingConfig_ == null ? com.xray.app.observatory.burst.HealthPingConfig.getDefaultInstance() : pingConfig_;
  }
  /**
   * <code>.xray.core.app.observatory.burst.HealthPingConfig ping_config = 3;</code>
   */
  @java.lang.Override
  public com.xray.app.observatory.burst.HealthPingConfigOrBuilder getPingConfigOrBuilder() {
    return getPingConfig();
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
    for (int i = 0; i < subjectSelector_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, subjectSelector_.getRaw(i));
    }
    if (pingConfig_ != null) {
      output.writeMessage(3, getPingConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < subjectSelector_.size(); i++) {
        dataSize += computeStringSizeNoTag(subjectSelector_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSubjectSelectorList().size();
    }
    if (pingConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPingConfig());
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
    if (!(obj instanceof com.xray.app.observatory.burst.Config)) {
      return super.equals(obj);
    }
    com.xray.app.observatory.burst.Config other = (com.xray.app.observatory.burst.Config) obj;

    if (!getSubjectSelectorList()
        .equals(other.getSubjectSelectorList())) return false;
    if (hasPingConfig() != other.hasPingConfig()) return false;
    if (hasPingConfig()) {
      if (!getPingConfig()
          .equals(other.getPingConfig())) return false;
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
    if (getSubjectSelectorCount() > 0) {
      hash = (37 * hash) + SUBJECT_SELECTOR_FIELD_NUMBER;
      hash = (53 * hash) + getSubjectSelectorList().hashCode();
    }
    if (hasPingConfig()) {
      hash = (37 * hash) + PING_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getPingConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xray.app.observatory.burst.Config parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.observatory.burst.Config parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.observatory.burst.Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.observatory.burst.Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.observatory.burst.Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.observatory.burst.Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.observatory.burst.Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.app.observatory.burst.Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.app.observatory.burst.Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xray.app.observatory.burst.Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.app.observatory.burst.Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.app.observatory.burst.Config parseFrom(
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
  public static Builder newBuilder(com.xray.app.observatory.burst.Config prototype) {
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
   * Protobuf type {@code xray.core.app.observatory.burst.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.core.app.observatory.burst.Config)
      com.xray.app.observatory.burst.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xray.app.observatory.burst.ConfigOuterClass.internal_static_xray_core_app_observatory_burst_Config_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xray.app.observatory.burst.ConfigOuterClass.internal_static_xray_core_app_observatory_burst_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xray.app.observatory.burst.Config.class, com.xray.app.observatory.burst.Config.Builder.class);
    }

    // Construct using com.xray.app.observatory.burst.Config.newBuilder()
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
      subjectSelector_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (pingConfigBuilder_ == null) {
        pingConfig_ = null;
      } else {
        pingConfig_ = null;
        pingConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xray.app.observatory.burst.ConfigOuterClass.internal_static_xray_core_app_observatory_burst_Config_descriptor;
    }

    @java.lang.Override
    public com.xray.app.observatory.burst.Config getDefaultInstanceForType() {
      return com.xray.app.observatory.burst.Config.getDefaultInstance();
    }

    @java.lang.Override
    public com.xray.app.observatory.burst.Config build() {
      com.xray.app.observatory.burst.Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xray.app.observatory.burst.Config buildPartial() {
      com.xray.app.observatory.burst.Config result = new com.xray.app.observatory.burst.Config(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        subjectSelector_ = subjectSelector_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.subjectSelector_ = subjectSelector_;
      if (pingConfigBuilder_ == null) {
        result.pingConfig_ = pingConfig_;
      } else {
        result.pingConfig_ = pingConfigBuilder_.build();
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
      if (other instanceof com.xray.app.observatory.burst.Config) {
        return mergeFrom((com.xray.app.observatory.burst.Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xray.app.observatory.burst.Config other) {
      if (other == com.xray.app.observatory.burst.Config.getDefaultInstance()) return this;
      if (!other.subjectSelector_.isEmpty()) {
        if (subjectSelector_.isEmpty()) {
          subjectSelector_ = other.subjectSelector_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureSubjectSelectorIsMutable();
          subjectSelector_.addAll(other.subjectSelector_);
        }
        onChanged();
      }
      if (other.hasPingConfig()) {
        mergePingConfig(other.getPingConfig());
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
      com.xray.app.observatory.burst.Config parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xray.app.observatory.burst.Config) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList subjectSelector_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureSubjectSelectorIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        subjectSelector_ = new com.google.protobuf.LazyStringArrayList(subjectSelector_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * &#64;Document The selectors for outbound under observation
     * </pre>
     *
     * <code>repeated string subject_selector = 2;</code>
     * @return A list containing the subjectSelector.
     */
    public com.google.protobuf.ProtocolStringList
        getSubjectSelectorList() {
      return subjectSelector_.getUnmodifiableView();
    }
    /**
     * <pre>
     * &#64;Document The selectors for outbound under observation
     * </pre>
     *
     * <code>repeated string subject_selector = 2;</code>
     * @return The count of subjectSelector.
     */
    public int getSubjectSelectorCount() {
      return subjectSelector_.size();
    }
    /**
     * <pre>
     * &#64;Document The selectors for outbound under observation
     * </pre>
     *
     * <code>repeated string subject_selector = 2;</code>
     * @param index The index of the element to return.
     * @return The subjectSelector at the given index.
     */
    public java.lang.String getSubjectSelector(int index) {
      return subjectSelector_.get(index);
    }
    /**
     * <pre>
     * &#64;Document The selectors for outbound under observation
     * </pre>
     *
     * <code>repeated string subject_selector = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the subjectSelector at the given index.
     */
    public com.google.protobuf.ByteString
        getSubjectSelectorBytes(int index) {
      return subjectSelector_.getByteString(index);
    }
    /**
     * <pre>
     * &#64;Document The selectors for outbound under observation
     * </pre>
     *
     * <code>repeated string subject_selector = 2;</code>
     * @param index The index to set the value at.
     * @param value The subjectSelector to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectSelector(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSubjectSelectorIsMutable();
      subjectSelector_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;Document The selectors for outbound under observation
     * </pre>
     *
     * <code>repeated string subject_selector = 2;</code>
     * @param value The subjectSelector to add.
     * @return This builder for chaining.
     */
    public Builder addSubjectSelector(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSubjectSelectorIsMutable();
      subjectSelector_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;Document The selectors for outbound under observation
     * </pre>
     *
     * <code>repeated string subject_selector = 2;</code>
     * @param values The subjectSelector to add.
     * @return This builder for chaining.
     */
    public Builder addAllSubjectSelector(
        java.lang.Iterable<java.lang.String> values) {
      ensureSubjectSelectorIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, subjectSelector_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;Document The selectors for outbound under observation
     * </pre>
     *
     * <code>repeated string subject_selector = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubjectSelector() {
      subjectSelector_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;Document The selectors for outbound under observation
     * </pre>
     *
     * <code>repeated string subject_selector = 2;</code>
     * @param value The bytes of the subjectSelector to add.
     * @return This builder for chaining.
     */
    public Builder addSubjectSelectorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureSubjectSelectorIsMutable();
      subjectSelector_.add(value);
      onChanged();
      return this;
    }

    private com.xray.app.observatory.burst.HealthPingConfig pingConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xray.app.observatory.burst.HealthPingConfig, com.xray.app.observatory.burst.HealthPingConfig.Builder, com.xray.app.observatory.burst.HealthPingConfigOrBuilder> pingConfigBuilder_;
    /**
     * <code>.xray.core.app.observatory.burst.HealthPingConfig ping_config = 3;</code>
     * @return Whether the pingConfig field is set.
     */
    public boolean hasPingConfig() {
      return pingConfigBuilder_ != null || pingConfig_ != null;
    }
    /**
     * <code>.xray.core.app.observatory.burst.HealthPingConfig ping_config = 3;</code>
     * @return The pingConfig.
     */
    public com.xray.app.observatory.burst.HealthPingConfig getPingConfig() {
      if (pingConfigBuilder_ == null) {
        return pingConfig_ == null ? com.xray.app.observatory.burst.HealthPingConfig.getDefaultInstance() : pingConfig_;
      } else {
        return pingConfigBuilder_.getMessage();
      }
    }
    /**
     * <code>.xray.core.app.observatory.burst.HealthPingConfig ping_config = 3;</code>
     */
    public Builder setPingConfig(com.xray.app.observatory.burst.HealthPingConfig value) {
      if (pingConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pingConfig_ = value;
        onChanged();
      } else {
        pingConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.xray.core.app.observatory.burst.HealthPingConfig ping_config = 3;</code>
     */
    public Builder setPingConfig(
        com.xray.app.observatory.burst.HealthPingConfig.Builder builderForValue) {
      if (pingConfigBuilder_ == null) {
        pingConfig_ = builderForValue.build();
        onChanged();
      } else {
        pingConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.xray.core.app.observatory.burst.HealthPingConfig ping_config = 3;</code>
     */
    public Builder mergePingConfig(com.xray.app.observatory.burst.HealthPingConfig value) {
      if (pingConfigBuilder_ == null) {
        if (pingConfig_ != null) {
          pingConfig_ =
            com.xray.app.observatory.burst.HealthPingConfig.newBuilder(pingConfig_).mergeFrom(value).buildPartial();
        } else {
          pingConfig_ = value;
        }
        onChanged();
      } else {
        pingConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.xray.core.app.observatory.burst.HealthPingConfig ping_config = 3;</code>
     */
    public Builder clearPingConfig() {
      if (pingConfigBuilder_ == null) {
        pingConfig_ = null;
        onChanged();
      } else {
        pingConfig_ = null;
        pingConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.xray.core.app.observatory.burst.HealthPingConfig ping_config = 3;</code>
     */
    public com.xray.app.observatory.burst.HealthPingConfig.Builder getPingConfigBuilder() {
      
      onChanged();
      return getPingConfigFieldBuilder().getBuilder();
    }
    /**
     * <code>.xray.core.app.observatory.burst.HealthPingConfig ping_config = 3;</code>
     */
    public com.xray.app.observatory.burst.HealthPingConfigOrBuilder getPingConfigOrBuilder() {
      if (pingConfigBuilder_ != null) {
        return pingConfigBuilder_.getMessageOrBuilder();
      } else {
        return pingConfig_ == null ?
            com.xray.app.observatory.burst.HealthPingConfig.getDefaultInstance() : pingConfig_;
      }
    }
    /**
     * <code>.xray.core.app.observatory.burst.HealthPingConfig ping_config = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xray.app.observatory.burst.HealthPingConfig, com.xray.app.observatory.burst.HealthPingConfig.Builder, com.xray.app.observatory.burst.HealthPingConfigOrBuilder> 
        getPingConfigFieldBuilder() {
      if (pingConfigBuilder_ == null) {
        pingConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.xray.app.observatory.burst.HealthPingConfig, com.xray.app.observatory.burst.HealthPingConfig.Builder, com.xray.app.observatory.burst.HealthPingConfigOrBuilder>(
                getPingConfig(),
                getParentForChildren(),
                isClean());
        pingConfig_ = null;
      }
      return pingConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:xray.core.app.observatory.burst.Config)
  }

  // @@protoc_insertion_point(class_scope:xray.core.app.observatory.burst.Config)
  private static final com.xray.app.observatory.burst.Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xray.app.observatory.burst.Config();
  }

  public static com.xray.app.observatory.burst.Config getDefaultInstance() {
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
  public com.xray.app.observatory.burst.Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

