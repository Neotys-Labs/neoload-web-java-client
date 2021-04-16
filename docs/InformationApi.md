# InformationApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInformation**](InformationApi.md#getInformation) | **GET** /v3/information | Lists information

<a name="getInformation"></a>
# **getInformation**
> InformationDefinition getInformation()

Lists information

Returns relevant information regarding Neoload Web resources and version.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InformationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

InformationApi apiInstance = new InformationApi();
try {
    InformationDefinition result = apiInstance.getInformation();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InformationApi#getInformation");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InformationDefinition**](InformationDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

