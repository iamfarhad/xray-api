// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/wireguard/config.proto

package com.xray.proxy.wireguard;

public interface DeviceConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.proxy.wireguard.DeviceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string secret_key = 1;</code>
   * @return The secretKey.
   */
  java.lang.String getSecretKey();
  /**
   * <code>string secret_key = 1;</code>
   * @return The bytes for secretKey.
   */
  com.google.protobuf.ByteString
      getSecretKeyBytes();

  /**
   * <code>repeated string endpoint = 2;</code>
   * @return A list containing the endpoint.
   */
  java.util.List<java.lang.String>
      getEndpointList();
  /**
   * <code>repeated string endpoint = 2;</code>
   * @return The count of endpoint.
   */
  int getEndpointCount();
  /**
   * <code>repeated string endpoint = 2;</code>
   * @param index The index of the element to return.
   * @return The endpoint at the given index.
   */
  java.lang.String getEndpoint(int index);
  /**
   * <code>repeated string endpoint = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the endpoint at the given index.
   */
  com.google.protobuf.ByteString
      getEndpointBytes(int index);

  /**
   * <code>repeated .xray.proxy.wireguard.PeerConfig peers = 3;</code>
   */
  java.util.List<com.xray.proxy.wireguard.PeerConfig> 
      getPeersList();
  /**
   * <code>repeated .xray.proxy.wireguard.PeerConfig peers = 3;</code>
   */
  com.xray.proxy.wireguard.PeerConfig getPeers(int index);
  /**
   * <code>repeated .xray.proxy.wireguard.PeerConfig peers = 3;</code>
   */
  int getPeersCount();
  /**
   * <code>repeated .xray.proxy.wireguard.PeerConfig peers = 3;</code>
   */
  java.util.List<? extends com.xray.proxy.wireguard.PeerConfigOrBuilder> 
      getPeersOrBuilderList();
  /**
   * <code>repeated .xray.proxy.wireguard.PeerConfig peers = 3;</code>
   */
  com.xray.proxy.wireguard.PeerConfigOrBuilder getPeersOrBuilder(
      int index);

  /**
   * <code>int32 mtu = 4;</code>
   * @return The mtu.
   */
  int getMtu();

  /**
   * <code>int32 num_workers = 5;</code>
   * @return The numWorkers.
   */
  int getNumWorkers();

  /**
   * <code>bytes reserved = 6;</code>
   * @return The reserved.
   */
  com.google.protobuf.ByteString getReserved();

  /**
   * <code>.xray.proxy.wireguard.DeviceConfig.DomainStrategy domain_strategy = 7;</code>
   * @return The enum numeric value on the wire for domainStrategy.
   */
  int getDomainStrategyValue();
  /**
   * <code>.xray.proxy.wireguard.DeviceConfig.DomainStrategy domain_strategy = 7;</code>
   * @return The domainStrategy.
   */
  com.xray.proxy.wireguard.DeviceConfig.DomainStrategy getDomainStrategy();

  /**
   * <code>bool is_client = 8;</code>
   * @return The isClient.
   */
  boolean getIsClient();

  /**
   * <code>bool kernel_mode = 9;</code>
   * @return The kernelMode.
   */
  boolean getKernelMode();
}
