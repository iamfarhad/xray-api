// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/http/config.proto

package com.xray.proxy.http;

/**
 * <pre>
 * Config for HTTP proxy server.
 * </pre>
 *
 * Protobuf type {@code xray.proxy.http.ServerConfig}
 */
public final class ServerConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.proxy.http.ServerConfig)
    ServerConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServerConfig.newBuilder() to construct.
  private ServerConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServerConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ServerConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ServerConfig(
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
          case 8: {

            timeout_ = input.readUInt32();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              accounts_ = com.google.protobuf.MapField.newMapField(
                  AccountsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            accounts__ = input.readMessage(
                AccountsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            accounts_.getMutableMap().put(
                accounts__.getKey(), accounts__.getValue());
            break;
          }
          case 24: {

            allowTransparent_ = input.readBool();
            break;
          }
          case 32: {

            userLevel_ = input.readUInt32();
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
    return com.xray.proxy.http.Config.internal_static_xray_proxy_http_ServerConfig_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetAccounts();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xray.proxy.http.Config.internal_static_xray_proxy_http_ServerConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xray.proxy.http.ServerConfig.class, com.xray.proxy.http.ServerConfig.Builder.class);
  }

  public static final int TIMEOUT_FIELD_NUMBER = 1;
  private int timeout_;
  /**
   * <code>uint32 timeout = 1 [deprecated = true];</code>
   * @return The timeout.
   */
  @java.lang.Override
  @java.lang.Deprecated public int getTimeout() {
    return timeout_;
  }

  public static final int ACCOUNTS_FIELD_NUMBER = 2;
  private static final class AccountsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.xray.proxy.http.Config.internal_static_xray_proxy_http_ServerConfig_AccountsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> accounts_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetAccounts() {
    if (accounts_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          AccountsDefaultEntryHolder.defaultEntry);
    }
    return accounts_;
  }

  public int getAccountsCount() {
    return internalGetAccounts().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */

  @java.lang.Override
  public boolean containsAccounts(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetAccounts().getMap().containsKey(key);
  }
  /**
   * Use {@link #getAccountsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getAccounts() {
    return getAccountsMap();
  }
  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getAccountsMap() {
    return internalGetAccounts().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */
  @java.lang.Override

  public java.lang.String getAccountsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetAccounts().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */
  @java.lang.Override

  public java.lang.String getAccountsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetAccounts().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int ALLOW_TRANSPARENT_FIELD_NUMBER = 3;
  private boolean allowTransparent_;
  /**
   * <code>bool allow_transparent = 3;</code>
   * @return The allowTransparent.
   */
  @java.lang.Override
  public boolean getAllowTransparent() {
    return allowTransparent_;
  }

  public static final int USER_LEVEL_FIELD_NUMBER = 4;
  private int userLevel_;
  /**
   * <code>uint32 user_level = 4;</code>
   * @return The userLevel.
   */
  @java.lang.Override
  public int getUserLevel() {
    return userLevel_;
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
    if (timeout_ != 0) {
      output.writeUInt32(1, timeout_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetAccounts(),
        AccountsDefaultEntryHolder.defaultEntry,
        2);
    if (allowTransparent_ != false) {
      output.writeBool(3, allowTransparent_);
    }
    if (userLevel_ != 0) {
      output.writeUInt32(4, userLevel_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timeout_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, timeout_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetAccounts().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      accounts__ = AccountsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, accounts__);
    }
    if (allowTransparent_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, allowTransparent_);
    }
    if (userLevel_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, userLevel_);
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
    if (!(obj instanceof com.xray.proxy.http.ServerConfig)) {
      return super.equals(obj);
    }
    com.xray.proxy.http.ServerConfig other = (com.xray.proxy.http.ServerConfig) obj;

    if (getTimeout()
        != other.getTimeout()) return false;
    if (!internalGetAccounts().equals(
        other.internalGetAccounts())) return false;
    if (getAllowTransparent()
        != other.getAllowTransparent()) return false;
    if (getUserLevel()
        != other.getUserLevel()) return false;
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
    hash = (37 * hash) + TIMEOUT_FIELD_NUMBER;
    hash = (53 * hash) + getTimeout();
    if (!internalGetAccounts().getMap().isEmpty()) {
      hash = (37 * hash) + ACCOUNTS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetAccounts().hashCode();
    }
    hash = (37 * hash) + ALLOW_TRANSPARENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAllowTransparent());
    hash = (37 * hash) + USER_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getUserLevel();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xray.proxy.http.ServerConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.proxy.http.ServerConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.proxy.http.ServerConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.proxy.http.ServerConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.proxy.http.ServerConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xray.proxy.http.ServerConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xray.proxy.http.ServerConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.proxy.http.ServerConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.proxy.http.ServerConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xray.proxy.http.ServerConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xray.proxy.http.ServerConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xray.proxy.http.ServerConfig parseFrom(
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
  public static Builder newBuilder(com.xray.proxy.http.ServerConfig prototype) {
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
   * <pre>
   * Config for HTTP proxy server.
   * </pre>
   *
   * Protobuf type {@code xray.proxy.http.ServerConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.proxy.http.ServerConfig)
      com.xray.proxy.http.ServerConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xray.proxy.http.Config.internal_static_xray_proxy_http_ServerConfig_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetAccounts();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableAccounts();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xray.proxy.http.Config.internal_static_xray_proxy_http_ServerConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xray.proxy.http.ServerConfig.class, com.xray.proxy.http.ServerConfig.Builder.class);
    }

    // Construct using com.xray.proxy.http.ServerConfig.newBuilder()
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
      timeout_ = 0;

      internalGetMutableAccounts().clear();
      allowTransparent_ = false;

      userLevel_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xray.proxy.http.Config.internal_static_xray_proxy_http_ServerConfig_descriptor;
    }

    @java.lang.Override
    public com.xray.proxy.http.ServerConfig getDefaultInstanceForType() {
      return com.xray.proxy.http.ServerConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.xray.proxy.http.ServerConfig build() {
      com.xray.proxy.http.ServerConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xray.proxy.http.ServerConfig buildPartial() {
      com.xray.proxy.http.ServerConfig result = new com.xray.proxy.http.ServerConfig(this);
      int from_bitField0_ = bitField0_;
      result.timeout_ = timeout_;
      result.accounts_ = internalGetAccounts();
      result.accounts_.makeImmutable();
      result.allowTransparent_ = allowTransparent_;
      result.userLevel_ = userLevel_;
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
      if (other instanceof com.xray.proxy.http.ServerConfig) {
        return mergeFrom((com.xray.proxy.http.ServerConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xray.proxy.http.ServerConfig other) {
      if (other == com.xray.proxy.http.ServerConfig.getDefaultInstance()) return this;
      if (other.getTimeout() != 0) {
        setTimeout(other.getTimeout());
      }
      internalGetMutableAccounts().mergeFrom(
          other.internalGetAccounts());
      if (other.getAllowTransparent() != false) {
        setAllowTransparent(other.getAllowTransparent());
      }
      if (other.getUserLevel() != 0) {
        setUserLevel(other.getUserLevel());
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
      com.xray.proxy.http.ServerConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xray.proxy.http.ServerConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int timeout_ ;
    /**
     * <code>uint32 timeout = 1 [deprecated = true];</code>
     * @return The timeout.
     */
    @java.lang.Override
    @java.lang.Deprecated public int getTimeout() {
      return timeout_;
    }
    /**
     * <code>uint32 timeout = 1 [deprecated = true];</code>
     * @param value The timeout to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setTimeout(int value) {
      
      timeout_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 timeout = 1 [deprecated = true];</code>
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearTimeout() {
      
      timeout_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> accounts_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetAccounts() {
      if (accounts_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AccountsDefaultEntryHolder.defaultEntry);
      }
      return accounts_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableAccounts() {
      onChanged();;
      if (accounts_ == null) {
        accounts_ = com.google.protobuf.MapField.newMapField(
            AccountsDefaultEntryHolder.defaultEntry);
      }
      if (!accounts_.isMutable()) {
        accounts_ = accounts_.copy();
      }
      return accounts_;
    }

    public int getAccountsCount() {
      return internalGetAccounts().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; accounts = 2;</code>
     */

    @java.lang.Override
    public boolean containsAccounts(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetAccounts().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAccountsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getAccounts() {
      return getAccountsMap();
    }
    /**
     * <code>map&lt;string, string&gt; accounts = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getAccountsMap() {
      return internalGetAccounts().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; accounts = 2;</code>
     */
    @java.lang.Override

    public java.lang.String getAccountsOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetAccounts().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; accounts = 2;</code>
     */
    @java.lang.Override

    public java.lang.String getAccountsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetAccounts().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearAccounts() {
      internalGetMutableAccounts().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; accounts = 2;</code>
     */

    public Builder removeAccounts(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableAccounts().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableAccounts() {
      return internalGetMutableAccounts().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; accounts = 2;</code>
     */
    public Builder putAccounts(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableAccounts().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; accounts = 2;</code>
     */

    public Builder putAllAccounts(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableAccounts().getMutableMap()
          .putAll(values);
      return this;
    }

    private boolean allowTransparent_ ;
    /**
     * <code>bool allow_transparent = 3;</code>
     * @return The allowTransparent.
     */
    @java.lang.Override
    public boolean getAllowTransparent() {
      return allowTransparent_;
    }
    /**
     * <code>bool allow_transparent = 3;</code>
     * @param value The allowTransparent to set.
     * @return This builder for chaining.
     */
    public Builder setAllowTransparent(boolean value) {
      
      allowTransparent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool allow_transparent = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowTransparent() {
      
      allowTransparent_ = false;
      onChanged();
      return this;
    }

    private int userLevel_ ;
    /**
     * <code>uint32 user_level = 4;</code>
     * @return The userLevel.
     */
    @java.lang.Override
    public int getUserLevel() {
      return userLevel_;
    }
    /**
     * <code>uint32 user_level = 4;</code>
     * @param value The userLevel to set.
     * @return This builder for chaining.
     */
    public Builder setUserLevel(int value) {
      
      userLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 user_level = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserLevel() {
      
      userLevel_ = 0;
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


    // @@protoc_insertion_point(builder_scope:xray.proxy.http.ServerConfig)
  }

  // @@protoc_insertion_point(class_scope:xray.proxy.http.ServerConfig)
  private static final com.xray.proxy.http.ServerConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xray.proxy.http.ServerConfig();
  }

  public static com.xray.proxy.http.ServerConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServerConfig>
      PARSER = new com.google.protobuf.AbstractParser<ServerConfig>() {
    @java.lang.Override
    public ServerConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ServerConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ServerConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServerConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xray.proxy.http.ServerConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

