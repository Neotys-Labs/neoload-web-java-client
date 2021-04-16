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
import io.swagger.client.model.WorkspaceVuQuotaDefinition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * WorkspaceCreateRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-04-16T09:41:51.665+02:00[Europe/Paris]")


public class WorkspaceCreateRequest {
  @SerializedName("allUsersEnabled")
  private Boolean allUsersEnabled = false;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("vuQuota")
  private WorkspaceVuQuotaDefinition vuQuota = null;

  public WorkspaceCreateRequest allUsersEnabled(Boolean allUsersEnabled) {
    this.allUsersEnabled = allUsersEnabled;
    return this;
  }

   /**
   * True if all users of the Workspace are enabled
   * @return allUsersEnabled
  **/
  @Schema(description = "True if all users of the Workspace are enabled")
  public Boolean isAllUsersEnabled() {
    return allUsersEnabled;
  }

  public void setAllUsersEnabled(Boolean allUsersEnabled) {
    this.allUsersEnabled = allUsersEnabled;
  }

  public WorkspaceCreateRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the Workspace
   * @return description
  **/
  @Schema(example = "Workspace description", description = "Description of the Workspace")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WorkspaceCreateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the Workspace
   * @return name
  **/
  @Schema(example = "My first Workspace", required = true, description = "Name of the Workspace")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkspaceCreateRequest vuQuota(WorkspaceVuQuotaDefinition vuQuota) {
    this.vuQuota = vuQuota;
    return this;
  }

   /**
   * Get vuQuota
   * @return vuQuota
  **/
  @Schema(description = "")
  public WorkspaceVuQuotaDefinition getVuQuota() {
    return vuQuota;
  }

  public void setVuQuota(WorkspaceVuQuotaDefinition vuQuota) {
    this.vuQuota = vuQuota;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceCreateRequest workspaceCreateRequest = (WorkspaceCreateRequest) o;
    return Objects.equals(this.allUsersEnabled, workspaceCreateRequest.allUsersEnabled) &&
        Objects.equals(this.description, workspaceCreateRequest.description) &&
        Objects.equals(this.name, workspaceCreateRequest.name) &&
        Objects.equals(this.vuQuota, workspaceCreateRequest.vuQuota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allUsersEnabled, description, name, vuQuota);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceCreateRequest {\n");
    
    sb.append("    allUsersEnabled: ").append(toIndentedString(allUsersEnabled)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vuQuota: ").append(toIndentedString(vuQuota)).append("\n");
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