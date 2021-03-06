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
 * TestResultStatistics
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-04-16T09:41:51.665+02:00[Europe/Paris]")


public class TestResultStatistics {
  @SerializedName("totalRequestCountSuccess")
  private Long totalRequestCountSuccess = null;

  @SerializedName("totalRequestCountFailure")
  private Long totalRequestCountFailure = null;

  @SerializedName("totalRequestDurationAverage")
  private Float totalRequestDurationAverage = null;

  @SerializedName("totalRequestCountPerSecond")
  private Float totalRequestCountPerSecond = null;

  @SerializedName("totalTransactionCountSuccess")
  private Long totalTransactionCountSuccess = null;

  @SerializedName("totalTransactionCountFailure")
  private Long totalTransactionCountFailure = null;

  @SerializedName("totalTransactionDurationAverage")
  private Float totalTransactionDurationAverage = null;

  @SerializedName("totalTransactionCountPerSecond")
  private Float totalTransactionCountPerSecond = null;

  @SerializedName("totalIterationCountSuccess")
  private Long totalIterationCountSuccess = null;

  @SerializedName("totalIterationCountFailure")
  private Long totalIterationCountFailure = null;

  @SerializedName("totalGlobalDownloadedBytes")
  private Long totalGlobalDownloadedBytes = null;

  @SerializedName("totalGlobalDownloadedBytesPerSecond")
  private Float totalGlobalDownloadedBytesPerSecond = null;

  @SerializedName("totalGlobalCountFailure")
  private Long totalGlobalCountFailure = null;

  @SerializedName("lastRequestCountPerSecond")
  private Float lastRequestCountPerSecond = null;

  @SerializedName("lastTransactionDurationAverage")
  private Float lastTransactionDurationAverage = null;

  @SerializedName("lastVirtualUserCount")
  private Integer lastVirtualUserCount = null;

  public TestResultStatistics totalRequestCountSuccess(Long totalRequestCountSuccess) {
    this.totalRequestCountSuccess = totalRequestCountSuccess;
    return this;
  }

   /**
   * Total number of requests in the scenario that did not encounter any error.
   * @return totalRequestCountSuccess
  **/
  @Schema(description = "Total number of requests in the scenario that did not encounter any error.")
  public Long getTotalRequestCountSuccess() {
    return totalRequestCountSuccess;
  }

  public void setTotalRequestCountSuccess(Long totalRequestCountSuccess) {
    this.totalRequestCountSuccess = totalRequestCountSuccess;
  }

  public TestResultStatistics totalRequestCountFailure(Long totalRequestCountFailure) {
    this.totalRequestCountFailure = totalRequestCountFailure;
    return this;
  }

   /**
   * Total number of requests in the scenario that encountered errors.
   * @return totalRequestCountFailure
  **/
  @Schema(description = "Total number of requests in the scenario that encountered errors.")
  public Long getTotalRequestCountFailure() {
    return totalRequestCountFailure;
  }

  public void setTotalRequestCountFailure(Long totalRequestCountFailure) {
    this.totalRequestCountFailure = totalRequestCountFailure;
  }

  public TestResultStatistics totalRequestDurationAverage(Float totalRequestDurationAverage) {
    this.totalRequestDurationAverage = totalRequestDurationAverage;
    return this;
  }

   /**
   * Average time in seconds for all requests of the scenario to be performed (from first byte sent to last byte received).
   * @return totalRequestDurationAverage
  **/
  @Schema(description = "Average time in seconds for all requests of the scenario to be performed (from first byte sent to last byte received).")
  public Float getTotalRequestDurationAverage() {
    return totalRequestDurationAverage;
  }

  public void setTotalRequestDurationAverage(Float totalRequestDurationAverage) {
    this.totalRequestDurationAverage = totalRequestDurationAverage;
  }

  public TestResultStatistics totalRequestCountPerSecond(Float totalRequestCountPerSecond) {
    this.totalRequestCountPerSecond = totalRequestCountPerSecond;
    return this;
  }

   /**
   * Total number of requests in the scenario that are performed per second.
   * @return totalRequestCountPerSecond
  **/
  @Schema(description = "Total number of requests in the scenario that are performed per second.")
  public Float getTotalRequestCountPerSecond() {
    return totalRequestCountPerSecond;
  }

