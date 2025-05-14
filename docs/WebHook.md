

# WebHook


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier. Leave it at 0 for new records as it will be set automatically. |  [optional] |
|**created** | **OffsetDateTime** | Creation date. It is set automatically. |  [optional] |
|**version** | **Integer** | Row version, for optimistic concurrency. It is set automatically. |  [optional] |
|**userId** | **Integer** | User id. |  [optional] |
|**companyId** | **Integer** | Company id. |  [optional] |
|**url** | **String** | The url of your application&#39;s endpoint that will receive a POST request when the webhook is fired. |  [optional] |
|**enabled** | **Boolean** | Wether the webhook is enabled. On creation, this is set to &#x60;true&#x60;. |  [optional] |
|**secret** | **String** | The secret used to generate webhook signatures, only returned on creation. You should store this value securely and validate it on every call, to ensure that the caller is InvoicetronicApi. |  [optional] |
|**description** | **String** | An optional description. |  [optional] |
|**events** | **List&lt;String&gt;** | List of events to that trigger the webhook.  See Invoicetronic.SupportedEvents.Available for a list of valid event names. |  [optional] |


## Implemented Interfaces

* Serializable


