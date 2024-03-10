// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/blackhole/config.proto

#include "proxy/blackhole/config.pb.h"

#include <algorithm>
#include "google/protobuf/io/coded_stream.h"
#include "google/protobuf/extension_set.h"
#include "google/protobuf/wire_format_lite.h"
#include "google/protobuf/descriptor.h"
#include "google/protobuf/generated_message_reflection.h"
#include "google/protobuf/reflection_ops.h"
#include "google/protobuf/wire_format.h"
#include "google/protobuf/generated_message_tctable_impl.h"
// @@protoc_insertion_point(includes)

// Must be included last.
#include "google/protobuf/port_def.inc"
PROTOBUF_PRAGMA_INIT_SEG
namespace _pb = ::google::protobuf;
namespace _pbi = ::google::protobuf::internal;
namespace _fl = ::google::protobuf::internal::field_layout;
namespace xray {
namespace proxy {
namespace blackhole {
      template <typename>
PROTOBUF_CONSTEXPR NoneResponse::NoneResponse(::_pbi::ConstantInitialized) {}
struct NoneResponseDefaultTypeInternal {
  PROTOBUF_CONSTEXPR NoneResponseDefaultTypeInternal() : _instance(::_pbi::ConstantInitialized{}) {}
  ~NoneResponseDefaultTypeInternal() {}
  union {
    NoneResponse _instance;
  };
};

PROTOBUF_ATTRIBUTE_NO_DESTROY PROTOBUF_CONSTINIT
    PROTOBUF_ATTRIBUTE_INIT_PRIORITY1 NoneResponseDefaultTypeInternal _NoneResponse_default_instance_;
      template <typename>
PROTOBUF_CONSTEXPR HTTPResponse::HTTPResponse(::_pbi::ConstantInitialized) {}
struct HTTPResponseDefaultTypeInternal {
  PROTOBUF_CONSTEXPR HTTPResponseDefaultTypeInternal() : _instance(::_pbi::ConstantInitialized{}) {}
  ~HTTPResponseDefaultTypeInternal() {}
  union {
    HTTPResponse _instance;
  };
};

PROTOBUF_ATTRIBUTE_NO_DESTROY PROTOBUF_CONSTINIT
    PROTOBUF_ATTRIBUTE_INIT_PRIORITY1 HTTPResponseDefaultTypeInternal _HTTPResponse_default_instance_;

inline constexpr Config::Impl_::Impl_(
    ::_pbi::ConstantInitialized) noexcept
      : _cached_size_{0},
        response_{nullptr} {}

template <typename>
PROTOBUF_CONSTEXPR Config::Config(::_pbi::ConstantInitialized)
    : _impl_(::_pbi::ConstantInitialized()) {}
struct ConfigDefaultTypeInternal {
  PROTOBUF_CONSTEXPR ConfigDefaultTypeInternal() : _instance(::_pbi::ConstantInitialized{}) {}
  ~ConfigDefaultTypeInternal() {}
  union {
    Config _instance;
  };
};

PROTOBUF_ATTRIBUTE_NO_DESTROY PROTOBUF_CONSTINIT
    PROTOBUF_ATTRIBUTE_INIT_PRIORITY1 ConfigDefaultTypeInternal _Config_default_instance_;
}  // namespace blackhole
}  // namespace proxy
}  // namespace xray
static ::_pb::Metadata file_level_metadata_proxy_2fblackhole_2fconfig_2eproto[3];
static constexpr const ::_pb::EnumDescriptor**
    file_level_enum_descriptors_proxy_2fblackhole_2fconfig_2eproto = nullptr;
static constexpr const ::_pb::ServiceDescriptor**
    file_level_service_descriptors_proxy_2fblackhole_2fconfig_2eproto = nullptr;
