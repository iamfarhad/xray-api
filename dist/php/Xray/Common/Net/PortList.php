<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: common/net/port.proto

namespace Xray\Common\Net;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * PortList is a list of ports.
 *
 * Generated from protobuf message <code>xray.common.net.PortList</code>
 */
class PortList extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>repeated .xray.common.net.PortRange range = 1;</code>
     */
    private $range;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type array<\Xray\Common\Net\PortRange>|\Google\Protobuf\Internal\RepeatedField $range
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Common\Net\Port::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>repeated .xray.common.net.PortRange range = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getRange()
    {
        return $this->range;
    }

    /**
     * Generated from protobuf field <code>repeated .xray.common.net.PortRange range = 1;</code>
     * @param array<\Xray\Common\Net\PortRange>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setRange($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Xray\Common\Net\PortRange::class);
        $this->range = $arr;

        return $this;
    }

}