  public void setTotalRequestCountPerSecond(Float totalRequestCountPerSecond) {
    this.totalRequestCountPerSecond = totalRequestCountPerSecond;
  }

  public TestResultStatistics totalTransactionCountSuccess(Long totalTransactionCountSuccess) {
    this.totalTransactionCountSuccess = totalTransactionCountSuccess;
    return this;
  }

   /**
   * Total number of the scenario Transactions executed without encountering any error.
   * @return totalTransactionCountSuccess
  **/
  @Schema(description = "Total number of the scenario Transactions executed without encountering any error.")
  public Long getTotalTransactionCountSuccess() {
    return totalTransactionCountSuccess;
  }

  public void setTotalTransactionCountSuccess(Long totalTransactionCountSuccess) {
    this.totalTransactionCountSuccess = totalTransactionCountSuccess;
  }

  public TestResultStatistics totalTransactionCountFailure(Long totalTransactionCountFailure) {
    this.totalTransactionCountFailure = totalTransactionCountFailure;
    return this;
  }

   /**
   * Total number of the scenario Transactions executed with errors.
   * @return totalTransactionCountFailure
  **/
  @Schema(description = "Total number of the scenario Transactions executed with errors.")
  public Long getTotalTransactionCountFailure() {
    return totalTransactionCountFailure;
  }

  public void setTotalTransactionCountFailure(Long totalTransactionCountFailure) {
    this.totalTransactionCountFailure = totalTransactionCountFailure;
  }

  public TestResultStatistics totalTransactionDurationAverage(Float totalTransactionDurationAverage) {
    this.totalTransactionDurationAverage = totalTransactionDurationAverage;
    return this;
  }

   /**
   * Average time in seconds for all Transactions of the scenario to be executed.
   * @return totalTransactionDurationAverage
  **/
  @Schema(description = "Average time in seconds for all Transactions of the scenario to be executed.")
  public Float getTotalTransactionDurationAverage() {
    return totalTransactionDurationAverage;
  }

  public void setTotalTransactionDurationAverage(Float totalTransactionDurationAverage) {
    this.totalTransactionDurationAverage = totalTransactionDurationAverage;
  }

  public TestResultStatistics totalTransactionCountPerSecond(Float totalTransactionCountPerSecond) {
    this.totalTransactionCountPerSecond = totalTransactionCountPerSecond;
    return this;
  }

   /**
   * Total number of the scenario Transactions executed per second.
   * @return totalTransactionCountPerSecond
  **/
  @Schema(description = "Total number of the scenario Transactions executed per second.")
  public Float getTotalTransactionCountPerSecond() {
    return totalTransactionCountPerSecond;
  }

  public void setTotalTransactionCountPerSecond(Float totalTransactionCountPerSecond) {
    this.totalTransactionCountPerSecond = totalTransactionCountPerSecond;
  }

  public TestResultStatistics totalIterationCountSuccess(Long totalIterationCountSuccess) {
    this.totalIterationCountSuccess = totalIterationCountSuccess;
    return this;
  }

   /**
   * Total number of times when the &#x27;Actions&#x27; Container was run for each Virtual User without encountering any error.
   * @return totalIterationCountSuccess
  **/
  @Schema(description = "Total number of times when the 'Actions' Container was run for each Virtual User without encountering any error.")
  public Long getTotalIterationCountSuccess() {
    return totalIterationCountSuccess;
  }

  public void setTotalIterationCountSuccess(Long totalIterationCountSuccess) {
    this.totalIterationCountSuccess = totalIterationCountSuccess;
  }

  public TestResultStatistics totalIterationCountFailure(Long totalIterationCountFailure) {
    this.totalIterationCountFailure = totalIterationCountFailure;
    return this;
  }

   /**
   * Total number of times when the &#x27;Actions&#x27; Container was run for each Virtual User and encountered an error.
   * @return totalIterationCountFailure
  **/
  @Schema(description = "Total number of times when the 'Actions' Container was run for each Virtual User and encountered an error.")
  public Long getTotalIterationCountFailure() {
    return totalIterationCountFailure;
  }

  public void setTotalIterationCountFailure(Long totalIterationCountFailure) {
    this.totalIterationCountFailure = totalIterationCountFailure;
  }

