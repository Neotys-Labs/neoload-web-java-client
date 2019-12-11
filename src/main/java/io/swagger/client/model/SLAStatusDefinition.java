/*
 * NeoLoad API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Status of the SLA
 */
@JsonAdapter(SLAStatusDefinition.Adapter.class)
public enum SLAStatusDefinition {
  PASSED("PASSED"),
  WARNING("WARNING"),
  FAILED("FAILED");

  private String value;

  SLAStatusDefinition(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SLAStatusDefinition fromValue(String text) {
    for (SLAStatusDefinition b : SLAStatusDefinition.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SLAStatusDefinition> {
    @Override
    public void write(final JsonWriter jsonWriter, final SLAStatusDefinition enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SLAStatusDefinition read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SLAStatusDefinition.fromValue(String.valueOf(value));
    }
  }
}
