# RuntimeApi

All URIs are relative to *https://your-hostname.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTest**](RuntimeApi.md#deleteTest) | **DELETE** /workspaces/{workspaceId}/tests/{testId} | Delete a test
[**getTest**](RuntimeApi.md#getTest) | **GET** /workspaces/{workspaceId}/tests/{testId} | Get a test
[**getTestList**](RuntimeApi.md#getTestList) | **GET** /workspaces/{workspaceId}/tests | Get a test list
[**getTestsRun**](RuntimeApi.md#getTestsRun) | **POST** /workspaces/{workspaceId}/tests/{testId}/start | Starts a test
[**patchTest**](RuntimeApi.md#patchTest) | **PATCH** /workspaces/{workspaceId}/tests/{testId} | Partially update a test
[**postCreateTest**](RuntimeApi.md#postCreateTest) | **POST** /workspaces/{workspaceId}/tests | Create a new test
[**postUploadProject**](RuntimeApi.md#postUploadProject) | **POST** /workspaces/{workspaceId}/tests/{testId}/project | Uploads a NeoLoad project zip file or a standalone as code file
[**putTest**](RuntimeApi.md#putTest) | **PUT** /workspaces/{workspaceId}/tests/{testId} | Fully update a test
[**readProjectMetadata**](RuntimeApi.md#readProjectMetadata) | **GET** /workspaces/{workspaceId}/tests/{testId}/project | Get project&#x27;s metadata

<a name="deleteTest"></a>
# **deleteTest**
> TestDefinition deleteTest(workspaceId, testId, deleteResults)

Delete a test

Delete the test with the specified id

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
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String testId = "testId_example"; // String | Unique identifier representing a specific test.
String deleteResults = "deleteResults_example"; // String | Delete also test results linked to the test. Default is true.
try {
    TestDefinition result = apiInstance.deleteTest(workspaceId, testId, deleteResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeApi#deleteTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **testId** | **String**| Unique identifier representing a specific test. |
 **deleteResults** | **String**| Delete also test results linked to the test. Default is true. | [optional]

### Return type

[**TestDefinition**](TestDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTest"></a>
# **getTest**
> TestDefinition getTest(workspaceId, testId)

Get a test

Get the test

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
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String testId = "testId_example"; // String | Unique identifier representing a specific test.
try {
    TestDefinition result = apiInstance.getTest(workspaceId, testId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeApi#getTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **testId** | **String**| Unique identifier representing a specific test. |

### Return type

[**TestDefinition**](TestDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestList"></a>
# **getTestList**
> TestDefinitionList getTestList(workspaceId, limit, offset, sort)

Get a test list

Lists the tests of the Account. ___ *Sortable fields :*   - name   - projectName   - lastUpdateDate (descending sort by default : the most recent first)   - lastRunDate   - userModifierName 

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
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
Integer limit = 50; // Integer | The maximum number of elements returned by this call. The maximum must be less than or equal to 200.
Integer offset = 0; // Integer | The offset of the first element to return. Starting at this offset, the query will return a maximum of 'limit' elements.
String sort = "sort_example"; // String | The key to sort the elements on. It may begin with a '+' or a '-' to specify an ascending or descending sort order. The list of available keys can be found in the endpoint description.
try {
    TestDefinitionList result = apiInstance.getTestList(workspaceId, limit, offset, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeApi#getTestList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **limit** | **Integer**| The maximum number of elements returned by this call. The maximum must be less than or equal to 200. | [optional] [default to 50] [enum: ]
 **offset** | **Integer**| The offset of the first element to return. Starting at this offset, the query will return a maximum of &#x27;limit&#x27; elements. | [optional] [default to 0]
 **sort** | **String**| The key to sort the elements on. It may begin with a &#x27;+&#x27; or a &#x27;-&#x27; to specify an ascending or descending sort order. The list of available keys can be found in the endpoint description. | [optional]

### Return type

[**TestDefinitionList**](TestDefinitionList.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestsRun"></a>
# **getTestsRun**
> RunTestDefinition getTestsRun(workspaceId, testId, testResultName, testResultDescription, asCode, reservationId, reservationDuration, reservationWebVUs, reservationSAPVUs, reservationCitrixVUs, publishTestResult)

Starts a test

Starts a test of the Account according to the method parameters.

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
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String testId = "testId_example"; // String | Unique identifier representing a specific test.
String testResultName = "testResultName_example"; // String | The name of the test result
String testResultDescription = "testResultDescription_example"; // String | The description of the test result
String asCode = "asCode_example"; // String | The comma-separated as-code files to use for the test. Those files must be part of the uploaded project.
String reservationId = "reservationId_example"; // String | The reservation identifier to use for the test that can be retrieved from the NeoLoad Web reservation calendar URL. If the reservation mode is enabled and \"reservationId\" value is defined, \"reservationDuration\", \"reservationWebVUs\" and \"reservationSAPVUs\" values will be ignored, otherwise if the reservation mode is disabled the value will be ignored.
Long reservationDuration = 789L; // Long | The duration of the reservation for the test. If the reservation mode is enabled, this value or \"reservationDuration\", \"reservationWebVUs\", \"reservationSAPVUs\" must be defined, otherwise if the reservation mode is disabled the value will be ignored. The value (in seconds) is optional when the reservation mode is enabled and ignored when reservationId value is defined or if the reservation mode is disabled. The default value is the selected scenario duration + 1200 seconds (20 minutes). All reserved resources will be released when the test ends.
Integer reservationWebVUs = 56; // Integer | The number of Web Virtual Users to be reserved for the test. The value is optional when the reservation mode is enabled and ignored when \"reservationId\" value is defined or if the reservation mode is disabled.
Integer reservationSAPVUs = 56; // Integer | The number of SAP Virtual Users to be reserved for the test. The value is optional when the reservation mode is enabled and ignored when \"reservationId\" value is defined or if the reservation mode is disabled.
Integer reservationCitrixVUs = 56; // Integer | The number of Citrix Virtual Users to be reserved for the test. The value is optional when the reservation mode is enabled and ignored when \"reservationId\" value is defined or if the reservation mode is disabled.
Boolean publishTestResult = true; // Boolean | When \"true\" and the project is a collaborative project (other than git) then the test result is published onto the server. If empty, the default value is \"false\".
try {
    RunTestDefinition result = apiInstance.getTestsRun(workspaceId, testId, testResultName, testResultDescription, asCode, reservationId, reservationDuration, reservationWebVUs, reservationSAPVUs, reservationCitrixVUs, publishTestResult);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeApi#getTestsRun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **testId** | **String**| Unique identifier representing a specific test. |
 **testResultName** | **String**| The name of the test result |
 **testResultDescription** | **String**| The description of the test result | [optional]
 **asCode** | **String**| The comma-separated as-code files to use for the test. Those files must be part of the uploaded project. | [optional]
 **reservationId** | **String**| The reservation identifier to use for the test that can be retrieved from the NeoLoad Web reservation calendar URL. If the reservation mode is enabled and \&quot;reservationId\&quot; value is defined, \&quot;reservationDuration\&quot;, \&quot;reservationWebVUs\&quot; and \&quot;reservationSAPVUs\&quot; values will be ignored, otherwise if the reservation mode is disabled the value will be ignored. | [optional]
 **reservationDuration** | **Long**| The duration of the reservation for the test. If the reservation mode is enabled, this value or \&quot;reservationDuration\&quot;, \&quot;reservationWebVUs\&quot;, \&quot;reservationSAPVUs\&quot; must be defined, otherwise if the reservation mode is disabled the value will be ignored. The value (in seconds) is optional when the reservation mode is enabled and ignored when reservationId value is defined or if the reservation mode is disabled. The default value is the selected scenario duration + 1200 seconds (20 minutes). All reserved resources will be released when the test ends. | [optional]
 **reservationWebVUs** | **Integer**| The number of Web Virtual Users to be reserved for the test. The value is optional when the reservation mode is enabled and ignored when \&quot;reservationId\&quot; value is defined or if the reservation mode is disabled. | [optional]
 **reservationSAPVUs** | **Integer**| The number of SAP Virtual Users to be reserved for the test. The value is optional when the reservation mode is enabled and ignored when \&quot;reservationId\&quot; value is defined or if the reservation mode is disabled. | [optional]
 **reservationCitrixVUs** | **Integer**| The number of Citrix Virtual Users to be reserved for the test. The value is optional when the reservation mode is enabled and ignored when \&quot;reservationId\&quot; value is defined or if the reservation mode is disabled. | [optional]
 **publishTestResult** | **Boolean**| When \&quot;true\&quot; and the project is a collaborative project (other than git) then the test result is published onto the server. If empty, the default value is \&quot;false\&quot;. | [optional]

### Return type

[**RunTestDefinition**](RunTestDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="patchTest"></a>
# **patchTest**
> TestDefinition patchTest(workspaceId, testId, body)

Partially update a test

Update only the specified fields of the test

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
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String testId = "testId_example"; // String | Unique identifier representing a specific test.
TestUpdate body = new TestUpdate(); // TestUpdate | The fields to update. No field is required, only those supplied will be updated.
try {
    TestDefinition result = apiInstance.patchTest(workspaceId, testId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeApi#patchTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **testId** | **String**| Unique identifier representing a specific test. |
 **body** | [**TestUpdate**](TestUpdate.md)| The fields to update. No field is required, only those supplied will be updated. | [optional]

### Return type

[**TestDefinition**](TestDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCreateTest"></a>
# **postCreateTest**
> TestCreated postCreateTest(body, workspaceId)

Create a new test

Create a new test with the specified name

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
TestCreate body = new TestCreate(); // TestCreate | 
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
try {
    TestCreated result = apiInstance.postCreateTest(body, workspaceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeApi#postCreateTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TestCreate**](TestCreate.md)|  |
 **workspaceId** | **String**| Unique identifier representing a workspace. |

### Return type

[**TestCreated**](TestCreated.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUploadProject"></a>
# **postUploadProject**
> ProjectDefinition postUploadProject(file, workspaceId, testId)

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
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String testId = "testId_example"; // String | Unique identifier representing a specific test.
try {
    ProjectDefinition result = apiInstance.postUploadProject(file, workspaceId, testId);
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
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **testId** | **String**| Unique identifier representing a specific test. |

### Return type

[**ProjectDefinition**](ProjectDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="putTest"></a>
# **putTest**
> TestDefinition putTest(body, workspaceId, testId)

Fully update a test

Update all fields of the test

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
TestUpdate body = new TestUpdate(); // TestUpdate | The fields to update. All fields are required and will be updated.
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String testId = "testId_example"; // String | Unique identifier representing a specific test.
try {
    TestDefinition result = apiInstance.putTest(body, workspaceId, testId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeApi#putTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TestUpdate**](TestUpdate.md)| The fields to update. All fields are required and will be updated. |
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **testId** | **String**| Unique identifier representing a specific test. |

### Return type

[**TestDefinition**](TestDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readProjectMetadata"></a>
# **readProjectMetadata**
> ProjectDefinition readProjectMetadata(workspaceId, testId)

Get project&#x27;s metadata

Get project&#x27;s metadata

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
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String testId = "testId_example"; // String | Unique identifier representing a specific test.
try {
    ProjectDefinition result = apiInstance.readProjectMetadata(workspaceId, testId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeApi#readProjectMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **testId** | **String**| Unique identifier representing a specific test. |

### Return type

[**ProjectDefinition**](ProjectDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

