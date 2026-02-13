# ExportApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exportGet**](ExportApi.md#exportGet) | **GET** /export | Export invoices as a ZIP archive |


<a id="exportGet"></a>
# **exportGet**
> exportGet(type, companyId, year, month, quarter, documentDateFrom, documentDateTo)

Export invoices as a ZIP archive

Export invoices as a ZIP archive of FatturaPA XML files, suitable for import into accounting software (TeamSystem, Zucchetti, etc.).  **Sent invoices** are only included when they have reached a definitive state (e.g., &#x60;Consegnato&#x60; for private recipients, &#x60;AccettatoDalDestinatario&#x60;, &#x60;DecorrenzaTermini&#x60;, etc.). Invoices still being processed by SDI are excluded.  **Received invoices** are always included. Unread invoices are automatically marked as read and counted as operations.  ### Period filters  You can filter by period using either: - &#x60;year&#x60; + &#x60;month&#x60; (e.g., &#x60;year&#x3D;2026&amp;month&#x3D;3&#x60; for March 2026) - &#x60;year&#x60; + &#x60;quarter&#x60; (e.g., &#x60;year&#x3D;2026&amp;quarter&#x3D;1&#x60; for Q1 Jan-Mar) - &#x60;document_date_from&#x60; / &#x60;document_date_to&#x60; for a custom date range  These options are mutually exclusive. The &#x60;year&#x60; parameter alone is not valid and requires either &#x60;month&#x60; or &#x60;quarter&#x60;.  ### Response  Returns &#x60;200&#x60; with a ZIP archive, or &#x60;204 No Content&#x60; if no invoices match the given filters. Files in the archive are organized by company VAT number (&#x60;{vat}/send/&#x60;, &#x60;{vat}/receive/&#x60;).  ### Rate limiting  This endpoint has a dedicated rate limit: only one export request per user can be processed at a time. Concurrent requests will receive a &#x60;429 Too Many Requests&#x60; response.

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.ExportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ExportApi apiInstance = new ExportApi(defaultClient);
    String type = "Send"; // String | 
    Integer companyId = 56; // Integer | Company id
    Integer year = 56; // Integer | 
    Integer month = 56; // Integer | 
    Integer quarter = 56; // Integer | 
    OffsetDateTime documentDateFrom = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    OffsetDateTime documentDateTo = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    try {
      apiInstance.exportGet(type, companyId, year, month, quarter, documentDateFrom, documentDateTo);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportApi#exportGet");
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
| **type** | **String**|  | [optional] [default to Both] [enum: Send, Receive, Both] |
| **companyId** | **Integer**| Company id | [optional] |
| **year** | **Integer**|  | [optional] |
| **month** | **Integer**|  | [optional] |
| **quarter** | **Integer**|  | [optional] |
| **documentDateFrom** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |
| **documentDateTo** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |

