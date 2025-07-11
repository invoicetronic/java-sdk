# ReceiveApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**receiveGet**](ReceiveApi.md#receiveGet) | **GET** /receive | List incoming invoices |
| [**receiveIdDelete**](ReceiveApi.md#receiveIdDelete) | **DELETE** /receive/{id} | Delete an incoming invoice by id |
| [**receiveIdGet**](ReceiveApi.md#receiveIdGet) | **GET** /receive/{id} | Get an incoming invoice by id |


<a id="receiveGet"></a>
# **receiveGet**
> List&lt;Receive&gt; receiveGet(companyId, identifier, unread, committente, prestatore, fileName, lastUpdateFrom, lastUpdateTo, dateSentFrom, dateSentTo, documentDateFrom, documentDateTo, documentNumber, includePayload, page, pageSize, sort)

List incoming invoices

Receive invoices are the invoices that are received from other companies. They are preserved for two years in the live environment and 24 hours in the Sandbox.

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.ReceiveApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ReceiveApi apiInstance = new ReceiveApi(defaultClient);
    Integer companyId = 56; // Integer | Company id
    String identifier = "identifier_example"; // String | SDI identifier.
    Boolean unread = true; // Boolean | Unread items only.
    String committente = "committente_example"; // String | Vat number or fiscal code.
    String prestatore = "prestatore_example"; // String | Vat number or fiscal code.
    String fileName = "fileName_example"; // String | File name.
    OffsetDateTime lastUpdateFrom = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    OffsetDateTime lastUpdateTo = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    OffsetDateTime dateSentFrom = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    OffsetDateTime dateSentTo = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    OffsetDateTime documentDateFrom = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    OffsetDateTime documentDateTo = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    String documentNumber = "documentNumber_example"; // String | Document number.
    Boolean includePayload = true; // Boolean | Include payload in the response. Defaults to false.
    Integer page = 1; // Integer | Page number.
    Integer pageSize = 100; // Integer | Items per page. Cannot be greater than 200.
    String sort = "sort_example"; // String | Sort by field. Prefix with '-' for descending order.
    try {
      List<Receive> result = apiInstance.receiveGet(companyId, identifier, unread, committente, prestatore, fileName, lastUpdateFrom, lastUpdateTo, dateSentFrom, dateSentTo, documentDateFrom, documentDateTo, documentNumber, includePayload, page, pageSize, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiveApi#receiveGet");
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
| **unread** | **Boolean**| Unread items only. | [optional] |
| **committente** | **String**| Vat number or fiscal code. | [optional] |
| **prestatore** | **String**| Vat number or fiscal code. | [optional] |
| **fileName** | **String**| File name. | [optional] |
| **lastUpdateFrom** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |
| **lastUpdateTo** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |
| **dateSentFrom** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |
| **dateSentTo** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |
| **documentDateFrom** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |
| **documentDateTo** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |
| **documentNumber** | **String**| Document number. | [optional] |
| **includePayload** | **Boolean**| Include payload in the response. Defaults to false. | [optional] |
| **page** | **Integer**| Page number. | [optional] [default to 1] |
| **pageSize** | **Integer**| Items per page. Cannot be greater than 200. | [optional] [default to 100] |
| **sort** | **String**| Sort by field. Prefix with &#39;-&#39; for descending order. | [optional] |

### Return type

[**List&lt;Receive&gt;**](Receive.md)

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

<a id="receiveIdDelete"></a>
# **receiveIdDelete**
> Receive receiveIdDelete(id)

Delete an incoming invoice by id

Receive invoices are the invoices that are received from other companies. They are preserved for two years in the live environment and 24 hours in the Sandbox.

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.ReceiveApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ReceiveApi apiInstance = new ReceiveApi(defaultClient);
    Integer id = 56; // Integer | Item id
    try {
      Receive result = apiInstance.receiveIdDelete(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiveApi#receiveIdDelete");
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

[**Receive**](Receive.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **422** | Unprocessable Content |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a id="receiveIdGet"></a>
# **receiveIdGet**
> Receive receiveIdGet(id, includePayload)

Get an incoming invoice by id

Receive invoices are the invoices that are received from other companies. They are preserved for two years in the live environment and 24 hours in the Sandbox.

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.ReceiveApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ReceiveApi apiInstance = new ReceiveApi(defaultClient);
    Integer id = 56; // Integer | Item id
    Boolean includePayload = false; // Boolean | Include payload in the response. Defaults to false.
    try {
      Receive result = apiInstance.receiveIdGet(id, includePayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiveApi#receiveIdGet");
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
| **includePayload** | **Boolean**| Include payload in the response. Defaults to false. | [optional] [default to false] |

### Return type

[**Receive**](Receive.md)

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

