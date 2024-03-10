// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/vmess/account.proto
// Protobuf C++ Version: 4.25.1

#ifndef GOOGLE_PROTOBUF_INCLUDED_proxy_2fvmess_2faccount_2eproto_2epb_2eh
#define GOOGLE_PROTOBUF_INCLUDED_proxy_2fvmess_2faccount_2eproto_2epb_2eh

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
#include "google/protobuf/generated_message_tctable_decl.h"
#include "google/protobuf/generated_message_util.h"
#include "google/protobuf/metadata_lite.h"
#include "google/protobuf/generated_message_reflection.h"
#include "google/protobuf/message.h"
#include "google/protobuf/repeated_field.h"  // IWYU pragma: export
#include "google/protobuf/extension_set.h"  // IWYU pragma: export
#include "google/protobuf/unknown_field_set.h"
#include "common/protocol/headers.pb.h"
// @@protoc_insertion_point(includes)

// Must be included last.
#include "google/protobuf/port_def.inc"

#define PROTOBUF_INTERNAL_EXPORT_proxy_2fvmess_2faccount_2eproto

namespace google {
namespace protobuf {
namespace internal {
class AnyMetadata;
}  // namespace internal
}  // namespace protobuf
}  // namespace google

// Internal implementation detail -- do not use these members.
struct TableStruct_proxy_2fvmess_2faccount_2eproto {
  static const ::uint32_t offsets[];
};
extern const ::google::protobuf::internal::DescriptorTable
    descriptor_table_proxy_2fvmess_2faccount_2eproto;
namespace xray {
namespace proxy {
namespace vmess {
class Account;
struct AccountDefaultTypeInternal;
extern AccountDefaultTypeInternal _Account_default_instance_;
}  // namespace vmess
}  // namespace proxy
}  // namespace xray
namespace google {
namespace protobuf {
}  // namespace protobuf
}  // namespace google

