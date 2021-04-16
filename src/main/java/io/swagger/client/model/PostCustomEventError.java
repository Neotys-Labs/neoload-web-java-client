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
/**
 * - HTTP 400 | Code: 400 | Message : Error while parsing json body for custom event. - HTTP 400 | Code: 401 | Message : Bench did not start yet. - HTTP 400 | Code: 402 | Message : Event start timestamp is before bench start timestamp. - HTTP 400 | Code: 403 | Message : Event start timestamp is in the future. Make sure the timestamp is in seconds. - HTTP 400 | Code: 404 | Message : Event start timestamp is after the bench end timestamp. Make sure the timestamp is in seconds. - HTTP 400 | Code: 405 | Message : Event end timestamp is before the event start timestamp. - HTTP 400 | Code: 406 | Message : Event end timestamp is in the future. Make sure the timestamp is in seconds. - HTTP 400 | Code: 407 | Message : Event end timestamp is after the bench end timestamp. Make sure the timestamp is in seconds. - HTTP 400 | Code: 408 | Message : Event with INSTANT timeframe cannot have a end timestamp. - HTTP 400 | Code: 409 | Message : Event name is empty. - HTTP 400 | Code: 410 | Message : Event name is too long. - HTTP 400 | Code: 411 | Message : Event code is too long. - HTTP 400 | Code: 412 | Message : Event source is too long. - HTTP 400 | Code: 413 | Message : Event description is too long. - HTTP 400 | Code: 414 | Message : Event url is too long. - HTTP 400 | Code: 415 | Message : Max count of custom event reached. 
 */
@Schema(description = "- HTTP 400 | Code: 400 | Message : Error while parsing json body for custom event. - HTTP 400 | Code: 401 | Message : Bench did not start yet. - HTTP 400 | Code: 402 | Message : Event start timestamp is before bench start timestamp. - HTTP 400 | Code: 403 | Message : Event start timestamp is in the future. Make sure the timestamp is in seconds. - HTTP 400 | Code: 404 | Message : Event start timestamp is after the bench end timestamp. Make sure the timestamp is in seconds. - HTTP 400 | Code: 405 | Message : Event end timestamp is before the event start timestamp. - HTTP 400 | Code: 406 | Message : Event end timestamp is in the future. Make sure the timestamp is in seconds. - HTTP 400 | Code: 407 | Message : Event end timestamp is after the bench end timestamp. Make sure the timestamp is in seconds. - HTTP 400 | Code: 408 | Message : Event with INSTANT timeframe cannot have a end timestamp. - HTTP 400 | Code: 409 | Message : Event name is empty. - HTTP 400 | Code: 410 | Message : Event name is too long. - HTTP 400 | Code: 411 | Message : Event code is too long. - HTTP 400 | Code: 412 | Message : Event source is too long. - HTTP 400 | Code: 413 | Message : Event description is too long. - HTTP 400 | Code: 414 | Message : Event url is too long. - HTTP 400 | Code: 415 | Message : Max count of custom event reached. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-04-16T09:41:51.665+02:00[Europe/Paris]")


public class PostCustomEventError {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("message")
  private String message = null;

  public PostCustomEventError code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(example = "404", description = "")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public PostCustomEventError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(example = "Event start timestamp is after the bench end timestamp. Make sure the timestamp is in seconds.", description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCustomEventError postCustomEventError = (PostCustomEventError) o;
    return Objects.equals(this.code, postCustomEventError.code) &&
        Objects.equals(this.message, postCustomEventError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCustomEventError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
