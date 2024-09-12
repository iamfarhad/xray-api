<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: transport/internet/kcp/config.proto

namespace Xray\Transport\Internet\Kcp;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>xray.transport.internet.kcp.WriteBuffer</code>
 */
class WriteBuffer extends \Google\Protobuf\Internal\Message
{
    /**
     * Buffer size in bytes.
     *
     * Generated from protobuf field <code>uint32 size = 1;</code>
     */
    protected $size = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $size
     *           Buffer size in bytes.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Transport\Internet\Kcp\Config::initOnce();
        parent::__construct($data);
    }

    /**
     * Buffer size in bytes.
     *
     * Generated from protobuf field <code>uint32 size = 1;</code>
     * @return int
     */
    public function getSize()
    {
        return $this->size;
    }

    /**
     * Buffer size in bytes.
     *
     * Generated from protobuf field <code>uint32 size = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setSize($var)
    {
        GPBUtil::checkUint32($var);
        $this->size = $var;

        return $this;
    }

}

