<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proxy/dokodemo/config.proto

namespace GPBMetadata\Proxy\Dokodemo;

class Config
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Common\Net\Address::initOnce();
        \GPBMetadata\Common\Net\Network::initOnce();
        $pool->internalAddGeneratedFile(
            '
�
proxy/dokodemo/config.protoxray.proxy.dokodemocommon/net/network.proto"�
Config,
address (2.xray.common.net.IPOrDomain
port (6
network_list (2.xray.common.net.NetworkListB*
networks (2.xray.common.net.Network
timeout (B
follow_redirect (

user_level (B[
com.xray.proxy.dokodemoPZ(github.com/xtls/xray-core/proxy/dokodemo�Xray.Proxy.Dokodemobproto3'
        , true);

        static::$is_initialized = true;
    }
}

