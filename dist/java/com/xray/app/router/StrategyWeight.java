// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/router/config.proto

package com.xray.app.router;

/**
 * Protobuf type {@code xray.app.router.StrategyWeight}
 */
public final class StrategyWeight extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.app.router.StrategyWeight)
    StrategyWeightOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StrategyWeight.newBuilder() to construct.
  private StrategyWeight(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StrategyWeight() {
    match_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StrategyWeight();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StrategyWeight(
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

            regexp_ = input.readBool();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            match_ = s;
            break;
          }
          case 29: {

            value_ = input.readFloat();
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
    return com.xray.app.router.ConfigOuterClass.internal_static_xray_app_router_StrategyWeight_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xray.app.router.ConfigOuterClass.internal_static_xray_app_router_StrategyWeight_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xray.app.router.StrategyWeight.class, com.xray.app.router.StrategyWeight.Builder.class);
  }

  public static final int REGEXP_FIELD_NUMBER = 1;
  private boolean regexp_;
  /**
   * <code>bool regexp = 1;</code>
   * @return The regexp.
   */
  @java.lang.Override
  public boolean getRegexp() {
    return regexp_;
  }

  public static final int MATCH_FIELD_NUMBER = 2;
  private volatile java.lang.Object match_;
  /**
   * <code>string match = 2;</code>
   * @return The match.
   */
  @java.lang.Override
  public java.lang.String getMatch() {
    java.lang.Object ref = match_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      match_ = s;
      return s;
    }
  }
  /**
   * <code>string match = 2;</code>
   * @return The bytes for match.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMatchBytes() {
    java.lang.Object ref = match_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      match_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private float value_;
  /**
   * <code>float value = 3;</code>
   * @return The value.
   */
  @java.lang.Override
  public float getValue() {
    return value_;
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
    if (regexp_ != false) {
      output.writeBool(1, regexp_);
    }
    if (!getMatchBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, match_);
    }
    if (value_ != 0F) {
      output.writeFloat(3, value_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (regexp_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, regexp_);
    }
    if (!getMatchBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, match_);
    }
    if (value_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, value_);
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
    if (!(obj instanceof com.xray.app.router.StrategyWeight)) {
      return super.equals(obj);
    }
    com.xray.app.router.StrategyWeight other = (com.xray.app.router.StrategyWeight) obj;

    if (getRegexp()
        != other.getRegexp()) return false;
    if (!getMatch()
        .equals(other.getMatch())) return false;
    if (java.lang.Float.floatToIntBits(getValue())
        != java.lang.Float.floatToIntBits(
            other.getValue())) return false;
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
    hash = (37 * hash) + REGEXP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRegexp());
    hash = (37 * hash) + MATCH_FIELD_NUMBER;
    hash = (53 * hash) + getMatch().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getValue());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xray.app.router.StrategyWeight parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.router.StrategyWeight parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.router.StrategyWeight parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.router.StrategyWeight parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.router.StrategyWeight parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.router.StrategyWeight parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.router.StrategyWeight parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.app.router.StrategyWeight parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.app.router.StrategyWeight parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xray.app.router.StrategyWeight parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.app.router.StrategyWeight parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.app.router.StrategyWeight parseFrom(
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
  public static Builder newBuilder(com.xray.app.router.StrategyWeight prototype) {
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
   * Protobuf type {@code xray.app.router.StrategyWeight}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.app.router.StrategyWeight)
      com.xray.app.router.StrategyWeightOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xray.app.router.ConfigOuterClass.internal_static_xray_app_router_StrategyWeight_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xray.app.router.ConfigOuterClass.internal_static_xray_app_router_StrategyWeight_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xray.app.router.StrategyWeight.class, com.xray.app.router.StrategyWeight.Builder.class);
    }

    // Construct using com.xray.app.router.StrategyWeight.newBuilder()
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
      regexp_ = false;

      match_ = "";

      value_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xray.app.router.ConfigOuterClass.internal_static_xray_app_router_StrategyWeight_descriptor;
    }

    @java.lang.Override
    public com.xray.app.router.StrategyWeight getDefaultInstanceForType() {
      return com.xray.app.router.StrategyWeight.getDefaultInstance();
    }

    @java.lang.Override
    public com.xray.app.router.StrategyWeight build() {
      com.xray.app.router.StrategyWeight result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xray.app.router.StrategyWeight buildPartial() {
      com.xray.app.router.StrategyWeight result = new com.xray.app.router.StrategyWeight(this);
      result.regexp_ = regexp_;
      result.match_ = match_;
      result.value_ = value_;
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
      if (other instanceof com.xray.app.router.StrategyWeight) {
        return mergeFrom((com.xray.app.router.StrategyWeight)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xray.app.router.StrategyWeight other) {
      if (other == com.xray.app.router.StrategyWeight.getDefaultInstance()) return this;
      if (other.getRegexp() != false) {
        setRegexp(other.getRegexp());
      }
      if (!other.getMatch().isEmpty()) {
        match_ = other.match_;
        onChanged();
      }
      if (other.getValue() != 0F) {
        setValue(other.getValue());
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
      com.xray.app.router.StrategyWeight parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xray.app.router.StrategyWeight) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean regexp_ ;
    /**
     * <code>bool regexp = 1;</code>
     * @return The regexp.
     */
    @java.lang.Override
    public boolean getRegexp() {
      return regexp_;
    }
    /**
     * <code>bool regexp = 1;</code>
     * @param value The regexp to set.
     * @return This builder for chaining.
     */
    public Builder setRegexp(boolean value) {
      
      regexp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool regexp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRegexp() {
      
      regexp_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object match_ = "";
    /**
     * <code>string match = 2;</code>
     * @return The match.
     */
    public java.lang.String getMatch() {
      java.lang.Object ref = match_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        match_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string match = 2;</code>
     * @return The bytes for match.
     */
    public com.google.protobuf.ByteString
        getMatchBytes() {
      java.lang.Object ref = match_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        match_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string match = 2;</code>
     * @param value The match to set.
     * @return This builder for chaining.
     */
    public Builder setMatch(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      match_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string match = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMatch() {
      
      match_ = getDefaultInstance().getMatch();
      onChanged();
      return this;
    }
    /**
     * <code>string match = 2;</code>
     * @param value The bytes for match to set.
     * @return This builder for chaining.
     */
    public Builder setMatchBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      match_ = value;
      onChanged();
      return this;
    }

    private float value_ ;
    /**
     * <code>float value = 3;</code>
     * @return The value.
     */
    @java.lang.Override
    public float getValue() {
      return value_;
    }
    /**
     * <code>float value = 3;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(float value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float value = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      
      value_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:xray.app.router.StrategyWeight)
  }

  // @@protoc_insertion_point(class_scope:xray.app.router.StrategyWeight)
  private static final com.xray.app.router.StrategyWeight DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xray.app.router.StrategyWeight();
  }

  public static com.xray.app.router.StrategyWeight getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StrategyWeight>
      PARSER = new com.google.protobuf.AbstractParser<StrategyWeight>() {
    @java.lang.Override
    public StrategyWeight parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StrategyWeight(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StrategyWeight> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StrategyWeight> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xray.app.router.StrategyWeight getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

