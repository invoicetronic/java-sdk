# LogApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**logGet**](LogApi.md#logGet) | **GET** /log | List events |
| [**logIdGet**](LogApi.md#logIdGet) | **GET** /log/{id} | Get an event by id |


<a id="logGet"></a>
# **logGet**
> List&lt;Event&gt; logGet(companyId, endpoint, method, apiVerion, statusCode, dateCreatedFrom, dateCreatedTo, page, pageSize, sort, query, success, dateTimeFrom, dateTimeTo)

List events

Every API operation is logged and can be retrieved here. Log records are preserved for 15 days.

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.LogApi;

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
    Integer page = 1; // Integer | Page number.
    Integer pageSize = 100; // Integer | Items per page. Cannot be greater than 200.
    String sort = "sort_example"; // String | Sort by field. Prefix with '-' for descending order.
    String query = "query_example"; // String | 
    Boolean success = true; // Boolean | 
    OffsetDateTime dateTimeFrom = OffsetDateTime.now(); // OffsetDateTime | Date and time of the event
    OffsetDateTime dateTimeTo = OffsetDateTime.now(); // OffsetDateTime | Date and time of the event
    try {
      List<Event> result = apiInstance.logGet(companyId, endpoint, method, apiVerion, statusCode, dateCreatedFrom, dateCreatedTo, page, pageSize, sort, query, success, dateTimeFrom, dateTimeTo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogApi#logGet");
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
| **page** | **Integer**| Page number. | [optional] [default to 1] |
| **pageSize** | **Integer**| Items per page. Cannot be greater than 200. | [optional] [default to 100] |
| **sort** | **String**| Sort by field. Prefix with &#39;-&#39; for descending order. | [optional] |
| **query** | **String**|  | [optional] |
| **success** | **Boolean**|  | [optional] |
| **dateTimeFrom** | **OffsetDateTime**| Date and time of the event | [optional] |
| **dateTimeTo** | **OffsetDateTime**| Date and time of the event | [optional] |

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

<a id="logIdGet"></a>
# **logIdGet**
> Event logIdGet(id)

Get an event by id

Every API operation is logged and can be retrieved here. Log records are preserved for 15 days.

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.LogApi;

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
      Event result = apiInstance.logIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogApi#logIdGet");
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

