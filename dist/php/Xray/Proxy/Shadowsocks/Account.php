<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proxy/shadowsocks/config.proto

namespace Xray\Proxy\Shadowsocks;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>xray.proxy.shadowsocks.Account</code>
 */
class Account extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string password = 1;</code>
     */
    protected $password = '';
    /**
     * Generated from protobuf field <code>.xray.proxy.shadowsocks.CipherType cipher_type = 2;</code>
     */
    protected $cipher_type = 0;
    /**
     * Generated from protobuf field <code>bool iv_check = 3;</code>
     */
    protected $iv_check = false;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $password
     *     @type int $cipher_type
     *     @type bool $iv_check
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Proxy\Shadowsocks\Config::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string password = 1;</code>
     * @return string
     */
    public function getPassword()
    {
        return $this->password;
    }

    /**
     * Generated from protobuf field <code>string password = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setPassword($var)
    {
        GPBUtil::checkString($var, True);
        $this->password = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.xray.proxy.shadowsocks.CipherType cipher_type = 2;</code>
     * @return int
     */
    public function getCipherType()
    {
        return $this->cipher_type;
    }

    /**
     * Generated from protobuf field <code>.xray.proxy.shadowsocks.CipherType cipher_type = 2;</code>
     * @param int $var
     * @return $this
     */
    public function setCipherType($var)
    {
        GPBUtil::checkEnum($var, \Xray\Proxy\Shadowsocks\CipherType::class);
        $this->cipher_type = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool iv_check = 3;</code>
     * @return bool
     */
    public function getIvCheck()
    {
        return $this->iv_check;
    }

    /**
     * Generated from protobuf field <code>bool iv_check = 3;</code>
     * @param bool $var
     * @return $this
     */
    public function setIvCheck($var)
    {
        GPBUtil::checkBool($var);
        $this->iv_check = $var;

        return $this;
    }

}

