<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proxy/freedom/config.proto

namespace GPBMetadata\Proxy\Freedom;

class Config
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Common\Protocol\ServerSpec::initOnce();
        $pool->internalAddGeneratedFile(
            '
�
proxy/freedom/config.protoxray.proxy.freedom"K
DestinationOverride4
server (2$.xray.common.protocol.ServerEndpoint"�
Fragment
packets_from (

packets_to (

length_min (

length_max (
interval_min (
interval_max ("h
Noise

length_min (

length_max (
	delay_min (
	delay_max (
	str_noise (	"�
ConfigB
domain_strategy (2).xray.proxy.freedom.Config.DomainStrategy
timeout (BE
destination_override (2\'.xray.proxy.freedom.DestinationOverride

user_level (.
fragment (2.xray.proxy.freedom.Fragment
proxy_protocol ((
noise (2.xray.proxy.freedom.Noise"�
DomainStrategy	
AS_IS 

USE_IP
USE_IP4
USE_IP6
USE_IP46
USE_IP64
FORCE_IP
	FORCE_IP4
	FORCE_IP6

FORCE_IP46	

FORCE_IP64
BX
com.xray.proxy.freedomPZ\'github.com/xtls/xray-core/proxy/freedom�Xray.Proxy.Freedombproto3'
        , true);

        static::$is_initialized = true;
    }
}

