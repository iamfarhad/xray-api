# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: app/log/command/config.proto
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
    'app/log/command/config.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1c\x61pp/log/command/config.proto\x12\x14xray.app.log.command\"\x08\n\x06\x43onfig\"\x16\n\x14RestartLoggerRequest\"\x17\n\x15RestartLoggerResponse2{\n\rLoggerService\x12j\n\rRestartLogger\x12*.xray.app.log.command.RestartLoggerRequest\x1a+.xray.app.log.command.RestartLoggerResponse\"\x00\x42^\n\x18\x63om.xray.app.log.commandP\x01Z)github.com/xtls/xray-core/app/log/command\xaa\x02\x14Xray.App.Log.Commandb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'app.log.command.config_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\030com.xray.app.log.commandP\001Z)github.com/xtls/xray-core/app/log/command\252\002\024Xray.App.Log.Command'
  _globals['_CONFIG']._serialized_start=54
  _globals['_CONFIG']._serialized_end=62
  _globals['_RESTARTLOGGERREQUEST']._serialized_start=64
  _globals['_RESTARTLOGGERREQUEST']._serialized_end=86
  _globals['_RESTARTLOGGERRESPONSE']._serialized_start=88
  _globals['_RESTARTLOGGERRESPONSE']._serialized_end=111
  _globals['_LOGGERSERVICE']._serialized_start=113
  _globals['_LOGGERSERVICE']._serialized_end=236
# @@protoc_insertion_point(module_scope)
