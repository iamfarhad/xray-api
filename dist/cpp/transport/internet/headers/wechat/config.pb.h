// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/headers/wechat/config.proto
// Protobuf C++ Version: 4.25.1

#ifndef GOOGLE_PROTOBUF_INCLUDED_transport_2finternet_2fheaders_2fwechat_2fconfig_2eproto_2epb_2eh
#define GOOGLE_PROTOBUF_INCLUDED_transport_2finternet_2fheaders_2fwechat_2fconfig_2eproto_2epb_2eh

#include <limits>
#include <string>
#include <type_traits>
#include <utility>

#include "google/protobuf/port_def.inc"
#if PROTOBUF_VERSION < 4025000
#error "This file was generated by a newer version of protoc which is"
#error "incompatible with your Protocol Buffer headers. Please update"
#error "your headers."
#endif  // PROTOBUF_VERSION

#if 4025001 < PROTOBUF_MIN_PROTOC_VERSION
#error "This file was generated by an older version of protoc which is"
#error "incompatible with your Protocol Buffer headers. Please"
#error "regenerate this file with a newer version of protoc."
#endif  // PROTOBUF_MIN_PROTOC_VERSION
#include "google/protobuf/port_undef.inc"
#include "google/protobuf/io/coded_stream.h"
#include "google/protobuf/arena.h"
#include "google/protobuf/arenastring.h"
#include "google/protobuf/generated_message_bases.h"
#include "google/protobuf/generated_message_tctable_decl.h"
#include "google/protobuf/generated_message_util.h"
#include "google/protobuf/metadata_lite.h"
#include "google/protobuf/generated_message_reflection.h"
#include "google/protobuf/message.h"
#include "google/protobuf/repeated_field.h"  // IWYU pragma: export
#include "google/protobuf/extension_set.h"  // IWYU pragma: export
#include "google/protobuf/unknown_field_set.h"
// @@protoc_insertion_point(includes)

// Must be included last.
#include "google/protobuf/port_def.inc"

#define PROTOBUF_INTERNAL_EXPORT_transport_2finternet_2fheaders_2fwechat_2fconfig_2eproto

namespace google {
namespace protobuf {
namespace internal {
class AnyMetadata;
}  // namespace internal
}  // namespace protobuf
}  // namespace google

// Internal implementation detail -- do not use these members.
struct TableStruct_transport_2finternet_2fheaders_2fwechat_2fconfig_2eproto {
  static const ::uint32_t offsets[];
};
extern const ::google::protobuf::internal::DescriptorTable
    descriptor_table_transport_2finternet_2fheaders_2fwechat_2fconfig_2eproto;
namespace xray {
namespace transport {
namespace internet {
namespace headers {
namespace wechat {
class VideoConfig;
struct VideoConfigDefaultTypeInternal;
extern VideoConfigDefaultTypeInternal _VideoConfig_default_instance_;
}  // namespace wechat
}  // namespace headers
}  // namespace internet
}  // namespace transport
}  // namespace xray
namespace google {
namespace protobuf {
}  // namespace protobuf
}  // namespace google

