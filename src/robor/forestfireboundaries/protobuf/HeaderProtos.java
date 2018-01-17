// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: header.proto

package robor.forestfireboundaries.protobuf;

public final class HeaderProtos {
  private HeaderProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HeaderOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Header)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 message_id = 1;</code>
     */
    int getMessageId();

    /**
     * <code>fixed32 message_length = 2;</code>
     */
    int getMessageLength();
  }
  /**
   * Protobuf type {@code Header}
   */
  public  static final class Header extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Header)
      HeaderOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Header.newBuilder() to construct.
    private Header(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Header() {
      messageId_ = 0;
      messageLength_ = 0;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Header(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 13: {

              messageId_ = input.readFixed32();
              break;
            }
            case 21: {

              messageLength_ = input.readFixed32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HeaderProtos.internal_static_Header_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HeaderProtos.internal_static_Header_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Header.class, Builder.class);
    }

    public static final int MESSAGE_ID_FIELD_NUMBER = 1;
    private int messageId_;
    /**
     * <code>fixed32 message_id = 1;</code>
     */
    public int getMessageId() {
      return messageId_;
    }

    public static final int MESSAGE_LENGTH_FIELD_NUMBER = 2;
    private int messageLength_;
    /**
     * <code>fixed32 message_length = 2;</code>
     */
    public int getMessageLength() {
      return messageLength_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (messageId_ != 0) {
        output.writeFixed32(1, messageId_);
      }
      if (messageLength_ != 0) {
        output.writeFixed32(2, messageLength_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (messageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(1, messageId_);
      }
      if (messageLength_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(2, messageLength_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Header)) {
        return super.equals(obj);
      }
      Header other = (Header) obj;

      boolean result = true;
      result = result && (getMessageId()
          == other.getMessageId());
      result = result && (getMessageLength()
          == other.getMessageLength());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + MESSAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMessageId();
      hash = (37 * hash) + MESSAGE_LENGTH_FIELD_NUMBER;
      hash = (53 * hash) + getMessageLength();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Header parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Header parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Header parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Header parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Header parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Header parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Header parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Header parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Header parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Header parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Header parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Header parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Header prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Header}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Header)
        HeaderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HeaderProtos.internal_static_Header_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HeaderProtos.internal_static_Header_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Header.class, Builder.class);
      }

      // Construct using robor.forestfireboundaries.protobuf.HeaderProtos.Header.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        messageId_ = 0;

        messageLength_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HeaderProtos.internal_static_Header_descriptor;
      }

      public Header getDefaultInstanceForType() {
        return Header.getDefaultInstance();
      }

      public Header build() {
        Header result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Header buildPartial() {
        Header result = new Header(this);
        result.messageId_ = messageId_;
        result.messageLength_ = messageLength_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Header) {
          return mergeFrom((Header)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Header other) {
        if (other == Header.getDefaultInstance()) return this;
        if (other.getMessageId() != 0) {
          setMessageId(other.getMessageId());
        }
        if (other.getMessageLength() != 0) {
          setMessageLength(other.getMessageLength());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Header parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Header) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int messageId_ ;
      /**
       * <code>fixed32 message_id = 1;</code>
       */
      public int getMessageId() {
        return messageId_;
      }
      /**
       * <code>fixed32 message_id = 1;</code>
       */
      public Builder setMessageId(int value) {
        
        messageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 message_id = 1;</code>
       */
      public Builder clearMessageId() {
        
        messageId_ = 0;
        onChanged();
        return this;
      }

      private int messageLength_ ;
      /**
       * <code>fixed32 message_length = 2;</code>
       */
      public int getMessageLength() {
        return messageLength_;
      }
      /**
       * <code>fixed32 message_length = 2;</code>
       */
      public Builder setMessageLength(int value) {
        
        messageLength_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 message_length = 2;</code>
       */
      public Builder clearMessageLength() {
        
        messageLength_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Header)
    }

    // @@protoc_insertion_point(class_scope:Header)
    private static final Header DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Header();
    }

    public static Header getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Header>
        PARSER = new com.google.protobuf.AbstractParser<Header>() {
      public Header parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Header(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Header> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Header> getParserForType() {
      return PARSER;
    }

    public Header getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Header_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Header_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\014header.proto\"4\n\006Header\022\022\n\nmessage_id\030\001" +
      " \001(\007\022\026\n\016message_length\030\002 \001(\007B3\n#robor.fo" +
      "restfireboundaries.protobufB\014HeaderProto" +
      "sb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Header_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Header_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Header_descriptor,
        new String[] { "MessageId", "MessageLength", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}