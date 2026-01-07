

# Event


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier. Leave it at 0 for new records as it will be set automatically. |  [optional] |
|**created** | **OffsetDateTime** | Creation date. It is set automatically. |  [optional] |
|**version** | **Integer** | Row version, for optimistic concurrency. It is set automatically. |  [optional] |
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
|**success** | **Boolean** | Wether the request was successful. |  [optional] [readonly] |
|**query** | **String** | Request query. Only used for internal logging, not sent to webhooks. |  [optional] |
|**responseBody** | **String** | Response payload. It is guaranteed to be cyphered at rest. |  [optional] |


## Implemented Interfaces

* Serializable


