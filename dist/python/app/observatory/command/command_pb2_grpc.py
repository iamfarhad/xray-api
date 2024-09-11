# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc
import warnings

from app.observatory.command import command_pb2 as app_dot_observatory_dot_command_dot_command__pb2

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
        + f' but the generated code in app/observatory/command/command_pb2_grpc.py depends on'
        + f' grpcio>={GRPC_GENERATED_VERSION}.'
        + f' Please upgrade your grpc module to grpcio>={GRPC_GENERATED_VERSION}'
        + f' or downgrade your generated code using grpcio-tools<={GRPC_VERSION}.'
    )


class ObservatoryServiceStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.GetOutboundStatus = channel.unary_unary(
                '/xray.core.app.observatory.command.ObservatoryService/GetOutboundStatus',
                request_serializer=app_dot_observatory_dot_command_dot_command__pb2.GetOutboundStatusRequest.SerializeToString,
                response_deserializer=app_dot_observatory_dot_command_dot_command__pb2.GetOutboundStatusResponse.FromString,
                _registered_method=True)


class ObservatoryServiceServicer(object):
    """Missing associated documentation comment in .proto file."""

    def GetOutboundStatus(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_ObservatoryServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'GetOutboundStatus': grpc.unary_unary_rpc_method_handler(
                    servicer.GetOutboundStatus,
                    request_deserializer=app_dot_observatory_dot_command_dot_command__pb2.GetOutboundStatusRequest.FromString,
                    response_serializer=app_dot_observatory_dot_command_dot_command__pb2.GetOutboundStatusResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'xray.core.app.observatory.command.ObservatoryService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))
    server.add_registered_method_handlers('xray.core.app.observatory.command.ObservatoryService', rpc_method_handlers)


 # This class is part of an EXPERIMENTAL API.
class ObservatoryService(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def GetOutboundStatus(request,
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
            '/xray.core.app.observatory.command.ObservatoryService/GetOutboundStatus',
            app_dot_observatory_dot_command_dot_command__pb2.GetOutboundStatusRequest.SerializeToString,
            app_dot_observatory_dot_command_dot_command__pb2.GetOutboundStatusResponse.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)
