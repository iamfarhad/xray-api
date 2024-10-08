<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: app/router/config.proto

namespace Xray\App\Router;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>xray.app.router.GeoIPList</code>
 */
class GeoIPList extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>repeated .xray.app.router.GeoIP entry = 1;</code>
     */
    private $entry;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type array<\Xray\App\Router\GeoIP>|\Google\Protobuf\Internal\RepeatedField $entry
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\App\Router\Config::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>repeated .xray.app.router.GeoIP entry = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getEntry()
    {
        return $this->entry;
    }

    /**
     * Generated from protobuf field <code>repeated .xray.app.router.GeoIP entry = 1;</code>
     * @param array<\Xray\App\Router\GeoIP>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setEntry($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Xray\App\Router\GeoIP::class);
        $this->entry = $arr;

        return $this;
    }

}

