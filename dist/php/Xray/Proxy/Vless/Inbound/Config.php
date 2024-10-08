<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proxy/vless/inbound/config.proto

namespace Xray\Proxy\Vless\Inbound;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>xray.proxy.vless.inbound.Config</code>
 */
class Config extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>repeated .xray.common.protocol.User clients = 1;</code>
     */
    private $clients;
    /**
     * Decryption settings. Only applies to server side, and only accepts "none"
     * for now.
     *
     * Generated from protobuf field <code>string decryption = 2;</code>
     */
    protected $decryption = '';
    /**
     * Generated from protobuf field <code>repeated .xray.proxy.vless.inbound.Fallback fallbacks = 3;</code>
     */
    private $fallbacks;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type array<\Xray\Common\Protocol\User>|\Google\Protobuf\Internal\RepeatedField $clients
     *     @type string $decryption
     *           Decryption settings. Only applies to server side, and only accepts "none"
     *           for now.
     *     @type array<\Xray\Proxy\Vless\Inbound\Fallback>|\Google\Protobuf\Internal\RepeatedField $fallbacks
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Proxy\Vless\Inbound\Config::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>repeated .xray.common.protocol.User clients = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getClients()
    {
        return $this->clients;
    }

    /**
     * Generated from protobuf field <code>repeated .xray.common.protocol.User clients = 1;</code>
     * @param array<\Xray\Common\Protocol\User>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setClients($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Xray\Common\Protocol\User::class);
        $this->clients = $arr;

        return $this;
    }

    /**
     * Decryption settings. Only applies to server side, and only accepts "none"
     * for now.
     *
     * Generated from protobuf field <code>string decryption = 2;</code>
     * @return string
     */
    public function getDecryption()
    {
        return $this->decryption;
    }

    /**
     * Decryption settings. Only applies to server side, and only accepts "none"
     * for now.
     *
     * Generated from protobuf field <code>string decryption = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setDecryption($var)
    {
        GPBUtil::checkString($var, True);
        $this->decryption = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated .xray.proxy.vless.inbound.Fallback fallbacks = 3;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getFallbacks()
    {
        return $this->fallbacks;
    }

    /**
     * Generated from protobuf field <code>repeated .xray.proxy.vless.inbound.Fallback fallbacks = 3;</code>
     * @param array<\Xray\Proxy\Vless\Inbound\Fallback>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setFallbacks($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Xray\Proxy\Vless\Inbound\Fallback::class);
        $this->fallbacks = $arr;

        return $this;
    }

}

