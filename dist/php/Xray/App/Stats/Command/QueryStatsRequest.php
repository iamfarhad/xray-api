<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: app/stats/command/command.proto

namespace Xray\App\Stats\Command;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>xray.app.stats.command.QueryStatsRequest</code>
 */
class QueryStatsRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string pattern = 1;</code>
     */
    protected $pattern = '';
    /**
     * Generated from protobuf field <code>bool reset = 2;</code>
     */
    protected $reset = false;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $pattern
     *     @type bool $reset
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\App\Stats\Command\Command::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string pattern = 1;</code>
     * @return string
     */
    public function getPattern()
    {
        return $this->pattern;
    }

    /**
     * Generated from protobuf field <code>string pattern = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setPattern($var)
    {
        GPBUtil::checkString($var, True);
        $this->pattern = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool reset = 2;</code>
     * @return bool
     */
    public function getReset()
    {
        return $this->reset;
    }

    /**
     * Generated from protobuf field <code>bool reset = 2;</code>
     * @param bool $var
     * @return $this
     */
    public function setReset($var)
    {
        GPBUtil::checkBool($var);
        $this->reset = $var;

        return $this;
    }

}

