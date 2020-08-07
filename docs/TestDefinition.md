# TestDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier of the test. |  [optional]
**name** | **String** | Name of the test. |  [optional]
**description** | **String** | Description of the test. |  [optional]
**userModifierName** | **String** | Identifier of the user who modified the test. |  [optional]
**creationDate** | **Long** | Timestamp when the test was created. Number of seconds since January 1, 1970. |  [optional]
**lastUpdateDate** | **Long** | Timestamp when the test was updated for the last time. Number of seconds since January 1, 1970. |  [optional]
**scenarioName** | **String** | The name of the selected scenario. |  [optional]
**controllerZoneId** | **String** | The identifier of the controller. |  [optional]
**projectId** | **String** | Id of project file. |  [optional]
**projectName** | **String** | Name of the project. |  [optional]
**lgZoneIds** | **Map&lt;String, Integer&gt;** | The LG zones with the number of the LGs. |  [optional]
**lastRunDate** | **Long** | Timestamp when the test was ran for the last time. Number of seconds since January 1, 1970. |  [optional]
**nextRunId** | [**BigDecimal**](BigDecimal.md) | The next run number. The value is incremented at each execution of the test. |  [optional]
**testResultNamingPattern** | **String** | Pattern of the test results name. |  [optional]
