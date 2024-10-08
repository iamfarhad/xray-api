<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proxy/shadowsocks_2022/config.proto

namespace Xray\Proxy\Shadowsocks_2022;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>xray.proxy.shadowsocks_2022.ClientConfig</code>
 */
class ClientConfig extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.xray.common.net.IPOrDomain address = 1;</code>
     */
    protected $address = null;
    /**
     * Generated from protobuf field <code>uint32 port = 2;</code>
     */
    protected $port = 0;
    /**
     * Generated from protobuf field <code>string method = 3;</code>
     */
    protected $method = '';
    /**
     * Generated from protobuf field <code>string key = 4;</code>
     */
    protected $key = '';
    /**
     * Generated from protobuf field <code>bool udp_over_tcp = 5;</code>
     */
    protected $udp_over_tcp = false;
    /**
     * Generated from protobuf field <code>uint32 udp_over_tcp_version = 6;</code>
     */
    protected $udp_over_tcp_version = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Xray\Common\Net\IPOrDomain $address
     *     @type int $port
     *     @type string $method
     *     @type string $key
     *     @type bool $udp_over_tcp
     *     @type int $udp_over_tcp_version
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Proxy\Shadowsocks2022\Config::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.xray.common.net.IPOrDomain address = 1;</code>
     * @return \Xray\Common\Net\IPOrDomain|null
     */
    public function getAddress()
    {
        return $this->address;
    }

    public function hasAddress()
    {
        return isset($this->address);
    }

    public function clearAddress()
    {
        unset($this->address);
    }

    /**
     * Generated from protobuf field <code>.xray.common.net.IPOrDomain address = 1;</code>
     * @param \Xray\Common\Net\IPOrDomain $var
     * @return $this
     */
    public function setAddress($var)
    {
        GPBUtil::checkMessage($var, \Xray\Common\Net\IPOrDomain::class);
        $this->address = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 port = 2;</code>
     * @return int
     */
    public function getPort()
    {
        return $this->port;
    }

    /**
     * Generated from protobuf field <code>uint32 port = 2;</code>
     * @param int $var
     * @return $this
     */
    public function setPort($var)
    {
        GPBUtil::checkUint32($var);
        $this->port = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string method = 3;</code>
     * @return string
     */
    public function getMethod()
    {
        return $this->method;
    }

    /**
     * Generated from protobuf field <code>string method = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setMethod($var)
    {
        GPBUtil::checkString($var, True);
        $this->method = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string key = 4;</code>
     * @return string
     */
    public function getKey()
    {
        return $this->key;
    }

    /**
     * Generated from protobuf field <code>string key = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setKey($var)
    {
        GPBUtil::checkString($var, True);
        $this->key = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool udp_over_tcp = 5;</code>
     * @return bool
     */
    public function getUdpOverTcp()
    {
        return $this->udp_over_tcp;
    }

    /**
     * Generated from protobuf field <code>bool udp_over_tcp = 5;</code>
     * @param bool $var
     * @return $this
     */
    public function setUdpOverTcp($var)
    {
        GPBUtil::checkBool($var);
        $this->udp_over_tcp = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 udp_over_tcp_version = 6;</code>
     * @return int
     */
    public function getUdpOverTcpVersion()
    {
        return $this->udp_over_tcp_version;
    }

    /**
     * Generated from protobuf field <code>uint32 udp_over_tcp_version = 6;</code>
     * @param int $var
     * @return $this
     */
    public function setUdpOverTcpVersion($var)
    {
        GPBUtil::checkUint32($var);
        $this->udp_over_tcp_version = $var;

        return $this;
    }

}

