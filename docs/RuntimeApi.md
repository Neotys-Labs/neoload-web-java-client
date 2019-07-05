# RuntimeApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTestsRun**](RuntimeApi.md#getTestsRun) | **POST** /projects/{projectId}/run | Runs a test
[**postUploadProject**](RuntimeApi.md#postUploadProject) | **POST** /projects | Uploads a NeoLoad project zip file or a standalone as code file

<a name="getTestsRun"></a>
# **getTestsRun**
> RunTestDefinition getTestsRun(name, projectId, scenarioName, description, asCode, reservationId, reservationDuration, reservationWebVUs, reservationSAPVUs, controllerZoneId, lgZones)

Runs a test

Runs a test of the Account according to the method parameters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RuntimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

RuntimeApi apiInstance = new RuntimeApi();
String name = "name_example"; // String | The name of the test
String projectId = "projectId_example"; // String | The project Id of the test
String scenarioName = "scenarioName_example"; // String | The scenario name of the test
String description = "description_example"; // String | The description of the test
String asCode = "asCode_example"; // String | The comma-separated as-code files to use for the test. Those files must be part of the uploaded project.
String reservationId = "reservationId_example"; // String | The reservation identifier to use for the test that can be retrieved from the NeoLoad Web reservation calendar URL. If the reservation mode is enabled and \"reservationId\" value is defined, \"reservationDuration\", \"reservationWebVUs\" and \"reservationSAPVUs\" values will be ignored, otherwise if the reservation mode is disabled the value will be ignored.
Long reservationDuration = 789L; // Long | The duration of the reservation for the test. If the reservation mode is enabled, this value or \"reservationDuration\", \"reservationWebVUs\", \"reservationSAPVUs\" must be defined, otherwise if the reservation mode is disabled the value will be ignored. The value (in seconds) is optional when the reservation mode is enabled and ignored when reservationId value is defined or if the reservation mode is disabled. The default value is the selected scenario duration + 1200 seconds (20 minutes). All reserved resources will be released when the test ends.
Integer reservationWebVUs = 56; // Integer | The number of Web Virtual Users to be reserved for the test. The value is optional when the reservation mode is enabled and ignored when \"reservationId\" value is defined or if the reservation mode is disabled.
Integer reservationSAPVUs = 56; // Integer | The number of SAP Virtual Users to be reserved for the test. The value is optional when the reservation mode is enabled and ignored when \"reservationId\" value is defined or if the reservation mode is disabled.
String controllerZoneId = "controllerZoneId_example"; // String | The controller zone Id. If empty, the default zone will be used.
String lgZones = "lgZones_example"; // String | The LG zones with the number of the LGs. Example: \"ZoneId1:10,ZoneId2:5\". If empty, the default zone will be used with one LG.
try {
    RunTestDefinition result = apiInstance.getTestsRun(name, projectId, scenarioName, description, asCode, reservationId, reservationDuration, reservationWebVUs, reservationSAPVUs, controllerZoneId, lgZones);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeApi#getTestsRun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the test |
 **projectId** | **String**| The project Id of the test |
 **scenarioName** | **String**| The scenario name of the test |
 **description** | **String**| The description of the test | [optional]
 **asCode** | **String**| The comma-separated as-code files to use for the test. Those files must be part of the uploaded project. | [optional]
 **reservationId** | **String**| The reservation identifier to use for the test that can be retrieved from the NeoLoad Web reservation calendar URL. If the reservation mode is enabled and \&quot;reservationId\&quot; value is defined, \&quot;reservationDuration\&quot;, \&quot;reservationWebVUs\&quot; and \&quot;reservationSAPVUs\&quot; values will be ignored, otherwise if the reservation mode is disabled the value will be ignored. | [optional]
 **reservationDuration** | **Long**| The duration of the reservation for the test. If the reservation mode is enabled, this value or \&quot;reservationDuration\&quot;, \&quot;reservationWebVUs\&quot;, \&quot;reservationSAPVUs\&quot; must be defined, otherwise if the reservation mode is disabled the value will be ignored. The value (in seconds) is optional when the reservation mode is enabled and ignored when reservationId value is defined or if the reservation mode is disabled. The default value is the selected scenario duration + 1200 seconds (20 minutes). All reserved resources will be released when the test ends. | [optional]
 **reservationWebVUs** | **Integer**| The number of Web Virtual Users to be reserved for the test. The value is optional when the reservation mode is enabled and ignored when \&quot;reservationId\&quot; value is defined or if the reservation mode is disabled. | [optional]
 **reservationSAPVUs** | **Integer**| The number of SAP Virtual Users to be reserved for the test. The value is optional when the reservation mode is enabled and ignored when \&quot;reservationId\&quot; value is defined or if the reservation mode is disabled. | [optional]
 **controllerZoneId** | **String**| The controller zone Id. If empty, the default zone will be used. | [optional]
 **lgZones** | **String**| The LG zones with the number of the LGs. Example: \&quot;ZoneId1:10,ZoneId2:5\&quot;. If empty, the default zone will be used with one LG. | [optional]

### Return type

[**RunTestDefinition**](RunTestDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postUploadProject"></a>
# **postUploadProject**
> ProjectDefinition postUploadProject(file)

Uploads a NeoLoad project zip file or a standalone as code file

Uploads a NeoLoad project of the account corresponding to the parameters. The maximum size file is 100 MB

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RuntimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

RuntimeApi apiInstance = new RuntimeApi();
File file = new File("file_example"); // File | 
try {
    ProjectDefinition result = apiInstance.postUploadProject(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeApi#postUploadProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  |

### Return type

[**ProjectDefinition**](ProjectDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

