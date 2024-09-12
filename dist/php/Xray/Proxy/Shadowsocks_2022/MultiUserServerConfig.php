<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proxy/shadowsocks_2022/config.proto

namespace Xray\Proxy\Shadowsocks_2022;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>xray.proxy.shadowsocks_2022.MultiUserServerConfig</code>
 */
class MultiUserServerConfig extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string method = 1;</code>
     */
    protected $method = '';
    /**
     * Generated from protobuf field <code>string key = 2;</code>
     */
    protected $key = '';
    /**
     * Generated from protobuf field <code>repeated .xray.proxy.shadowsocks_2022.User users = 3;</code>
     */
    private $users;
    /**
     * Generated from protobuf field <code>repeated .xray.common.net.Network network = 4;</code>
     */
    private $network;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $method
     *     @type string $key
     *     @type array<\Xray\Proxy\Shadowsocks_2022\User>|\Google\Protobuf\Internal\RepeatedField $users
     *     @type array<int>|\Google\Protobuf\Internal\RepeatedField $network
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Proxy\Shadowsocks2022\Config::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string method = 1;</code>
     * @return string
     */
    public function getMethod()
    {
        return $this->method;
    }

    /**
     * Generated from protobuf field <code>string method = 1;</code>
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
     * Generated from protobuf field <code>string key = 2;</code>
     * @return string
     */
    public function getKey()
    {
        return $this->key;
    }

    /**
     * Generated from protobuf field <code>string key = 2;</code>
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
     * Generated from protobuf field <code>repeated .xray.proxy.shadowsocks_2022.User users = 3;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getUsers()
    {
        return $this->users;
    }

    /**
     * Generated from protobuf field <code>repeated .xray.proxy.shadowsocks_2022.User users = 3;</code>
     * @param array<\Xray\Proxy\Shadowsocks_2022\User>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setUsers($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Xray\Proxy\Shadowsocks_2022\User::class);
        $this->users = $arr;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated .xray.common.net.Network network = 4;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getNetwork()
    {
        return $this->network;
    }

    /**
     * Generated from protobuf field <code>repeated .xray.common.net.Network network = 4;</code>
     * @param array<int>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setNetwork($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::ENUM, \Xray\Common\Net\Network::class);
        $this->network = $arr;

        return $this;
    }

}

