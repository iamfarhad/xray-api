// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/stats/command/command.proto

package com.xray.app.stats.command;

/**
 * Protobuf type {@code xray.app.stats.command.QueryStatsRequest}
 */
public final class QueryStatsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.app.stats.command.QueryStatsRequest)
    QueryStatsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryStatsRequest.newBuilder() to construct.
  private QueryStatsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryStatsRequest() {
    pattern_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryStatsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryStatsRequest(
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

            pattern_ = s;
            break;
          }
          case 16: {

            reset_ = input.readBool();
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
    return com.xray.app.stats.command.Command.internal_static_xray_app_stats_command_QueryStatsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xray.app.stats.command.Command.internal_static_xray_app_stats_command_QueryStatsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xray.app.stats.command.QueryStatsRequest.class, com.xray.app.stats.command.QueryStatsRequest.Builder.class);
  }

  public static final int PATTERN_FIELD_NUMBER = 1;
  private volatile java.lang.Object pattern_;
  /**
   * <code>string pattern = 1;</code>
   * @return The pattern.
   */
  @java.lang.Override
  public java.lang.String getPattern() {
    java.lang.Object ref = pattern_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pattern_ = s;
      return s;
    }
  }
  /**
   * <code>string pattern = 1;</code>
   * @return The bytes for pattern.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPatternBytes() {
    java.lang.Object ref = pattern_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pattern_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESET_FIELD_NUMBER = 2;
  private boolean reset_;
  /**
   * <code>bool reset = 2;</code>
   * @return The reset.
   */
  @java.lang.Override
  public boolean getReset() {
    return reset_;
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
    if (!getPatternBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pattern_);
    }
    if (reset_ != false) {
      output.writeBool(2, reset_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPatternBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pattern_);
    }
    if (reset_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, reset_);
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
    if (!(obj instanceof com.xray.app.stats.command.QueryStatsRequest)) {
      return super.equals(obj);
    }
    com.xray.app.stats.command.QueryStatsRequest other = (com.xray.app.stats.command.QueryStatsRequest) obj;

    if (!getPattern()
        .equals(other.getPattern())) return false;
    if (getReset()
        != other.getReset()) return false;
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
    hash = (37 * hash) + PATTERN_FIELD_NUMBER;
    hash = (53 * hash) + getPattern().hashCode();
    hash = (37 * hash) + RESET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getReset());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xray.app.stats.command.QueryStatsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.stats.command.QueryStatsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.stats.command.QueryStatsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.stats.command.QueryStatsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.stats.command.QueryStatsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.stats.command.QueryStatsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.stats.command.QueryStatsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.app.stats.command.QueryStatsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.app.stats.command.QueryStatsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xray.app.stats.command.QueryStatsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.app.stats.command.QueryStatsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.app.stats.command.QueryStatsRequest parseFrom(
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
  public static Builder newBuilder(com.xray.app.stats.command.QueryStatsRequest prototype) {
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
   * Protobuf type {@code xray.app.stats.command.QueryStatsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.app.stats.command.QueryStatsRequest)
      com.xray.app.stats.command.QueryStatsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xray.app.stats.command.Command.internal_static_xray_app_stats_command_QueryStatsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xray.app.stats.command.Command.internal_static_xray_app_stats_command_QueryStatsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xray.app.stats.command.QueryStatsRequest.class, com.xray.app.stats.command.QueryStatsRequest.Builder.class);
    }

    // Construct using com.xray.app.stats.command.QueryStatsRequest.newBuilder()
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
      pattern_ = "";

      reset_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xray.app.stats.command.Command.internal_static_xray_app_stats_command_QueryStatsRequest_descriptor;
    }

    @java.lang.Override
    public com.xray.app.stats.command.QueryStatsRequest getDefaultInstanceForType() {
      return com.xray.app.stats.command.QueryStatsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.xray.app.stats.command.QueryStatsRequest build() {
      com.xray.app.stats.command.QueryStatsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xray.app.stats.command.QueryStatsRequest buildPartial() {
      com.xray.app.stats.command.QueryStatsRequest result = new com.xray.app.stats.command.QueryStatsRequest(this);
      result.pattern_ = pattern_;
      result.reset_ = reset_;
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
      if (other instanceof com.xray.app.stats.command.QueryStatsRequest) {
        return mergeFrom((com.xray.app.stats.command.QueryStatsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xray.app.stats.command.QueryStatsRequest other) {
      if (other == com.xray.app.stats.command.QueryStatsRequest.getDefaultInstance()) return this;
      if (!other.getPattern().isEmpty()) {
        pattern_ = other.pattern_;
        onChanged();
      }
      if (other.getReset() != false) {
        setReset(other.getReset());
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
      com.xray.app.stats.command.QueryStatsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xray.app.stats.command.QueryStatsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object pattern_ = "";
    /**
     * <code>string pattern = 1;</code>
     * @return The pattern.
     */
    public java.lang.String getPattern() {
      java.lang.Object ref = pattern_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pattern_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pattern = 1;</code>
     * @return The bytes for pattern.
     */
    public com.google.protobuf.ByteString
        getPatternBytes() {
      java.lang.Object ref = pattern_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pattern_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pattern = 1;</code>
     * @param value The pattern to set.
     * @return This builder for chaining.
     */
    public Builder setPattern(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pattern_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pattern = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPattern() {
      
      pattern_ = getDefaultInstance().getPattern();
      onChanged();
      return this;
    }
    /**
     * <code>string pattern = 1;</code>
     * @param value The bytes for pattern to set.
     * @return This builder for chaining.
     */
    public Builder setPatternBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pattern_ = value;
      onChanged();
      return this;
    }

    private boolean reset_ ;
    /**
     * <code>bool reset = 2;</code>
     * @return The reset.
     */
    @java.lang.Override
    public boolean getReset() {
      return reset_;
    }
    /**
     * <code>bool reset = 2;</code>
     * @param value The reset to set.
     * @return This builder for chaining.
     */
    public Builder setReset(boolean value) {
      
      reset_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool reset = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearReset() {
      
      reset_ = false;
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


    // @@protoc_insertion_point(builder_scope:xray.app.stats.command.QueryStatsRequest)
  }

  // @@protoc_insertion_point(class_scope:xray.app.stats.command.QueryStatsRequest)
  private static final com.xray.app.stats.command.QueryStatsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xray.app.stats.command.QueryStatsRequest();
  }

  public static com.xray.app.stats.command.QueryStatsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryStatsRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryStatsRequest>() {
    @java.lang.Override
    public QueryStatsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryStatsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryStatsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryStatsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xray.app.stats.command.QueryStatsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

