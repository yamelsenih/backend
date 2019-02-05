// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dictionary.proto

package org.spin.grpc.util;

public interface MenuOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dictionary.Menu)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>string uuid = 2;</code>
   */
  java.lang.String getUuid();
  /**
   * <code>string uuid = 2;</code>
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <code>string parentUuid = 4;</code>
   */
  java.lang.String getParentUuid();
  /**
   * <code>string parentUuid = 4;</code>
   */
  com.google.protobuf.ByteString
      getParentUuidBytes();

  /**
   * <code>string name = 5;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 5;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 6;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 6;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string sequence = 7;</code>
   */
  java.lang.String getSequence();
  /**
   * <code>string sequence = 7;</code>
   */
  com.google.protobuf.ByteString
      getSequenceBytes();

  /**
   * <code>bool isReadOnly = 8;</code>
   */
  boolean getIsReadOnly();

  /**
   * <code>bool isSummary = 9;</code>
   */
  boolean getIsSummary();

  /**
   * <code>bool isSOTrx = 10;</code>
   */
  boolean getIsSOTrx();

  /**
   * <code>string action = 11;</code>
   */
  java.lang.String getAction();
  /**
   * <code>string action = 11;</code>
   */
  com.google.protobuf.ByteString
      getActionBytes();

  /**
   * <pre>
   * Supported References
   * </pre>
   *
   * <code>string formUuid = 12;</code>
   */
  java.lang.String getFormUuid();
  /**
   * <pre>
   * Supported References
   * </pre>
   *
   * <code>string formUuid = 12;</code>
   */
  com.google.protobuf.ByteString
      getFormUuidBytes();

  /**
   * <code>string windowUuid = 13;</code>
   */
  java.lang.String getWindowUuid();
  /**
   * <code>string windowUuid = 13;</code>
   */
  com.google.protobuf.ByteString
      getWindowUuidBytes();

  /**
   * <code>string processUuid = 14;</code>
   */
  java.lang.String getProcessUuid();
  /**
   * <code>string processUuid = 14;</code>
   */
  com.google.protobuf.ByteString
      getProcessUuidBytes();

  /**
   * <code>string smartBrowserUuid = 15;</code>
   */
  java.lang.String getSmartBrowserUuid();
  /**
   * <code>string smartBrowserUuid = 15;</code>
   */
  com.google.protobuf.ByteString
      getSmartBrowserUuidBytes();

  /**
   * <code>repeated .dictionary.Menu childs = 16;</code>
   */
  java.util.List<org.spin.grpc.util.Menu> 
      getChildsList();
  /**
   * <code>repeated .dictionary.Menu childs = 16;</code>
   */
  org.spin.grpc.util.Menu getChilds(int index);
  /**
   * <code>repeated .dictionary.Menu childs = 16;</code>
   */
  int getChildsCount();
  /**
   * <code>repeated .dictionary.Menu childs = 16;</code>
   */
  java.util.List<? extends org.spin.grpc.util.MenuOrBuilder> 
      getChildsOrBuilderList();
  /**
   * <code>repeated .dictionary.Menu childs = 16;</code>
   */
  org.spin.grpc.util.MenuOrBuilder getChildsOrBuilder(
      int index);
}