const ::uint32_t TableStruct_proxy_2fblackhole_2fconfig_2eproto::offsets[] PROTOBUF_SECTION_VARIABLE(
    protodesc_cold) = {
    ~0u,  // no _has_bits_
    PROTOBUF_FIELD_OFFSET(::xray::proxy::blackhole::NoneResponse, _internal_metadata_),
    ~0u,  // no _extensions_
    ~0u,  // no _oneof_case_
    ~0u,  // no _weak_field_map_
    ~0u,  // no _inlined_string_donated_
    ~0u,  // no _split_
    ~0u,  // no sizeof(Split)
    ~0u,  // no _has_bits_
    PROTOBUF_FIELD_OFFSET(::xray::proxy::blackhole::HTTPResponse, _internal_metadata_),
    ~0u,  // no _extensions_
    ~0u,  // no _oneof_case_
    ~0u,  // no _weak_field_map_
    ~0u,  // no _inlined_string_donated_
    ~0u,  // no _split_
    ~0u,  // no sizeof(Split)
    PROTOBUF_FIELD_OFFSET(::xray::proxy::blackhole::Config, _impl_._has_bits_),
    PROTOBUF_FIELD_OFFSET(::xray::proxy::blackhole::Config, _internal_metadata_),
    ~0u,  // no _extensions_
    ~0u,  // no _oneof_case_
    ~0u,  // no _weak_field_map_
    ~0u,  // no _inlined_string_donated_
    ~0u,  // no _split_
    ~0u,  // no sizeof(Split)
    PROTOBUF_FIELD_OFFSET(::xray::proxy::blackhole::Config, _impl_.response_),
    0,
};

static const ::_pbi::MigrationSchema
    schemas[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
        {0, -1, -1, sizeof(::xray::proxy::blackhole::NoneResponse)},
        {8, -1, -1, sizeof(::xray::proxy::blackhole::HTTPResponse)},
        {16, 25, -1, sizeof(::xray::proxy::blackhole::Config)},
};

static const ::_pb::Message* const file_default_instances[] = {
    &::xray::proxy::blackhole::_NoneResponse_default_instance_._instance,
    &::xray::proxy::blackhole::_HTTPResponse_default_instance_._instance,
    &::xray::proxy::blackhole::_Config_default_instance_._instance,
};
const char descriptor_table_protodef_proxy_2fblackhole_2fconfig_2eproto[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
    "\n\034proxy/blackhole/config.proto\022\024xray.pro"
    "xy.blackhole\032!common/serial/typed_messag"
    "e.proto\"\016\n\014NoneResponse\"\016\n\014HTTPResponse\""
    "<\n\006Config\0222\n\010response\030\001 \001(\0132 .xray.commo"
    "n.serial.TypedMessageB^\n\030com.xray.proxy."
    "blackholeP\001Z)github.com/xtls/xray-core/p"
    "roxy/blackhole\252\002\024Xray.Proxy.Blackholeb\006p"
    "roto3"
};
static const ::_pbi::DescriptorTable* const descriptor_table_proxy_2fblackhole_2fconfig_2eproto_deps[1] =
    {
        &::descriptor_table_common_2fserial_2ftyped_5fmessage_2eproto,
};
static ::absl::once_flag descriptor_table_proxy_2fblackhole_2fconfig_2eproto_once;
const ::_pbi::DescriptorTable descriptor_table_proxy_2fblackhole_2fconfig_2eproto = {
    false,
    false,
    285,
    descriptor_table_protodef_proxy_2fblackhole_2fconfig_2eproto,
    "proxy/blackhole/config.proto",
    &descriptor_table_proxy_2fblackhole_2fconfig_2eproto_once,
    descriptor_table_proxy_2fblackhole_2fconfig_2eproto_deps,
    1,
    3,
    schemas,
    file_default_instances,
    TableStruct_proxy_2fblackhole_2fconfig_2eproto::offsets,
    file_level_metadata_proxy_2fblackhole_2fconfig_2eproto,
    file_level_enum_descriptors_proxy_2fblackhole_2fconfig_2eproto,
    file_level_service_descriptors_proxy_2fblackhole_2fconfig_2eproto,
};

