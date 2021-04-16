# AdministrationOfUsersApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete1**](AdministrationOfUsersApi.md#delete1) | **DELETE** /v3/users/{login} | Delete a user

<a name="delete1"></a>
# **delete1**
> delete1(login, removeFromNeotysSaaSAccount)

Delete a user

Delete a user with the specified login

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AdministrationOfUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

AdministrationOfUsersApi apiInstance = new AdministrationOfUsersApi();
String login = "login_example"; // String | 
Boolean removeFromNeotysSaaSAccount = false; // Boolean | SaaS Account-Admin-only option: Remove the user from your Account on the Neotys user platform
try {
    apiInstance.delete1(login, removeFromNeotysSaaSAccount);
} catch (ApiException e) {
    System.err.println("Exception when calling AdministrationOfUsersApi#delete1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  |
 **removeFromNeotysSaaSAccount** | **Boolean**| SaaS Account-Admin-only option: Remove the user from your Account on the Neotys user platform | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

