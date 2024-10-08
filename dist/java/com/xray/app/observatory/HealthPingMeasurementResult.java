// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/observatory/config.proto

package com.xray.app.observatory;

/**
 * Protobuf type {@code xray.core.app.observatory.HealthPingMeasurementResult}
 */
public final class HealthPingMeasurementResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.core.app.observatory.HealthPingMeasurementResult)
    HealthPingMeasurementResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HealthPingMeasurementResult.newBuilder() to construct.
  private HealthPingMeasurementResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HealthPingMeasurementResult() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HealthPingMeasurementResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HealthPingMeasurementResult(
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

            all_ = input.readInt64();
            break;
          }
          case 16: {

            fail_ = input.readInt64();
            break;
          }
          case 24: {

            deviation_ = input.readInt64();
            break;
          }
          case 32: {

            average_ = input.readInt64();
            break;
          }
          case 40: {

            max_ = input.readInt64();
            break;
          }
          case 48: {

            min_ = input.readInt64();
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
    return com.xray.app.observatory.ConfigOuterClass.internal_static_xray_core_app_observatory_HealthPingMeasurementResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xray.app.observatory.ConfigOuterClass.internal_static_xray_core_app_observatory_HealthPingMeasurementResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xray.app.observatory.HealthPingMeasurementResult.class, com.xray.app.observatory.HealthPingMeasurementResult.Builder.class);
  }

  public static final int ALL_FIELD_NUMBER = 1;
  private long all_;
  /**
   * <code>int64 all = 1;</code>
   * @return The all.
   */
  @java.lang.Override
  public long getAll() {
    return all_;
  }

  public static final int FAIL_FIELD_NUMBER = 2;
  private long fail_;
  /**
   * <code>int64 fail = 2;</code>
   * @return The fail.
   */
  @java.lang.Override
  public long getFail() {
    return fail_;
  }

  public static final int DEVIATION_FIELD_NUMBER = 3;
  private long deviation_;
  /**
   * <code>int64 deviation = 3;</code>
   * @return The deviation.
   */
  @java.lang.Override
  public long getDeviation() {
    return deviation_;
  }

  public static final int AVERAGE_FIELD_NUMBER = 4;
  private long average_;
  /**
   * <code>int64 average = 4;</code>
   * @return The average.
   */
  @java.lang.Override
  public long getAverage() {
    return average_;
  }

  public static final int MAX_FIELD_NUMBER = 5;
  private long max_;
  /**
   * <code>int64 max = 5;</code>
   * @return The max.
   */
  @java.lang.Override
  public long getMax() {
    return max_;
  }

  public static final int MIN_FIELD_NUMBER = 6;
  private long min_;
  /**
   * <code>int64 min = 6;</code>
   * @return The min.
   */
  @java.lang.Override
  public long getMin() {
    return min_;
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
    if (all_ != 0L) {
      output.writeInt64(1, all_);
    }
    if (fail_ != 0L) {
      output.writeInt64(2, fail_);
    }
    if (deviation_ != 0L) {
      output.writeInt64(3, deviation_);
    }
    if (average_ != 0L) {
      output.writeInt64(4, average_);
    }
    if (max_ != 0L) {
      output.writeInt64(5, max_);
    }
    if (min_ != 0L) {
      output.writeInt64(6, min_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (all_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, all_);
    }
    if (fail_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, fail_);
    }
    if (deviation_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, deviation_);
    }
    if (average_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, average_);
    }
    if (max_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, max_);
    }
    if (min_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, min_);
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
    if (!(obj instanceof com.xray.app.observatory.HealthPingMeasurementResult)) {
      return super.equals(obj);
    }
    com.xray.app.observatory.HealthPingMeasurementResult other = (com.xray.app.observatory.HealthPingMeasurementResult) obj;

    if (getAll()
        != other.getAll()) return false;
    if (getFail()
        != other.getFail()) return false;
    if (getDeviation()
        != other.getDeviation()) return false;
    if (getAverage()
        != other.getAverage()) return false;
    if (getMax()
        != other.getMax()) return false;
    if (getMin()
        != other.getMin()) return false;
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
    hash = (37 * hash) + ALL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAll());
    hash = (37 * hash) + FAIL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFail());
    hash = (37 * hash) + DEVIATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDeviation());
    hash = (37 * hash) + AVERAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAverage());
    hash = (37 * hash) + MAX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMax());
    hash = (37 * hash) + MIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMin());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xray.app.observatory.HealthPingMeasurementResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.observatory.HealthPingMeasurementResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.observatory.HealthPingMeasurementResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.observatory.HealthPingMeasurementResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.observatory.HealthPingMeasurementResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.app.observatory.HealthPingMeasurementResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.app.observatory.HealthPingMeasurementResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.app.observatory.HealthPingMeasurementResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.app.observatory.HealthPingMeasurementResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xray.app.observatory.HealthPingMeasurementResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.app.observatory.HealthPingMeasurementResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.app.observatory.HealthPingMeasurementResult parseFrom(
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
  public static Builder newBuilder(com.xray.app.observatory.HealthPingMeasurementResult prototype) {
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
   * Protobuf type {@code xray.core.app.observatory.HealthPingMeasurementResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.core.app.observatory.HealthPingMeasurementResult)
      com.xray.app.observatory.HealthPingMeasurementResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xray.app.observatory.ConfigOuterClass.internal_static_xray_core_app_observatory_HealthPingMeasurementResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xray.app.observatory.ConfigOuterClass.internal_static_xray_core_app_observatory_HealthPingMeasurementResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xray.app.observatory.HealthPingMeasurementResult.class, com.xray.app.observatory.HealthPingMeasurementResult.Builder.class);
    }

    // Construct using com.xray.app.observatory.HealthPingMeasurementResult.newBuilder()
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
      all_ = 0L;

      fail_ = 0L;

      deviation_ = 0L;

      average_ = 0L;

      max_ = 0L;

      min_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xray.app.observatory.ConfigOuterClass.internal_static_xray_core_app_observatory_HealthPingMeasurementResult_descriptor;
    }

    @java.lang.Override
    public com.xray.app.observatory.HealthPingMeasurementResult getDefaultInstanceForType() {
      return com.xray.app.observatory.HealthPingMeasurementResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.xray.app.observatory.HealthPingMeasurementResult build() {
      com.xray.app.observatory.HealthPingMeasurementResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xray.app.observatory.HealthPingMeasurementResult buildPartial() {
      com.xray.app.observatory.HealthPingMeasurementResult result = new com.xray.app.observatory.HealthPingMeasurementResult(this);
      result.all_ = all_;
      result.fail_ = fail_;
      result.deviation_ = deviation_;
      result.average_ = average_;
      result.max_ = max_;
      result.min_ = min_;
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
      if (other instanceof com.xray.app.observatory.HealthPingMeasurementResult) {
        return mergeFrom((com.xray.app.observatory.HealthPingMeasurementResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xray.app.observatory.HealthPingMeasurementResult other) {
      if (other == com.xray.app.observatory.HealthPingMeasurementResult.getDefaultInstance()) return this;
      if (other.getAll() != 0L) {
        setAll(other.getAll());
      }
      if (other.getFail() != 0L) {
        setFail(other.getFail());
      }
      if (other.getDeviation() != 0L) {
        setDeviation(other.getDeviation());
      }
      if (other.getAverage() != 0L) {
        setAverage(other.getAverage());
      }
      if (other.getMax() != 0L) {
        setMax(other.getMax());
      }
      if (other.getMin() != 0L) {
        setMin(other.getMin());
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
      com.xray.app.observatory.HealthPingMeasurementResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xray.app.observatory.HealthPingMeasurementResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long all_ ;
    /**
     * <code>int64 all = 1;</code>
     * @return The all.
     */
    @java.lang.Override
    public long getAll() {
      return all_;
    }
    /**
     * <code>int64 all = 1;</code>
     * @param value The all to set.
     * @return This builder for chaining.
     */
    public Builder setAll(long value) {
      
      all_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 all = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAll() {
      
      all_ = 0L;
      onChanged();
      return this;
    }

    private long fail_ ;
    /**
     * <code>int64 fail = 2;</code>
     * @return The fail.
     */
    @java.lang.Override
    public long getFail() {
      return fail_;
    }
    /**
     * <code>int64 fail = 2;</code>
     * @param value The fail to set.
     * @return This builder for chaining.
     */
    public Builder setFail(long value) {
      
      fail_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 fail = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFail() {
      
      fail_ = 0L;
      onChanged();
      return this;
    }

    private long deviation_ ;
    /**
     * <code>int64 deviation = 3;</code>
     * @return The deviation.
     */
    @java.lang.Override
    public long getDeviation() {
      return deviation_;
    }
    /**
     * <code>int64 deviation = 3;</code>
     * @param value The deviation to set.
     * @return This builder for chaining.
     */
    public Builder setDeviation(long value) {
      
      deviation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 deviation = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviation() {
      
      deviation_ = 0L;
      onChanged();
      return this;
    }

    private long average_ ;
    /**
     * <code>int64 average = 4;</code>
     * @return The average.
     */
    @java.lang.Override
    public long getAverage() {
      return average_;
    }
    /**
     * <code>int64 average = 4;</code>
     * @param value The average to set.
     * @return This builder for chaining.
     */
    public Builder setAverage(long value) {
      
      average_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 average = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAverage() {
      
      average_ = 0L;
      onChanged();
      return this;
    }

    private long max_ ;
    /**
     * <code>int64 max = 5;</code>
     * @return The max.
     */
    @java.lang.Override
    public long getMax() {
      return max_;
    }
    /**
     * <code>int64 max = 5;</code>
     * @param value The max to set.
     * @return This builder for chaining.
     */
    public Builder setMax(long value) {
      
      max_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 max = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearMax() {
      
      max_ = 0L;
      onChanged();
      return this;
    }

    private long min_ ;
    /**
     * <code>int64 min = 6;</code>
     * @return The min.
     */
    @java.lang.Override
    public long getMin() {
      return min_;
    }
    /**
     * <code>int64 min = 6;</code>
     * @param value The min to set.
     * @return This builder for chaining.
     */
    public Builder setMin(long value) {
      
      min_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 min = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearMin() {
      
      min_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:xray.core.app.observatory.HealthPingMeasurementResult)
  }

  // @@protoc_insertion_point(class_scope:xray.core.app.observatory.HealthPingMeasurementResult)
  private static final com.xray.app.observatory.HealthPingMeasurementResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xray.app.observatory.HealthPingMeasurementResult();
  }

  public static com.xray.app.observatory.HealthPingMeasurementResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HealthPingMeasurementResult>
      PARSER = new com.google.protobuf.AbstractParser<HealthPingMeasurementResult>() {
    @java.lang.Override
    public HealthPingMeasurementResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HealthPingMeasurementResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HealthPingMeasurementResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HealthPingMeasurementResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xray.app.observatory.HealthPingMeasurementResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

