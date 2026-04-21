

# Event

An API request log entry.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier. For POST requests, leave it at &#x60;0&#x60; — the server will assign one automatically. For PUT requests, set it to the id of the record you want to update. |  [optional] |
|**created** | **OffsetDateTime** | Creation date. It is set automatically. |  [optional] [readonly] |
|**version** | **Integer** | Row version, for optimistic concurrency. It is set automatically. |  [optional] [readonly] |
|**userId** | **Integer** | User id. |  [optional] |
|**apiKeyId** | **Integer** | Api key id. |  [optional] |
|**companyId** | **Integer** | Company id. |  [optional] |
|**method** | **String** | Request method. |  |
|**endpoint** | **String** | API endpoint. |  |
|**apiVersion** | **Integer** | Api version. |  [optional] |
|**statusCode** | **Integer** | Status code returned by the API. |  [optional] |
|**dateTime** | **OffsetDateTime** | Date and time of the request. |  [optional] |
|**error** | **String** | Response error. |  [optional] |
|**resourceId** | **Integer** | ID of the resource created or modified by this request. |  [optional] |
|**userAgent** | **String** | User-Agent header from the HTTP request. |  [optional] |
|**success** | **Boolean** | Whether the request was successful. |  [optional] [readonly] |
|**query** | **String** | Request query. Only used for internal logging, not sent to webhooks. |  [optional] |
|**responseBody** | **String** | Response payload. It is guaranteed to be encrypted at rest. |  [optional] |


## Implemented Interfaces

* Serializable


