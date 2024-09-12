<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: app/proxyman/config.proto

namespace Xray\App\Proxyman;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>xray.app.proxyman.InboundHandlerConfig</code>
 */
class InboundHandlerConfig extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string tag = 1;</code>
     */
    protected $tag = '';
    /**
     * Generated from protobuf field <code>.xray.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    protected $receiver_settings = null;
    /**
     * Generated from protobuf field <code>.xray.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    protected $proxy_settings = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $tag
     *     @type \Xray\Common\Serial\TypedMessage $receiver_settings
     *     @type \Xray\Common\Serial\TypedMessage $proxy_settings
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\App\Proxyman\Config::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string tag = 1;</code>
     * @return string
     */
    public function getTag()
    {
        return $this->tag;
    }

    /**
     * Generated from protobuf field <code>string tag = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setTag($var)
    {
        GPBUtil::checkString($var, True);
        $this->tag = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.xray.common.serial.TypedMessage receiver_settings = 2;</code>
     * @return \Xray\Common\Serial\TypedMessage|null
     */
    public function getReceiverSettings()
    {
        return $this->receiver_settings;
    }

    public function hasReceiverSettings()
    {
        return isset($this->receiver_settings);
    }

    public function clearReceiverSettings()
    {
        unset($this->receiver_settings);
    }

    /**
     * Generated from protobuf field <code>.xray.common.serial.TypedMessage receiver_settings = 2;</code>
     * @param \Xray\Common\Serial\TypedMessage $var
     * @return $this
     */
    public function setReceiverSettings($var)
    {
        GPBUtil::checkMessage($var, \Xray\Common\Serial\TypedMessage::class);
        $this->receiver_settings = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.xray.common.serial.TypedMessage proxy_settings = 3;</code>
     * @return \Xray\Common\Serial\TypedMessage|null
     */
    public function getProxySettings()
    {
        return $this->proxy_settings;
    }

    public function hasProxySettings()
    {
        return isset($this->proxy_settings);
    }

    public function clearProxySettings()
    {
        unset($this->proxy_settings);
    }

    /**
     * Generated from protobuf field <code>.xray.common.serial.TypedMessage proxy_settings = 3;</code>
     * @param \Xray\Common\Serial\TypedMessage $var
     * @return $this
     */
    public function setProxySettings($var)
    {
        GPBUtil::checkMessage($var, \Xray\Common\Serial\TypedMessage::class);
        $this->proxy_settings = $var;

        return $this;
    }

}

