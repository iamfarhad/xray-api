// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/freedom/config.proto

package com.xray.proxy.freedom;

/**
 * Protobuf type {@code xray.proxy.freedom.Fragment}
 */
public final class Fragment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.proxy.freedom.Fragment)
    FragmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Fragment.newBuilder() to construct.
  private Fragment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Fragment() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Fragment();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Fragment(
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

            packetsFrom_ = input.readUInt64();
            break;
          }
          case 16: {

            packetsTo_ = input.readUInt64();
            break;
          }
          case 24: {

            lengthMin_ = input.readUInt64();
            break;
          }
          case 32: {

            lengthMax_ = input.readUInt64();
            break;
          }
          case 40: {

            intervalMin_ = input.readUInt64();
            break;
          }
          case 48: {

            intervalMax_ = input.readUInt64();
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
    return com.xray.proxy.freedom.ConfigOuterClass.internal_static_xray_proxy_freedom_Fragment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xray.proxy.freedom.ConfigOuterClass.internal_static_xray_proxy_freedom_Fragment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xray.proxy.freedom.Fragment.class, com.xray.proxy.freedom.Fragment.Builder.class);
  }

  public static final int PACKETS_FROM_FIELD_NUMBER = 1;
  private long packetsFrom_;
  /**
   * <code>uint64 packets_from = 1;</code>
   * @return The packetsFrom.
   */
  @java.lang.Override
  public long getPacketsFrom() {
    return packetsFrom_;
  }

  public static final int PACKETS_TO_FIELD_NUMBER = 2;
  private long packetsTo_;
  /**
   * <code>uint64 packets_to = 2;</code>
   * @return The packetsTo.
   */
  @java.lang.Override
  public long getPacketsTo() {
    return packetsTo_;
  }

  public static final int LENGTH_MIN_FIELD_NUMBER = 3;
  private long lengthMin_;
  /**
   * <code>uint64 length_min = 3;</code>
   * @return The lengthMin.
   */
  @java.lang.Override
  public long getLengthMin() {
    return lengthMin_;
  }

  public static final int LENGTH_MAX_FIELD_NUMBER = 4;
  private long lengthMax_;
  /**
   * <code>uint64 length_max = 4;</code>
   * @return The lengthMax.
   */
  @java.lang.Override
  public long getLengthMax() {
    return lengthMax_;
  }

  public static final int INTERVAL_MIN_FIELD_NUMBER = 5;
  private long intervalMin_;
  /**
   * <code>uint64 interval_min = 5;</code>
   * @return The intervalMin.
   */
  @java.lang.Override
  public long getIntervalMin() {
    return intervalMin_;
  }

  public static final int INTERVAL_MAX_FIELD_NUMBER = 6;
  private long intervalMax_;
  /**
   * <code>uint64 interval_max = 6;</code>
   * @return The intervalMax.
   */
  @java.lang.Override
  public long getIntervalMax() {
    return intervalMax_;
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
    if (packetsFrom_ != 0L) {
      output.writeUInt64(1, packetsFrom_);
    }
    if (packetsTo_ != 0L) {
      output.writeUInt64(2, packetsTo_);
    }
    if (lengthMin_ != 0L) {
      output.writeUInt64(3, lengthMin_);
    }
    if (lengthMax_ != 0L) {
      output.writeUInt64(4, lengthMax_);
    }
    if (intervalMin_ != 0L) {
      output.writeUInt64(5, intervalMin_);
    }
    if (intervalMax_ != 0L) {
      output.writeUInt64(6, intervalMax_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (packetsFrom_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, packetsFrom_);
    }
    if (packetsTo_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, packetsTo_);
    }
    if (lengthMin_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, lengthMin_);
    }
    if (lengthMax_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, lengthMax_);
    }
    if (intervalMin_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, intervalMin_);
    }
    if (intervalMax_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(6, intervalMax_);
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
    if (!(obj instanceof com.xray.proxy.freedom.Fragment)) {
      return super.equals(obj);
    }
    com.xray.proxy.freedom.Fragment other = (com.xray.proxy.freedom.Fragment) obj;

    if (getPacketsFrom()
        != other.getPacketsFrom()) return false;
    if (getPacketsTo()
        != other.getPacketsTo()) return false;
    if (getLengthMin()
        != other.getLengthMin()) return false;
    if (getLengthMax()
        != other.getLengthMax()) return false;
    if (getIntervalMin()
        != other.getIntervalMin()) return false;
    if (getIntervalMax()
        != other.getIntervalMax()) return false;
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
    hash = (37 * hash) + PACKETS_FROM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPacketsFrom());
    hash = (37 * hash) + PACKETS_TO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPacketsTo());
    hash = (37 * hash) + LENGTH_MIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLengthMin());
    hash = (37 * hash) + LENGTH_MAX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLengthMax());
    hash = (37 * hash) + INTERVAL_MIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIntervalMin());
    hash = (37 * hash) + INTERVAL_MAX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIntervalMax());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xray.proxy.freedom.Fragment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.proxy.freedom.Fragment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.proxy.freedom.Fragment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.proxy.freedom.Fragment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.proxy.freedom.Fragment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.proxy.freedom.Fragment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.proxy.freedom.Fragment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.proxy.freedom.Fragment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.proxy.freedom.Fragment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xray.proxy.freedom.Fragment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.proxy.freedom.Fragment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.proxy.freedom.Fragment parseFrom(
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
  public static Builder newBuilder(com.xray.proxy.freedom.Fragment prototype) {
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
   * Protobuf type {@code xray.proxy.freedom.Fragment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.proxy.freedom.Fragment)
      com.xray.proxy.freedom.FragmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xray.proxy.freedom.ConfigOuterClass.internal_static_xray_proxy_freedom_Fragment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xray.proxy.freedom.ConfigOuterClass.internal_static_xray_proxy_freedom_Fragment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xray.proxy.freedom.Fragment.class, com.xray.proxy.freedom.Fragment.Builder.class);
    }

    // Construct using com.xray.proxy.freedom.Fragment.newBuilder()
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
      packetsFrom_ = 0L;

      packetsTo_ = 0L;

      lengthMin_ = 0L;

      lengthMax_ = 0L;

      intervalMin_ = 0L;

      intervalMax_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xray.proxy.freedom.ConfigOuterClass.internal_static_xray_proxy_freedom_Fragment_descriptor;
    }

    @java.lang.Override
    public com.xray.proxy.freedom.Fragment getDefaultInstanceForType() {
      return com.xray.proxy.freedom.Fragment.getDefaultInstance();
    }

    @java.lang.Override
    public com.xray.proxy.freedom.Fragment build() {
      com.xray.proxy.freedom.Fragment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xray.proxy.freedom.Fragment buildPartial() {
      com.xray.proxy.freedom.Fragment result = new com.xray.proxy.freedom.Fragment(this);
      result.packetsFrom_ = packetsFrom_;
      result.packetsTo_ = packetsTo_;
      result.lengthMin_ = lengthMin_;
      result.lengthMax_ = lengthMax_;
      result.intervalMin_ = intervalMin_;
      result.intervalMax_ = intervalMax_;
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
      if (other instanceof com.xray.proxy.freedom.Fragment) {
        return mergeFrom((com.xray.proxy.freedom.Fragment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xray.proxy.freedom.Fragment other) {
      if (other == com.xray.proxy.freedom.Fragment.getDefaultInstance()) return this;
      if (other.getPacketsFrom() != 0L) {
        setPacketsFrom(other.getPacketsFrom());
      }
      if (other.getPacketsTo() != 0L) {
        setPacketsTo(other.getPacketsTo());
      }
      if (other.getLengthMin() != 0L) {
        setLengthMin(other.getLengthMin());
      }
      if (other.getLengthMax() != 0L) {
        setLengthMax(other.getLengthMax());
      }
      if (other.getIntervalMin() != 0L) {
        setIntervalMin(other.getIntervalMin());
      }
      if (other.getIntervalMax() != 0L) {
        setIntervalMax(other.getIntervalMax());
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
      com.xray.proxy.freedom.Fragment parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xray.proxy.freedom.Fragment) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long packetsFrom_ ;
    /**
     * <code>uint64 packets_from = 1;</code>
     * @return The packetsFrom.
     */
    @java.lang.Override
    public long getPacketsFrom() {
      return packetsFrom_;
    }
    /**
     * <code>uint64 packets_from = 1;</code>
     * @param value The packetsFrom to set.
     * @return This builder for chaining.
     */
    public Builder setPacketsFrom(long value) {
      
      packetsFrom_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 packets_from = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPacketsFrom() {
      
      packetsFrom_ = 0L;
      onChanged();
      return this;
    }

    private long packetsTo_ ;
    /**
     * <code>uint64 packets_to = 2;</code>
     * @return The packetsTo.
     */
    @java.lang.Override
    public long getPacketsTo() {
      return packetsTo_;
    }
    /**
     * <code>uint64 packets_to = 2;</code>
     * @param value The packetsTo to set.
     * @return This builder for chaining.
     */
    public Builder setPacketsTo(long value) {
      
      packetsTo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 packets_to = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPacketsTo() {
      
      packetsTo_ = 0L;
      onChanged();
      return this;
    }

    private long lengthMin_ ;
    /**
     * <code>uint64 length_min = 3;</code>
     * @return The lengthMin.
     */
    @java.lang.Override
    public long getLengthMin() {
      return lengthMin_;
    }
    /**
     * <code>uint64 length_min = 3;</code>
     * @param value The lengthMin to set.
     * @return This builder for chaining.
     */
    public Builder setLengthMin(long value) {
      
      lengthMin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 length_min = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLengthMin() {
      
      lengthMin_ = 0L;
      onChanged();
      return this;
    }

    private long lengthMax_ ;
    /**
     * <code>uint64 length_max = 4;</code>
     * @return The lengthMax.
     */
    @java.lang.Override
    public long getLengthMax() {
      return lengthMax_;
    }
    /**
     * <code>uint64 length_max = 4;</code>
     * @param value The lengthMax to set.
     * @return This builder for chaining.
     */
    public Builder setLengthMax(long value) {
      
      lengthMax_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 length_max = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLengthMax() {
      
      lengthMax_ = 0L;
      onChanged();
      return this;
    }

    private long intervalMin_ ;
    /**
     * <code>uint64 interval_min = 5;</code>
     * @return The intervalMin.
     */
    @java.lang.Override
    public long getIntervalMin() {
      return intervalMin_;
    }
    /**
     * <code>uint64 interval_min = 5;</code>
     * @param value The intervalMin to set.
     * @return This builder for chaining.
     */
    public Builder setIntervalMin(long value) {
      
      intervalMin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 interval_min = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIntervalMin() {
      
      intervalMin_ = 0L;
      onChanged();
      return this;
    }

    private long intervalMax_ ;
    /**
     * <code>uint64 interval_max = 6;</code>
     * @return The intervalMax.
     */
    @java.lang.Override
    public long getIntervalMax() {
      return intervalMax_;
    }
    /**
     * <code>uint64 interval_max = 6;</code>
     * @param value The intervalMax to set.
     * @return This builder for chaining.
     */
    public Builder setIntervalMax(long value) {
      
      intervalMax_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 interval_max = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearIntervalMax() {
      
      intervalMax_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:xray.proxy.freedom.Fragment)
  }

  // @@protoc_insertion_point(class_scope:xray.proxy.freedom.Fragment)
  private static final com.xray.proxy.freedom.Fragment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xray.proxy.freedom.Fragment();
  }

  public static com.xray.proxy.freedom.Fragment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Fragment>
      PARSER = new com.google.protobuf.AbstractParser<Fragment>() {
    @java.lang.Override
    public Fragment parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Fragment(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Fragment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Fragment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xray.proxy.freedom.Fragment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

