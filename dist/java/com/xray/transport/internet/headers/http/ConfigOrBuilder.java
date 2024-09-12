// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/headers/http/config.proto

package com.xray.transport.internet.headers.http;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.transport.internet.headers.http.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Settings for authenticating requests. If not set, client side will not send
   * authentication header, and server side will bypass authentication.
   * </pre>
   *
   * <code>.xray.transport.internet.headers.http.RequestConfig request = 1;</code>
   * @return Whether the request field is set.
   */
  boolean hasRequest();
  /**
   * <pre>
   * Settings for authenticating requests. If not set, client side will not send
   * authentication header, and server side will bypass authentication.
   * </pre>
   *
   * <code>.xray.transport.internet.headers.http.RequestConfig request = 1;</code>
   * @return The request.
   */
  com.xray.transport.internet.headers.http.RequestConfig getRequest();
  /**
   * <pre>
   * Settings for authenticating requests. If not set, client side will not send
   * authentication header, and server side will bypass authentication.
   * </pre>
   *
   * <code>.xray.transport.internet.headers.http.RequestConfig request = 1;</code>
   */
  com.xray.transport.internet.headers.http.RequestConfigOrBuilder getRequestOrBuilder();

  /**
   * <pre>
   * Settings for authenticating responses. If not set, client side will bypass
   * authentication, and server side will not send authentication header.
   * </pre>
   *
   * <code>.xray.transport.internet.headers.http.ResponseConfig response = 2;</code>
   * @return Whether the response field is set.
   */
  boolean hasResponse();
  /**
   * <pre>
   * Settings for authenticating responses. If not set, client side will bypass
   * authentication, and server side will not send authentication header.
   * </pre>
   *
   * <code>.xray.transport.internet.headers.http.ResponseConfig response = 2;</code>
   * @return The response.
   */
  com.xray.transport.internet.headers.http.ResponseConfig getResponse();
  /**
   * <pre>
   * Settings for authenticating responses. If not set, client side will bypass
   * authentication, and server side will not send authentication header.
   * </pre>
   *
   * <code>.xray.transport.internet.headers.http.ResponseConfig response = 2;</code>
   */
  com.xray.transport.internet.headers.http.ResponseConfigOrBuilder getResponseOrBuilder();
}
