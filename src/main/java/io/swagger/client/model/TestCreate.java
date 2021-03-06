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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * TestCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-04-16T09:41:51.665+02:00[Europe/Paris]")


public class TestCreate {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("controllerZoneId")
  private String controllerZoneId = null;

  @SerializedName("lgZoneIds")
  private Map<String, Integer> lgZoneIds = null;

  @SerializedName("testResultNamingPattern")
  private String testResultNamingPattern = null;

  public TestCreate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the test.
   * @return name
  **/
  @Schema(example = "New Test 1", description = "Name of the test.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TestCreate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the test.
   * @return description
  **/
  @Schema(example = "My description", description = "Description of the test.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TestCreate controllerZoneId(String controllerZoneId) {
    this.controllerZoneId = controllerZoneId;
    return this;
  }

   /**
   * The identifier of the controller.
   * @return controllerZoneId
  **/
  @Schema(example = "defaultzone", description = "The identifier of the controller.")
  public String getControllerZoneId() {
    return controllerZoneId;
  }

  public void setControllerZoneId(String controllerZoneId) {
    this.controllerZoneId = controllerZoneId;
  }

  public TestCreate lgZoneIds(Map<String, Integer> lgZoneIds) {
    this.lgZoneIds = lgZoneIds;
    return this;
  }

  public TestCreate putLgZoneIdsItem(String key, Integer lgZoneIdsItem) {
    if (this.lgZoneIds == null) {
      this.lgZoneIds = new HashMap<String, Integer>();
    }
    this.lgZoneIds.put(key, lgZoneIdsItem);
    return this;
  }

   /**
   * The LG zones with the number of the LGs.
   * @return lgZoneIds
  **/
  @Schema(example = "{\"defaultzone\":10,\"ZoneId\":5}", description = "The LG zones with the number of the LGs.")
  public Map<String, Integer> getLgZoneIds() {
    return lgZoneIds;
  }

  public void setLgZoneIds(Map<String, Integer> lgZoneIds) {
    this.lgZoneIds = lgZoneIds;
  }

  public TestCreate testResultNamingPattern(String testResultNamingPattern) {
    this.testResultNamingPattern = testResultNamingPattern;
    return this;
  }

   /**
   * Pattern of the test results name.
   * @return testResultNamingPattern
  **/
  @Schema(example = "#${runID}", description = "Pattern of the test results name.")
  public String getTestResultNamingPattern() {
    return testResultNamingPattern;
  }

  public void setTestResultNamingPattern(String testResultNamingPattern) {
    this.testResultNamingPattern = testResultNamingPattern;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestCreate testCreate = (TestCreate) o;
    return Objects.equals(this.name, testCreate.name) &&
        Objects.equals(this.description, testCreate.description) &&
        Objects.equals(this.controllerZoneId, testCreate.controllerZoneId) &&
        Objects.equals(this.lgZoneIds, testCreate.lgZoneIds) &&
        Objects.equals(this.testResultNamingPattern, testCreate.testResultNamingPattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, controllerZoneId, lgZoneIds, testResultNamingPattern);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestCreate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    controllerZoneId: ").append(toIndentedString(controllerZoneId)).append("\n");
    sb.append("    lgZoneIds: ").append(toIndentedString(lgZoneIds)).append("\n");
    sb.append("    testResultNamingPattern: ").append(toIndentedString(testResultNamingPattern)).append("\n");
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
