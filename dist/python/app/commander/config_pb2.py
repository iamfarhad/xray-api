# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: app/commander/config.proto
# Protobuf Python Version: 4.25.1
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from common.serial import typed_message_pb2 as common_dot_serial_dot_typed__message__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1a\x61pp/commander/config.proto\x12\x12xray.app.commander\x1a!common/serial/typed_message.proto\"H\n\x06\x43onfig\x12\x0b\n\x03tag\x18\x01 \x01(\t\x12\x31\n\x07service\x18\x02 \x03(\x0b\x32 .xray.common.serial.TypedMessage\"\x12\n\x10ReflectionConfigBX\n\x16\x63om.xray.app.commanderP\x01Z\'github.com/xtls/xray-core/app/commander\xaa\x02\x12Xray.App.Commanderb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'app.commander.config_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\026com.xray.app.commanderP\001Z\'github.com/xtls/xray-core/app/commander\252\002\022Xray.App.Commander'
  _globals['_CONFIG']._serialized_start=85
  _globals['_CONFIG']._serialized_end=157
  _globals['_REFLECTIONCONFIG']._serialized_start=159
  _globals['_REFLECTIONCONFIG']._serialized_end=177
# @@protoc_insertion_point(module_scope)
