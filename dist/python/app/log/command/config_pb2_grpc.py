# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc
import warnings

from app.log.command import config_pb2 as app_dot_log_dot_command_dot_config__pb2

GRPC_GENERATED_VERSION = '1.66.1'
GRPC_VERSION = grpc.__version__
_version_not_supported = False

try:
    from grpc._utilities import first_version_is_lower
    _version_not_supported = first_version_is_lower(GRPC_VERSION, GRPC_GENERATED_VERSION)
except ImportError:
    _version_not_supported = True

if _version_not_supported:
    raise RuntimeError(
        f'The grpc package installed is at version {GRPC_VERSION},'
        + f' but the generated code in app/log/command/config_pb2_grpc.py depends on'
        + f' grpcio>={GRPC_GENERATED_VERSION}.'
        + f' Please upgrade your grpc module to grpcio>={GRPC_GENERATED_VERSION}'
        + f' or downgrade your generated code using grpcio-tools<={GRPC_VERSION}.'
    )


class LoggerServiceStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.RestartLogger = channel.unary_unary(
                '/xray.app.log.command.LoggerService/RestartLogger',
                request_serializer=app_dot_log_dot_command_dot_config__pb2.RestartLoggerRequest.SerializeToString,
                response_deserializer=app_dot_log_dot_command_dot_config__pb2.RestartLoggerResponse.FromString,
                _registered_method=True)


class LoggerServiceServicer(object):
    """Missing associated documentation comment in .proto file."""

    def RestartLogger(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_LoggerServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'RestartLogger': grpc.unary_unary_rpc_method_handler(
                    servicer.RestartLogger,
                    request_deserializer=app_dot_log_dot_command_dot_config__pb2.RestartLoggerRequest.FromString,
                    response_serializer=app_dot_log_dot_command_dot_config__pb2.RestartLoggerResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'xray.app.log.command.LoggerService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))
    server.add_registered_method_handlers('xray.app.log.command.LoggerService', rpc_method_handlers)


 # This class is part of an EXPERIMENTAL API.
class LoggerService(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def RestartLogger(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(
            request,
            target,
            '/xray.app.log.command.LoggerService/RestartLogger',
            app_dot_log_dot_command_dot_config__pb2.RestartLoggerRequest.SerializeToString,
            app_dot_log_dot_command_dot_config__pb2.RestartLoggerResponse.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)
