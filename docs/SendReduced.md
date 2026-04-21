

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
|**latestState** | [**LatestStateEnum**](#LatestStateEnum) | Current SDI state of the invoice. Reflects the most recent update received from SDI. |  [optional] |



## Enum: LatestStateEnum

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


