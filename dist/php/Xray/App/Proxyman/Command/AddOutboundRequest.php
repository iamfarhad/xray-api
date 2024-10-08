<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: app/proxyman/command/command.proto

namespace Xray\App\Proxyman\Command;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>xray.app.proxyman.command.AddOutboundRequest</code>
 */
class AddOutboundRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.xray.core.OutboundHandlerConfig outbound = 1;</code>
     */
    protected $outbound = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Xray\Core\OutboundHandlerConfig $outbound
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\App\Proxyman\Command\Command::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.xray.core.OutboundHandlerConfig outbound = 1;</code>
     * @return \Xray\Core\OutboundHandlerConfig|null
     */
    public function getOutbound()
    {
        return $this->outbound;
    }

    public function hasOutbound()
    {
        return isset($this->outbound);
    }

    public function clearOutbound()
    {
        unset($this->outbound);
    }

    /**
     * Generated from protobuf field <code>.xray.core.OutboundHandlerConfig outbound = 1;</code>
     * @param \Xray\Core\OutboundHandlerConfig $var
     * @return $this
     */
    public function setOutbound($var)
    {
        GPBUtil::checkMessage($var, \Xray\Core\OutboundHandlerConfig::class);
        $this->outbound = $var;

        return $this;
    }

}

