<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: common/protocol/server_spec.proto

namespace GPBMetadata\Common\Protocol;

class ServerSpec
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Common\Net\Address::initOnce();
        \GPBMetadata\Common\Protocol\User::initOnce();
        $pool->internalAddGeneratedFile(
            '
�
!common/protocol/server_spec.protoxray.common.protocolcommon/protocol/user.proto"v
ServerEndpoint,
address (2.xray.common.net.IPOrDomain
port ((
user (2.xray.common.protocol.UserB^
com.xray.common.protocolPZ)github.com/xtls/xray-core/common/protocol�Xray.Common.Protocolbproto3'
        , true);

        static::$is_initialized = true;
    }
}