  public TestResultStatistics totalGlobalDownloadedBytes(Long totalGlobalDownloadedBytes) {
    this.totalGlobalDownloadedBytes = totalGlobalDownloadedBytes;
    return this;
  }

   /**
   * Total size of http traffic received in bytes.
   * @return totalGlobalDownloadedBytes
  **/
  @Schema(description = "Total size of http traffic received in bytes.")
  public Long getTotalGlobalDownloadedBytes() {
    return totalGlobalDownloadedBytes;
  }

  public void setTotalGlobalDownloadedBytes(Long totalGlobalDownloadedBytes) {
    this.totalGlobalDownloadedBytes = totalGlobalDownloadedBytes;
  }

  public TestResultStatistics totalGlobalDownloadedBytesPerSecond(Float totalGlobalDownloadedBytesPerSecond) {
    this.totalGlobalDownloadedBytesPerSecond = totalGlobalDownloadedBytesPerSecond;
    return this;
  }

   /**
   * Average size of http traffic received in bytes per second.
   * @return totalGlobalDownloadedBytesPerSecond
  **/
  @Schema(description = "Average size of http traffic received in bytes per second.")
  public Float getTotalGlobalDownloadedBytesPerSecond() {
    return totalGlobalDownloadedBytesPerSecond;
  }

  public void setTotalGlobalDownloadedBytesPerSecond(Float totalGlobalDownloadedBytesPerSecond) {
    this.totalGlobalDownloadedBytesPerSecond = totalGlobalDownloadedBytesPerSecond;
  }

  public TestResultStatistics totalGlobalCountFailure(Long totalGlobalCountFailure) {
    this.totalGlobalCountFailure = totalGlobalCountFailure;
    return this;
  }

   /**
   * Get totalGlobalCountFailure
   * @return totalGlobalCountFailure
  **/
  @Schema(description = "")
  public Long getTotalGlobalCountFailure() {
    return totalGlobalCountFailure;
  }

  public void setTotalGlobalCountFailure(Long totalGlobalCountFailure) {
    this.totalGlobalCountFailure = totalGlobalCountFailure;
  }

  public TestResultStatistics lastRequestCountPerSecond(Float lastRequestCountPerSecond) {
    this.lastRequestCountPerSecond = lastRequestCountPerSecond;
    return this;
  }

   /**
   * Last value received for the number of requests in the scenario that are performed per second.
   * @return lastRequestCountPerSecond
  **/
  @Schema(description = "Last value received for the number of requests in the scenario that are performed per second.")
  public Float getLastRequestCountPerSecond() {
    return lastRequestCountPerSecond;
  }

  public void setLastRequestCountPerSecond(Float lastRequestCountPerSecond) {
    this.lastRequestCountPerSecond = lastRequestCountPerSecond;
  }

  public TestResultStatistics lastTransactionDurationAverage(Float lastTransactionDurationAverage) {
    this.lastTransactionDurationAverage = lastTransactionDurationAverage;
    return this;
  }

   /**
   * Last value received for the average time in milliseconds for all Transactions of the scenario.
   * @return lastTransactionDurationAverage
  **/
  @Schema(description = "Last value received for the average time in milliseconds for all Transactions of the scenario.")
  public Float getLastTransactionDurationAverage() {
    return lastTransactionDurationAverage;
  }

  public void setLastTransactionDurationAverage(Float lastTransactionDurationAverage) {
    this.lastTransactionDurationAverage = lastTransactionDurationAverage;
  }

  public TestResultStatistics lastVirtualUserCount(Integer lastVirtualUserCount) {
    this.lastVirtualUserCount = lastVirtualUserCount;
    return this;
  }

   /**
   * Last value received for the total number of Virtual Users executed in the test.
   * @return lastVirtualUserCount
  **/
  @Schema(description = "Last value received for the total number of Virtual Users executed in the test.")
  public Integer getLastVirtualUserCount() {
    return lastVirtualUserCount;
  }

