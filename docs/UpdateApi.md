# UpdateApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateGet**](UpdateApi.md#updateGet) | **GET** /update | List updates |
| [**updateIdGet**](UpdateApi.md#updateIdGet) | **GET** /update/{id} | Get an update by id |


<a id="updateGet"></a>
# **updateGet**
> List&lt;Update&gt; updateGet(companyId, identifier, prestatore, unread, sendId, state, lastUpdateFrom, lastUpdateTo, dateSentFrom, dateSentTo, page, pageSize, sort)

List updates

Retrieve a paginated list of updates. Results can be filtered by various criteria such as company, send item, SDI state, and date ranges.  **Updates** are status notifications from Italy&#39;s SDI (Sistema di Interscambio) about invoices you sent. Multiple updates can exist for the same send item as the invoice progresses through the SDI workflow.  The &#x60;state&#x60; field is the most important property and can have the following values:  | Value | Name | Description | |-------|------|-------------| | 2 | &#x60;Inviato&#x60; | Sent to the SDI. | | 5 | &#x60;Consegnato&#x60; | Delivered to the recipient. | | 6 | &#x60;NonConsegnato&#x60; | Not delivered to the recipient. Only relevant for public administration entities. | | 7 | &#x60;Scartato&#x60; | Rejected by the SDI. | | 8 | &#x60;AccettatoDalDestinatario&#x60; | Accepted by the recipient. Only relevant for public administration entities. | | 9 | &#x60;RifiutatoDalDestinatario&#x60; | Rejected by the recipient. Only relevant for public administration entities. | | 10 | &#x60;ImpossibilitaDiRecapito&#x60; | Available on the recipient&#39;s tax drawer, but it was not possible to deliver it to the recipient&#39;s reception system. | | 11 | &#x60;DecorrenzaTermini&#x60; | A public administration entity has not responded for more than 15 days. The document is considered delivered. | | 12 | &#x60;AttestazioneTrasmissioneFattura&#x60; | A public administration entity has received the document, but has not yet processed it. |  **Important:** Always monitor the state of your sent invoices. A state of &#x60;Inviato&#x60; only means the invoice has been submitted to SDI, not that it has been delivered. A state like &#x60;Scartato&#x60; indicates that the invoice was **not** successfully delivered and may require corrective action, such as fixing validation errors and resubmitting. In that case, &#x60;description&#x60; contains the reason for the rejection.

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.UpdateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    UpdateApi apiInstance = new UpdateApi(defaultClient);
    Integer companyId = 56; // Integer | Company id
    String identifier = "identifier_example"; // String | SDI identifier.
    String prestatore = "prestatore_example"; // String | Vat number or fiscal code.
    Boolean unread = true; // Boolean | Unread items only.
    Integer sendId = 56; // Integer | Send item's id.
    String state = "Inviato"; // String | SDI state
    OffsetDateTime lastUpdateFrom = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    OffsetDateTime lastUpdateTo = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    OffsetDateTime dateSentFrom = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    OffsetDateTime dateSentTo = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    Integer page = 1; // Integer | Page number.
    Integer pageSize = 100; // Integer | Items per page. Cannot be greater than 200.
    String sort = "last_update"; // String | Sort by field. Prefix with '-' for descending order.
    try {
      List<Update> result = apiInstance.updateGet(companyId, identifier, prestatore, unread, sendId, state, lastUpdateFrom, lastUpdateTo, dateSentFrom, dateSentTo, page, pageSize, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UpdateApi#updateGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **companyId** | **Integer**| Company id | [optional] |
| **identifier** | **String**| SDI identifier. | [optional] |
| **prestatore** | **String**| Vat number or fiscal code. | [optional] |
| **unread** | **Boolean**| Unread items only. | [optional] |
| **sendId** | **Integer**| Send item&#39;s id. | [optional] |
| **state** | **String**| SDI state | [optional] [enum: Inviato, Consegnato, NonConsegnato, Scartato, AccettatoDalDestinatario, RifiutatoDalDestinatario, ImpossibilitaDiRecapito, DecorrenzaTermini, AttestazioneTrasmissioneFattura] |
| **lastUpdateFrom** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |
| **lastUpdateTo** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |
| **dateSentFrom** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |
| **dateSentTo** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |
| **page** | **Integer**| Page number. | [optional] [default to 1] |
| **pageSize** | **Integer**| Items per page. Cannot be greater than 200. | [optional] [default to 100] |
| **sort** | **String**| Sort by field. Prefix with &#39;-&#39; for descending order. | [optional] [default to last_update] |

### Return type

[**List&lt;Update&gt;**](Update.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **400** | Bad Request |  -  |

<a id="updateIdGet"></a>
# **updateIdGet**
> Update updateIdGet(id)

Get an update by id

Retrieve an update by its internal id.  **Updates** are status notifications from Italy&#39;s SDI (Sistema di Interscambio) about invoices you sent. Multiple updates can exist for the same send item as the invoice progresses through the SDI workflow.  The &#x60;state&#x60; field is the most important property and can have the following values:  | Value | Name | Description | |-------|------|-------------| | 2 | &#x60;Inviato&#x60; | Sent to the SDI. | | 5 | &#x60;Consegnato&#x60; | Delivered to the recipient. | | 6 | &#x60;NonConsegnato&#x60; | Not delivered to the recipient. Only relevant for public administration entities. | | 7 | &#x60;Scartato&#x60; | Rejected by the SDI. | | 8 | &#x60;AccettatoDalDestinatario&#x60; | Accepted by the recipient. Only relevant for public administration entities. | | 9 | &#x60;RifiutatoDalDestinatario&#x60; | Rejected by the recipient. Only relevant for public administration entities. | | 10 | &#x60;ImpossibilitaDiRecapito&#x60; | Available on the recipient&#39;s tax drawer, but it was not possible to deliver it to the recipient&#39;s reception system. | | 11 | &#x60;DecorrenzaTermini&#x60; | A public administration entity has not responded for more than 15 days. The document is considered delivered. | | 12 | &#x60;AttestazioneTrasmissioneFattura&#x60; | A public administration entity has received the document, but has not yet processed it. |  **Important:** Always monitor the state of your sent invoices. A state of &#x60;Inviato&#x60; only means the invoice has been submitted to SDI, not that it has been delivered. A state like &#x60;Scartato&#x60; indicates that the invoice was **not** successfully delivered and may require corrective action, such as fixing validation errors and resubmitting. In that case, &#x60;description&#x60; contains the reason for the rejection.

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.UpdateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    UpdateApi apiInstance = new UpdateApi(defaultClient);
    Integer id = 56; // Integer | Item id
    try {
      Update result = apiInstance.updateIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UpdateApi#updateIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| Item id | |

### Return type

[**Update**](Update.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |

