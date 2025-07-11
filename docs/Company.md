

# Company

A company model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier. Leave it at 0 for new records as it will be set automatically. |  [optional] |
|**created** | **OffsetDateTime** | Creation date. It is set automatically. |  [optional] |
|**version** | **Integer** | Row version, for optimistic concurrency. It is set automatically. |  [optional] |
|**userId** | **Integer** | User id. |  [optional] |
|**vat** | **String** | Vat number. Must include the country code. |  |
|**fiscalCode** | **String** | Fiscal code. In most cases it&#39;s the same as the vat number. |  |
|**name** | **String** | Name |  |


## Implemented Interfaces

* Serializable


