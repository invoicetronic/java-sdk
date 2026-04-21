

# WebHook

A webhook subscription.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier. For POST requests, leave it at &#x60;0&#x60; — the server will assign one automatically. For PUT requests, set it to the id of the record you want to update. |  [optional] |
|**created** | **OffsetDateTime** | Creation date. It is set automatically. |  [optional] [readonly] |
|**version** | **Integer** | Row version, for optimistic concurrency. It is set automatically. |  [optional] [readonly] |
|**userId** | **Integer** | User id. It is set automatically based on the authenticated user. |  [optional] [readonly] |
|**companyId** | **Integer** | Optional company id. If set, the webhook is restricted to events for that company; if omitted, it fires for all companies on the account. |  [optional] |
|**url** | **String** | The url of your application&#39;s endpoint that will receive a POST request when the webhook is fired. |  |
|**enabled** | **Boolean** | Whether the webhook is enabled. On creation, this is set to &#x60;true&#x60;. |  [optional] |
|**secret** | **String** | The secret used to generate webhook signatures, only returned on creation. You should store this value securely and validate it on every call, to ensure that the caller is InvoicetronicApi. |  [optional] |
|**description** | **String** | An optional description. |  [optional] |
|**events** | **List&lt;String&gt;** | List of events that trigger the webhook. See Invoicetronic.SupportedEvents.Available for a list of valid event names. |  [optional] |
|**failureNotifiedAt** | **OffsetDateTime** | Timestamp of the last failure notification email sent for this webhook. Set by the notifier service; reset to null on successful delivery. |  [optional] [readonly] |


## Implemented Interfaces

* Serializable


