# LogApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**invoiceV1LogGet**](LogApi.md#invoiceV1LogGet) | **GET** /invoice/v1/log | List events |
| [**invoiceV1LogIdGet**](LogApi.md#invoiceV1LogIdGet) | **GET** /invoice/v1/log/{id} | Get an event by id |


<a id="invoiceV1LogGet"></a>
# **invoiceV1LogGet**
> List&lt;Event&gt; invoiceV1LogGet(companyId, endpoint, method, apiVerion, statusCode, dateCreatedFrom, dateCreatedTo, page, pageSize)

List events

Every API operation is logged and can be retrieved here.

### Example
```java
// Import classes:
import com.invoicetronic.invoice.sdk.ApiClient;
import com.invoicetronic.invoice.sdk.ApiException;
import com.invoicetronic.invoice.sdk.Configuration;
import com.invoicetronic.invoice.sdk.auth.*;
import com.invoicetronic.invoice.sdk.models.*;
import com.invoicetronic.invoice.sdk.api.LogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    LogApi apiInstance = new LogApi(defaultClient);
    Integer companyId = 56; // Integer | Company id
    String endpoint = "endpoint_example"; // String | 
    String method = "method_example"; // String | 
    Integer apiVerion = 56; // Integer | Api version
    Integer statusCode = 56; // Integer | Response status code
    OffsetDateTime dateCreatedFrom = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    OffsetDateTime dateCreatedTo = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    Integer page = 1; // Integer | Page number. Defaults to 1.
    Integer pageSize = 100; // Integer | Items per page. Defaults to 50. Cannot be greater than 200.
    try {
      List<Event> result = apiInstance.invoiceV1LogGet(companyId, endpoint, method, apiVerion, statusCode, dateCreatedFrom, dateCreatedTo, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogApi#invoiceV1LogGet");
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
| **endpoint** | **String**|  | [optional] |
| **method** | **String**|  | [optional] |
| **apiVerion** | **Integer**| Api version | [optional] |
| **statusCode** | **Integer**| Response status code | [optional] |
| **dateCreatedFrom** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |
| **dateCreatedTo** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |
| **page** | **Integer**| Page number. Defaults to 1. | [optional] [default to 1] |
| **pageSize** | **Integer**| Items per page. Defaults to 50. Cannot be greater than 200. | [optional] [default to 100] |

### Return type

[**List&lt;Event&gt;**](Event.md)

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

<a id="invoiceV1LogIdGet"></a>
# **invoiceV1LogIdGet**
> Event invoiceV1LogIdGet(id)

Get an event by id

Every API operation is logged and can be retrieved here.

### Example
```java
// Import classes:
import com.invoicetronic.invoice.sdk.ApiClient;
import com.invoicetronic.invoice.sdk.ApiException;
import com.invoicetronic.invoice.sdk.Configuration;
import com.invoicetronic.invoice.sdk.auth.*;
import com.invoicetronic.invoice.sdk.models.*;
import com.invoicetronic.invoice.sdk.api.LogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    LogApi apiInstance = new LogApi(defaultClient);
    Integer id = 56; // Integer | Item id
    try {
      Event result = apiInstance.invoiceV1LogIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogApi#invoiceV1LogIdGet");
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

[**Event**](Event.md)

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

