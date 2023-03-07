// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Auth.proto

package com.ifx.connect.proto;

public final class Auth {
  private Auth() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AuthenticateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.ifx.connect.proto.Authenticate)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.com.ifx.connect.proto.ProtocolHeader actionProtocol = 2;</code>
     * @return Whether the actionProtocol field is set.
     */
    boolean hasActionProtocol();
    /**
     * <code>.com.ifx.connect.proto.ProtocolHeader actionProtocol = 2;</code>
     * @return The actionProtocol.
     */
    com.ifx.connect.proto.ProtoMessage.ProtocolHeader getActionProtocol();
    /**
     * <code>.com.ifx.connect.proto.ProtocolHeader actionProtocol = 2;</code>
     */
    com.ifx.connect.proto.ProtoMessage.ProtocolHeaderOrBuilder getActionProtocolOrBuilder();

    /**
     * <code>string jwt = 1;</code>
     * @return The jwt.
     */
    java.lang.String getJwt();
    /**
     * <code>string jwt = 1;</code>
     * @return The bytes for jwt.
     */
    com.google.protobuf.ByteString
        getJwtBytes();
  }
  /**
   * Protobuf type {@code com.ifx.connect.proto.Authenticate}
   */
  public static final class Authenticate extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.ifx.connect.proto.Authenticate)
      AuthenticateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Authenticate.newBuilder() to construct.
    private Authenticate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Authenticate() {
      jwt_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Authenticate();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ifx.connect.proto.Auth.internal_static_com_ifx_connect_proto_Authenticate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ifx.connect.proto.Auth.internal_static_com_ifx_connect_proto_Authenticate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ifx.connect.proto.Auth.Authenticate.class, com.ifx.connect.proto.Auth.Authenticate.Builder.class);
    }

    public static final int ACTIONPROTOCOL_FIELD_NUMBER = 2;
    private com.ifx.connect.proto.ProtoMessage.ProtocolHeader actionProtocol_;
    /**
     * <code>.com.ifx.connect.proto.ProtocolHeader actionProtocol = 2;</code>
     * @return Whether the actionProtocol field is set.
     */
    @java.lang.Override
    public boolean hasActionProtocol() {
      return actionProtocol_ != null;
    }
    /**
     * <code>.com.ifx.connect.proto.ProtocolHeader actionProtocol = 2;</code>
     * @return The actionProtocol.
     */
    @java.lang.Override
    public com.ifx.connect.proto.ProtoMessage.ProtocolHeader getActionProtocol() {
      return actionProtocol_ == null ? com.ifx.connect.proto.ProtoMessage.ProtocolHeader.getDefaultInstance() : actionProtocol_;
    }
    /**
     * <code>.com.ifx.connect.proto.ProtocolHeader actionProtocol = 2;</code>
     */
    @java.lang.Override
    public com.ifx.connect.proto.ProtoMessage.ProtocolHeaderOrBuilder getActionProtocolOrBuilder() {
      return actionProtocol_ == null ? com.ifx.connect.proto.ProtoMessage.ProtocolHeader.getDefaultInstance() : actionProtocol_;
    }

    public static final int JWT_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object jwt_ = "";
    /**
     * <code>string jwt = 1;</code>
     * @return The jwt.
     */
    @java.lang.Override
    public java.lang.String getJwt() {
      java.lang.Object ref = jwt_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jwt_ = s;
        return s;
      }
    }
    /**
     * <code>string jwt = 1;</code>
     * @return The bytes for jwt.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getJwtBytes() {
      java.lang.Object ref = jwt_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jwt_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jwt_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, jwt_);
      }
      if (actionProtocol_ != null) {
        output.writeMessage(2, getActionProtocol());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jwt_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, jwt_);
      }
      if (actionProtocol_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getActionProtocol());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.ifx.connect.proto.Auth.Authenticate)) {
        return super.equals(obj);
      }
      com.ifx.connect.proto.Auth.Authenticate other = (com.ifx.connect.proto.Auth.Authenticate) obj;

      if (hasActionProtocol() != other.hasActionProtocol()) return false;
      if (hasActionProtocol()) {
        if (!getActionProtocol()
            .equals(other.getActionProtocol())) return false;
      }
      if (!getJwt()
          .equals(other.getJwt())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasActionProtocol()) {
        hash = (37 * hash) + ACTIONPROTOCOL_FIELD_NUMBER;
        hash = (53 * hash) + getActionProtocol().hashCode();
      }
      hash = (37 * hash) + JWT_FIELD_NUMBER;
      hash = (53 * hash) + getJwt().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.ifx.connect.proto.Auth.Authenticate parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ifx.connect.proto.Auth.Authenticate parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ifx.connect.proto.Auth.Authenticate parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ifx.connect.proto.Auth.Authenticate parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ifx.connect.proto.Auth.Authenticate parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ifx.connect.proto.Auth.Authenticate parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ifx.connect.proto.Auth.Authenticate parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ifx.connect.proto.Auth.Authenticate parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ifx.connect.proto.Auth.Authenticate parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.ifx.connect.proto.Auth.Authenticate parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ifx.connect.proto.Auth.Authenticate parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ifx.connect.proto.Auth.Authenticate parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.ifx.connect.proto.Auth.Authenticate prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.ifx.connect.proto.Authenticate}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.ifx.connect.proto.Authenticate)
        com.ifx.connect.proto.Auth.AuthenticateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.ifx.connect.proto.Auth.internal_static_com_ifx_connect_proto_Authenticate_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.ifx.connect.proto.Auth.internal_static_com_ifx_connect_proto_Authenticate_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.ifx.connect.proto.Auth.Authenticate.class, com.ifx.connect.proto.Auth.Authenticate.Builder.class);
      }

      // Construct using com.ifx.connect.proto.Auth.Authenticate.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        actionProtocol_ = null;
        if (actionProtocolBuilder_ != null) {
          actionProtocolBuilder_.dispose();
          actionProtocolBuilder_ = null;
        }
        jwt_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.ifx.connect.proto.Auth.internal_static_com_ifx_connect_proto_Authenticate_descriptor;
      }

      @java.lang.Override
      public com.ifx.connect.proto.Auth.Authenticate getDefaultInstanceForType() {
        return com.ifx.connect.proto.Auth.Authenticate.getDefaultInstance();
      }

      @java.lang.Override
      public com.ifx.connect.proto.Auth.Authenticate build() {
        com.ifx.connect.proto.Auth.Authenticate result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.ifx.connect.proto.Auth.Authenticate buildPartial() {
        com.ifx.connect.proto.Auth.Authenticate result = new com.ifx.connect.proto.Auth.Authenticate(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.ifx.connect.proto.Auth.Authenticate result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.actionProtocol_ = actionProtocolBuilder_ == null
              ? actionProtocol_
              : actionProtocolBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.jwt_ = jwt_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.ifx.connect.proto.Auth.Authenticate) {
          return mergeFrom((com.ifx.connect.proto.Auth.Authenticate)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.ifx.connect.proto.Auth.Authenticate other) {
        if (other == com.ifx.connect.proto.Auth.Authenticate.getDefaultInstance()) return this;
        if (other.hasActionProtocol()) {
          mergeActionProtocol(other.getActionProtocol());
        }
        if (!other.getJwt().isEmpty()) {
          jwt_ = other.jwt_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                jwt_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 10
              case 18: {
                input.readMessage(
                    getActionProtocolFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 18
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.ifx.connect.proto.ProtoMessage.ProtocolHeader actionProtocol_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.ifx.connect.proto.ProtoMessage.ProtocolHeader, com.ifx.connect.proto.ProtoMessage.ProtocolHeader.Builder, com.ifx.connect.proto.ProtoMessage.ProtocolHeaderOrBuilder> actionProtocolBuilder_;
      /**
       * <code>.com.ifx.connect.proto.ProtocolHeader actionProtocol = 2;</code>
       * @return Whether the actionProtocol field is set.
       */
      public boolean hasActionProtocol() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.com.ifx.connect.proto.ProtocolHeader actionProtocol = 2;</code>
       * @return The actionProtocol.
       */
      public com.ifx.connect.proto.ProtoMessage.ProtocolHeader getActionProtocol() {
        if (actionProtocolBuilder_ == null) {
          return actionProtocol_ == null ? com.ifx.connect.proto.ProtoMessage.ProtocolHeader.getDefaultInstance() : actionProtocol_;
        } else {
          return actionProtocolBuilder_.getMessage();
        }
      }
      /**
       * <code>.com.ifx.connect.proto.ProtocolHeader actionProtocol = 2;</code>
       */
      public Builder setActionProtocol(com.ifx.connect.proto.ProtoMessage.ProtocolHeader value) {
        if (actionProtocolBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          actionProtocol_ = value;
        } else {
          actionProtocolBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.com.ifx.connect.proto.ProtocolHeader actionProtocol = 2;</code>
       */
      public Builder setActionProtocol(
          com.ifx.connect.proto.ProtoMessage.ProtocolHeader.Builder builderForValue) {
        if (actionProtocolBuilder_ == null) {
          actionProtocol_ = builderForValue.build();
        } else {
          actionProtocolBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.com.ifx.connect.proto.ProtocolHeader actionProtocol = 2;</code>
       */
      public Builder mergeActionProtocol(com.ifx.connect.proto.ProtoMessage.ProtocolHeader value) {
        if (actionProtocolBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            actionProtocol_ != null &&
            actionProtocol_ != com.ifx.connect.proto.ProtoMessage.ProtocolHeader.getDefaultInstance()) {
            getActionProtocolBuilder().mergeFrom(value);
          } else {
            actionProtocol_ = value;
          }
        } else {
          actionProtocolBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.com.ifx.connect.proto.ProtocolHeader actionProtocol = 2;</code>
       */
      public Builder clearActionProtocol() {
        bitField0_ = (bitField0_ & ~0x00000001);
        actionProtocol_ = null;
        if (actionProtocolBuilder_ != null) {
          actionProtocolBuilder_.dispose();
          actionProtocolBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.com.ifx.connect.proto.ProtocolHeader actionProtocol = 2;</code>
       */
      public com.ifx.connect.proto.ProtoMessage.ProtocolHeader.Builder getActionProtocolBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getActionProtocolFieldBuilder().getBuilder();
      }
      /**
       * <code>.com.ifx.connect.proto.ProtocolHeader actionProtocol = 2;</code>
       */
      public com.ifx.connect.proto.ProtoMessage.ProtocolHeaderOrBuilder getActionProtocolOrBuilder() {
        if (actionProtocolBuilder_ != null) {
          return actionProtocolBuilder_.getMessageOrBuilder();
        } else {
          return actionProtocol_ == null ?
              com.ifx.connect.proto.ProtoMessage.ProtocolHeader.getDefaultInstance() : actionProtocol_;
        }
      }
      /**
       * <code>.com.ifx.connect.proto.ProtocolHeader actionProtocol = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.ifx.connect.proto.ProtoMessage.ProtocolHeader, com.ifx.connect.proto.ProtoMessage.ProtocolHeader.Builder, com.ifx.connect.proto.ProtoMessage.ProtocolHeaderOrBuilder> 
          getActionProtocolFieldBuilder() {
        if (actionProtocolBuilder_ == null) {
          actionProtocolBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.ifx.connect.proto.ProtoMessage.ProtocolHeader, com.ifx.connect.proto.ProtoMessage.ProtocolHeader.Builder, com.ifx.connect.proto.ProtoMessage.ProtocolHeaderOrBuilder>(
                  getActionProtocol(),
                  getParentForChildren(),
                  isClean());
          actionProtocol_ = null;
        }
        return actionProtocolBuilder_;
      }

      private java.lang.Object jwt_ = "";
      /**
       * <code>string jwt = 1;</code>
       * @return The jwt.
       */
      public java.lang.String getJwt() {
        java.lang.Object ref = jwt_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          jwt_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string jwt = 1;</code>
       * @return The bytes for jwt.
       */
      public com.google.protobuf.ByteString
          getJwtBytes() {
        java.lang.Object ref = jwt_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          jwt_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string jwt = 1;</code>
       * @param value The jwt to set.
       * @return This builder for chaining.
       */
      public Builder setJwt(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        jwt_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string jwt = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearJwt() {
        jwt_ = getDefaultInstance().getJwt();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string jwt = 1;</code>
       * @param value The bytes for jwt to set.
       * @return This builder for chaining.
       */
      public Builder setJwtBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        jwt_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.ifx.connect.proto.Authenticate)
    }

    // @@protoc_insertion_point(class_scope:com.ifx.connect.proto.Authenticate)
    private static final com.ifx.connect.proto.Auth.Authenticate DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.ifx.connect.proto.Auth.Authenticate();
    }

    public static com.ifx.connect.proto.Auth.Authenticate getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Authenticate>
        PARSER = new com.google.protobuf.AbstractParser<Authenticate>() {
      @java.lang.Override
      public Authenticate parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Authenticate> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Authenticate> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.ifx.connect.proto.Auth.Authenticate getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ifx_connect_proto_Authenticate_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ifx_connect_proto_Authenticate_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nAuth.proto\022\025com.ifx.connect.proto\032\024Act" +
      "ionProtocol.proto\"Z\n\014Authenticate\022=\n\016act" +
      "ionProtocol\030\002 \001(\0132%.com.ifx.connect.prot" +
      "o.ProtocolHeader\022\013\n\003jwt\030\001 \001(\tB\035\n\025com.ifx" +
      ".connect.protoB\004Authb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.ifx.connect.proto.ProtoMessage.getDescriptor(),
        });
    internal_static_com_ifx_connect_proto_Authenticate_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_ifx_connect_proto_Authenticate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ifx_connect_proto_Authenticate_descriptor,
        new java.lang.String[] { "ActionProtocol", "Jwt", });
    com.ifx.connect.proto.ProtoMessage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