// This function exists to be marked as weak.
// It can significantly speed up compilation by breaking up LLVM's SCC
// in the .pb.cc translation units. Large translation units see a
// reduction of more than 35% of walltime for optimized builds. Without
// the weak attribute all the messages in the file, including all the
// vtables and everything they use become part of the same SCC through
// a cycle like:
// GetMetadata -> descriptor table -> default instances ->
//   vtables -> GetMetadata
// By adding a weak function here we break the connection from the
// individual vtables back into the descriptor table.
PROTOBUF_ATTRIBUTE_WEAK const ::_pbi::DescriptorTable* descriptor_table_proxy_2fblackhole_2fconfig_2eproto_getter() {
  return &descriptor_table_proxy_2fblackhole_2fconfig_2eproto;
}
// Force running AddDescriptors() at dynamic initialization time.
PROTOBUF_ATTRIBUTE_INIT_PRIORITY2
static ::_pbi::AddDescriptorsRunner dynamic_init_dummy_proxy_2fblackhole_2fconfig_2eproto(&descriptor_table_proxy_2fblackhole_2fconfig_2eproto);
namespace xray {
namespace proxy {
namespace blackhole {
// ===================================================================

class NoneResponse::_Internal {
 public:
};

NoneResponse::NoneResponse(::google::protobuf::Arena* arena)
    : ::google::protobuf::internal::ZeroFieldsBase(arena) {
  // @@protoc_insertion_point(arena_constructor:xray.proxy.blackhole.NoneResponse)
}
NoneResponse::NoneResponse(
    ::google::protobuf::Arena* arena,
    const NoneResponse& from)
    : ::google::protobuf::internal::ZeroFieldsBase(arena) {
  NoneResponse* const _this = this;
  (void)_this;
  _internal_metadata_.MergeFrom<::google::protobuf::UnknownFieldSet>(
      from._internal_metadata_);

  // @@protoc_insertion_point(copy_constructor:xray.proxy.blackhole.NoneResponse)
}









::google::protobuf::Metadata NoneResponse::GetMetadata() const {
  return ::_pbi::AssignDescriptors(
      &descriptor_table_proxy_2fblackhole_2fconfig_2eproto_getter, &descriptor_table_proxy_2fblackhole_2fconfig_2eproto_once,
      file_level_metadata_proxy_2fblackhole_2fconfig_2eproto[0]);
}
// ===================================================================

class HTTPResponse::_Internal {
 public:
};

HTTPResponse::HTTPResponse(::google::protobuf::Arena* arena)
    : ::google::protobuf::internal::ZeroFieldsBase(arena) {
  // @@protoc_insertion_point(arena_constructor:xray.proxy.blackhole.HTTPResponse)
}
HTTPResponse::HTTPResponse(
    ::google::protobuf::Arena* arena,
    const HTTPResponse& from)
    : ::google::protobuf::internal::ZeroFieldsBase(arena) {
  HTTPResponse* const _this = this;
  (void)_this;
  _internal_metadata_.MergeFrom<::google::protobuf::UnknownFieldSet>(
      from._internal_metadata_);

  // @@protoc_insertion_point(copy_constructor:xray.proxy.blackhole.HTTPResponse)
}









::google::protobuf::Metadata HTTPResponse::GetMetadata() const {
  return ::_pbi::AssignDescriptors(
      &descriptor_table_proxy_2fblackhole_2fconfig_2eproto_getter, &descriptor_table_proxy_2fblackhole_2fconfig_2eproto_once,
      file_level_metadata_proxy_2fblackhole_2fconfig_2eproto[1]);
}
// ===================================================================

class Config::_Internal {
 public:
  using HasBits = decltype(std::declval<Config>()._impl_._has_bits_);
  static constexpr ::int32_t kHasBitsOffset =
    8 * PROTOBUF_FIELD_OFFSET(Config, _impl_._has_bits_);
  static const ::xray::common::serial::TypedMessage& response(const Config* msg);
  static void set_has_response(HasBits* has_bits) {
    (*has_bits)[0] |= 1u;
  }
};

const ::xray::common::serial::TypedMessage& Config::_Internal::response(const Config* msg) {
  return *msg->_impl_.response_;
}
void Config::clear_response() {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  if (_impl_.response_ != nullptr) _impl_.response_->Clear();
  _impl_._has_bits_[0] &= ~0x00000001u;
}
Config::Config(::google::protobuf::Arena* arena)
    : ::google::protobuf::Message(arena) {
  SharedCtor(arena);
  // @@protoc_insertion_point(arena_constructor:xray.proxy.blackhole.Config)
}
inline PROTOBUF_NDEBUG_INLINE Config::Impl_::Impl_(
    ::google::protobuf::internal::InternalVisibility visibility, ::google::protobuf::Arena* arena,
    const Impl_& from)
      : _has_bits_{from._has_bits_},
        _cached_size_{0} {}

Config::Config(
    ::google::protobuf::Arena* arena,
    const Config& from)
    : ::google::protobuf::Message(arena) {
  Config* const _this = this;
  (void)_this;
  _internal_metadata_.MergeFrom<::google::protobuf::UnknownFieldSet>(
      from._internal_metadata_);
  new (&_impl_) Impl_(internal_visibility(), arena, from._impl_);
  ::uint32_t cached_has_bits = _impl_._has_bits_[0];
  _impl_.response_ = (cached_has_bits & 0x00000001u)
                ? CreateMaybeMessage<::xray::common::serial::TypedMessage>(arena, *from._impl_.response_)
                : nullptr;

  // @@protoc_insertion_point(copy_constructor:xray.proxy.blackhole.Config)
}
inline PROTOBUF_NDEBUG_INLINE Config::Impl_::Impl_(
    ::google::protobuf::internal::InternalVisibility visibility,
    ::google::protobuf::Arena* arena)
      : _cached_size_{0} {}

inline void Config::SharedCtor(::_pb::Arena* arena) {
  new (&_impl_) Impl_(internal_visibility(), arena);
  _impl_.response_ = {};
}
Config::~Config() {
  // @@protoc_insertion_point(destructor:xray.proxy.blackhole.Config)
  _internal_metadata_.Delete<::google::protobuf::UnknownFieldSet>();
  SharedDtor();
}
inline void Config::SharedDtor() {
  ABSL_DCHECK(GetArena() == nullptr);
  delete _impl_.response_;
  _impl_.~Impl_();
}

PROTOBUF_NOINLINE void Config::Clear() {
// @@protoc_insertion_point(message_clear_start:xray.proxy.blackhole.Config)
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  ::uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  cached_has_bits = _impl_._has_bits_[0];
  if (cached_has_bits & 0x00000001u) {
    ABSL_DCHECK(_impl_.response_ != nullptr);
    _impl_.response_->Clear();
  }
  _impl_._has_bits_.Clear();
  _internal_metadata_.Clear<::google::protobuf::UnknownFieldSet>();
}

const char* Config::_InternalParse(
    const char* ptr, ::_pbi::ParseContext* ctx) {
  ptr = ::_pbi::TcParser::ParseLoop(this, ptr, ctx, &_table_.header);
  return ptr;
}


PROTOBUF_CONSTINIT PROTOBUF_ATTRIBUTE_INIT_PRIORITY1
const ::_pbi::TcParseTable<0, 1, 1, 0, 2> Config::_table_ = {
  {
    PROTOBUF_FIELD_OFFSET(Config, _impl_._has_bits_),
    0, // no _extensions_
    1, 0,  // max_field_number, fast_idx_mask
    offsetof(decltype(_table_), field_lookup_table),
    4294967294,  // skipmap
    offsetof(decltype(_table_), field_entries),
    1,  // num_field_entries
    1,  // num_aux_entries
    offsetof(decltype(_table_), aux_entries),
    &_Config_default_instance_._instance,
    ::_pbi::TcParser::GenericFallback,  // fallback
  }, {{
    // .xray.common.serial.TypedMessage response = 1;
    {::_pbi::TcParser::FastMtS1,
     {10, 0, 0, PROTOBUF_FIELD_OFFSET(Config, _impl_.response_)}},
  }}, {{
    65535, 65535
  }}, {{
    // .xray.common.serial.TypedMessage response = 1;
    {PROTOBUF_FIELD_OFFSET(Config, _impl_.response_), _Internal::kHasBitsOffset + 0, 0,
    (0 | ::_fl::kFcOptional | ::_fl::kMessage | ::_fl::kTvTable)},
  }}, {{
    {::_pbi::TcParser::GetTable<::xray::common::serial::TypedMessage>()},
  }}, {{
  }},
};

::uint8_t* Config::_InternalSerialize(
    ::uint8_t* target,
    ::google::protobuf::io::EpsCopyOutputStream* stream) const {
  // @@protoc_insertion_point(serialize_to_array_start:xray.proxy.blackhole.Config)
  ::uint32_t cached_has_bits = 0;
  (void)cached_has_bits;

  cached_has_bits = _impl_._has_bits_[0];
  // .xray.common.serial.TypedMessage response = 1;
  if (cached_has_bits & 0x00000001u) {
    target = ::google::protobuf::internal::WireFormatLite::InternalWriteMessage(
        1, _Internal::response(this),
        _Internal::response(this).GetCachedSize(), target, stream);
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    target =
        ::_pbi::WireFormat::InternalSerializeUnknownFieldsToArray(
            _internal_metadata_.unknown_fields<::google::protobuf::UnknownFieldSet>(::google::protobuf::UnknownFieldSet::default_instance), target, stream);
  }
  // @@protoc_insertion_point(serialize_to_array_end:xray.proxy.blackhole.Config)
  return target;
}

::size_t Config::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:xray.proxy.blackhole.Config)
  ::size_t total_size = 0;