  public void setLastVirtualUserCount(Integer lastVirtualUserCount) {
    this.lastVirtualUserCount = lastVirtualUserCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultStatistics testResultStatistics = (TestResultStatistics) o;
    return Objects.equals(this.totalRequestCountSuccess, testResultStatistics.totalRequestCountSuccess) &&
        Objects.equals(this.totalRequestCountFailure, testResultStatistics.totalRequestCountFailure) &&
        Objects.equals(this.totalRequestDurationAverage, testResultStatistics.totalRequestDurationAverage) &&
        Objects.equals(this.totalRequestCountPerSecond, testResultStatistics.totalRequestCountPerSecond) &&
        Objects.equals(this.totalTransactionCountSuccess, testResultStatistics.totalTransactionCountSuccess) &&
        Objects.equals(this.totalTransactionCountFailure, testResultStatistics.totalTransactionCountFailure) &&
        Objects.equals(this.totalTransactionDurationAverage, testResultStatistics.totalTransactionDurationAverage) &&
        Objects.equals(this.totalTransactionCountPerSecond, testResultStatistics.totalTransactionCountPerSecond) &&
        Objects.equals(this.totalIterationCountSuccess, testResultStatistics.totalIterationCountSuccess) &&
        Objects.equals(this.totalIterationCountFailure, testResultStatistics.totalIterationCountFailure) &&
        Objects.equals(this.totalGlobalDownloadedBytes, testResultStatistics.totalGlobalDownloadedBytes) &&
        Objects.equals(this.totalGlobalDownloadedBytesPerSecond, testResultStatistics.totalGlobalDownloadedBytesPerSecond) &&
        Objects.equals(this.totalGlobalCountFailure, testResultStatistics.totalGlobalCountFailure) &&
        Objects.equals(this.lastRequestCountPerSecond, testResultStatistics.lastRequestCountPerSecond) &&
        Objects.equals(this.lastTransactionDurationAverage, testResultStatistics.lastTransactionDurationAverage) &&
        Objects.equals(this.lastVirtualUserCount, testResultStatistics.lastVirtualUserCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRequestCountSuccess, totalRequestCountFailure, totalRequestDurationAverage, totalRequestCountPerSecond, totalTransactionCountSuccess, totalTransactionCountFailure, totalTransactionDurationAverage, totalTransactionCountPerSecond, totalIterationCountSuccess, totalIterationCountFailure, totalGlobalDownloadedBytes, totalGlobalDownloadedBytesPerSecond, totalGlobalCountFailure, lastRequestCountPerSecond, lastTransactionDurationAverage, lastVirtualUserCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestResultStatistics {\n");
    
    sb.append("    totalRequestCountSuccess: ").append(toIndentedString(totalRequestCountSuccess)).append("\n");
    sb.append("    totalRequestCountFailure: ").append(toIndentedString(totalRequestCountFailure)).append("\n");
    sb.append("    totalRequestDurationAverage: ").append(toIndentedString(totalRequestDurationAverage)).append("\n");
    sb.append("    totalRequestCountPerSecond: ").append(toIndentedString(totalRequestCountPerSecond)).append("\n");
    sb.append("    totalTransactionCountSuccess: ").append(toIndentedString(totalTransactionCountSuccess)).append("\n");
    sb.append("    totalTransactionCountFailure: ").append(toIndentedString(totalTransactionCountFailure)).append("\n");
    sb.append("    totalTransactionDurationAverage: ").append(toIndentedString(totalTransactionDurationAverage)).append("\n");
    sb.append("    totalTransactionCountPerSecond: ").append(toIndentedString(totalTransactionCountPerSecond)).append("\n");
    sb.append("    totalIterationCountSuccess: ").append(toIndentedString(totalIterationCountSuccess)).append("\n");
    sb.append("    totalIterationCountFailure: ").append(toIndentedString(totalIterationCountFailure)).append("\n");
    sb.append("    totalGlobalDownloadedBytes: ").append(toIndentedString(totalGlobalDownloadedBytes)).append("\n");
    sb.append("    totalGlobalDownloadedBytesPerSecond: ").append(toIndentedString(totalGlobalDownloadedBytesPerSecond)).append("\n");
    sb.append("    totalGlobalCountFailure: ").append(toIndentedString(totalGlobalCountFailure)).append("\n");
    sb.append("    lastRequestCountPerSecond: ").append(toIndentedString(lastRequestCountPerSecond)).append("\n");
    sb.append("    lastTransactionDurationAverage: ").append(toIndentedString(lastTransactionDurationAverage)).append("\n");
    sb.append("    lastVirtualUserCount: ").append(toIndentedString(lastVirtualUserCount)).append("\n");
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
