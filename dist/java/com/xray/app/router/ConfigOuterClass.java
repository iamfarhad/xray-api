// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/router/config.proto

package com.xray.app.router;

public final class ConfigOuterClass {
  private ConfigOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_Domain_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_Domain_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_Domain_Attribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_Domain_Attribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_CIDR_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_CIDR_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_GeoIP_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_GeoIP_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_GeoIPList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_GeoIPList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_GeoSite_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_GeoSite_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_GeoSiteList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_GeoSiteList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_RoutingRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_RoutingRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_RoutingRule_AttributesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_RoutingRule_AttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_BalancingRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_BalancingRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_StrategyWeight_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_StrategyWeight_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_StrategyLeastLoadConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_StrategyLeastLoadConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027app/router/config.proto\022\017xray.app.rout" +
      "er\032!common/serial/typed_message.proto\032\025c" +
      "ommon/net/port.proto\032\030common/net/network" +
      ".proto\"\201\002\n\006Domain\022*\n\004type\030\001 \001(\0162\034.xray.a" +
      "pp.router.Domain.Type\022\r\n\005value\030\002 \001(\t\0224\n\t" +
      "attribute\030\003 \003(\0132!.xray.app.router.Domain" +
      ".Attribute\032R\n\tAttribute\022\013\n\003key\030\001 \001(\t\022\024\n\n" +
      "bool_value\030\002 \001(\010H\000\022\023\n\tint_value\030\003 \001(\003H\000B" +
      "\r\n\013typed_value\"2\n\004Type\022\t\n\005Plain\020\000\022\t\n\005Reg" +
      "ex\020\001\022\n\n\006Domain\020\002\022\010\n\004Full\020\003\"\"\n\004CIDR\022\n\n\002ip" +
      "\030\001 \001(\014\022\016\n\006prefix\030\002 \001(\r\"Y\n\005GeoIP\022\024\n\014count" +
      "ry_code\030\001 \001(\t\022#\n\004cidr\030\002 \003(\0132\025.xray.app.r" +
      "outer.CIDR\022\025\n\rreverse_match\030\003 \001(\010\"2\n\tGeo" +
      "IPList\022%\n\005entry\030\001 \003(\0132\026.xray.app.router." +
      "GeoIP\"H\n\007GeoSite\022\024\n\014country_code\030\001 \001(\t\022\'" +
      "\n\006domain\030\002 \003(\0132\027.xray.app.router.Domain\"" +
      "6\n\013GeoSiteList\022\'\n\005entry\030\001 \003(\0132\030.xray.app" +
      ".router.GeoSite\"\357\005\n\013RoutingRule\022\r\n\003tag\030\001" +
      " \001(\tH\000\022\027\n\rbalancing_tag\030\014 \001(\tH\000\022\020\n\010rule_" +
      "tag\030\022 \001(\t\022\'\n\006domain\030\002 \003(\0132\027.xray.app.rou" +
      "ter.Domain\022\'\n\004cidr\030\003 \003(\0132\025.xray.app.rout" +
      "er.CIDRB\002\030\001\022%\n\005geoip\030\n \003(\0132\026.xray.app.ro" +
      "uter.GeoIP\0222\n\nport_range\030\004 \001(\0132\032.xray.co" +
      "mmon.net.PortRangeB\002\030\001\022,\n\tport_list\030\016 \001(" +
      "\0132\031.xray.common.net.PortList\0226\n\014network_" +
      "list\030\005 \001(\0132\034.xray.common.net.NetworkList" +
      "B\002\030\001\022*\n\010networks\030\r \003(\0162\030.xray.common.net" +
      ".Network\022.\n\013source_cidr\030\006 \003(\0132\025.xray.app" +
      ".router.CIDRB\002\030\001\022,\n\014source_geoip\030\013 \003(\0132\026" +
      ".xray.app.router.GeoIP\0223\n\020source_port_li" +
      "st\030\020 \001(\0132\031.xray.common.net.PortList\022\022\n\nu" +
      "ser_email\030\007 \003(\t\022\023\n\013inbound_tag\030\010 \003(\t\022\020\n\010" +
      "protocol\030\t \003(\t\022@\n\nattributes\030\017 \003(\0132,.xra" +
      "y.app.router.RoutingRule.AttributesEntry" +
      "\022\026\n\016domain_matcher\030\021 \001(\t\0321\n\017AttributesEn" +
      "try\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001B\014\n\nt" +
      "arget_tag\"\234\001\n\rBalancingRule\022\013\n\003tag\030\001 \001(\t" +
      "\022\031\n\021outbound_selector\030\002 \003(\t\022\020\n\010strategy\030" +
      "\003 \001(\t\022;\n\021strategy_settings\030\004 \001(\0132 .xray." +
      "common.serial.TypedMessage\022\024\n\014fallback_t" +
      "ag\030\005 \001(\t\">\n\016StrategyWeight\022\016\n\006regexp\030\001 \001" +
      "(\010\022\r\n\005match\030\002 \001(\t\022\r\n\005value\030\003 \001(\002\"\221\001\n\027Str" +
      "ategyLeastLoadConfig\022.\n\005costs\030\002 \003(\0132\037.xr" +
      "ay.app.router.StrategyWeight\022\021\n\tbaseline" +
      "s\030\003 \003(\003\022\020\n\010expected\030\004 \001(\005\022\016\n\006maxRTT\030\005 \001(" +
      "\003\022\021\n\ttolerance\030\006 \001(\002\"\366\001\n\006Config\022?\n\017domai" +
      "n_strategy\030\001 \001(\0162&.xray.app.router.Confi" +
      "g.DomainStrategy\022*\n\004rule\030\002 \003(\0132\034.xray.ap" +
      "p.router.RoutingRule\0226\n\016balancing_rule\030\003" +
      " \003(\0132\036.xray.app.router.BalancingRule\"G\n\016" +
      "DomainStrategy\022\010\n\004AsIs\020\000\022\t\n\005UseIp\020\001\022\020\n\014I" +
      "pIfNonMatch\020\002\022\016\n\nIpOnDemand\020\003BO\n\023com.xra" +
      "y.app.routerP\001Z$github.com/xtls/xray-cor" +
      "e/app/router\252\002\017Xray.App.Routerb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xray.common.serial.TypedMessageOuterClass.getDescriptor(),
          com.xray.common.net.Port.getDescriptor(),
          com.xray.common.net.NetworkOuterClass.getDescriptor(),
        });
    internal_static_xray_app_router_Domain_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xray_app_router_Domain_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_Domain_descriptor,
        new java.lang.String[] { "Type", "Value", "Attribute", });
    internal_static_xray_app_router_Domain_Attribute_descriptor =
      internal_static_xray_app_router_Domain_descriptor.getNestedTypes().get(0);
    internal_static_xray_app_router_Domain_Attribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_Domain_Attribute_descriptor,
        new java.lang.String[] { "Key", "BoolValue", "IntValue", "TypedValue", });
    internal_static_xray_app_router_CIDR_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_xray_app_router_CIDR_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_CIDR_descriptor,
        new java.lang.String[] { "Ip", "Prefix", });
    internal_static_xray_app_router_GeoIP_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_xray_app_router_GeoIP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_GeoIP_descriptor,
        new java.lang.String[] { "CountryCode", "Cidr", "ReverseMatch", });
    internal_static_xray_app_router_GeoIPList_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_xray_app_router_GeoIPList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_GeoIPList_descriptor,
        new java.lang.String[] { "Entry", });
    internal_static_xray_app_router_GeoSite_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_xray_app_router_GeoSite_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_GeoSite_descriptor,
        new java.lang.String[] { "CountryCode", "Domain", });
    internal_static_xray_app_router_GeoSiteList_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_xray_app_router_GeoSiteList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_GeoSiteList_descriptor,
        new java.lang.String[] { "Entry", });
    internal_static_xray_app_router_RoutingRule_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_xray_app_router_RoutingRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_RoutingRule_descriptor,
        new java.lang.String[] { "Tag", "BalancingTag", "RuleTag", "Domain", "Cidr", "Geoip", "PortRange", "PortList", "NetworkList", "Networks", "SourceCidr", "SourceGeoip", "SourcePortList", "UserEmail", "InboundTag", "Protocol", "Attributes", "DomainMatcher", "TargetTag", });
    internal_static_xray_app_router_RoutingRule_AttributesEntry_descriptor =
      internal_static_xray_app_router_RoutingRule_descriptor.getNestedTypes().get(0);
    internal_static_xray_app_router_RoutingRule_AttributesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_RoutingRule_AttributesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_xray_app_router_BalancingRule_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_xray_app_router_BalancingRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_BalancingRule_descriptor,
        new java.lang.String[] { "Tag", "OutboundSelector", "Strategy", "StrategySettings", "FallbackTag", });
    internal_static_xray_app_router_StrategyWeight_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_xray_app_router_StrategyWeight_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_StrategyWeight_descriptor,
        new java.lang.String[] { "Regexp", "Match", "Value", });
    internal_static_xray_app_router_StrategyLeastLoadConfig_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_xray_app_router_StrategyLeastLoadConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_StrategyLeastLoadConfig_descriptor,
        new java.lang.String[] { "Costs", "Baselines", "Expected", "MaxRTT", "Tolerance", });
    internal_static_xray_app_router_Config_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_xray_app_router_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_Config_descriptor,
        new java.lang.String[] { "DomainStrategy", "Rule", "BalancingRule", });
    com.xray.common.serial.TypedMessageOuterClass.getDescriptor();
    com.xray.common.net.Port.getDescriptor();
    com.xray.common.net.NetworkOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
