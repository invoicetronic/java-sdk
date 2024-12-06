

# WebHookHistory

Webhook history.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier. Leave it at 0 for new records as it will be set automatically. |  [optional] |
|**created** | **OffsetDateTime** | Creation date. It is set automatically. |  [optional] |
|**version** | **Integer** | Row version, for optimistic concurrency. It is set automatically. |  [optional] |
|**webHookId** | **Integer** | Webhook id. |  [optional] |
|**userId** | **Integer** | User id. |  [optional] |
|**event** | **String** | Event name. |  [optional] |
|**statusCode** | **Integer** | Status code. |  [optional] |
|**requestBody** | **String** | Webhook request body. |  [optional] |
|**responseBody** | **String** | Webhook response body. |  [optional] |
|**dateTime** | **OffsetDateTime** | Date and time of the request. |  [optional] |
|**success** | **Boolean** | Wether the request was successful. |  [optional] [readonly] |


## Implemented Interfaces

* Serializable


