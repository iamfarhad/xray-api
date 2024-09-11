# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: proxy/shadowsocks/config.proto
# Protobuf Python Version: 5.27.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import runtime_version as _runtime_version
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
_runtime_version.ValidateProtobufRuntimeVersion(
    _runtime_version.Domain.PUBLIC,
    5,
    27,
    2,
    '',
    'proxy/shadowsocks/config.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from common.net import network_pb2 as common_dot_net_dot_network__pb2
from common.protocol import user_pb2 as common_dot_protocol_dot_user__pb2
from common.protocol import server_spec_pb2 as common_dot_protocol_dot_server__spec__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1eproxy/shadowsocks/config.proto\x12\x16xray.proxy.shadowsocks\x1a\x18\x63ommon/net/network.proto\x1a\x1a\x63ommon/protocol/user.proto\x1a!common/protocol/server_spec.proto\"f\n\x07\x41\x63\x63ount\x12\x10\n\x08password\x18\x01 \x01(\t\x12\x37\n\x0b\x63ipher_type\x18\x02 \x01(\x0e\x32\".xray.proxy.shadowsocks.CipherType\x12\x10\n\x08iv_check\x18\x03 \x01(\x08\"d\n\x0cServerConfig\x12)\n\x05users\x18\x01 \x03(\x0b\x32\x1a.xray.common.protocol.User\x12)\n\x07network\x18\x02 \x03(\x0e\x32\x18.xray.common.net.Network\"D\n\x0c\x43lientConfig\x12\x34\n\x06server\x18\x01 \x03(\x0b\x32$.xray.common.protocol.ServerEndpoint*t\n\nCipherType\x12\x0b\n\x07UNKNOWN\x10\x00\x12\x0f\n\x0b\x41\x45S_128_GCM\x10\x05\x12\x0f\n\x0b\x41\x45S_256_GCM\x10\x06\x12\x15\n\x11\x43HACHA20_POLY1305\x10\x07\x12\x16\n\x12XCHACHA20_POLY1305\x10\x08\x12\x08\n\x04NONE\x10\tBd\n\x1a\x63om.xray.proxy.shadowsocksP\x01Z+github.com/xtls/xray-core/proxy/shadowsocks\xaa\x02\x16Xray.Proxy.Shadowsocksb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'proxy.shadowsocks.config_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\032com.xray.proxy.shadowsocksP\001Z+github.com/xtls/xray-core/proxy/shadowsocks\252\002\026Xray.Proxy.Shadowsocks'
  _globals['_CIPHERTYPE']._serialized_start=423
  _globals['_CIPHERTYPE']._serialized_end=539
  _globals['_ACCOUNT']._serialized_start=147
  _globals['_ACCOUNT']._serialized_end=249
  _globals['_SERVERCONFIG']._serialized_start=251
  _globals['_SERVERCONFIG']._serialized_end=351
  _globals['_CLIENTCONFIG']._serialized_start=353
  _globals['_CLIENTCONFIG']._serialized_end=421
# @@protoc_insertion_point(module_scope)
