

# Update

An SDI status update for a sent invoice.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier. For POST requests, leave it at &#x60;0&#x60; — the server will assign one automatically. For PUT requests, set it to the id of the record you want to update. |  [optional] |
|**created** | **OffsetDateTime** | Creation date. It is set automatically. |  [optional] [readonly] |
|**version** | **Integer** | Row version, for optimistic concurrency. It is set automatically. |  [optional] [readonly] |
|**userId** | **Integer** | User id. |  [optional] |
|**companyId** | **Integer** | Company id. |  [optional] |
|**sendId** | **Integer** | Send id. This is the id of the sent invoice to which this update refers to. |  [optional] |
|**lastUpdate** | **OffsetDateTime** | Last update from SDI. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | State of the document. These are the possible values, as per the SDI documentation: |  [optional] |
|**description** | **String** | Description for the state. |  [optional] |
|**messageId** | **String** | SDI message id. |  [optional] |
|**errors** | [**List&lt;Error&gt;**](Error.md) | SDI errors, if any. |  [optional] |
|**isRead** | **Boolean** | Whether the item has been read at least once. |  [optional] |
|**send** | [**SendReduced**](SendReduced.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| INVIATO | &quot;Inviato&quot; |
| CONSEGNATO | &quot;Consegnato&quot; |
| NON_CONSEGNATO | &quot;NonConsegnato&quot; |
| SCARTATO | &quot;Scartato&quot; |
| ACCETTATO_DAL_DESTINATARIO | &quot;AccettatoDalDestinatario&quot; |
| RIFIUTATO_DAL_DESTINATARIO | &quot;RifiutatoDalDestinatario&quot; |
| IMPOSSIBILITA_DI_RECAPITO | &quot;ImpossibilitaDiRecapito&quot; |
| DECORRENZA_TERMINI | &quot;DecorrenzaTermini&quot; |
| ATTESTAZIONE_TRASMISSIONE_FATTURA | &quot;AttestazioneTrasmissioneFattura&quot; |


## Implemented Interfaces

* Serializable


