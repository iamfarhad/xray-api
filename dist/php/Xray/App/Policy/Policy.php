<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: app/policy/config.proto

namespace Xray\App\Policy;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>xray.app.policy.Policy</code>
 */
class Policy extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.xray.app.policy.Policy.Timeout timeout = 1;</code>
     */
    protected $timeout = null;
    /**
     * Generated from protobuf field <code>.xray.app.policy.Policy.Stats stats = 2;</code>
     */
    protected $stats = null;
    /**
     * Generated from protobuf field <code>.xray.app.policy.Policy.Buffer buffer = 3;</code>
     */
    protected $buffer = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Xray\App\Policy\Policy\Timeout $timeout
     *     @type \Xray\App\Policy\Policy\Stats $stats
     *     @type \Xray\App\Policy\Policy\Buffer $buffer
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\App\Policy\Config::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.xray.app.policy.Policy.Timeout timeout = 1;</code>
     * @return \Xray\App\Policy\Policy\Timeout|null
     */
    public function getTimeout()
    {
        return $this->timeout;
    }

    public function hasTimeout()
    {
        return isset($this->timeout);
    }

    public function clearTimeout()
    {
        unset($this->timeout);
    }

    /**
     * Generated from protobuf field <code>.xray.app.policy.Policy.Timeout timeout = 1;</code>
     * @param \Xray\App\Policy\Policy\Timeout $var
     * @return $this
     */
    public function setTimeout($var)
    {
        GPBUtil::checkMessage($var, \Xray\App\Policy\Policy\Timeout::class);
        $this->timeout = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.xray.app.policy.Policy.Stats stats = 2;</code>
     * @return \Xray\App\Policy\Policy\Stats|null
     */
    public function getStats()
    {
        return $this->stats;
    }

    public function hasStats()
    {
        return isset($this->stats);
    }

    public function clearStats()
    {
        unset($this->stats);
    }

    /**
     * Generated from protobuf field <code>.xray.app.policy.Policy.Stats stats = 2;</code>
     * @param \Xray\App\Policy\Policy\Stats $var
     * @return $this
     */
    public function setStats($var)
    {
        GPBUtil::checkMessage($var, \Xray\App\Policy\Policy\Stats::class);
        $this->stats = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.xray.app.policy.Policy.Buffer buffer = 3;</code>
     * @return \Xray\App\Policy\Policy\Buffer|null
     */
    public function getBuffer()
    {
        return $this->buffer;
    }

    public function hasBuffer()
    {
        return isset($this->buffer);
    }

    public function clearBuffer()
    {
        unset($this->buffer);
    }

    /**
     * Generated from protobuf field <code>.xray.app.policy.Policy.Buffer buffer = 3;</code>
     * @param \Xray\App\Policy\Policy\Buffer $var
     * @return $this
     */
    public function setBuffer($var)
    {
        GPBUtil::checkMessage($var, \Xray\App\Policy\Policy\Buffer::class);
        $this->buffer = $var;

        return $this;
    }

}

