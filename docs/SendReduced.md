

# SendReduced

Reduced Send data for Update responses, containing only the essential fields.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identifier** | **String** | SDI identifier. |  [optional] |
|**prestatore** | **String** | VAT number of the Cedente/Prestatore (vendor). |  [optional] |
|**metaData** | **Map&lt;String, String&gt;** | Optional metadata, as json. |  [optional] |
|**documents** | [**List&lt;DocumentData&gt;**](DocumentData.md) | The invoices included in the payload. |  [optional] |
|**dateSent** | **OffsetDateTime** | When the invoice was sent to SDI. |  [optional] |


## Implemented Interfaces

* Serializable


