<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: transport/internet/kcp/config.proto

namespace Xray\Transport\Internet\Kcp;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>xray.transport.internet.kcp.Config</code>
 */
class Config extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.xray.transport.internet.kcp.MTU mtu = 1;</code>
     */
    protected $mtu = null;
    /**
     * Generated from protobuf field <code>.xray.transport.internet.kcp.TTI tti = 2;</code>
     */
    protected $tti = null;
    /**
     * Generated from protobuf field <code>.xray.transport.internet.kcp.UplinkCapacity uplink_capacity = 3;</code>
     */
    protected $uplink_capacity = null;
    /**
     * Generated from protobuf field <code>.xray.transport.internet.kcp.DownlinkCapacity downlink_capacity = 4;</code>
     */
    protected $downlink_capacity = null;
    /**
     * Generated from protobuf field <code>bool congestion = 5;</code>
     */
    protected $congestion = false;
    /**
     * Generated from protobuf field <code>.xray.transport.internet.kcp.WriteBuffer write_buffer = 6;</code>
     */
    protected $write_buffer = null;
    /**
     * Generated from protobuf field <code>.xray.transport.internet.kcp.ReadBuffer read_buffer = 7;</code>
     */
    protected $read_buffer = null;
    /**
     * Generated from protobuf field <code>.xray.common.serial.TypedMessage header_config = 8;</code>
     */
    protected $header_config = null;
    /**
     * Generated from protobuf field <code>.xray.transport.internet.kcp.EncryptionSeed seed = 10;</code>
     */
    protected $seed = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Xray\Transport\Internet\Kcp\MTU $mtu
     *     @type \Xray\Transport\Internet\Kcp\TTI $tti
     *     @type \Xray\Transport\Internet\Kcp\UplinkCapacity $uplink_capacity
     *     @type \Xray\Transport\Internet\Kcp\DownlinkCapacity $downlink_capacity
     *     @type bool $congestion
     *     @type \Xray\Transport\Internet\Kcp\WriteBuffer $write_buffer
     *     @type \Xray\Transport\Internet\Kcp\ReadBuffer $read_buffer
     *     @type \Xray\Common\Serial\TypedMessage $header_config
     *     @type \Xray\Transport\Internet\Kcp\EncryptionSeed $seed
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Transport\Internet\Kcp\Config::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.xray.transport.internet.kcp.MTU mtu = 1;</code>
     * @return \Xray\Transport\Internet\Kcp\MTU|null
     */
    public function getMtu()
    {
        return $this->mtu;
    }

    public function hasMtu()
    {
        return isset($this->mtu);
    }

    public function clearMtu()
    {
        unset($this->mtu);
    }

    /**
     * Generated from protobuf field <code>.xray.transport.internet.kcp.MTU mtu = 1;</code>
     * @param \Xray\Transport\Internet\Kcp\MTU $var
     * @return $this
     */
    public function setMtu($var)
    {
        GPBUtil::checkMessage($var, \Xray\Transport\Internet\Kcp\MTU::class);
        $this->mtu = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.xray.transport.internet.kcp.TTI tti = 2;</code>
     * @return \Xray\Transport\Internet\Kcp\TTI|null
     */
    public function getTti()
    {
        return $this->tti;
    }

    public function hasTti()
    {
        return isset($this->tti);
    }

    public function clearTti()
    {
        unset($this->tti);
    }

    /**
     * Generated from protobuf field <code>.xray.transport.internet.kcp.TTI tti = 2;</code>
     * @param \Xray\Transport\Internet\Kcp\TTI $var
     * @return $this
     */
    public function setTti($var)
    {
        GPBUtil::checkMessage($var, \Xray\Transport\Internet\Kcp\TTI::class);
        $this->tti = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.xray.transport.internet.kcp.UplinkCapacity uplink_capacity = 3;</code>
     * @return \Xray\Transport\Internet\Kcp\UplinkCapacity|null
     */
    public function getUplinkCapacity()
    {
        return $this->uplink_capacity;
    }

    public function hasUplinkCapacity()
    {
        return isset($this->uplink_capacity);
    }

    public function clearUplinkCapacity()
    {
        unset($this->uplink_capacity);
    }

    /**
     * Generated from protobuf field <code>.xray.transport.internet.kcp.UplinkCapacity uplink_capacity = 3;</code>
     * @param \Xray\Transport\Internet\Kcp\UplinkCapacity $var
     * @return $this
     */
    public function setUplinkCapacity($var)
    {
        GPBUtil::checkMessage($var, \Xray\Transport\Internet\Kcp\UplinkCapacity::class);
        $this->uplink_capacity = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.xray.transport.internet.kcp.DownlinkCapacity downlink_capacity = 4;</code>
     * @return \Xray\Transport\Internet\Kcp\DownlinkCapacity|null
     */
    public function getDownlinkCapacity()
    {
        return $this->downlink_capacity;
    }

    public function hasDownlinkCapacity()
    {
        return isset($this->downlink_capacity);
    }

    public function clearDownlinkCapacity()
    {
        unset($this->downlink_capacity);
    }

    /**
     * Generated from protobuf field <code>.xray.transport.internet.kcp.DownlinkCapacity downlink_capacity = 4;</code>
     * @param \Xray\Transport\Internet\Kcp\DownlinkCapacity $var
     * @return $this
     */
    public function setDownlinkCapacity($var)
    {
        GPBUtil::checkMessage($var, \Xray\Transport\Internet\Kcp\DownlinkCapacity::class);
        $this->downlink_capacity = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool congestion = 5;</code>
     * @return bool
     */
    public function getCongestion()
    {
        return $this->congestion;
    }

    /**
     * Generated from protobuf field <code>bool congestion = 5;</code>
     * @param bool $var
     * @return $this
     */
    public function setCongestion($var)
    {
        GPBUtil::checkBool($var);
        $this->congestion = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.xray.transport.internet.kcp.WriteBuffer write_buffer = 6;</code>
     * @return \Xray\Transport\Internet\Kcp\WriteBuffer|null
     */
    public function getWriteBuffer()
    {
        return $this->write_buffer;
    }

    public function hasWriteBuffer()
    {
        return isset($this->write_buffer);
    }

    public function clearWriteBuffer()
    {
        unset($this->write_buffer);
    }

    /**
     * Generated from protobuf field <code>.xray.transport.internet.kcp.WriteBuffer write_buffer = 6;</code>
     * @param \Xray\Transport\Internet\Kcp\WriteBuffer $var
     * @return $this
     */
    public function setWriteBuffer($var)
    {
        GPBUtil::checkMessage($var, \Xray\Transport\Internet\Kcp\WriteBuffer::class);
        $this->write_buffer = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.xray.transport.internet.kcp.ReadBuffer read_buffer = 7;</code>
     * @return \Xray\Transport\Internet\Kcp\ReadBuffer|null
     */
    public function getReadBuffer()
    {
        return $this->read_buffer;
    }

    public function hasReadBuffer()
    {
        return isset($this->read_buffer);
    }

    public function clearReadBuffer()
    {
        unset($this->read_buffer);
    }

    /**
     * Generated from protobuf field <code>.xray.transport.internet.kcp.ReadBuffer read_buffer = 7;</code>
     * @param \Xray\Transport\Internet\Kcp\ReadBuffer $var
     * @return $this
     */
    public function setReadBuffer($var)
    {
        GPBUtil::checkMessage($var, \Xray\Transport\Internet\Kcp\ReadBuffer::class);
        $this->read_buffer = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.xray.common.serial.TypedMessage header_config = 8;</code>
     * @return \Xray\Common\Serial\TypedMessage|null
     */
    public function getHeaderConfig()
    {
        return $this->header_config;
    }

    public function hasHeaderConfig()
    {
        return isset($this->header_config);
    }

    public function clearHeaderConfig()
    {
        unset($this->header_config);
    }

    /**
     * Generated from protobuf field <code>.xray.common.serial.TypedMessage header_config = 8;</code>
     * @param \Xray\Common\Serial\TypedMessage $var
     * @return $this
     */
    public function setHeaderConfig($var)
    {
        GPBUtil::checkMessage($var, \Xray\Common\Serial\TypedMessage::class);
        $this->header_config = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.xray.transport.internet.kcp.EncryptionSeed seed = 10;</code>
     * @return \Xray\Transport\Internet\Kcp\EncryptionSeed|null
     */
    public function getSeed()
    {
        return $this->seed;
    }

    public function hasSeed()
    {
        return isset($this->seed);
    }

    public function clearSeed()
    {
        unset($this->seed);
    }

    /**
     * Generated from protobuf field <code>.xray.transport.internet.kcp.EncryptionSeed seed = 10;</code>
     * @param \Xray\Transport\Internet\Kcp\EncryptionSeed $var
     * @return $this
     */
    public function setSeed($var)
    {
        GPBUtil::checkMessage($var, \Xray\Transport\Internet\Kcp\EncryptionSeed::class);
        $this->seed = $var;

        return $this;
    }

}

