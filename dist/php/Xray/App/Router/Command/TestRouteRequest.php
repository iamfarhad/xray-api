<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: app/router/command/command.proto

namespace Xray\App\Router\Command;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * TestRouteRequest manually tests a routing result according to the routing
 * context message.
 * * RoutingContext is the routing message without outbound information.
 * * FieldSelectors selects the fields to return in the routing result. All
 * fields are returned if left empty.
 * * PublishResult broadcasts the routing result to routing statistics channel
 * if set true.
 *
 * Generated from protobuf message <code>xray.app.router.command.TestRouteRequest</code>
 */
class TestRouteRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.xray.app.router.command.RoutingContext RoutingContext = 1;</code>
     */
    protected $RoutingContext = null;
    /**
     * Generated from protobuf field <code>repeated string FieldSelectors = 2;</code>
     */
    private $FieldSelectors;
    /**
     * Generated from protobuf field <code>bool PublishResult = 3;</code>
     */
    protected $PublishResult = false;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Xray\App\Router\Command\RoutingContext $RoutingContext
     *     @type array<string>|\Google\Protobuf\Internal\RepeatedField $FieldSelectors
     *     @type bool $PublishResult
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\App\Router\Command\Command::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.xray.app.router.command.RoutingContext RoutingContext = 1;</code>
     * @return \Xray\App\Router\Command\RoutingContext|null
     */
    public function getRoutingContext()
    {
        return $this->RoutingContext;
    }

    public function hasRoutingContext()
    {
        return isset($this->RoutingContext);
    }

    public function clearRoutingContext()
    {
        unset($this->RoutingContext);
    }

    /**
     * Generated from protobuf field <code>.xray.app.router.command.RoutingContext RoutingContext = 1;</code>
     * @param \Xray\App\Router\Command\RoutingContext $var
     * @return $this
     */
    public function setRoutingContext($var)
    {
        GPBUtil::checkMessage($var, \Xray\App\Router\Command\RoutingContext::class);
        $this->RoutingContext = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated string FieldSelectors = 2;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getFieldSelectors()
    {
        return $this->FieldSelectors;
    }

    /**
     * Generated from protobuf field <code>repeated string FieldSelectors = 2;</code>
     * @param array<string>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setFieldSelectors($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->FieldSelectors = $arr;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool PublishResult = 3;</code>
     * @return bool
     */
    public function getPublishResult()
    {
        return $this->PublishResult;
    }

    /**
     * Generated from protobuf field <code>bool PublishResult = 3;</code>
     * @param bool $var
     * @return $this
     */
    public function setPublishResult($var)
    {
        GPBUtil::checkBool($var);
        $this->PublishResult = $var;

        return $this;
    }

}

