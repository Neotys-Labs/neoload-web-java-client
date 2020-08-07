# WorkspacesApi

All URIs are relative to *https://your-hostname.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWorkspaceList**](WorkspacesApi.md#getWorkspaceList) | **GET** /workspaces | Get the list workspaces that can be accessed

<a name="getWorkspaceList"></a>
# **getWorkspaceList**
> WorkspaceDefinitionList getWorkspaceList()

Get the list workspaces that can be accessed

The list of all workspaces that can be accessed

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkspacesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

WorkspacesApi apiInstance = new WorkspacesApi();
try {
    WorkspaceDefinitionList result = apiInstance.getWorkspaceList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkspacesApi#getWorkspaceList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WorkspaceDefinitionList**](WorkspaceDefinitionList.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

