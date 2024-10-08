// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/observatory/config.proto

package com.xray.app.observatory;

/**
 * Protobuf type {@code xray.core.app.observatory.ProbeResult}
 */
public final class ProbeResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.core.app.observatory.ProbeResult)
    ProbeResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProbeResult.newBuilder() to construct.
  private ProbeResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProbeResult() {
    lastErrorReason_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProbeResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProbeResult(
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

            alive_ = input.readBool();
            break;
          }
          case 16: {

            delay_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            lastErrorReason_ = s;
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
    return com.xray.app.observatory.ConfigOuterClass.internal_static_xray_core_app_observatory_ProbeResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xray.app.observatory.ConfigOuterClass.internal_static_xray_core_app_observatory_ProbeResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xray.app.observatory.ProbeResult.class, com.xray.app.observatory.ProbeResult.Builder.class);
  }

  public static final int ALIVE_FIELD_NUMBER = 1;
  private boolean alive_;
  /**
   * <pre>
   * &#64;Document Whether this outbound is usable
   *&#64;Restriction ReadOnlyForUser
   * </pre>
   *
   * <code>bool alive = 1;</code>
   * @return The alive.
   */
  @java.lang.Override
  public boolean getAlive() {
    return alive_;
  }

  public static final int DELAY_FIELD_NUMBER = 2;
  private long delay_;
  /**
   * <pre>
   * &#64;Document The time for probe request to finish.
   *&#64;Type time.ms
   *&#64;Restriction ReadOnlyForUser
   * </pre>
   *
   * <code>int64 delay = 2;</code>
   * @return The delay.
   */
  @java.lang.Override
  public long getDelay() {
    return delay_;
  }

  public static final int LAST_ERROR_REASON_FIELD_NUMBER = 3;
  private volatile java.lang.Object lastErrorReason_;
  /**
   * <pre>
   * &#64;Document The error caused this outbound failed to relay probe request
   *&#64;Restriction NotMachineReadable
   * </pre>
   *
   * <code>string last_error_reason = 3;</code>
   * @return The lastErrorReason.
   */
  @java.lang.Override
  public java.lang.String getLastErrorReason() {
    java.lang.Object ref = lastErrorReason_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lastErrorReason_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * &#64;Document The error caused this outbound failed to relay probe request
   *&#64;Restriction NotMachineReadable
   * </pre>
   *
   * <code>string last_error_reason = 3;</code>
   * @return The bytes for lastErrorReason.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLastErrorReasonBytes() {
    java.lang.Object ref = lastErrorReason_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lastErrorReason_ = b;
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
    if (alive_ != false) {
      output.writeBool(1, alive_);
    }
    if (delay_ != 0L) {
      output.writeInt64(2, delay_);
    }
    if (!getLastErrorReasonBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, lastErrorReason_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (alive_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, alive_);
    }
    if (delay_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, delay_);
    }
    if (!getLastErrorReasonBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, lastErrorReason_);
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
    if (!(obj instanceof com.xray.app.observatory.ProbeResult)) {
      return super.equals(obj);
    }
    com.xray.app.observatory.ProbeResult other = (com.xray.app.observatory.ProbeResult) obj;

    if (getAlive()
        != other.getAlive()) return false;
    if (getDelay()
        != other.getDelay()) return false;
    if (!getLastErrorReason()
        .equals(other.getLastErrorReason())) return false;
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
    hash = (37 * hash) + ALIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAlive());
    hash = (37 * hash) + DELAY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDelay());
    hash = (37 * hash) + LAST_ERROR_REASON_FIELD_NUMBER;
    hash = (53 * hash) + getLastErrorReason().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xray.app.observatory.ProbeResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.observatory.ProbeResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.observatory.ProbeResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.observatory.ProbeResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.observatory.ProbeResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.observatory.ProbeResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.observatory.ProbeResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.app.observatory.ProbeResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.app.observatory.ProbeResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xray.app.observatory.ProbeResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.app.observatory.ProbeResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.app.observatory.ProbeResult parseFrom(
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
  public static Builder newBuilder(com.xray.app.observatory.ProbeResult prototype) {
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
   * Protobuf type {@code xray.core.app.observatory.ProbeResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.core.app.observatory.ProbeResult)
      com.xray.app.observatory.ProbeResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xray.app.observatory.ConfigOuterClass.internal_static_xray_core_app_observatory_ProbeResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xray.app.observatory.ConfigOuterClass.internal_static_xray_core_app_observatory_ProbeResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xray.app.observatory.ProbeResult.class, com.xray.app.observatory.ProbeResult.Builder.class);
    }

    // Construct using com.xray.app.observatory.ProbeResult.newBuilder()
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
      alive_ = false;

      delay_ = 0L;

      lastErrorReason_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xray.app.observatory.ConfigOuterClass.internal_static_xray_core_app_observatory_ProbeResult_descriptor;
    }

    @java.lang.Override
    public com.xray.app.observatory.ProbeResult getDefaultInstanceForType() {
      return com.xray.app.observatory.ProbeResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.xray.app.observatory.ProbeResult build() {
      com.xray.app.observatory.ProbeResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xray.app.observatory.ProbeResult buildPartial() {
      com.xray.app.observatory.ProbeResult result = new com.xray.app.observatory.ProbeResult(this);
      result.alive_ = alive_;
      result.delay_ = delay_;
      result.lastErrorReason_ = lastErrorReason_;
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
      if (other instanceof com.xray.app.observatory.ProbeResult) {
        return mergeFrom((com.xray.app.observatory.ProbeResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xray.app.observatory.ProbeResult other) {
      if (other == com.xray.app.observatory.ProbeResult.getDefaultInstance()) return this;
      if (other.getAlive() != false) {
        setAlive(other.getAlive());
      }
      if (other.getDelay() != 0L) {
        setDelay(other.getDelay());
      }
      if (!other.getLastErrorReason().isEmpty()) {
        lastErrorReason_ = other.lastErrorReason_;
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
      com.xray.app.observatory.ProbeResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xray.app.observatory.ProbeResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean alive_ ;
    /**
     * <pre>
     * &#64;Document Whether this outbound is usable
     *&#64;Restriction ReadOnlyForUser
     * </pre>
     *
     * <code>bool alive = 1;</code>
     * @return The alive.
     */
    @java.lang.Override
    public boolean getAlive() {
      return alive_;
    }
    /**
     * <pre>
     * &#64;Document Whether this outbound is usable
     *&#64;Restriction ReadOnlyForUser
     * </pre>
     *
     * <code>bool alive = 1;</code>
     * @param value The alive to set.
     * @return This builder for chaining.
     */
    public Builder setAlive(boolean value) {
      
      alive_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;Document Whether this outbound is usable
     *&#64;Restriction ReadOnlyForUser
     * </pre>
     *
     * <code>bool alive = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAlive() {
      
      alive_ = false;
      onChanged();
      return this;
    }

    private long delay_ ;
    /**
     * <pre>
     * &#64;Document The time for probe request to finish.
     *&#64;Type time.ms
     *&#64;Restriction ReadOnlyForUser
     * </pre>
     *
     * <code>int64 delay = 2;</code>
     * @return The delay.
     */
    @java.lang.Override
    public long getDelay() {
      return delay_;
    }
    /**
     * <pre>
     * &#64;Document The time for probe request to finish.
     *&#64;Type time.ms
     *&#64;Restriction ReadOnlyForUser
     * </pre>
     *
     * <code>int64 delay = 2;</code>
     * @param value The delay to set.
     * @return This builder for chaining.
     */
    public Builder setDelay(long value) {
      
      delay_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;Document The time for probe request to finish.
     *&#64;Type time.ms
     *&#64;Restriction ReadOnlyForUser
     * </pre>
     *
     * <code>int64 delay = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDelay() {
      
      delay_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object lastErrorReason_ = "";
    /**
     * <pre>
     * &#64;Document The error caused this outbound failed to relay probe request
     *&#64;Restriction NotMachineReadable
     * </pre>
     *
     * <code>string last_error_reason = 3;</code>
     * @return The lastErrorReason.
     */
    public java.lang.String getLastErrorReason() {
      java.lang.Object ref = lastErrorReason_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lastErrorReason_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * &#64;Document The error caused this outbound failed to relay probe request
     *&#64;Restriction NotMachineReadable
     * </pre>
     *
     * <code>string last_error_reason = 3;</code>
     * @return The bytes for lastErrorReason.
     */
    public com.google.protobuf.ByteString
        getLastErrorReasonBytes() {
      java.lang.Object ref = lastErrorReason_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lastErrorReason_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * &#64;Document The error caused this outbound failed to relay probe request
     *&#64;Restriction NotMachineReadable
     * </pre>
     *
     * <code>string last_error_reason = 3;</code>
     * @param value The lastErrorReason to set.
     * @return This builder for chaining.
     */
    public Builder setLastErrorReason(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lastErrorReason_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;Document The error caused this outbound failed to relay probe request
     *&#64;Restriction NotMachineReadable
     * </pre>
     *
     * <code>string last_error_reason = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastErrorReason() {
      
      lastErrorReason_ = getDefaultInstance().getLastErrorReason();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;Document The error caused this outbound failed to relay probe request
     *&#64;Restriction NotMachineReadable
     * </pre>
     *
     * <code>string last_error_reason = 3;</code>
     * @param value The bytes for lastErrorReason to set.
     * @return This builder for chaining.
     */
    public Builder setLastErrorReasonBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lastErrorReason_ = value;
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


    // @@protoc_insertion_point(builder_scope:xray.core.app.observatory.ProbeResult)
  }

  // @@protoc_insertion_point(class_scope:xray.core.app.observatory.ProbeResult)
  private static final com.xray.app.observatory.ProbeResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xray.app.observatory.ProbeResult();
  }

  public static com.xray.app.observatory.ProbeResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProbeResult>
      PARSER = new com.google.protobuf.AbstractParser<ProbeResult>() {
    @java.lang.Override
    public ProbeResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProbeResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProbeResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProbeResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xray.app.observatory.ProbeResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