  ::uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  // .xray.common.serial.TypedMessage response = 1;
  cached_has_bits = _impl_._has_bits_[0];
  if (cached_has_bits & 0x00000001u) {
    total_size +=
        1 + ::google::protobuf::internal::WireFormatLite::MessageSize(*_impl_.response_);
  }

  return MaybeComputeUnknownFieldsSize(total_size, &_impl_._cached_size_);
}

const ::google::protobuf::Message::ClassData Config::_class_data_ = {
    Config::MergeImpl,
    nullptr,  // OnDemandRegisterArenaDtor
};
const ::google::protobuf::Message::ClassData* Config::GetClassData() const {
  return &_class_data_;
}

void Config::MergeImpl(::google::protobuf::Message& to_msg, const ::google::protobuf::Message& from_msg) {
  auto* const _this = static_cast<Config*>(&to_msg);
  auto& from = static_cast<const Config&>(from_msg);
  // @@protoc_insertion_point(class_specific_merge_from_start:xray.proxy.blackhole.Config)
  ABSL_DCHECK_NE(&from, _this);
  ::uint32_t cached_has_bits = 0;
  (void) cached_has_bits;

  if ((from._impl_._has_bits_[0] & 0x00000001u) != 0) {
    _this->_internal_mutable_response()->::xray::common::serial::TypedMessage::MergeFrom(
        from._internal_response());
  }
  _this->_internal_metadata_.MergeFrom<::google::protobuf::UnknownFieldSet>(from._internal_metadata_);
}

void Config::CopyFrom(const Config& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:xray.proxy.blackhole.Config)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

PROTOBUF_NOINLINE bool Config::IsInitialized() const {
  return true;
}

::_pbi::CachedSize* Config::AccessCachedSize() const {
  return &_impl_._cached_size_;
}
void Config::InternalSwap(Config* PROTOBUF_RESTRICT other) {
  using std::swap;
  _internal_metadata_.InternalSwap(&other->_internal_metadata_);
  swap(_impl_._has_bits_[0], other->_impl_._has_bits_[0]);
  swap(_impl_.response_, other->_impl_.response_);
}

::google::protobuf::Metadata Config::GetMetadata() const {
  return ::_pbi::AssignDescriptors(
      &descriptor_table_proxy_2fblackhole_2fconfig_2eproto_getter, &descriptor_table_proxy_2fblackhole_2fconfig_2eproto_once,
      file_level_metadata_proxy_2fblackhole_2fconfig_2eproto[2]);
}
// @@protoc_insertion_point(namespace_scope)
}  // namespace blackhole
}  // namespace proxy
}  // namespace xray
namespace google {
namespace protobuf {
}  // namespace protobuf
}  // namespace google
// @@protoc_insertion_point(global_scope)
#include "google/protobuf/port_undef.inc"
