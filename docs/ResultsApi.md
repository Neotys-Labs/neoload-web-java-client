# ResultsApi

All URIs are relative to *https://your-hostname.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTestResult**](ResultsApi.md#deleteTestResult) | **DELETE** /workspaces/{workspaceId}/test-results/{resultId} | Deletes a test result
[**getTestResult**](ResultsApi.md#getTestResult) | **GET** /workspaces/{workspaceId}/test-results/{resultId} | Test result description
[**getTestResultElementDefinition**](ResultsApi.md#getTestResultElementDefinition) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/elements/{elementId} | Test result element definition
[**getTestResultElements**](ResultsApi.md#getTestResultElements) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/elements | Test result elements
[**getTestResultElementsPercentiles**](ResultsApi.md#getTestResultElementsPercentiles) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/elements/{elementId}/percentiles | Test result percentiles transaction since the beginning of the test result
[**getTestResultElementsPoints**](ResultsApi.md#getTestResultElementsPoints) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/elements/{elementId}/points | Test results elements points since the beginning of the test result
[**getTestResultElementsSla**](ResultsApi.md#getTestResultElementsSla) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/elements/{elementId}/sla | Test result elements SLA status since the beginning of the test result
[**getTestResultElementsValues**](ResultsApi.md#getTestResultElementsValues) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/elements/{elementId}/values | Test result elements values
[**getTestResultEvents**](ResultsApi.md#getTestResultEvents) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/events | Test result events
[**getTestResultGraph**](ResultsApi.md#getTestResultGraph) | **POST** /workspaces/{workspaceId}/test-results/{resultId}/graph | Test result Graph
[**getTestResultList**](ResultsApi.md#getTestResultList) | **GET** /workspaces/{workspaceId}/test-results | Lists test results
[**getTestResultMonitorDefinition**](ResultsApi.md#getTestResultMonitorDefinition) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/monitors/{counterId} | Test result counter definition
[**getTestResultMonitors**](ResultsApi.md#getTestResultMonitors) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/monitors | Test result monitors
[**getTestResultMonitorsPoints**](ResultsApi.md#getTestResultMonitorsPoints) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/monitors/{counterId}/points | Test result monitors points
[**getTestResultMonitorsValues**](ResultsApi.md#getTestResultMonitorsValues) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/monitors/{counterId}/values | Test result monitors values
[**getTestResultMultiGraph**](ResultsApi.md#getTestResultMultiGraph) | **POST** /workspaces/{workspaceId}/test-results/graph | Test results MultiGraph
[**getTestResultSLAGlobalIndicators**](ResultsApi.md#getTestResultSLAGlobalIndicators) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/slas/statistics | SLAs global indicators
[**getTestResultSLAPerInterval**](ResultsApi.md#getTestResultSLAPerInterval) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/slas/per-interval | SLAs per time interval
[**getTestResultSLAPerTest**](ResultsApi.md#getTestResultSLAPerTest) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/slas/per-test | SLAs per test
[**getTestResultStatistics**](ResultsApi.md#getTestResultStatistics) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/statistics | Test result main statistics
[**postTestResultMonitors**](ResultsApi.md#postTestResultMonitors) | **POST** /workspaces/{workspaceId}/test-results/{resultId}/monitors | Create custom monitors
[**stopTestResult**](ResultsApi.md#stopTestResult) | **POST** /workspaces/{workspaceId}/test-results/{resultId}/stop | Stop a running test result
[**updateTestResult**](ResultsApi.md#updateTestResult) | **PUT** /workspaces/{workspaceId}/test-results/{resultId} | Update a test result

<a name="deleteTestResult"></a>
# **deleteTestResult**
> deleteTestResult(workspaceId, resultId)

Deletes a test result

Deletes a test result and all the associated statistics. This action cannot be undone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String resultId = "resultId_example"; // String | Unique identifier representing a specific test result.
try {
    apiInstance.deleteTestResult(workspaceId, resultId);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#deleteTestResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **resultId** | **String**| Unique identifier representing a specific test result. |

### Return type

null (empty response body)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestResult"></a>
# **getTestResult**
> TestResultDefinition getTestResult(workspaceId, resultId)

Test result description

Provides a test result description using a unique test result identifier. Provides name, dates, owner ...

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String resultId = "resultId_example"; // String | Unique identifier representing a specific test result.
try {
    TestResultDefinition result = apiInstance.getTestResult(workspaceId, resultId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#getTestResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **resultId** | **String**| Unique identifier representing a specific test result. |

### Return type

[**TestResultDefinition**](TestResultDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestResultElementDefinition"></a>
# **getTestResultElementDefinition**
> ElementDefinition getTestResultElementDefinition(workspaceId, resultId, elementId)

Test result element definition

Provides a test result element definition.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String resultId = "resultId_example"; // String | Unique identifier representing a specific test result.
String elementId = "elementId_example"; // String | Unique identifier representing a specific element.
try {
    ElementDefinition result = apiInstance.getTestResultElementDefinition(workspaceId, resultId, elementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#getTestResultElementDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **resultId** | **String**| Unique identifier representing a specific test result. |
 **elementId** | **String**| Unique identifier representing a specific element. |

### Return type

[**ElementDefinition**](ElementDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestResultElements"></a>
# **getTestResultElements**
> ArrayOfElementDefinition getTestResultElements(workspaceId, resultId, category)

Test result elements

Provides the tests elements of a test result. The elements type must be provided.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String resultId = "resultId_example"; // String | Unique identifier representing a specific test result.
String category = "TRANSACTION"; // String | Category of the elements to return.
try {
    ArrayOfElementDefinition result = apiInstance.getTestResultElements(workspaceId, resultId, category);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#getTestResultElements");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **resultId** | **String**| Unique identifier representing a specific test result. |
 **category** | **String**| Category of the elements to return. | [default to TRANSACTION] [enum: TRANSACTION, PAGE, REQUEST]

### Return type

[**ArrayOfElementDefinition**](ArrayOfElementDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestResultElementsPercentiles"></a>
# **getTestResultElementsPercentiles**
> Percentiles getTestResultElementsPercentiles(workspaceId, resultId, elementId)

Test result percentiles transaction since the beginning of the test result

Provides the percentiles of a test result transaction.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String resultId = "resultId_example"; // String | Unique identifier representing a specific test result.
String elementId = "elementId_example"; // String | Unique identifier representing a specific element.
try {
    Percentiles result = apiInstance.getTestResultElementsPercentiles(workspaceId, resultId, elementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#getTestResultElementsPercentiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **resultId** | **String**| Unique identifier representing a specific test result. |
 **elementId** | **String**| Unique identifier representing a specific element. |

### Return type

[**Percentiles**](Percentiles.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestResultElementsPoints"></a>
# **getTestResultElementsPoints**
> Points getTestResultElementsPoints(workspaceId, resultId, elementId, statistics)

Test results elements points since the beginning of the test result

Provides all the points of a test result element for the selected statistics.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String resultId = "resultId_example"; // String | Unique identifier representing a specific test result.
String elementId = "elementId_example"; // String | Unique identifier representing a specific element.
String statistics = "statistics_example"; // String | Comma-separated list of statistics to get. Available statistics are: AVG_DURATION (ms), MIN_DURATION (ms), MAX_DURATION (ms), COUNT, THROUGHPUT (Byte/s), ELEMENTS_PER_SECOND, ERRORS, ERRORS_PER_SECOND, ERROR_RATE (%), AVG_TTFB (ms), MIN_TTFB (ms), MAX_TTFB (ms).<br/> Example: AVG_DURATION,ELEMENTS_PER_SECOND
try {
    Points result = apiInstance.getTestResultElementsPoints(workspaceId, resultId, elementId, statistics);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#getTestResultElementsPoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **resultId** | **String**| Unique identifier representing a specific test result. |
 **elementId** | **String**| Unique identifier representing a specific element. |
 **statistics** | **String**| Comma-separated list of statistics to get. Available statistics are: AVG_DURATION (ms), MIN_DURATION (ms), MAX_DURATION (ms), COUNT, THROUGHPUT (Byte/s), ELEMENTS_PER_SECOND, ERRORS, ERRORS_PER_SECOND, ERROR_RATE (%), AVG_TTFB (ms), MIN_TTFB (ms), MAX_TTFB (ms).&lt;br/&gt; Example: AVG_DURATION,ELEMENTS_PER_SECOND |

### Return type

[**Points**](Points.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestResultElementsSla"></a>
# **getTestResultElementsSla**
> Sla getTestResultElementsSla(workspaceId, resultId, elementId)

Test result elements SLA status since the beginning of the test result

Provides the SLA status of a test result element.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String resultId = "resultId_example"; // String | Unique identifier representing a specific test result.
String elementId = "elementId_example"; // String | Unique identifier representing a specific element.
try {
    Sla result = apiInstance.getTestResultElementsSla(workspaceId, resultId, elementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#getTestResultElementsSla");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **resultId** | **String**| Unique identifier representing a specific test result. |
 **elementId** | **String**| Unique identifier representing a specific element. |

### Return type

[**Sla**](Sla.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestResultElementsValues"></a>
# **getTestResultElementsValues**
> ElementValues getTestResultElementsValues(workspaceId, resultId, elementId)

Test result elements values

Provides the values of a test result element.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String resultId = "resultId_example"; // String | Unique identifier representing a specific test result.
String elementId = "elementId_example"; // String | Unique identifier representing a specific element.
try {
    ElementValues result = apiInstance.getTestResultElementsValues(workspaceId, resultId, elementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#getTestResultElementsValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **resultId** | **String**| Unique identifier representing a specific test result. |
 **elementId** | **String**| Unique identifier representing a specific element. |

### Return type

[**ElementValues**](ElementValues.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestResultEvents"></a>
# **getTestResultEvents**
> ArrayOfEventDefinition getTestResultEvents(workspaceId, resultId, types, limit, offset, sort)

Test result events

List the events of the specified test result according to the method parameters. ___ *Sortable fields :*   - offset   - fullname   - code   - source 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String resultId = "resultId_example"; // String | Unique identifier representing a specific test result.
List<EventType> types = Arrays.asList(new EventType()); // List<EventType> | The types of the events you expect to get. It will return all the types if the field is left empty. (Ctrl+click to select multiple values) 
Integer limit = 50; // Integer | The maximum number of elements returned by this call. The maximum must be less than or equal to 200.
Integer offset = 0; // Integer | The offset of the first element to return. Starting at this offset, the query will return a maximum of 'limit' elements.
String sort = "sort_example"; // String | The key to sort the elements on. It may begin with a '+' or a '-' to specify an ascending or descending sort order. The list of available keys can be found in the endpoint description.
try {
    ArrayOfEventDefinition result = apiInstance.getTestResultEvents(workspaceId, resultId, types, limit, offset, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#getTestResultEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **resultId** | **String**| Unique identifier representing a specific test result. |
 **types** | [**List&lt;EventType&gt;**](EventType.md)| The types of the events you expect to get. It will return all the types if the field is left empty. (Ctrl+click to select multiple values)  | [optional]
 **limit** | **Integer**| The maximum number of elements returned by this call. The maximum must be less than or equal to 200. | [optional] [default to 50] [enum: ]
 **offset** | **Integer**| The offset of the first element to return. Starting at this offset, the query will return a maximum of &#x27;limit&#x27; elements. | [optional] [default to 0]
 **sort** | **String**| The key to sort the elements on. It may begin with a &#x27;+&#x27; or a &#x27;-&#x27; to specify an ascending or descending sort order. The list of available keys can be found in the endpoint description. | [optional]

### Return type

[**ArrayOfEventDefinition**](ArrayOfEventDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestResultGraph"></a>
# **getTestResultGraph**
> File getTestResultGraph(workspaceId, resultId, body)

Test result Graph

Provides a graph from some stats of a test result.  Element statistics can be mixed with monitor statistics. Only limitation is around PERCENTILES_DURATION element statistic that cannot be mixed with other element statistics neither with monitor statistics. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String resultId = "resultId_example"; // String | Unique identifier representing a specific test result.
TestResultRasterConfiguration body = new TestResultRasterConfiguration(); // TestResultRasterConfiguration | 
try {
    File result = apiInstance.getTestResultGraph(workspaceId, resultId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#getTestResultGraph");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **resultId** | **String**| Unique identifier representing a specific test result. |
 **body** | [**TestResultRasterConfiguration**](TestResultRasterConfiguration.md)|  | [optional]

### Return type

[**File**](File.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: image/png, image/jpeg, image/tiff, application/json

<a name="getTestResultList"></a>
# **getTestResultList**
> ArrayOfTestResultDefinition getTestResultList(workspaceId, status, project, author, limit, offset, sort, fields, pretty)

Lists test results

Lists the test results of the Account according to the method parameters. ___ *Sortable fields :*   - name   - project   - startDate (descending sort by default : the most recent first)   - qualityStatus 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String status = "status_example"; // String | Returns only the test results with the specified status.
String project = "project_example"; // String | Project name. Returns only the test results of the specified project.
String author = "author_example"; // String | The author of the test result. Returns only the test results launched by the specified author.
Integer limit = 50; // Integer | The maximum number of elements returned by this call. The maximum must be less than or equal to 200.
Integer offset = 0; // Integer | The offset of the first element to return. Starting at this offset, the query will return a maximum of 'limit' elements.
String sort = "sort_example"; // String | The key to sort the elements on. It may begin with a '+' or a '-' to specify an ascending or descending sort order. The list of available keys can be found in the endpoint description.
String fields = "fields_example"; // String | Comma-separated list of fields to include in the json test result definition.
Boolean pretty = true; // Boolean | If true the Json returned is human readable.
try {
    ArrayOfTestResultDefinition result = apiInstance.getTestResultList(workspaceId, status, project, author, limit, offset, sort, fields, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#getTestResultList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **status** | **String**| Returns only the test results with the specified status. | [optional] [enum: STARTING, RUNNING, TERMINATED]
 **project** | **String**| Project name. Returns only the test results of the specified project. | [optional]
 **author** | **String**| The author of the test result. Returns only the test results launched by the specified author. | [optional]
 **limit** | **Integer**| The maximum number of elements returned by this call. The maximum must be less than or equal to 200. | [optional] [default to 50] [enum: ]
 **offset** | **Integer**| The offset of the first element to return. Starting at this offset, the query will return a maximum of &#x27;limit&#x27; elements. | [optional] [default to 0]
 **sort** | **String**| The key to sort the elements on. It may begin with a &#x27;+&#x27; or a &#x27;-&#x27; to specify an ascending or descending sort order. The list of available keys can be found in the endpoint description. | [optional]
 **fields** | **String**| Comma-separated list of fields to include in the json test result definition. | [optional]
 **pretty** | **Boolean**| If true the Json returned is human readable. | [optional]

### Return type

[**ArrayOfTestResultDefinition**](ArrayOfTestResultDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestResultMonitorDefinition"></a>
# **getTestResultMonitorDefinition**
> CounterDefinition getTestResultMonitorDefinition(workspaceId, resultId, counterId)

Test result counter definition

Provides the definition of a test result counter.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String resultId = "resultId_example"; // String | Unique identifier representing a specific test result.
String counterId = "counterId_example"; // String | Unique identifier representing a specific counter.
try {
    CounterDefinition result = apiInstance.getTestResultMonitorDefinition(workspaceId, resultId, counterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#getTestResultMonitorDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **resultId** | **String**| Unique identifier representing a specific test result. |
 **counterId** | **String**| Unique identifier representing a specific counter. |

### Return type

[**CounterDefinition**](CounterDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestResultMonitors"></a>
# **getTestResultMonitors**
> CounterDefinitionArray getTestResultMonitors(workspaceId, resultId)

Test result monitors

Provides all the test result counters of all monitors for a test result.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String resultId = "resultId_example"; // String | Unique identifier representing a specific test result.
try {
    CounterDefinitionArray result = apiInstance.getTestResultMonitors(workspaceId, resultId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#getTestResultMonitors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **resultId** | **String**| Unique identifier representing a specific test result. |

### Return type

[**CounterDefinitionArray**](CounterDefinitionArray.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestResultMonitorsPoints"></a>
# **getTestResultMonitorsPoints**
> Points getTestResultMonitorsPoints(workspaceId, resultId, counterId)

Test result monitors points

Provides all the points of a test result counter. The values are the average on the specified interval.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String resultId = "resultId_example"; // String | Unique identifier representing a specific test result.
String counterId = "counterId_example"; // String | Unique identifier representing a specific counter.
try {
    Points result = apiInstance.getTestResultMonitorsPoints(workspaceId, resultId, counterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#getTestResultMonitorsPoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **resultId** | **String**| Unique identifier representing a specific test result. |
 **counterId** | **String**| Unique identifier representing a specific counter. |

### Return type

[**Points**](Points.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestResultMonitorsValues"></a>
# **getTestResultMonitorsValues**
> CounterValues getTestResultMonitorsValues(workspaceId, resultId, counterId)

Test result monitors values

Provides the values of a test result counter.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String resultId = "resultId_example"; // String | Unique identifier representing a specific test result.
String counterId = "counterId_example"; // String | Unique identifier representing a specific counter.
try {
    CounterValues result = apiInstance.getTestResultMonitorsValues(workspaceId, resultId, counterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#getTestResultMonitorsValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **resultId** | **String**| Unique identifier representing a specific test result. |
 **counterId** | **String**| Unique identifier representing a specific counter. |

### Return type

[**CounterValues**](CounterValues.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestResultMultiGraph"></a>
# **getTestResultMultiGraph**
> File getTestResultMultiGraph(workspaceId, body)

Test results MultiGraph

Provides a graph from some stats of some tests result.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
TestResultRasterMultiConfiguration body = new TestResultRasterMultiConfiguration(); // TestResultRasterMultiConfiguration | 
try {
    File result = apiInstance.getTestResultMultiGraph(workspaceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#getTestResultMultiGraph");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **body** | [**TestResultRasterMultiConfiguration**](TestResultRasterMultiConfiguration.md)|  | [optional]

### Return type

[**File**](File.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: image/png, image/jpeg, image/tiff, application/json

<a name="getTestResultSLAGlobalIndicators"></a>
# **getTestResultSLAGlobalIndicators**
> ArrayOfSLAGlobalIndicatorDefinition getTestResultSLAGlobalIndicators(workspaceId, resultId, status)

SLAs global indicators

Provides the SLAs global indicators of the test result.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String resultId = "resultId_example"; // String | Unique identifier representing a specific test result.
String status = "status_example"; // String | The status of the element you expect to get the SLA for. It will return all the statuses if the field is left empty.
try {
    ArrayOfSLAGlobalIndicatorDefinition result = apiInstance.getTestResultSLAGlobalIndicators(workspaceId, resultId, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#getTestResultSLAGlobalIndicators");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **resultId** | **String**| Unique identifier representing a specific test result. |
 **status** | **String**| The status of the element you expect to get the SLA for. It will return all the statuses if the field is left empty. | [optional] [enum: PASSED, WARNING, FAILED]

### Return type

[**ArrayOfSLAGlobalIndicatorDefinition**](ArrayOfSLAGlobalIndicatorDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestResultSLAPerInterval"></a>
# **getTestResultSLAPerInterval**
> ArrayOfSLAPerIntervalDefinition getTestResultSLAPerInterval(workspaceId, resultId, status, category)

SLAs per time interval

Provides the SLAs per time interval of a specific test result.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String resultId = "resultId_example"; // String | Unique identifier representing a specific test result.
String status = "status_example"; // String | The status of the element you expect to get the SLA for. It will return all the statuses if the field is left empty.
String category = "category_example"; // String | The category of the element you expect to get the SLA for. It will return all the categories if the field is left empty.
try {
    ArrayOfSLAPerIntervalDefinition result = apiInstance.getTestResultSLAPerInterval(workspaceId, resultId, status, category);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#getTestResultSLAPerInterval");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **resultId** | **String**| Unique identifier representing a specific test result. |
 **status** | **String**| The status of the element you expect to get the SLA for. It will return all the statuses if the field is left empty. | [optional] [enum: PASSED, WARNING, FAILED]
 **category** | **String**| The category of the element you expect to get the SLA for. It will return all the categories if the field is left empty. | [optional] [enum: TRANSACTION, PAGE, REQUEST]

### Return type

[**ArrayOfSLAPerIntervalDefinition**](ArrayOfSLAPerIntervalDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestResultSLAPerTest"></a>
# **getTestResultSLAPerTest**
> ArrayOfSLAPerTestResultDefinition getTestResultSLAPerTest(workspaceId, resultId, status, category)

SLAs per test

Provides the SLAs per test of a specific test result.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String resultId = "resultId_example"; // String | Unique identifier representing a specific test result.
String status = "status_example"; // String | The status of the element you expect to get the SLA for. It will return all the statuses if the field is left empty.
String category = "category_example"; // String | The category of the element you expect to get the SLA for. It will return all the categories if the field is left empty.
try {
    ArrayOfSLAPerTestResultDefinition result = apiInstance.getTestResultSLAPerTest(workspaceId, resultId, status, category);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#getTestResultSLAPerTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **resultId** | **String**| Unique identifier representing a specific test result. |
 **status** | **String**| The status of the element you expect to get the SLA for. It will return all the statuses if the field is left empty. | [optional] [enum: PASSED, WARNING, FAILED]
 **category** | **String**| The category of the element you expect to get the SLA for. It will return all the categories if the field is left empty. | [optional] [enum: TRANSACTION, PAGE, REQUEST]

### Return type

[**ArrayOfSLAPerTestResultDefinition**](ArrayOfSLAPerTestResultDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestResultStatistics"></a>
# **getTestResultStatistics**
> TestResultStatistics getTestResultStatistics(workspaceId, resultId)

Test result main statistics

Provides the main statistics of a test result. For a runnning test, these statistics are live, for a test result, those are average for the all test result.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String resultId = "resultId_example"; // String | Unique identifier representing a specific test result.
try {
    TestResultStatistics result = apiInstance.getTestResultStatistics(workspaceId, resultId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#getTestResultStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **resultId** | **String**| Unique identifier representing a specific test result. |

### Return type

[**TestResultStatistics**](TestResultStatistics.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postTestResultMonitors"></a>
# **postTestResultMonitors**
> postTestResultMonitors(body, workspaceId, resultId)

Create custom monitors

Pushes monitoring data (external data) for a given running test. &lt;br/&gt;&lt;br/&gt; &lt;b&gt;Resolution limitation&lt;/b&gt;: &lt;ul&gt;   &lt;li&gt;Maximum resolution for a monitor value is &lt;b&gt;1 per second&lt;/b&gt;, otherwise &lt;b&gt;the first value is kept&lt;/b&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;Maximum paths and monitors&lt;/b&gt;: &lt;ul&gt;   &lt;li&gt;Maximum 100 different &lt;b&gt;unique&lt;/b&gt; paths.&lt;/li&gt;   &lt;li&gt;Maximum 50 different monitors for a given path.&lt;/li&gt;   &lt;li&gt;Maximum length is 10 for a path.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;Other requirements&lt;/b&gt;: &lt;ul&gt;   &lt;li&gt;&#x27;/&#x27; character is not allowed in path element.&lt;/li&gt;   &lt;li&gt;The test must be &lt;b&gt;running&lt;/b&gt; while pushing the data.&lt;/li&gt;   &lt;li&gt;For a given timestamp, all monitors relative to a path must be sent in the same request.&lt;/li&gt;   &lt;li&gt;These elements must not be empty: &lt;b&gt;monitor name&lt;/b&gt;, &lt;b&gt;a path element&lt;/b&gt; and &lt;b&gt;values&lt;/b&gt;.&lt;/li&gt; &lt;/ul&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
MonitorPostRequest body = new MonitorPostRequest(); // MonitorPostRequest | List of custom monitors
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String resultId = "resultId_example"; // String | Unique identifier representing a specific test result.
try {
    apiInstance.postTestResultMonitors(body, workspaceId, resultId);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#postTestResultMonitors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MonitorPostRequest**](MonitorPostRequest.md)| List of custom monitors |
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **resultId** | **String**| Unique identifier representing a specific test result. |

### Return type

null (empty response body)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stopTestResult"></a>
# **stopTestResult**
> InlineResponse200 stopTestResult(body, workspaceId, resultId)

Stop a running test result

Stop the running test result with the specified id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
TestResultStopRequest body = new TestResultStopRequest(); // TestResultStopRequest | 
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String resultId = "resultId_example"; // String | Unique identifier representing a specific test result.
try {
    InlineResponse200 result = apiInstance.stopTestResult(body, workspaceId, resultId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#stopTestResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TestResultStopRequest**](TestResultStopRequest.md)|  |
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **resultId** | **String**| Unique identifier representing a specific test result. |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTestResult"></a>
# **updateTestResult**
> TestResultDefinition updateTestResult(body, workspaceId, resultId)

Update a test result

Updates a test result with new name, description or quality status.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: NeoloadAuthorizer
ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
NeoloadAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//NeoloadAuthorizer.setApiKeyPrefix("Token");

ResultsApi apiInstance = new ResultsApi();
TestResultUpdateRequest body = new TestResultUpdateRequest(); // TestResultUpdateRequest | 
String workspaceId = "workspaceId_example"; // String | Unique identifier representing a workspace.
String resultId = "resultId_example"; // String | Unique identifier representing a specific test result.
try {
    TestResultDefinition result = apiInstance.updateTestResult(body, workspaceId, resultId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#updateTestResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TestResultUpdateRequest**](TestResultUpdateRequest.md)|  |
 **workspaceId** | **String**| Unique identifier representing a workspace. |
 **resultId** | **String**| Unique identifier representing a specific test result. |

### Return type

[**TestResultDefinition**](TestResultDefinition.md)

### Authorization

[NeoloadAuthorizer](../README.md#NeoloadAuthorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

