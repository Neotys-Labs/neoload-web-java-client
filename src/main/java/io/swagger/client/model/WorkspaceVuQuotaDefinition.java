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
 * Quotas assigned to Workspace
 */
@Schema(description = "Quotas assigned to Workspace")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-04-16T09:41:51.665+02:00[Europe/Paris]")


public class WorkspaceVuQuotaDefinition {
  @SerializedName("citrix")
  private Integer citrix = null;

  @SerializedName("sap")
  private Integer sap = null;

  @SerializedName("unlimited")
  private Boolean unlimited = null;

  @SerializedName("web")
  private Integer web = null;

  public WorkspaceVuQuotaDefinition citrix(Integer citrix) {
    this.citrix = citrix;
    return this;
  }

   /**
   * Citrix quota
   * @return citrix
  **/
  @Schema(description = "Citrix quota")
  public Integer getCitrix() {
    return citrix;
  }

  public void setCitrix(Integer citrix) {
    this.citrix = citrix;
  }

  public WorkspaceVuQuotaDefinition sap(Integer sap) {
    this.sap = sap;
    return this;
  }

   /**
   * SAP quota
   * @return sap
  **/
  @Schema(description = "SAP quota")
  public Integer getSap() {
    return sap;
  }

  public void setSap(Integer sap) {
    this.sap = sap;
  }

  public WorkspaceVuQuotaDefinition unlimited(Boolean unlimited) {
    this.unlimited = unlimited;
    return this;
  }

   /**
   * True if quotas are unlimited
   * @return unlimited
  **/
  @Schema(description = "True if quotas are unlimited")
  public Boolean isUnlimited() {
    return unlimited;
  }

  public void setUnlimited(Boolean unlimited) {
    this.unlimited = unlimited;
  }

  public WorkspaceVuQuotaDefinition web(Integer web) {
    this.web = web;
    return this;
  }

   /**
   * Web quota
   * @return web
  **/
  @Schema(description = "Web quota")
  public Integer getWeb() {
    return web;
  }

  public void setWeb(Integer web) {
    this.web = web;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceVuQuotaDefinition workspaceVuQuotaDefinition = (WorkspaceVuQuotaDefinition) o;
    return Objects.equals(this.citrix, workspaceVuQuotaDefinition.citrix) &&
        Objects.equals(this.sap, workspaceVuQuotaDefinition.sap) &&
        Objects.equals(this.unlimited, workspaceVuQuotaDefinition.unlimited) &&
        Objects.equals(this.web, workspaceVuQuotaDefinition.web);
  }

  @Override
  public int hashCode() {
    return Objects.hash(citrix, sap, unlimited, web);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceVuQuotaDefinition {\n");
    
    sb.append("    citrix: ").append(toIndentedString(citrix)).append("\n");
    sb.append("    sap: ").append(toIndentedString(sap)).append("\n");
    sb.append("    unlimited: ").append(toIndentedString(unlimited)).append("\n");
    sb.append("    web: ").append(toIndentedString(web)).append("\n");
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