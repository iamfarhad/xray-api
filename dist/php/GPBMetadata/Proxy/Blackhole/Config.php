<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proxy/blackhole/config.proto

namespace GPBMetadata\Proxy\Blackhole;

class Config
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Common\Serial\TypedMessage::initOnce();
        $pool->internalAddGeneratedFile(
            '
�
proxy/blackhole/config.protoxray.proxy.blackhole"
NoneResponse"
HTTPResponse"<
Config2
response (2 .xray.common.serial.TypedMessageB^
com.xray.proxy.blackholePZ)github.com/xtls/xray-core/proxy/blackhole�Xray.Proxy.Blackholebproto3'
        , true);

        static::$is_initialized = true;
    }
}