namespace xray {
namespace proxy {
namespace vmess {

// ===================================================================


// -------------------------------------------------------------------

class Account final :
    public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:xray.proxy.vmess.Account) */ {
 public:
  inline Account() : Account(nullptr) {}
  ~Account() override;
  template<typename = void>
  explicit PROTOBUF_CONSTEXPR Account(::google::protobuf::internal::ConstantInitialized);

  inline Account(const Account& from)
      : Account(nullptr, from) {}
  Account(Account&& from) noexcept
    : Account() {
    *this = ::std::move(from);
  }

  inline Account& operator=(const Account& from) {
    CopyFrom(from);
    return *this;
  }
  inline Account& operator=(Account&& from) noexcept {
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
  static const Account& default_instance() {
    return *internal_default_instance();
  }
  static inline const Account* internal_default_instance() {
    return reinterpret_cast<const Account*>(
               &_Account_default_instance_);
  }
  static constexpr int kIndexInFileMessages =
    0;

  friend void swap(Account& a, Account& b) {
    a.Swap(&b);
  }
  inline void Swap(Account* other) {
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
  void UnsafeArenaSwap(Account* other) {
    if (other == this) return;
    ABSL_DCHECK(GetArena() == other->GetArena());
    InternalSwap(other);
  }

  // implements Message ----------------------------------------------

  Account* New(::google::protobuf::Arena* arena = nullptr) const final {
    return CreateMaybeMessage<Account>(arena);
  }
  using ::google::protobuf::Message::CopyFrom;
  void CopyFrom(const Account& from);
  using ::google::protobuf::Message::MergeFrom;
  void MergeFrom( const Account& from) {
    Account::MergeImpl(*this, from);
  }
  private:
  static void MergeImpl(::google::protobuf::Message& to_msg, const ::google::protobuf::Message& from_msg);
  public:
  PROTOBUF_ATTRIBUTE_REINITIALIZES void Clear() final;
  bool IsInitialized() const final;

  ::size_t ByteSizeLong() const final;
  const char* _InternalParse(const char* ptr, ::google::protobuf::internal::ParseContext* ctx) final;
  ::uint8_t* _InternalSerialize(
      ::uint8_t* target, ::google::protobuf::io::EpsCopyOutputStream* stream) const final;
  int GetCachedSize() const { return _impl_._cached_size_.Get(); }

  private:
  ::google::protobuf::internal::CachedSize* AccessCachedSize() const final;
  void SharedCtor(::google::protobuf::Arena* arena);
  void SharedDtor();
  void InternalSwap(Account* other);

  private:
  friend class ::google::protobuf::internal::AnyMetadata;
  static ::absl::string_view FullMessageName() {
    return "xray.proxy.vmess.Account";
  }
  protected:
  explicit Account(::google::protobuf::Arena* arena);
  Account(::google::protobuf::Arena* arena, const Account& from);
  public:

  static const ClassData _class_data_;
  const ::google::protobuf::Message::ClassData*GetClassData() const final;

  ::google::protobuf::Metadata GetMetadata() const final;

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  enum : int {
    kIdFieldNumber = 1,
    kTestsEnabledFieldNumber = 4,
    kSecuritySettingsFieldNumber = 3,
  };
  // string id = 1;
  void clear_id() ;
  const std::string& id() const;
  template <typename Arg_ = const std::string&, typename... Args_>
  void set_id(Arg_&& arg, Args_... args);
  std::string* mutable_id();
  PROTOBUF_NODISCARD std::string* release_id();
  void set_allocated_id(std::string* value);

  private:
  const std::string& _internal_id() const;
  inline PROTOBUF_ALWAYS_INLINE void _internal_set_id(
      const std::string& value);
  std::string* _internal_mutable_id();

  public:
  // string tests_enabled = 4;
  void clear_tests_enabled() ;
  const std::string& tests_enabled() const;
  template <typename Arg_ = const std::string&, typename... Args_>
  void set_tests_enabled(Arg_&& arg, Args_... args);
  std::string* mutable_tests_enabled();
  PROTOBUF_NODISCARD std::string* release_tests_enabled();
  void set_allocated_tests_enabled(std::string* value);

  private:
  const std::string& _internal_tests_enabled() const;
  inline PROTOBUF_ALWAYS_INLINE void _internal_set_tests_enabled(
      const std::string& value);
  std::string* _internal_mutable_tests_enabled();

  public:
  // .xray.common.protocol.SecurityConfig security_settings = 3;
  bool has_security_settings() const;
  void clear_security_settings() ;
  const ::xray::common::protocol::SecurityConfig& security_settings() const;
  PROTOBUF_NODISCARD ::xray::common::protocol::SecurityConfig* release_security_settings();
  ::xray::common::protocol::SecurityConfig* mutable_security_settings();
  void set_allocated_security_settings(::xray::common::protocol::SecurityConfig* value);
  void unsafe_arena_set_allocated_security_settings(::xray::common::protocol::SecurityConfig* value);
  ::xray::common::protocol::SecurityConfig* unsafe_arena_release_security_settings();

  private:
  const ::xray::common::protocol::SecurityConfig& _internal_security_settings() const;
  ::xray::common::protocol::SecurityConfig* _internal_mutable_security_settings();

  public:
  // @@protoc_insertion_point(class_scope:xray.proxy.vmess.Account)
 private:
  class _Internal;

  friend class ::google::protobuf::internal::TcParser;
  static const ::google::protobuf::internal::TcParseTable<
      2, 3, 1,
      48, 2>
      _table_;
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
    ::google::protobuf::internal::HasBits<1> _has_bits_;
    mutable ::google::protobuf::internal::CachedSize _cached_size_;
    ::google::protobuf::internal::ArenaStringPtr id_;
    ::google::protobuf::internal::ArenaStringPtr tests_enabled_;
    ::xray::common::protocol::SecurityConfig* security_settings_;
    PROTOBUF_TSAN_DECLARE_MEMBER
  };
  union { Impl_ _impl_; };
  friend struct ::TableStruct_proxy_2fvmess_2faccount_2eproto;
};

// ===================================================================




// ===================================================================


#ifdef __GNUC__
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wstrict-aliasing"
#endif  // __GNUC__
// -------------------------------------------------------------------

// Account

// string id = 1;
inline void Account::clear_id() {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  _impl_.id_.ClearToEmpty();
}
inline const std::string& Account::id() const
    ABSL_ATTRIBUTE_LIFETIME_BOUND {
  // @@protoc_insertion_point(field_get:xray.proxy.vmess.Account.id)
  return _internal_id();
}
template <typename Arg_, typename... Args_>
inline PROTOBUF_ALWAYS_INLINE void Account::set_id(Arg_&& arg,
                                                     Args_... args) {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  ;
  _impl_.id_.Set(static_cast<Arg_&&>(arg), args..., GetArena());
  // @@protoc_insertion_point(field_set:xray.proxy.vmess.Account.id)
}
inline std::string* Account::mutable_id() ABSL_ATTRIBUTE_LIFETIME_BOUND {
  std::string* _s = _internal_mutable_id();
  // @@protoc_insertion_point(field_mutable:xray.proxy.vmess.Account.id)
  return _s;
}
inline const std::string& Account::_internal_id() const {
  PROTOBUF_TSAN_READ(&_impl_._tsan_detect_race);
  return _impl_.id_.Get();
}
inline void Account::_internal_set_id(const std::string& value) {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  ;
  _impl_.id_.Set(value, GetArena());
}
inline std::string* Account::_internal_mutable_id() {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  ;
  return _impl_.id_.Mutable( GetArena());
}
inline std::string* Account::release_id() {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  // @@protoc_insertion_point(field_release:xray.proxy.vmess.Account.id)
  return _impl_.id_.Release();
}
inline void Account::set_allocated_id(std::string* value) {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  _impl_.id_.SetAllocated(value, GetArena());
  #ifdef PROTOBUF_FORCE_COPY_DEFAULT_STRING
        if (_impl_.id_.IsDefault()) {
          _impl_.id_.Set("", GetArena());
        }
  #endif  // PROTOBUF_FORCE_COPY_DEFAULT_STRING
  // @@protoc_insertion_point(field_set_allocated:xray.proxy.vmess.Account.id)
}

// .xray.common.protocol.SecurityConfig security_settings = 3;
inline bool Account::has_security_settings() const {
  bool value = (_impl_._has_bits_[0] & 0x00000001u) != 0;
  PROTOBUF_ASSUME(!value || _impl_.security_settings_ != nullptr);
  return value;
}
inline const ::xray::common::protocol::SecurityConfig& Account::_internal_security_settings() const {
  PROTOBUF_TSAN_READ(&_impl_._tsan_detect_race);
  const ::xray::common::protocol::SecurityConfig* p = _impl_.security_settings_;
  return p != nullptr ? *p : reinterpret_cast<const ::xray::common::protocol::SecurityConfig&>(::xray::common::protocol::_SecurityConfig_default_instance_);
}
inline const ::xray::common::protocol::SecurityConfig& Account::security_settings() const ABSL_ATTRIBUTE_LIFETIME_BOUND {
  // @@protoc_insertion_point(field_get:xray.proxy.vmess.Account.security_settings)
  return _internal_security_settings();
}
inline void Account::unsafe_arena_set_allocated_security_settings(::xray::common::protocol::SecurityConfig* value) {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  if (GetArena() == nullptr) {
    delete reinterpret_cast<::google::protobuf::MessageLite*>(_impl_.security_settings_);
  }
  _impl_.security_settings_ = reinterpret_cast<::xray::common::protocol::SecurityConfig*>(value);
  if (value != nullptr) {
    _impl_._has_bits_[0] |= 0x00000001u;
  } else {
    _impl_._has_bits_[0] &= ~0x00000001u;
  }
  // @@protoc_insertion_point(field_unsafe_arena_set_allocated:xray.proxy.vmess.Account.security_settings)
}
inline ::xray::common::protocol::SecurityConfig* Account::release_security_settings() {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);

  _impl_._has_bits_[0] &= ~0x00000001u;
  ::xray::common::protocol::SecurityConfig* released = _impl_.security_settings_;
  _impl_.security_settings_ = nullptr;
#ifdef PROTOBUF_FORCE_COPY_IN_RELEASE
  auto* old = reinterpret_cast<::google::protobuf::MessageLite*>(released);
  released = ::google::protobuf::internal::DuplicateIfNonNull(released);
  if (GetArena() == nullptr) {
    delete old;
  }
#else   // PROTOBUF_FORCE_COPY_IN_RELEASE
  if (GetArena() != nullptr) {
    released = ::google::protobuf::internal::DuplicateIfNonNull(released);
  }
#endif  // !PROTOBUF_FORCE_COPY_IN_RELEASE
  return released;
}
inline ::xray::common::protocol::SecurityConfig* Account::unsafe_arena_release_security_settings() {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  // @@protoc_insertion_point(field_release:xray.proxy.vmess.Account.security_settings)

  _impl_._has_bits_[0] &= ~0x00000001u;
  ::xray::common::protocol::SecurityConfig* temp = _impl_.security_settings_;
  _impl_.security_settings_ = nullptr;
  return temp;
}
inline ::xray::common::protocol::SecurityConfig* Account::_internal_mutable_security_settings() {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  _impl_._has_bits_[0] |= 0x00000001u;
  if (_impl_.security_settings_ == nullptr) {
    auto* p = CreateMaybeMessage<::xray::common::protocol::SecurityConfig>(GetArena());
    _impl_.security_settings_ = reinterpret_cast<::xray::common::protocol::SecurityConfig*>(p);
  }
  return _impl_.security_settings_;
}
inline ::xray::common::protocol::SecurityConfig* Account::mutable_security_settings() ABSL_ATTRIBUTE_LIFETIME_BOUND {
  ::xray::common::protocol::SecurityConfig* _msg = _internal_mutable_security_settings();
  // @@protoc_insertion_point(field_mutable:xray.proxy.vmess.Account.security_settings)
  return _msg;
}
inline void Account::set_allocated_security_settings(::xray::common::protocol::SecurityConfig* value) {
  ::google::protobuf::Arena* message_arena = GetArena();
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  if (message_arena == nullptr) {
    delete reinterpret_cast<::google::protobuf::MessageLite*>(_impl_.security_settings_);
  }

  if (value != nullptr) {
    ::google::protobuf::Arena* submessage_arena = reinterpret_cast<::google::protobuf::MessageLite*>(value)->GetArena();
    if (message_arena != submessage_arena) {
      value = ::google::protobuf::internal::GetOwnedMessage(message_arena, value, submessage_arena);
    }
    _impl_._has_bits_[0] |= 0x00000001u;
  } else {
    _impl_._has_bits_[0] &= ~0x00000001u;
  }

  _impl_.security_settings_ = reinterpret_cast<::xray::common::protocol::SecurityConfig*>(value);
  // @@protoc_insertion_point(field_set_allocated:xray.proxy.vmess.Account.security_settings)
}

// string tests_enabled = 4;
inline void Account::clear_tests_enabled() {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  _impl_.tests_enabled_.ClearToEmpty();
}
inline const std::string& Account::tests_enabled() const
    ABSL_ATTRIBUTE_LIFETIME_BOUND {
  // @@protoc_insertion_point(field_get:xray.proxy.vmess.Account.tests_enabled)
  return _internal_tests_enabled();
}
template <typename Arg_, typename... Args_>
inline PROTOBUF_ALWAYS_INLINE void Account::set_tests_enabled(Arg_&& arg,
                                                     Args_... args) {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  ;
  _impl_.tests_enabled_.Set(static_cast<Arg_&&>(arg), args..., GetArena());
  // @@protoc_insertion_point(field_set:xray.proxy.vmess.Account.tests_enabled)
}
inline std::string* Account::mutable_tests_enabled() ABSL_ATTRIBUTE_LIFETIME_BOUND {
  std::string* _s = _internal_mutable_tests_enabled();
  // @@protoc_insertion_point(field_mutable:xray.proxy.vmess.Account.tests_enabled)
  return _s;
}
inline const std::string& Account::_internal_tests_enabled() const {
  PROTOBUF_TSAN_READ(&_impl_._tsan_detect_race);
  return _impl_.tests_enabled_.Get();
}
inline void Account::_internal_set_tests_enabled(const std::string& value) {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  ;
  _impl_.tests_enabled_.Set(value, GetArena());
}
inline std::string* Account::_internal_mutable_tests_enabled() {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  ;
  return _impl_.tests_enabled_.Mutable( GetArena());
}
inline std::string* Account::release_tests_enabled() {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  // @@protoc_insertion_point(field_release:xray.proxy.vmess.Account.tests_enabled)
  return _impl_.tests_enabled_.Release();
}
inline void Account::set_allocated_tests_enabled(std::string* value) {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  _impl_.tests_enabled_.SetAllocated(value, GetArena());
  #ifdef PROTOBUF_FORCE_COPY_DEFAULT_STRING
        if (_impl_.tests_enabled_.IsDefault()) {
          _impl_.tests_enabled_.Set("", GetArena());
        }
  #endif  // PROTOBUF_FORCE_COPY_DEFAULT_STRING
  // @@protoc_insertion_point(field_set_allocated:xray.proxy.vmess.Account.tests_enabled)
}

#ifdef __GNUC__
#pragma GCC diagnostic pop
#endif  // __GNUC__

// @@protoc_insertion_point(namespace_scope)
}  // namespace vmess
}  // namespace proxy
}  // namespace xray


// @@protoc_insertion_point(global_scope)

#include "google/protobuf/port_undef.inc"

#endif  // GOOGLE_PROTOBUF_INCLUDED_proxy_2fvmess_2faccount_2eproto_2epb_2eh
