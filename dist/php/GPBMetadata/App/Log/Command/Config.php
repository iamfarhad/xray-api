<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: app/log/command/config.proto

namespace GPBMetadata\App\Log\Command;

class Config
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        $pool->internalAddGeneratedFile(
            '
�
app/log/command/config.protoxray.app.log.command"
Config"
RestartLoggerRequest"
RestartLoggerResponse2{
LoggerServicej
RestartLogger*.xray.app.log.command.RestartLoggerRequest+.xray.app.log.command.RestartLoggerResponse" B^
com.xray.app.log.commandPZ)github.com/xtls/xray-core/app/log/command�Xray.App.Log.Commandbproto3'
        , true);

        static::$is_initialized = true;
    }
}

