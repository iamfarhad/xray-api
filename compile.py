import os
import glob
import sys

CURRENT_DIRECTORY = os.getcwd()
XRAY_API_PATH = os.path.join(CURRENT_DIRECTORY, 'xray_api')
DIST_PATH = os.path.join(CURRENT_DIRECTORY, 'dist')

PYTHON_OUTPUT_PATH = os.path.join(DIST_PATH, "python")
PHP_OUTPUT_PATH = os.path.join(DIST_PATH, "php")
JAVA_OUTPUT_PATH = os.path.join(DIST_PATH, "java")


def find_proto_files():
    return glob.glob(os.path.join(XRAY_API_PATH, '**', '*.proto'), recursive=True)


proto_files = find_proto_files()


if len(sys.argv) < 2:
    print("Please use the script correctly!")
    sys.exit(1)

compiler = sys.argv[1]
if compiler == "python":
    command = (
        f"python -m grpc_tools.protoc "
        f"--proto_path={XRAY_API_PATH} "
        f"--python_out={PYTHON_OUTPUT_PATH} "
        f"--grpc_python_out={PYTHON_OUTPUT_PATH} "
        f"{' '.join(proto_files)}"
    )
elif compiler == "php":
    command = (
        f"protoc "
        f"--proto_path={XRAY_API_PATH} "
        f"--php_out={PHP_OUTPUT_PATH} "
        f"--grpc_out={PHP_OUTPUT_PATH} "
        "--plugin=protoc-gen-grpc=$(which grpc_php_plugin) "
        f"{' '.join(proto_files)}"
    )
elif compiler == "java":
    command = (
        f"protoc "
        f"-I={XRAY_API_PATH} "
        f"--java_out={JAVA_OUTPUT_PATH} "
        f"--grpc_out={JAVA_OUTPUT_PATH} "
        f"{' '.join(proto_files)}"
    )
else:
    print("warning: not valid input! we will compile for python")
    command = (
        f"python -m grpc_tools.protoc "
        f"--proto_path={XRAY_API_PATH} "
        f"--python_out={PYTHON_OUTPUT_PATH} "
        f"--grpc_python_out={PYTHON_OUTPUT_PATH} "
        f"{' '.join(proto_files)}"
    )

exit_code = os.system(command)

if exit_code == 0:
    print("Proto files compiled successfully.")
else:
    print("Error: Proto files compilation failed.")
