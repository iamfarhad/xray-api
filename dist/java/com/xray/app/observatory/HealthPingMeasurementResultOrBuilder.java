// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/observatory/config.proto

package com.xray.app.observatory;

public interface HealthPingMeasurementResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.core.app.observatory.HealthPingMeasurementResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 all = 1;</code>
   * @return The all.
   */
  long getAll();

  /**
   * <code>int64 fail = 2;</code>
   * @return The fail.
   */
  long getFail();

  /**
   * <code>int64 deviation = 3;</code>
   * @return The deviation.
   */
  long getDeviation();

  /**
   * <code>int64 average = 4;</code>
   * @return The average.
   */
  long getAverage();

  /**
   * <code>int64 max = 5;</code>
   * @return The max.
   */
  long getMax();

  /**
   * <code>int64 min = 6;</code>
   * @return The min.
   */
  long getMin();
}