namespace xray {
namespace transport {
namespace internet {
namespace headers {
namespace wechat {

// ===================================================================


// -------------------------------------------------------------------

class VideoConfig final :
    public ::google::protobuf::internal::ZeroFieldsBase /* @@protoc_insertion_point(class_definition:xray.transport.internet.headers.wechat.VideoConfig) */ {
 public:
  inline VideoConfig() : VideoConfig(nullptr) {}
  template<typename = void>
  explicit PROTOBUF_CONSTEXPR VideoConfig(::google::protobuf::internal::ConstantInitialized);

  inline VideoConfig(const VideoConfig& from)
      : VideoConfig(nullptr, from) {}
  VideoConfig(VideoConfig&& from) noexcept
    : VideoConfig() {
    *this = ::std::move(from);
  }

  inline VideoConfig& operator=(const VideoConfig& from) {
    CopyFrom(from);
    return *this;
  }
  inline VideoConfig& operator=(VideoConfig&& from) noexcept {
    if (this == &from) return *this;
    if (GetArena() == from.GetArena()
  #ifdef PROTOBUF_FORCE_COPY_IN_MOVE
        && GetArena() != nullptr
  #endif  // !PROTOBUF_FORCE_COPY_IN_MOVE
    ) {
      InternalSwap(&from);
    } else {
      CopyFrom(from);
    }
    return *this;
  }

  inline const ::google::protobuf::UnknownFieldSet& unknown_fields() const
      ABSL_ATTRIBUTE_LIFETIME_BOUND {
    return _internal_metadata_.unknown_fields<::google::protobuf::UnknownFieldSet>(::google::protobuf::UnknownFieldSet::default_instance);
  }
  inline ::google::protobuf::UnknownFieldSet* mutable_unknown_fields()
      ABSL_ATTRIBUTE_LIFETIME_BOUND {
    return _internal_metadata_.mutable_unknown_fields<::google::protobuf::UnknownFieldSet>();
  }

  static const ::google::protobuf::Descriptor* descriptor() {
    return GetDescriptor();
  }
  static const ::google::protobuf::Descriptor* GetDescriptor() {
    return default_instance().GetMetadata().descriptor;
  }
  static const ::google::protobuf::Reflection* GetReflection() {
    return default_instance().GetMetadata().reflection;
  }
  static const VideoConfig& default_instance() {
    return *internal_default_instance();
  }
  static inline const VideoConfig* internal_default_instance() {
    return reinterpret_cast<const VideoConfig*>(
               &_VideoConfig_default_instance_);
  }
  static constexpr int kIndexInFileMessages =
    0;

  friend void swap(VideoConfig& a, VideoConfig& b) {
    a.Swap(&b);
  }
  inline void Swap(VideoConfig* other) {
    if (other == this) return;
  #ifdef PROTOBUF_FORCE_COPY_IN_SWAP
    if (GetArena() != nullptr &&
        GetArena() == other->GetArena()) {
   #else  // PROTOBUF_FORCE_COPY_IN_SWAP
    if (GetArena() == other->GetArena()) {
  #endif  // !PROTOBUF_FORCE_COPY_IN_SWAP
      InternalSwap(other);
    } else {
      ::google::protobuf::internal::GenericSwap(this, other);
    }
  }
  void UnsafeArenaSwap(VideoConfig* other) {
    if (other == this) return;
    ABSL_DCHECK(GetArena() == other->GetArena());
    InternalSwap(other);
  }

  // implements Message ----------------------------------------------

  VideoConfig* New(::google::protobuf::Arena* arena = nullptr) const final {
    return CreateMaybeMessage<VideoConfig>(arena);
  }
  using ::google::protobuf::internal::ZeroFieldsBase::CopyFrom;
  inline void CopyFrom(const VideoConfig& from) {
    ::google::protobuf::internal::ZeroFieldsBase::CopyImpl(*this, from);
  }
  using ::google::protobuf::internal::ZeroFieldsBase::MergeFrom;
  void MergeFrom(const VideoConfig& from) {
    ::google::protobuf::internal::ZeroFieldsBase::MergeImpl(*this, from);
  }
  public:

  private:
  friend class ::google::protobuf::internal::AnyMetadata;
  static ::absl::string_view FullMessageName() {
    return "xray.transport.internet.headers.wechat.VideoConfig";
  }
  protected:
  explicit VideoConfig(::google::protobuf::Arena* arena);
  VideoConfig(::google::protobuf::Arena* arena, const VideoConfig& from);
  public:

  ::google::protobuf::Metadata GetMetadata() const final;

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // @@protoc_insertion_point(class_scope:xray.transport.internet.headers.wechat.VideoConfig)
 private:
  class _Internal;

  friend class ::google::protobuf::MessageLite;
  friend class ::google::protobuf::Arena;
  template <typename T>
  friend class ::google::protobuf::Arena::InternalHelper;
  using InternalArenaConstructable_ = void;
  using DestructorSkippable_ = void;
  struct Impl_ {

        inline explicit constexpr Impl_(
            ::google::protobuf::internal::ConstantInitialized) noexcept;
        inline explicit Impl_(::google::protobuf::internal::InternalVisibility visibility,
                              ::google::protobuf::Arena* arena);
        inline explicit Impl_(::google::protobuf::internal::InternalVisibility visibility,
                              ::google::protobuf::Arena* arena, const Impl_& from);
    PROTOBUF_TSAN_DECLARE_MEMBER
  };
  friend struct ::TableStruct_transport_2finternet_2fheaders_2fwechat_2fconfig_2eproto;
};

// ===================================================================




// ===================================================================


#ifdef __GNUC__
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wstrict-aliasing"
#endif  // __GNUC__
// -------------------------------------------------------------------

// VideoConfig

#ifdef __GNUC__
#pragma GCC diagnostic pop
#endif  // __GNUC__

// @@protoc_insertion_point(namespace_scope)
}  // namespace wechat
}  // namespace headers
}  // namespace internet
}  // namespace transport
}  // namespace xray


// @@protoc_insertion_point(global_scope)

#include "google/protobuf/port_undef.inc"

#endif  // GOOGLE_PROTOBUF_INCLUDED_transport_2finternet_2fheaders_2fwechat_2fconfig_2eproto_2epb_2eh
