<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: app/dispatcher/config.proto

namespace Xray\App\Dispatcher;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>xray.app.dispatcher.Config</code>
 */
class Config extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.xray.app.dispatcher.SessionConfig settings = 1;</code>
     */
    protected $settings = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Xray\App\Dispatcher\SessionConfig $settings
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\App\Dispatcher\Config::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.xray.app.dispatcher.SessionConfig settings = 1;</code>
     * @return \Xray\App\Dispatcher\SessionConfig|null
     */
    public function getSettings()
    {
        return $this->settings;
    }

    public function hasSettings()
    {
        return isset($this->settings);
    }

    public function clearSettings()
    {
        unset($this->settings);
    }

    /**
     * Generated from protobuf field <code>.xray.app.dispatcher.SessionConfig settings = 1;</code>
     * @param \Xray\App\Dispatcher\SessionConfig $var
     * @return $this
     */
    public function setSettings($var)
    {
        GPBUtil::checkMessage($var, \Xray\App\Dispatcher\SessionConfig::class);
        $this->settings = $var;

        return $this;
    }

}

