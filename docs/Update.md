

# Update


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier. Leave it at 0 for new records as it will be set automatically. |  [optional] |
|**created** | **OffsetDateTime** | Creation date. It is set automatically. |  [optional] |
|**version** | **Integer** | Row version, for optimistic concurrency. It is set automatically. |  [optional] |
|**userId** | **Integer** | User id. |  [optional] |
|**companyId** | **Integer** | Company id. |  [optional] |
|**sendId** | **Integer** | Send id. This is the id of the sent invoice to which this update refers to. |  [optional] |
|**dateSent** | **OffsetDateTime** | When the document was sent to the SDI. |  [optional] |
|**lastUpdate** | **OffsetDateTime** | Last update from SDI. |  [optional] |
|**identifier** | **String** | SDI identifier. This is set by the SDI and it is unique within the SDI system. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | State of the document. Theses are the possible values, as per the SDI documentation: |  [optional] |
|**description** | **String** | Description for the state. |  [optional] |
|**messageId** | **String** | SDI message id. |  [optional] |
|**errors** | [**List&lt;Error&gt;**](Error.md) | SDI errors, if any. |  [optional] |
|**isRead** | **Boolean** | Wether the item has been read at least once. |  [optional] |
|**metaData** | **Map&lt;String, String&gt;** | Metadata from the Send item this update refers to. |  [optional] |
|**documents** | [**List&lt;DocumentData&gt;**](DocumentData.md) | Invoice references from the Send item this update refers to. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| INVIATO | &quot;Inviato&quot; |
| CONSEGNATO | &quot;Consegnato&quot; |
| NON_CONSEGNATO | &quot;NonConsegnato&quot; |
| SCARTATO | &quot;Scartato&quot; |
| ACCETTATO_DAL_DESTINATARIO | &quot;AccettatoDalDestinatario&quot; |
| RIFIUTATO_DAL_DESTINATARIO | &quot;RifiutatoDalDestinatario&quot; |
| IMPOSSIBILIT_DI_RECAPITO | &quot;ImpossibilitàDiRecapito&quot; |
| DECORRENZA_TERMINI | &quot;DecorrenzaTermini&quot; |
| ATTESTAZIONE_TRASMISSIONE_FATTURA | &quot;AttestazioneTrasmissioneFattura&quot; |


## Implemented Interfaces

* Serializable


