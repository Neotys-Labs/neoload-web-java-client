# WorkspacesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMembersToWorkspace**](WorkspacesApi.md#addMembersToWorkspace) | **PATCH** /v3/workspaces/{workspaceId}/members/add | Add member(s) to a Workspace
[**create**](WorkspacesApi.md#create) | **POST** /v3/workspaces | Create a new Workspace
[**delete**](WorkspacesApi.md#delete) | **DELETE** /v3/workspaces/{workspaceId}/name/{workspaceName} | Delete a Workspace
[**find**](WorkspacesApi.md#find) | **GET** /v3/workspaces/{workspaceId} | Get a Workspace
[**getWorkspaceList**](WorkspacesApi.md#getWorkspaceList) | **GET** /v3/workspaces | Get the list of all accessible Workspaces
[**removeMembersFromWorkspace**](WorkspacesApi.md#removeMembersFromWorkspace) | **PATCH** /v3/workspaces/{workspaceId}/members/remove | Remove member(s) from a Workspace
[**update**](WorkspacesApi.md#update) | **PATCH** /v3/workspaces/{workspaceId} | Update a Workspace

<a name="addMembersToWorkspace"></a>
# **addMembersToWorkspace**
> FullWorkspaceDefinition addMembersToWorkspace(workspaceId, body)

Add member(s) to a Workspace

Add member(s) to a Workspace

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
String workspaceId = "workspaceId_example"; // String | 
MemberListDefinition body = new MemberListDefinition(); // MemberListDefinition | 
try {
    FullWorkspaceDefinition result = apiInstance.addMembersToWorkspace(workspaceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkspacesApi#addMembersToWorkspace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**|  |
 **body** | [**MemberListDefinition**](MemberListDefinition.md)|  | [optional]

### Return type

[**FullWorkspaceDefinition**](FullWorkspaceDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="create"></a>
# **create**
> FullWorkspaceDefinition create(body)

Create a new Workspace

Create a new Workspace

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
WorkspaceCreateRequest body = new WorkspaceCreateRequest(); // WorkspaceCreateRequest | 
try {
    FullWorkspaceDefinition result = apiInstance.create(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkspacesApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WorkspaceCreateRequest**](WorkspaceCreateRequest.md)|  | [optional]

### Return type

[**FullWorkspaceDefinition**](FullWorkspaceDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> FullWorkspaceDefinition delete(workspaceId, workspaceName)

Delete a Workspace

WARNING: All related resources will be deleted and definitively lost. Delete the Workspace with the specified id. The Workspace name is also required to make sure you actually delete the good Workspace.

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
String workspaceId = "workspaceId_example"; // String | 
String workspaceName = "workspaceName_example"; // String | 
try {
    FullWorkspaceDefinition result = apiInstance.delete(workspaceId, workspaceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkspacesApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**|  |
 **workspaceName** | **String**|  |

### Return type

[**FullWorkspaceDefinition**](FullWorkspaceDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="find"></a>
# **find**
> FullWorkspaceDefinition find(workspaceId)

Get a Workspace

Get a Workspace

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
String workspaceId = "workspaceId_example"; // String | 
try {
    FullWorkspaceDefinition result = apiInstance.find(workspaceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkspacesApi#find");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**|  |

### Return type

[**FullWorkspaceDefinition**](FullWorkspaceDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkspaceList"></a>
# **getWorkspaceList**
> WorkspaceDefinitionList getWorkspaceList(allWorkspaces, limit, offset)

Get the list of all accessible Workspaces

Lists all accessible Workspaces.

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
Boolean allWorkspaces = false; // Boolean | If true (reserved to admin users), returns all existing workspaces, including the workspaces I am not member of. If false, returns only the workspaces I am a member of.
Integer limit = 50; // Integer | The maximum number of elements returned by this call. The maximum must be less than or equal to 200.
Integer offset = 0; // Integer | The offset of the first element to return. Starting at this offset, the query will return a maximum of 'limit' elements.
try {
    WorkspaceDefinitionList result = apiInstance.getWorkspaceList(allWorkspaces, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkspacesApi#getWorkspaceList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allWorkspaces** | **Boolean**| If true (reserved to admin users), returns all existing workspaces, including the workspaces I am not member of. If false, returns only the workspaces I am a member of. | [optional] [default to false]
 **limit** | **Integer**| The maximum number of elements returned by this call. The maximum must be less than or equal to 200. | [optional] [default to 50] [enum: ]
 **offset** | **Integer**| The offset of the first element to return. Starting at this offset, the query will return a maximum of &#x27;limit&#x27; elements. | [optional] [default to 0]

### Return type

[**WorkspaceDefinitionList**](WorkspaceDefinitionList.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeMembersFromWorkspace"></a>
# **removeMembersFromWorkspace**
> FullWorkspaceDefinition removeMembersFromWorkspace(workspaceId, body)

Remove member(s) from a Workspace

Remove member(s) from a Workspace

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
String workspaceId = "workspaceId_example"; // String | 
MemberListDefinition body = new MemberListDefinition(); // MemberListDefinition | 
try {
    FullWorkspaceDefinition result = apiInstance.removeMembersFromWorkspace(workspaceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkspacesApi#removeMembersFromWorkspace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**|  |
 **body** | [**MemberListDefinition**](MemberListDefinition.md)|  | [optional]

### Return type

[**FullWorkspaceDefinition**](FullWorkspaceDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> FullWorkspaceDefinition update(workspaceId, body)

Update a Workspace

Update only the specified fields of the Workspace

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
String workspaceId = "workspaceId_example"; // String | 
WorkspaceUpdateRequest body = new WorkspaceUpdateRequest(); // WorkspaceUpdateRequest | 
try {
    FullWorkspaceDefinition result = apiInstance.update(workspaceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkspacesApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**|  |
 **body** | [**WorkspaceUpdateRequest**](WorkspaceUpdateRequest.md)|  | [optional]

### Return type

[**FullWorkspaceDefinition**](FullWorkspaceDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

