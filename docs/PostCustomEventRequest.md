# PostCustomEventRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startTimestamp** | [**BigDecimal**](BigDecimal.md) | Custom event start epoch timestamp in seconds. If not provided, current time is used. |  [optional]
**endTimestamp** | [**BigDecimal**](BigDecimal.md) | Custom event end epoch timestamp in seconds. If not provided, then either startTimestamp is used (when timeframe is INSTANT), or test result end timestamp is used (when timeframe is TIME_RANGE). |  [optional]
**timeframe** | [**TimeframeEnum**](#TimeframeEnum) |  |  [optional]
**fullname** | **String** | Custom event name. Max length 256 chars. | 
**code** | **String** | Custom event code. Max length 64 chars. |  [optional]
**source** | **String** | Custom event source. Max length 32 chars. If not set, source is set to &#x27;External&#x27;. |  [optional]
**description** | **String** | Custom event description. Max length 2048 chars. |  [optional]
**url** | **String** | Custom event URL. Max length 2048 chars. |  [optional]

<a name="TimeframeEnum"></a>
## Enum: TimeframeEnum
Name | Value
---- | -----
TIME_RANGE | &quot;TIME_RANGE&quot;
INSTANT | &quot;INSTANT&quot;
