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
import io.swagger.client.model.SLAElementDefinition;
import io.swagger.client.model.SLAKPIDefinition;
import io.swagger.client.model.SLAStatusDefinition;
import io.swagger.client.model.ThresholdDefinition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SLAPerIntervalDefinition
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-04-16T09:41:51.665+02:00[Europe/Paris]")


public class SLAPerIntervalDefinition {
  @SerializedName("kpi")
  private SLAKPIDefinition kpi = null;

  @SerializedName("status")
  private SLAStatusDefinition status = null;

  @SerializedName("warning")
  private Float warning = null;

  @SerializedName("warningThreshold")
  private ThresholdDefinition warningThreshold = null;

  @SerializedName("failed")
  private Float failed = null;

  @SerializedName("failedThreshold")
  private ThresholdDefinition failedThreshold = null;

  @SerializedName("element")
  private SLAElementDefinition element = null;

  public SLAPerIntervalDefinition kpi(SLAKPIDefinition kpi) {
    this.kpi = kpi;
    return this;
  }

   /**
   * Get kpi
   * @return kpi
  **/
  @Schema(description = "")
  public SLAKPIDefinition getKpi() {
    return kpi;
  }

  public void setKpi(SLAKPIDefinition kpi) {
    this.kpi = kpi;
  }

  public SLAPerIntervalDefinition status(SLAStatusDefinition status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public SLAStatusDefinition getStatus() {
    return status;
  }

  public void setStatus(SLAStatusDefinition status) {
    this.status = status;
  }

  public SLAPerIntervalDefinition warning(Float warning) {
    this.warning = warning;
    return this;
  }

   /**
   * Percentage of intervals warning
   * @return warning
  **/
  @Schema(description = "Percentage of intervals warning")
  public Float getWarning() {
    return warning;
  }

  public void setWarning(Float warning) {
    this.warning = warning;
  }

  public SLAPerIntervalDefinition warningThreshold(ThresholdDefinition warningThreshold) {
    this.warningThreshold = warningThreshold;
    return this;
  }

   /**
   * Get warningThreshold
   * @return warningThreshold
  **/
  @Schema(description = "")
  public ThresholdDefinition getWarningThreshold() {
    return warningThreshold;
  }

  public void setWarningThreshold(ThresholdDefinition warningThreshold) {
    this.warningThreshold = warningThreshold;
  }

  public SLAPerIntervalDefinition failed(Float failed) {
    this.failed = failed;
    return this;
  }

   /**
   * Percentage of intervals failed
   * @return failed
  **/
  @Schema(description = "Percentage of intervals failed")
  public Float getFailed() {
    return failed;
  }

  public void setFailed(Float failed) {
    this.failed = failed;
  }

  public SLAPerIntervalDefinition failedThreshold(ThresholdDefinition failedThreshold) {
    this.failedThreshold = failedThreshold;
    return this;
  }

   /**
   * Get failedThreshold
   * @return failedThreshold
  **/
  @Schema(description = "")
  public ThresholdDefinition getFailedThreshold() {
    return failedThreshold;
  }

  public void setFailedThreshold(ThresholdDefinition failedThreshold) {
    this.failedThreshold = failedThreshold;
  }

  public SLAPerIntervalDefinition element(SLAElementDefinition element) {
    this.element = element;
    return this;
  }

   /**
   * Get element
   * @return element
  **/
  @Schema(description = "")
  public SLAElementDefinition getElement() {
    return element;
  }

  public void setElement(SLAElementDefinition element) {
    this.element = element;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLAPerIntervalDefinition slAPerIntervalDefinition = (SLAPerIntervalDefinition) o;
    return Objects.equals(this.kpi, slAPerIntervalDefinition.kpi) &&
        Objects.equals(this.status, slAPerIntervalDefinition.status) &&
        Objects.equals(this.warning, slAPerIntervalDefinition.warning) &&
        Objects.equals(this.warningThreshold, slAPerIntervalDefinition.warningThreshold) &&
        Objects.equals(this.failed, slAPerIntervalDefinition.failed) &&
        Objects.equals(this.failedThreshold, slAPerIntervalDefinition.failedThreshold) &&
        Objects.equals(this.element, slAPerIntervalDefinition.element);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kpi, status, warning, warningThreshold, failed, failedThreshold, element);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLAPerIntervalDefinition {\n");
    
    sb.append("    kpi: ").append(toIndentedString(kpi)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
    sb.append("    warningThreshold: ").append(toIndentedString(warningThreshold)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    failedThreshold: ").append(toIndentedString(failedThreshold)).append("\n");
    sb.append("    element: ").append(toIndentedString(element)).append("\n");
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
