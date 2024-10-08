<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: app/router/config.proto

namespace Xray\App\Router;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>xray.app.router.GeoIP</code>
 */
class GeoIP extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string country_code = 1;</code>
     */
    protected $country_code = '';
    /**
     * Generated from protobuf field <code>repeated .xray.app.router.CIDR cidr = 2;</code>
     */
    private $cidr;
    /**
     * Generated from protobuf field <code>bool reverse_match = 3;</code>
     */
    protected $reverse_match = false;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $country_code
     *     @type array<\Xray\App\Router\CIDR>|\Google\Protobuf\Internal\RepeatedField $cidr
     *     @type bool $reverse_match
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\App\Router\Config::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string country_code = 1;</code>
     * @return string
     */
    public function getCountryCode()
    {
        return $this->country_code;
    }

    /**
     * Generated from protobuf field <code>string country_code = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setCountryCode($var)
    {
        GPBUtil::checkString($var, True);
        $this->country_code = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated .xray.app.router.CIDR cidr = 2;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getCidr()
    {
        return $this->cidr;
    }

    /**
     * Generated from protobuf field <code>repeated .xray.app.router.CIDR cidr = 2;</code>
     * @param array<\Xray\App\Router\CIDR>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setCidr($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Xray\App\Router\CIDR::class);
        $this->cidr = $arr;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool reverse_match = 3;</code>
     * @return bool
     */
    public function getReverseMatch()
    {
        return $this->reverse_match;
    }

    /**
     * Generated from protobuf field <code>bool reverse_match = 3;</code>
     * @param bool $var
     * @return $this
     */
    public function setReverseMatch($var)
    {
        GPBUtil::checkBool($var);
        $this->reverse_match = $var;

        return $this;
    }

}

