# PatchCustomEventResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique ID of the custom event patched. |  [optional]
**offset** | [**BigDecimal**](BigDecimal.md) | Custom event start timestamp in milliseconds, relative to bench start timestamp. |  [optional]
**duration** | [**BigDecimal**](BigDecimal.md) | Custom event duration in milliseconds. |  [optional]
**timeframe** | [**TimeframeEnum**](#TimeframeEnum) |  |  [optional]
**fullname** | **String** | Custom event name. Max length 256 chars. |  [optional]
**code** | **String** | Custom event code. Max length 64 chars. |  [optional]
**source** | **String** | Custom event source. Max length 32 chars. |  [optional]
**description** | **String** | Custom event description. Max length 512 chars. |  [optional]
**url** | **String** | Custom event URL. Max length 2048 chars. |  [optional]

<a name="TimeframeEnum"></a>
## Enum: TimeframeEnum
Name | Value
---- | -----
TIME_RANGE | &quot;TIME_RANGE&quot;
INSTANT | &quot;INSTANT&quot;
