/*
 * NeoLoad API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.EventType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
/**
 * EventDefinition
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-12T09:30:22.329+02:00[Europe/Paris]")


public class EventDefinition {
  @SerializedName("id")
  private String id = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("elementid")
  private UUID elementid = null;

  @SerializedName("fullname")
  private String fullname = null;

  @SerializedName("offset")
  private Long offset = null;

  @SerializedName("type")
  private EventType type = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("source")
  private String source = null;

  public EventDefinition id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EventDefinition code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public EventDefinition elementid(UUID elementid) {
    this.elementid = elementid;
    return this;
  }

   /**
   * Get elementid
   * @return elementid
  **/
  @Schema(description = "")
  public UUID getElementid() {
    return elementid;
  }

  public void setElementid(UUID elementid) {
    this.elementid = elementid;
  }

  public EventDefinition fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

   /**
   * Get fullname
   * @return fullname
  **/
  @Schema(description = "")
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public EventDefinition offset(Long offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @Schema(description = "")
  public Long getOffset() {
    return offset;
  }

  public void setOffset(Long offset) {
    this.offset = offset;
  }

  public EventDefinition type(EventType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public EventType getType() {
    return type;
  }

  public void setType(EventType type) {
    this.type = type;
  }

  public EventDefinition duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @Schema(description = "")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public EventDefinition source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventDefinition eventDefinition = (EventDefinition) o;
    return Objects.equals(this.id, eventDefinition.id) &&
        Objects.equals(this.code, eventDefinition.code) &&
        Objects.equals(this.elementid, eventDefinition.elementid) &&
        Objects.equals(this.fullname, eventDefinition.fullname) &&
        Objects.equals(this.offset, eventDefinition.offset) &&
        Objects.equals(this.type, eventDefinition.type) &&
        Objects.equals(this.duration, eventDefinition.duration) &&
        Objects.equals(this.source, eventDefinition.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, elementid, fullname, offset, type, duration, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    elementid: ").append(toIndentedString(elementid)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
