# swagger-java-client

NeoLoad API
- API version: 3.0
  - Build date: 2020-06-12T09:30:22.329+02:00[Europe/Paris]

No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ResourcesApi;

import java.io.File;
import java.util.*;

public class ResourcesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: NeoloadAuthorizer
        ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
        NeoloadAuthorizer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //NeoloadAuthorizer.setApiKeyPrefix("Token");

        ResourcesApi apiInstance = new ResourcesApi();
        String fromDateTime = "fromDateTime_example"; // String | Date-time with an offset of the beginning of the search. Format YYYY-MM-DDTHH:mm:ssZ<br/> Example 2020-01-01T09:00:00+00:00
        String toDateTime = "toDateTime_example"; // String | Date-time with an offset of the end of the search. Format YYYY-MM-DDTHH:mm:ssZ<br/> Example 2020-01-01T09:00:00+00:00
        Integer limit = 50; // Integer | The maximum number of elements returned by this call. The maximum must be less than or equal to 200.
        Integer offset = 0; // Integer | The offset of the first element to return. Starting at this offset, the query will return a maximum of 'limit' elements.
        try {
            ArrayOfReservationDefinition result = apiInstance.getReservations(fromDateTime, toDateTime, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResourcesApi#getReservations");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ResourcesApi;

import java.io.File;
import java.util.*;

public class ResourcesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: NeoloadAuthorizer
        ApiKeyAuth NeoloadAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("NeoloadAuthorizer");
        NeoloadAuthorizer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //NeoloadAuthorizer.setApiKeyPrefix("Token");

        ResourcesApi apiInstance = new ResourcesApi();
        try {
            ArrayOfZoneDefinition result = apiInstance.getZones();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResourcesApi#getZones");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://your-hostname.com/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ResourcesApi* | [**getReservations**](docs/ResourcesApi.md#getReservations) | **GET** /resources/reservations | Lists reservations
*ResourcesApi* | [**getZones**](docs/ResourcesApi.md#getZones) | **GET** /resources/zones | List all zones
*ResultsApi* | [**deleteTestResult**](docs/ResultsApi.md#deleteTestResult) | **DELETE** /workspaces/{workspaceId}/test-results/{resultId} | Deletes a test result
*ResultsApi* | [**getTestResult**](docs/ResultsApi.md#getTestResult) | **GET** /workspaces/{workspaceId}/test-results/{resultId} | Test result description
*ResultsApi* | [**getTestResultElementDefinition**](docs/ResultsApi.md#getTestResultElementDefinition) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/elements/{elementId} | Test result element definition
*ResultsApi* | [**getTestResultElements**](docs/ResultsApi.md#getTestResultElements) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/elements | Test result elements
*ResultsApi* | [**getTestResultElementsPercentiles**](docs/ResultsApi.md#getTestResultElementsPercentiles) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/elements/{elementId}/percentiles | Test result percentiles transaction since the beginning of the test result
*ResultsApi* | [**getTestResultElementsPoints**](docs/ResultsApi.md#getTestResultElementsPoints) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/elements/{elementId}/points | Test results elements points since the beginning of the test result
*ResultsApi* | [**getTestResultElementsSla**](docs/ResultsApi.md#getTestResultElementsSla) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/elements/{elementId}/sla | Test result elements SLA status since the beginning of the test result
*ResultsApi* | [**getTestResultElementsValues**](docs/ResultsApi.md#getTestResultElementsValues) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/elements/{elementId}/values | Test result elements values
*ResultsApi* | [**getTestResultEvents**](docs/ResultsApi.md#getTestResultEvents) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/events | Test result events
*ResultsApi* | [**getTestResultGraph**](docs/ResultsApi.md#getTestResultGraph) | **POST** /workspaces/{workspaceId}/test-results/{resultId}/graph | Test result Graph
*ResultsApi* | [**getTestResultList**](docs/ResultsApi.md#getTestResultList) | **GET** /workspaces/{workspaceId}/test-results | Lists test results
*ResultsApi* | [**getTestResultMonitorDefinition**](docs/ResultsApi.md#getTestResultMonitorDefinition) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/monitors/{counterId} | Test result counter definition
*ResultsApi* | [**getTestResultMonitors**](docs/ResultsApi.md#getTestResultMonitors) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/monitors | Test result monitors
*ResultsApi* | [**getTestResultMonitorsPoints**](docs/ResultsApi.md#getTestResultMonitorsPoints) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/monitors/{counterId}/points | Test result monitors points
*ResultsApi* | [**getTestResultMonitorsValues**](docs/ResultsApi.md#getTestResultMonitorsValues) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/monitors/{counterId}/values | Test result monitors values
*ResultsApi* | [**getTestResultMultiGraph**](docs/ResultsApi.md#getTestResultMultiGraph) | **POST** /workspaces/{workspaceId}/test-results/graph | Test results MultiGraph
*ResultsApi* | [**getTestResultSLAGlobalIndicators**](docs/ResultsApi.md#getTestResultSLAGlobalIndicators) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/slas/statistics | SLAs global indicators
*ResultsApi* | [**getTestResultSLAPerInterval**](docs/ResultsApi.md#getTestResultSLAPerInterval) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/slas/per-interval | SLAs per time interval
*ResultsApi* | [**getTestResultSLAPerTest**](docs/ResultsApi.md#getTestResultSLAPerTest) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/slas/per-test | SLAs per test
*ResultsApi* | [**getTestResultStatistics**](docs/ResultsApi.md#getTestResultStatistics) | **GET** /workspaces/{workspaceId}/test-results/{resultId}/statistics | Test result main statistics
*ResultsApi* | [**postTestResultMonitors**](docs/ResultsApi.md#postTestResultMonitors) | **POST** /workspaces/{workspaceId}/test-results/{resultId}/monitors | Create custom monitors
*ResultsApi* | [**stopTestResult**](docs/ResultsApi.md#stopTestResult) | **POST** /workspaces/{workspaceId}/test-results/{resultId}/stop | Stop a running test result
*ResultsApi* | [**updateTestResult**](docs/ResultsApi.md#updateTestResult) | **PUT** /workspaces/{workspaceId}/test-results/{resultId} | Update a test result
*RuntimeApi* | [**deleteTest**](docs/RuntimeApi.md#deleteTest) | **DELETE** /workspaces/{workspaceId}/tests/{testId} | Delete a test
*RuntimeApi* | [**getTest**](docs/RuntimeApi.md#getTest) | **GET** /workspaces/{workspaceId}/tests/{testId} | Get a test
*RuntimeApi* | [**getTestList**](docs/RuntimeApi.md#getTestList) | **GET** /workspaces/{workspaceId}/tests | Get a test list
*RuntimeApi* | [**getTestsRun**](docs/RuntimeApi.md#getTestsRun) | **POST** /workspaces/{workspaceId}/tests/{testId}/start | Starts a test
*RuntimeApi* | [**patchTest**](docs/RuntimeApi.md#patchTest) | **PATCH** /workspaces/{workspaceId}/tests/{testId} | Partially update a test
*RuntimeApi* | [**postCreateTest**](docs/RuntimeApi.md#postCreateTest) | **POST** /workspaces/{workspaceId}/tests | Create a new test
*RuntimeApi* | [**postUploadProject**](docs/RuntimeApi.md#postUploadProject) | **POST** /workspaces/{workspaceId}/tests/{testId}/project | Uploads a NeoLoad project zip file or a standalone as code file
*RuntimeApi* | [**putTest**](docs/RuntimeApi.md#putTest) | **PUT** /workspaces/{workspaceId}/tests/{testId} | Fully update a test
*RuntimeApi* | [**readProjectMetadata**](docs/RuntimeApi.md#readProjectMetadata) | **GET** /workspaces/{workspaceId}/tests/{testId}/project | Get project&#x27;s metadata
*WorkspacesApi* | [**getWorkspaceList**](docs/WorkspacesApi.md#getWorkspaceList) | **GET** /workspaces | Get the list workspaces that can be accessed

## Documentation for Models

 - [ArrayOfElementDefinition](docs/ArrayOfElementDefinition.md)
 - [ArrayOfEventDefinition](docs/ArrayOfEventDefinition.md)
 - [ArrayOfReservationDefinition](docs/ArrayOfReservationDefinition.md)
 - [ArrayOfSLAGlobalIndicatorDefinition](docs/ArrayOfSLAGlobalIndicatorDefinition.md)
 - [ArrayOfSLAPerIntervalDefinition](docs/ArrayOfSLAPerIntervalDefinition.md)
 - [ArrayOfSLAPerTestResultDefinition](docs/ArrayOfSLAPerTestResultDefinition.md)
 - [ArrayOfTestResultDefinition](docs/ArrayOfTestResultDefinition.md)
 - [ArrayOfZoneDefinition](docs/ArrayOfZoneDefinition.md)
 - [AsCodeFile](docs/AsCodeFile.md)
 - [Body](docs/Body.md)
 - [CounterDefinition](docs/CounterDefinition.md)
 - [CounterDefinitionArray](docs/CounterDefinitionArray.md)
 - [CounterValues](docs/CounterValues.md)
 - [CustomMonitor](docs/CustomMonitor.md)
 - [CustomMonitorValues](docs/CustomMonitorValues.md)
 - [CustomMonitorValuesInner](docs/CustomMonitorValuesInner.md)
 - [ElementDefinition](docs/ElementDefinition.md)
 - [ElementIdDefinition](docs/ElementIdDefinition.md)
 - [ElementValues](docs/ElementValues.md)
 - [Empty](docs/Empty.md)
 - [Error](docs/Error.md)
 - [EventDefinition](docs/EventDefinition.md)
 - [EventType](docs/EventType.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [LastChangeDefinition](docs/LastChangeDefinition.md)
 - [LgByZones](docs/LgByZones.md)
 - [MonitorPostRequest](docs/MonitorPostRequest.md)
 - [Percentiles](docs/Percentiles.md)
 - [PercentilesPoints](docs/PercentilesPoints.md)
 - [Point](docs/Point.md)
 - [Points](docs/Points.md)
 - [ProjectDefinition](docs/ProjectDefinition.md)
 - [RateLimitError](docs/RateLimitError.md)
 - [ReservationDefinition](docs/ReservationDefinition.md)
 - [ReservationOwner](docs/ReservationOwner.md)
 - [RunTestDefinition](docs/RunTestDefinition.md)
 - [SLAElementDefinition](docs/SLAElementDefinition.md)
 - [SLAGlobalIndicatorDefinition](docs/SLAGlobalIndicatorDefinition.md)
 - [SLAKPIDefinition](docs/SLAKPIDefinition.md)
 - [SLAPerIntervalDefinition](docs/SLAPerIntervalDefinition.md)
 - [SLAPerTestResultDefinition](docs/SLAPerTestResultDefinition.md)
 - [SLAStatusDefinition](docs/SLAStatusDefinition.md)
 - [ScenarioDefinition](docs/ScenarioDefinition.md)
 - [SimpleResourceApiDefinition](docs/SimpleResourceApiDefinition.md)
 - [Sla](docs/Sla.md)
 - [TestCreate](docs/TestCreate.md)
 - [TestCreateRequest](docs/TestCreateRequest.md)
 - [TestCreated](docs/TestCreated.md)
 - [TestDefinition](docs/TestDefinition.md)
 - [TestDefinitionList](docs/TestDefinitionList.md)
 - [TestResultDefinition](docs/TestResultDefinition.md)
 - [TestResultIdDefinition](docs/TestResultIdDefinition.md)
 - [TestResultRasterConfiguration](docs/TestResultRasterConfiguration.md)
 - [TestResultRasterMultiConfiguration](docs/TestResultRasterMultiConfiguration.md)
 - [TestResultStatistics](docs/TestResultStatistics.md)
 - [TestResultStopRequest](docs/TestResultStopRequest.md)
 - [TestResultUpdateRequest](docs/TestResultUpdateRequest.md)
 - [TestUpdate](docs/TestUpdate.md)
 - [ThresholdDefinition](docs/ThresholdDefinition.md)
 - [WorkspaceDefinition](docs/WorkspaceDefinition.md)
 - [WorkspaceDefinitionList](docs/WorkspaceDefinitionList.md)
 - [ZoneDefinition](docs/ZoneDefinition.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### NeoloadAuthorizer

- **Type**: API key
- **API key parameter name**: accountToken
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


