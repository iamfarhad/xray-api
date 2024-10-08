<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: app/policy/config.proto

namespace Xray\App\Policy\SystemPolicy;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>xray.app.policy.SystemPolicy.Stats</code>
 */
class Stats extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>bool inbound_uplink = 1;</code>
     */
    protected $inbound_uplink = false;
    /**
     * Generated from protobuf field <code>bool inbound_downlink = 2;</code>
     */
    protected $inbound_downlink = false;
    /**
     * Generated from protobuf field <code>bool outbound_uplink = 3;</code>
     */
    protected $outbound_uplink = false;
    /**
     * Generated from protobuf field <code>bool outbound_downlink = 4;</code>
     */
    protected $outbound_downlink = false;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type bool $inbound_uplink
     *     @type bool $inbound_downlink
     *     @type bool $outbound_uplink
     *     @type bool $outbound_downlink
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\App\Policy\Config::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>bool inbound_uplink = 1;</code>
     * @return bool
     */
    public function getInboundUplink()
    {
        return $this->inbound_uplink;
    }

    /**
     * Generated from protobuf field <code>bool inbound_uplink = 1;</code>
     * @param bool $var
     * @return $this
     */
    public function setInboundUplink($var)
    {
        GPBUtil::checkBool($var);
        $this->inbound_uplink = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool inbound_downlink = 2;</code>
     * @return bool
     */
    public function getInboundDownlink()
    {
        return $this->inbound_downlink;
    }

    /**
     * Generated from protobuf field <code>bool inbound_downlink = 2;</code>
     * @param bool $var
     * @return $this
     */
    public function setInboundDownlink($var)
    {
        GPBUtil::checkBool($var);
        $this->inbound_downlink = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool outbound_uplink = 3;</code>
     * @return bool
     */
    public function getOutboundUplink()
    {
        return $this->outbound_uplink;
    }

    /**
     * Generated from protobuf field <code>bool outbound_uplink = 3;</code>
     * @param bool $var
     * @return $this
     */
    public function setOutboundUplink($var)
    {
        GPBUtil::checkBool($var);
        $this->outbound_uplink = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool outbound_downlink = 4;</code>
     * @return bool
     */
    public function getOutboundDownlink()
    {
        return $this->outbound_downlink;
    }

    /**
     * Generated from protobuf field <code>bool outbound_downlink = 4;</code>
     * @param bool $var
     * @return $this
     */
    public function setOutboundDownlink($var)
    {
        GPBUtil::checkBool($var);
        $this->outbound_downlink = $var;

        return $this;
    }

}

// Adding a class alias for backwards compatibility with the previous class name.
class_alias(Stats::class, \Xray\App\Policy\SystemPolicy_Stats::class);

