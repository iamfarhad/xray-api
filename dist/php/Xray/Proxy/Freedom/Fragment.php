<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proxy/freedom/config.proto

namespace Xray\Proxy\Freedom;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>xray.proxy.freedom.Fragment</code>
 */
class Fragment extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>uint64 packets_from = 1;</code>
     */
    protected $packets_from = 0;
    /**
     * Generated from protobuf field <code>uint64 packets_to = 2;</code>
     */
    protected $packets_to = 0;
    /**
     * Generated from protobuf field <code>uint64 length_min = 3;</code>
     */
    protected $length_min = 0;
    /**
     * Generated from protobuf field <code>uint64 length_max = 4;</code>
     */
    protected $length_max = 0;
    /**
     * Generated from protobuf field <code>uint64 interval_min = 5;</code>
     */
    protected $interval_min = 0;
    /**
     * Generated from protobuf field <code>uint64 interval_max = 6;</code>
     */
    protected $interval_max = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int|string $packets_from
     *     @type int|string $packets_to
     *     @type int|string $length_min
     *     @type int|string $length_max
     *     @type int|string $interval_min
     *     @type int|string $interval_max
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Proxy\Freedom\Config::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>uint64 packets_from = 1;</code>
     * @return int|string
     */
    public function getPacketsFrom()
    {
        return $this->packets_from;
    }

    /**
     * Generated from protobuf field <code>uint64 packets_from = 1;</code>
     * @param int|string $var
     * @return $this
     */
    public function setPacketsFrom($var)
    {
        GPBUtil::checkUint64($var);
        $this->packets_from = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint64 packets_to = 2;</code>
     * @return int|string
     */
    public function getPacketsTo()
    {
        return $this->packets_to;
    }

    /**
     * Generated from protobuf field <code>uint64 packets_to = 2;</code>
     * @param int|string $var
     * @return $this
     */
    public function setPacketsTo($var)
    {
        GPBUtil::checkUint64($var);
        $this->packets_to = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint64 length_min = 3;</code>
     * @return int|string
     */
    public function getLengthMin()
    {
        return $this->length_min;
    }

    /**
     * Generated from protobuf field <code>uint64 length_min = 3;</code>
     * @param int|string $var
     * @return $this
     */
    public function setLengthMin($var)
    {
        GPBUtil::checkUint64($var);
        $this->length_min = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint64 length_max = 4;</code>
     * @return int|string
     */
    public function getLengthMax()
    {
        return $this->length_max;
    }

    /**
     * Generated from protobuf field <code>uint64 length_max = 4;</code>
     * @param int|string $var
     * @return $this
     */
    public function setLengthMax($var)
    {
        GPBUtil::checkUint64($var);
        $this->length_max = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint64 interval_min = 5;</code>
     * @return int|string
     */
    public function getIntervalMin()
    {
        return $this->interval_min;
    }

    /**
     * Generated from protobuf field <code>uint64 interval_min = 5;</code>
     * @param int|string $var
     * @return $this
     */
    public function setIntervalMin($var)
    {
        GPBUtil::checkUint64($var);
        $this->interval_min = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint64 interval_max = 6;</code>
     * @return int|string
     */
    public function getIntervalMax()
    {
        return $this->interval_max;
    }

    /**
     * Generated from protobuf field <code>uint64 interval_max = 6;</code>
     * @param int|string $var
     * @return $this
     */
    public function setIntervalMax($var)
    {
        GPBUtil::checkUint64($var);
        $this->interval_max = $var;

        return $this;
    }

}

