

# WebHookHistory

Webhook history.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier. For POST requests, leave it at &#x60;0&#x60; — the server will assign one automatically. For PUT requests, set it to the id of the record you want to update. |  [optional] |
|**created** | **OffsetDateTime** | Creation date. It is set automatically. |  [optional] [readonly] |
|**version** | **Integer** | Row version, for optimistic concurrency. It is set automatically. |  [optional] [readonly] |
|**webHookId** | **Integer** | Webhook id. |  [optional] |
|**userId** | **Integer** | User id. |  [optional] |
|**event** | **String** | Event name. |  [optional] |
|**statusCode** | **Integer** | HTTP status code returned by the webhook endpoint. A value of 0 means the request could not be completed due to a network error (e.g., DNS resolution failure, connection refused, or timeout). This typically indicates that the endpoint URL is misconfigured or no longer exists. |  [optional] |
|**error** | **String** | Error description, if any. Null when the delivery is successful (2xx). Contains the exception message for network errors (status code 0) or the response body for non-2xx HTTP responses. |  [optional] |
|**dateTime** | **OffsetDateTime** | Date and time of the request. |  [optional] |
|**success** | **Boolean** | Whether the request was successful. |  [optional] [readonly] |


## Implemented Interfaces

* Serializable


