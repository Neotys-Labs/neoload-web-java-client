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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * TestCreated
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-04-16T09:41:51.665+02:00[Europe/Paris]")


public class TestCreated {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("userModifierName")
  private String userModifierName = null;

  @SerializedName("creationDate")
  private Long creationDate = null;

  @SerializedName("lastUpdateDate")
  private Long lastUpdateDate = null;

  @SerializedName("controllerZoneId")
  private String controllerZoneId = null;

  @SerializedName("lgZoneIds")
  private Map<String, Integer> lgZoneIds = null;

  @SerializedName("nextRunId")
  private BigDecimal nextRunId = null;

  @SerializedName("testResultNamingPattern")
  private String testResultNamingPattern = null;

  public TestCreated id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the test.
   * @return id
  **/
  @Schema(example = "5ed5350f-9f2f-4e2a-9acb-cdbcee874256", description = "Unique identifier of the test.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TestCreated name(String name) {
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

  public TestCreated description(String description) {
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

  public TestCreated userModifierName(String userModifierName) {
    this.userModifierName = userModifierName;
    return this;
  }

   /**
   * Identifier of the user who modified the test.
   * @return userModifierName
  **/
  @Schema(description = "Identifier of the user who modified the test.")
  public String getUserModifierName() {
    return userModifierName;
  }

  public void setUserModifierName(String userModifierName) {
    this.userModifierName = userModifierName;
  }

  public TestCreated creationDate(Long creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Timestamp when the test was created. Number of seconds since January 1, 1970.
   * @return creationDate
  **/
  @Schema(example = "1582550441", description = "Timestamp when the test was created. Number of seconds since January 1, 1970.")
  public Long getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Long creationDate) {
    this.creationDate = creationDate;
  }

  public TestCreated lastUpdateDate(Long lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
    return this;
  }

   /**
   * Timestamp when the test was updated for the last time. Number of seconds since January 1, 1970.
   * @return lastUpdateDate
  **/
  @Schema(example = "1582550442", description = "Timestamp when the test was updated for the last time. Number of seconds since January 1, 1970.")
  public Long getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(Long lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }

  public TestCreated controllerZoneId(String controllerZoneId) {
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

  public TestCreated lgZoneIds(Map<String, Integer> lgZoneIds) {
    this.lgZoneIds = lgZoneIds;
    return this;
  }

  public TestCreated putLgZoneIdsItem(String key, Integer lgZoneIdsItem) {
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

  public TestCreated nextRunId(BigDecimal nextRunId) {
    this.nextRunId = nextRunId;
    return this;
  }

   /**
   * The next run number. The value is incremented at each execution of the test.
   * @return nextRunId
  **/
  @Schema(description = "The next run number. The value is incremented at each execution of the test.")
  public BigDecimal getNextRunId() {
    return nextRunId;
  }

  public void setNextRunId(BigDecimal nextRunId) {
    this.nextRunId = nextRunId;
  }

  public TestCreated testResultNamingPattern(String testResultNamingPattern) {
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
    TestCreated testCreated = (TestCreated) o;
    return Objects.equals(this.id, testCreated.id) &&
        Objects.equals(this.name, testCreated.name) &&
        Objects.equals(this.description, testCreated.description) &&
        Objects.equals(this.userModifierName, testCreated.userModifierName) &&
        Objects.equals(this.creationDate, testCreated.creationDate) &&
        Objects.equals(this.lastUpdateDate, testCreated.lastUpdateDate) &&
        Objects.equals(this.controllerZoneId, testCreated.controllerZoneId) &&
        Objects.equals(this.lgZoneIds, testCreated.lgZoneIds) &&
        Objects.equals(this.nextRunId, testCreated.nextRunId) &&
        Objects.equals(this.testResultNamingPattern, testCreated.testResultNamingPattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, userModifierName, creationDate, lastUpdateDate, controllerZoneId, lgZoneIds, nextRunId, testResultNamingPattern);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestCreated {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    userModifierName: ").append(toIndentedString(userModifierName)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastUpdateDate: ").append(toIndentedString(lastUpdateDate)).append("\n");
    sb.append("    controllerZoneId: ").append(toIndentedString(controllerZoneId)).append("\n");
    sb.append("    lgZoneIds: ").append(toIndentedString(lgZoneIds)).append("\n");
    sb.append("    nextRunId: ").append(toIndentedString(nextRunId)).append("\n");
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
