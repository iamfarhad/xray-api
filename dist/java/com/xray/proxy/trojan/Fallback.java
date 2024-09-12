// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/trojan/config.proto

package com.xray.proxy.trojan;

/**
 * Protobuf type {@code xray.proxy.trojan.Fallback}
 */
public final class Fallback extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.proxy.trojan.Fallback)
    FallbackOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Fallback.newBuilder() to construct.
  private Fallback(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Fallback() {
    name_ = "";
    alpn_ = "";
    path_ = "";
    type_ = "";
    dest_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Fallback();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Fallback(
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

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            alpn_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            path_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            dest_ = s;
            break;
          }
          case 48: {

            xver_ = input.readUInt64();
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
    return com.xray.proxy.trojan.Config.internal_static_xray_proxy_trojan_Fallback_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xray.proxy.trojan.Config.internal_static_xray_proxy_trojan_Fallback_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xray.proxy.trojan.Fallback.class, com.xray.proxy.trojan.Fallback.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALPN_FIELD_NUMBER = 2;
  private volatile java.lang.Object alpn_;
  /**
   * <code>string alpn = 2;</code>
   * @return The alpn.
   */
  @java.lang.Override
  public java.lang.String getAlpn() {
    java.lang.Object ref = alpn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      alpn_ = s;
      return s;
    }
  }
  /**
   * <code>string alpn = 2;</code>
   * @return The bytes for alpn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAlpnBytes() {
    java.lang.Object ref = alpn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      alpn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PATH_FIELD_NUMBER = 3;
  private volatile java.lang.Object path_;
  /**
   * <code>string path = 3;</code>
   * @return The path.
   */
  @java.lang.Override
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <code>string path = 3;</code>
   * @return The bytes for path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 4;
  private volatile java.lang.Object type_;
  /**
   * <code>string type = 4;</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 4;</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEST_FIELD_NUMBER = 5;
  private volatile java.lang.Object dest_;
  /**
   * <code>string dest = 5;</code>
   * @return The dest.
   */
  @java.lang.Override
  public java.lang.String getDest() {
    java.lang.Object ref = dest_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dest_ = s;
      return s;
    }
  }
  /**
   * <code>string dest = 5;</code>
   * @return The bytes for dest.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDestBytes() {
    java.lang.Object ref = dest_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dest_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int XVER_FIELD_NUMBER = 6;
  private long xver_;
  /**
   * <code>uint64 xver = 6;</code>
   * @return The xver.
   */
  @java.lang.Override
  public long getXver() {
    return xver_;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getAlpnBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, alpn_);
    }
    if (!getPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, path_);
    }
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, type_);
    }
    if (!getDestBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, dest_);
    }
    if (xver_ != 0L) {
      output.writeUInt64(6, xver_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getAlpnBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, alpn_);
    }
    if (!getPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, path_);
    }
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, type_);
    }
    if (!getDestBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, dest_);
    }
    if (xver_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(6, xver_);
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
    if (!(obj instanceof com.xray.proxy.trojan.Fallback)) {
      return super.equals(obj);
    }
    com.xray.proxy.trojan.Fallback other = (com.xray.proxy.trojan.Fallback) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getAlpn()
        .equals(other.getAlpn())) return false;
    if (!getPath()
        .equals(other.getPath())) return false;
    if (!getType()
        .equals(other.getType())) return false;
    if (!getDest()
        .equals(other.getDest())) return false;
    if (getXver()
        != other.getXver()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ALPN_FIELD_NUMBER;
    hash = (53 * hash) + getAlpn().hashCode();
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + DEST_FIELD_NUMBER;
    hash = (53 * hash) + getDest().hashCode();
    hash = (37 * hash) + XVER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getXver());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xray.proxy.trojan.Fallback parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.proxy.trojan.Fallback parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.proxy.trojan.Fallback parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.proxy.trojan.Fallback parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.proxy.trojan.Fallback parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.proxy.trojan.Fallback parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.proxy.trojan.Fallback parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.proxy.trojan.Fallback parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.proxy.trojan.Fallback parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xray.proxy.trojan.Fallback parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.proxy.trojan.Fallback parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.proxy.trojan.Fallback parseFrom(
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
  public static Builder newBuilder(com.xray.proxy.trojan.Fallback prototype) {
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
   * Protobuf type {@code xray.proxy.trojan.Fallback}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.proxy.trojan.Fallback)
      com.xray.proxy.trojan.FallbackOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xray.proxy.trojan.Config.internal_static_xray_proxy_trojan_Fallback_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xray.proxy.trojan.Config.internal_static_xray_proxy_trojan_Fallback_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xray.proxy.trojan.Fallback.class, com.xray.proxy.trojan.Fallback.Builder.class);
    }

    // Construct using com.xray.proxy.trojan.Fallback.newBuilder()
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
      name_ = "";

      alpn_ = "";

      path_ = "";

      type_ = "";

      dest_ = "";

      xver_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xray.proxy.trojan.Config.internal_static_xray_proxy_trojan_Fallback_descriptor;
    }

    @java.lang.Override
    public com.xray.proxy.trojan.Fallback getDefaultInstanceForType() {
      return com.xray.proxy.trojan.Fallback.getDefaultInstance();
    }

    @java.lang.Override
    public com.xray.proxy.trojan.Fallback build() {
      com.xray.proxy.trojan.Fallback result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xray.proxy.trojan.Fallback buildPartial() {
      com.xray.proxy.trojan.Fallback result = new com.xray.proxy.trojan.Fallback(this);
      result.name_ = name_;
      result.alpn_ = alpn_;
      result.path_ = path_;
      result.type_ = type_;
      result.dest_ = dest_;
      result.xver_ = xver_;
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
      if (other instanceof com.xray.proxy.trojan.Fallback) {
        return mergeFrom((com.xray.proxy.trojan.Fallback)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xray.proxy.trojan.Fallback other) {
      if (other == com.xray.proxy.trojan.Fallback.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getAlpn().isEmpty()) {
        alpn_ = other.alpn_;
        onChanged();
      }
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (!other.getDest().isEmpty()) {
        dest_ = other.dest_;
        onChanged();
      }
      if (other.getXver() != 0L) {
        setXver(other.getXver());
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
      com.xray.proxy.trojan.Fallback parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xray.proxy.trojan.Fallback) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object alpn_ = "";
    /**
     * <code>string alpn = 2;</code>
     * @return The alpn.
     */
    public java.lang.String getAlpn() {
      java.lang.Object ref = alpn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        alpn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string alpn = 2;</code>
     * @return The bytes for alpn.
     */
    public com.google.protobuf.ByteString
        getAlpnBytes() {
      java.lang.Object ref = alpn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        alpn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string alpn = 2;</code>
     * @param value The alpn to set.
     * @return This builder for chaining.
     */
    public Builder setAlpn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      alpn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string alpn = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAlpn() {
      
      alpn_ = getDefaultInstance().getAlpn();
      onChanged();
      return this;
    }
    /**
     * <code>string alpn = 2;</code>
     * @param value The bytes for alpn to set.
     * @return This builder for chaining.
     */
    public Builder setAlpnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      alpn_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object path_ = "";
    /**
     * <code>string path = 3;</code>
     * @return The path.
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string path = 3;</code>
     * @return The bytes for path.
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string path = 3;</code>
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      path_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string path = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPath() {
      
      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     * <code>string path = 3;</code>
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      path_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 4;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string type = 4;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 4;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 4;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dest_ = "";
    /**
     * <code>string dest = 5;</code>
     * @return The dest.
     */
    public java.lang.String getDest() {
      java.lang.Object ref = dest_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dest_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dest = 5;</code>
     * @return The bytes for dest.
     */
    public com.google.protobuf.ByteString
        getDestBytes() {
      java.lang.Object ref = dest_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dest_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dest = 5;</code>
     * @param value The dest to set.
     * @return This builder for chaining.
     */
    public Builder setDest(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dest_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dest = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDest() {
      
      dest_ = getDefaultInstance().getDest();
      onChanged();
      return this;
    }
    /**
     * <code>string dest = 5;</code>
     * @param value The bytes for dest to set.
     * @return This builder for chaining.
     */
    public Builder setDestBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dest_ = value;
      onChanged();
      return this;
    }

    private long xver_ ;
    /**
     * <code>uint64 xver = 6;</code>
     * @return The xver.
     */
    @java.lang.Override
    public long getXver() {
      return xver_;
    }
    /**
     * <code>uint64 xver = 6;</code>
     * @param value The xver to set.
     * @return This builder for chaining.
     */
    public Builder setXver(long value) {
      
      xver_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 xver = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearXver() {
      
      xver_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:xray.proxy.trojan.Fallback)
  }

  // @@protoc_insertion_point(class_scope:xray.proxy.trojan.Fallback)
  private static final com.xray.proxy.trojan.Fallback DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xray.proxy.trojan.Fallback();
  }

  public static com.xray.proxy.trojan.Fallback getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Fallback>
      PARSER = new com.google.protobuf.AbstractParser<Fallback>() {
    @java.lang.Override
    public Fallback parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Fallback(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Fallback> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Fallback> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xray.proxy.trojan.Fallback getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

