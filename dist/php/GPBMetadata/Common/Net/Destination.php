<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: common/net/destination.proto

namespace GPBMetadata\Common\Net;

class Destination
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Common\Net\Network::initOnce();
        \GPBMetadata\Common\Net\Address::initOnce();
        $pool->internalAddGeneratedFile(
            '
�
common/net/destination.protoxray.common.netcommon/net/address.proto"q
Endpoint)
network (2.xray.common.net.Network,
address (2.xray.common.net.IPOrDomain
port (BO
com.xray.common.netPZ$github.com/xtls/xray-core/common/net�Xray.Common.Netbproto3'
        , true);

        static::$is_initialized = true;
    }
}

