<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: app/proxyman/command/command.proto

namespace Xray\App\Proxyman\Command;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>xray.app.proxyman.command.AddUserOperation</code>
 */
class AddUserOperation extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.xray.common.protocol.User user = 1;</code>
     */
    protected $user = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Xray\Common\Protocol\User $user
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\App\Proxyman\Command\Command::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.xray.common.protocol.User user = 1;</code>
     * @return \Xray\Common\Protocol\User|null
     */
    public function getUser()
    {
        return $this->user;
    }

    public function hasUser()
    {
        return isset($this->user);
    }

    public function clearUser()
    {
        unset($this->user);
    }

    /**
     * Generated from protobuf field <code>.xray.common.protocol.User user = 1;</code>
     * @param \Xray\Common\Protocol\User $var
     * @return $this
     */
    public function setUser($var)
    {
        GPBUtil::checkMessage($var, \Xray\Common\Protocol\User::class);
        $this->user = $var;

        return $this;
    }

}

