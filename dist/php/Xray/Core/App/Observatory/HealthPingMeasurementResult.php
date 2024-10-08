<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: app/observatory/config.proto

namespace Xray\Core\App\Observatory;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>xray.core.app.observatory.HealthPingMeasurementResult</code>
 */
class HealthPingMeasurementResult extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>int64 all = 1;</code>
     */
    protected $all = 0;
    /**
     * Generated from protobuf field <code>int64 fail = 2;</code>
     */
    protected $fail = 0;
    /**
     * Generated from protobuf field <code>int64 deviation = 3;</code>
     */
    protected $deviation = 0;
    /**
     * Generated from protobuf field <code>int64 average = 4;</code>
     */
    protected $average = 0;
    /**
     * Generated from protobuf field <code>int64 max = 5;</code>
     */
    protected $max = 0;
    /**
     * Generated from protobuf field <code>int64 min = 6;</code>
     */
    protected $min = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int|string $all
     *     @type int|string $fail
     *     @type int|string $deviation
     *     @type int|string $average
     *     @type int|string $max
     *     @type int|string $min
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\App\Observatory\Config::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>int64 all = 1;</code>
     * @return int|string
     */
    public function getAll()
    {
        return $this->all;
    }

    /**
     * Generated from protobuf field <code>int64 all = 1;</code>
     * @param int|string $var
     * @return $this
     */
    public function setAll($var)
    {
        GPBUtil::checkInt64($var);
        $this->all = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int64 fail = 2;</code>
     * @return int|string
     */
    public function getFail()
    {
        return $this->fail;
    }

    /**
     * Generated from protobuf field <code>int64 fail = 2;</code>
     * @param int|string $var
     * @return $this
     */
    public function setFail($var)
    {
        GPBUtil::checkInt64($var);
        $this->fail = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int64 deviation = 3;</code>
     * @return int|string
     */
    public function getDeviation()
    {
        return $this->deviation;
    }

    /**
     * Generated from protobuf field <code>int64 deviation = 3;</code>
     * @param int|string $var
     * @return $this
     */
    public function setDeviation($var)
    {
        GPBUtil::checkInt64($var);
        $this->deviation = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int64 average = 4;</code>
     * @return int|string
     */
    public function getAverage()
    {
        return $this->average;
    }

    /**
     * Generated from protobuf field <code>int64 average = 4;</code>
     * @param int|string $var
     * @return $this
     */
    public function setAverage($var)
    {
        GPBUtil::checkInt64($var);
        $this->average = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int64 max = 5;</code>
     * @return int|string
     */
    public function getMax()
    {
        return $this->max;
    }

    /**
     * Generated from protobuf field <code>int64 max = 5;</code>
     * @param int|string $var
     * @return $this
     */
    public function setMax($var)
    {
        GPBUtil::checkInt64($var);
        $this->max = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int64 min = 6;</code>
     * @return int|string
     */
    public function getMin()
    {
        return $this->min;
    }

    /**
     * Generated from protobuf field <code>int64 min = 6;</code>
     * @param int|string $var
     * @return $this
     */
    public function setMin($var)
    {
        GPBUtil::checkInt64($var);
        $this->min = $var;

        return $this;
    }

}

