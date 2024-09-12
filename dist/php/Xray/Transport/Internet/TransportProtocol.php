<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: transport/internet/config.proto

namespace Xray\Transport\Internet;

use UnexpectedValueException;

/**
 * Protobuf type <code>xray.transport.internet.TransportProtocol</code>
 */
class TransportProtocol
{
    /**
     * Generated from protobuf enum <code>TCP = 0;</code>
     */
    const TCP = 0;
    /**
     * Generated from protobuf enum <code>UDP = 1;</code>
     */
    const UDP = 1;
    /**
     * Generated from protobuf enum <code>MKCP = 2;</code>
     */
    const MKCP = 2;
    /**
     * Generated from protobuf enum <code>WebSocket = 3;</code>
     */
    const WebSocket = 3;
    /**
     * Generated from protobuf enum <code>HTTP = 4;</code>
     */
    const HTTP = 4;
    /**
     * Generated from protobuf enum <code>HTTPUpgrade = 6;</code>
     */
    const HTTPUpgrade = 6;
    /**
     * Generated from protobuf enum <code>SplitHTTP = 7;</code>
     */
    const SplitHTTP = 7;

    private static $valueToName = [
        self::TCP => 'TCP',
        self::UDP => 'UDP',
        self::MKCP => 'MKCP',
        self::WebSocket => 'WebSocket',
        self::HTTP => 'HTTP',
        self::HTTPUpgrade => 'HTTPUpgrade',
        self::SplitHTTP => 'SplitHTTP',
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

