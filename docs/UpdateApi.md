# UpdateApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**invoiceV1UpdateGet**](UpdateApi.md#invoiceV1UpdateGet) | **GET** /invoice/v1/update | List updates |
| [**invoiceV1UpdateIdGet**](UpdateApi.md#invoiceV1UpdateIdGet) | **GET** /invoice/v1/update/{id} | Get an update by id |


<a id="invoiceV1UpdateGet"></a>
# **invoiceV1UpdateGet**
> List&lt;Update&gt; invoiceV1UpdateGet(companyId, identifier, unread, sendId, state, lastUpdateFrom, lastUpdateTo, dateSentFrom, dateSentTo, page, pageSize)

List updates

Updates are notifications that are sent by the SDI about the status of sent invoices.

### Example
```java
// Import classes:
import com.invoicetronic.invoice.sdk.ApiClient;
import com.invoicetronic.invoice.sdk.ApiException;
import com.invoicetronic.invoice.sdk.Configuration;
import com.invoicetronic.invoice.sdk.auth.*;
import com.invoicetronic.invoice.sdk.models.*;
import com.invoicetronic.invoice.sdk.api.UpdateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    UpdateApi apiInstance = new UpdateApi(defaultClient);
    Integer companyId = 56; // Integer | Company id.
    String identifier = "identifier_example"; // String | SDI identifier.
    Boolean unread = true; // Boolean | Only unread items.
    Integer sendId = 56; // Integer | Send item's id.
    String state = "Inviato"; // String | SDI state
    OffsetDateTime lastUpdateFrom = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    OffsetDateTime lastUpdateTo = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    OffsetDateTime dateSentFrom = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    OffsetDateTime dateSentTo = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 format (2024-11-29T12:34:56Z)
    Integer page = 1; // Integer | Page number.
    Integer pageSize = 100; // Integer | Items per page.
    try {
      List<Update> result = apiInstance.invoiceV1UpdateGet(companyId, identifier, unread, sendId, state, lastUpdateFrom, lastUpdateTo, dateSentFrom, dateSentTo, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UpdateApi#invoiceV1UpdateGet");
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
| **companyId** | **Integer**| Company id. | [optional] |
| **identifier** | **String**| SDI identifier. | [optional] |
| **unread** | **Boolean**| Only unread items. | [optional] |
| **sendId** | **Integer**| Send item&#39;s id. | [optional] |
| **state** | **String**| SDI state | [optional] [enum: Inviato, Consegnato, NonConsegnato, Scartato, AccettatoDalDestinatario, RifiutatoDalDestinatario, ImpossibilitàDiRecapito, DecorrenzaTermini, AttestazioneTrasmissioneFattura] |
| **lastUpdateFrom** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |
| **lastUpdateTo** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |
| **dateSentFrom** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |
| **dateSentTo** | **OffsetDateTime**| UTC ISO 8601 format (2024-11-29T12:34:56Z) | [optional] |
| **page** | **Integer**| Page number. | [optional] [default to 1] |
| **pageSize** | **Integer**| Items per page. | [optional] [default to 100] |

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

<a id="invoiceV1UpdateIdGet"></a>
# **invoiceV1UpdateIdGet**
> Update invoiceV1UpdateIdGet(id)

Get an update by id

Updates are notifications that are sent by the SDI about the status of sent invoices.

### Example
```java
// Import classes:
import com.invoicetronic.invoice.sdk.ApiClient;
import com.invoicetronic.invoice.sdk.ApiException;
import com.invoicetronic.invoice.sdk.Configuration;
import com.invoicetronic.invoice.sdk.auth.*;
import com.invoicetronic.invoice.sdk.models.*;
import com.invoicetronic.invoice.sdk.api.UpdateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    UpdateApi apiInstance = new UpdateApi(defaultClient);
    Integer id = 56; // Integer | Item id.
    try {
      Update result = apiInstance.invoiceV1UpdateIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UpdateApi#invoiceV1UpdateIdGet");
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
| **id** | **Integer**| Item id. | |

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

