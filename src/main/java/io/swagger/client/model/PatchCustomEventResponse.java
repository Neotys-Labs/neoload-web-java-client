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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * PatchCustomEventResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-04-16T09:41:51.665+02:00[Europe/Paris]")


public class PatchCustomEventResponse {
  @SerializedName("id")
  private String id = null;

  @SerializedName("offset")
  private BigDecimal offset = null;

  @SerializedName("duration")
  private BigDecimal duration = null;

  /**
   * Gets or Sets timeframe
   */
  @JsonAdapter(TimeframeEnum.Adapter.class)
  public enum TimeframeEnum {
    TIME_RANGE("TIME_RANGE"),
    INSTANT("INSTANT");

    private String value;

    TimeframeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TimeframeEnum fromValue(String text) {
      for (TimeframeEnum b : TimeframeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TimeframeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeframeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimeframeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TimeframeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("timeframe")
  private TimeframeEnum timeframe = TimeframeEnum.TIME_RANGE;

  @SerializedName("fullname")
  private String fullname = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("url")
  private String url = null;

  public PatchCustomEventResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the custom event patched.
   * @return id
  **/
  @Schema(description = "The unique ID of the custom event patched.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PatchCustomEventResponse offset(BigDecimal offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Custom event start timestamp in milliseconds, relative to bench start timestamp.
   * @return offset
  **/
  @Schema(example = "1000", description = "Custom event start timestamp in milliseconds, relative to bench start timestamp.")
  public BigDecimal getOffset() {
    return offset;
  }

  public void setOffset(BigDecimal offset) {
    this.offset = offset;
  }

  public PatchCustomEventResponse duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Custom event duration in milliseconds.
   * @return duration
  **/
  @Schema(example = "1000", description = "Custom event duration in milliseconds.")
  public BigDecimal getDuration() {
    return duration;
  }

  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

  public PatchCustomEventResponse timeframe(TimeframeEnum timeframe) {
    this.timeframe = timeframe;
    return this;
  }

   /**
   * Get timeframe
   * @return timeframe
  **/
  @Schema(description = "")
  public TimeframeEnum getTimeframe() {
    return timeframe;
  }

  public void setTimeframe(TimeframeEnum timeframe) {
    this.timeframe = timeframe;
  }

  public PatchCustomEventResponse fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

   /**
   * Custom event name. Max length 256 chars.
   * @return fullname
  **/
  @Schema(example = "myCustomEvent", description = "Custom event name. Max length 256 chars.")
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public PatchCustomEventResponse code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Custom event code. Max length 64 chars.
   * @return code
  **/
  @Schema(example = "Application Error", description = "Custom event code. Max length 64 chars.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PatchCustomEventResponse source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Custom event source. Max length 32 chars.
   * @return source
  **/
  @Schema(example = "APM", description = "Custom event source. Max length 32 chars.")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public PatchCustomEventResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Custom event description. Max length 512 chars.
   * @return description
  **/
  @Schema(description = "Custom event description. Max length 512 chars.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PatchCustomEventResponse url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Custom event URL. Max length 2048 chars.
   * @return url
  **/
  @Schema(description = "Custom event URL. Max length 2048 chars.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchCustomEventResponse patchCustomEventResponse = (PatchCustomEventResponse) o;
    return Objects.equals(this.id, patchCustomEventResponse.id) &&
        Objects.equals(this.offset, patchCustomEventResponse.offset) &&
        Objects.equals(this.duration, patchCustomEventResponse.duration) &&
        Objects.equals(this.timeframe, patchCustomEventResponse.timeframe) &&
        Objects.equals(this.fullname, patchCustomEventResponse.fullname) &&
        Objects.equals(this.code, patchCustomEventResponse.code) &&
        Objects.equals(this.source, patchCustomEventResponse.source) &&
        Objects.equals(this.description, patchCustomEventResponse.description) &&
        Objects.equals(this.url, patchCustomEventResponse.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, offset, duration, timeframe, fullname, code, source, description, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchCustomEventResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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