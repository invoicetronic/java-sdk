

# Event


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier. Leave it at 0 for new records as it will be set automatically. |  [optional] |
|**created** | **OffsetDateTime** | Creation date. It is set automatically. |  [optional] |
|**version** | **Integer** | Row version, for optimistic concurrency. It is set automatically. |  [optional] |
|**companyId** | **Integer** | Company id. |  [optional] |
|**method** | **String** | Request method. |  [optional] |
|**query** | **String** | Request query. |  [optional] |
|**endpoint** | **String** | API endpoint. |  [optional] |
|**apiVersion** | **Integer** | Api version. |  [optional] |
|**statusCode** | **Integer** | Status code returned by the API. |  [optional] |
|**dateTime** | **OffsetDateTime** | Date and time of the request. |  [optional] |
|**error** | **String** | Response error. |  [optional] |
|**requestBody** | **String** | Request payload. It is guaranteed to be cyphered at rest. |  [optional] |
|**responseBody** | **String** | Response payload. It is guaranteed to be cyphered at rest. |  [optional] |
|**success** | **Boolean** | Wether the request was successful. |  [optional] [readonly] |
|**userId** | **Integer** | User id. |  [optional] |
|**apiKeyId** | **Integer** | Api key id. |  [optional] |


## Implemented Interfaces

* Serializable


