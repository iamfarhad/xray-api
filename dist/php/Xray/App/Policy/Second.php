<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: app/policy/config.proto

namespace Xray\App\Policy;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>xray.app.policy.Second</code>
 */
class Second extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>uint32 value = 1;</code>
     */
    protected $value = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $value
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\App\Policy\Config::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>uint32 value = 1;</code>
     * @return int
     */
    public function getValue()
    {
        return $this->value;
    }

    /**
     * Generated from protobuf field <code>uint32 value = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setValue($var)
    {
        GPBUtil::checkUint32($var);
        $this->value = $var;

        return $this;
    }

}

