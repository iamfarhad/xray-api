<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: transport/internet/config.proto

namespace Xray\Transport\Internet\SocketConfig;

use UnexpectedValueException;

/**
 * Protobuf type <code>xray.transport.internet.SocketConfig.TProxyMode</code>
 */
class TProxyMode
{
    /**
     * TProxy is off.
     *
     * Generated from protobuf enum <code>Off = 0;</code>
     */
    const Off = 0;
    /**
     * TProxy mode.
     *
     * Generated from protobuf enum <code>TProxy = 1;</code>
     */
    const TProxy = 1;
    /**
     * Redirect mode.
     *
     * Generated from protobuf enum <code>Redirect = 2;</code>
     */
    const Redirect = 2;

    private static $valueToName = [
        self::Off => 'Off',
        self::TProxy => 'TProxy',
        self::Redirect => 'Redirect',
    ];

    public static function name($value)
    {
        if (!isset(self::$valueToName[$value])) {
            throw new UnexpectedValueException(sprintf(
                    'Enum %s has no name defined for value %s', __CLASS__, $value));
        }
        return self::$valueToName[$value];
    }


    public static function value($name)
    {
        $const = __CLASS__ . '::' . strtoupper($name);
        if (!defined($const)) {
            throw new UnexpectedValueException(sprintf(
                    'Enum %s has no value defined for name %s', __CLASS__, $name));
        }
        return constant($const);
    }
}

// Adding a class alias for backwards compatibility with the previous class name.
class_alias(TProxyMode::class, \Xray\Transport\Internet\SocketConfig_TProxyMode::class);

