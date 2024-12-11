# WebhookApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**invoiceV1WebhookGet**](WebhookApi.md#invoiceV1WebhookGet) | **GET** /invoice/v1/webhook | List webhooks |
| [**invoiceV1WebhookIdDelete**](WebhookApi.md#invoiceV1WebhookIdDelete) | **DELETE** /invoice/v1/webhook/{id} | Delete a webhook by id |
| [**invoiceV1WebhookIdGet**](WebhookApi.md#invoiceV1WebhookIdGet) | **GET** /invoice/v1/webhook/{id} | Get a webhook by id |
| [**invoiceV1WebhookPost**](WebhookApi.md#invoiceV1WebhookPost) | **POST** /invoice/v1/webhook | Add a webhook |
| [**invoiceV1WebhookPut**](WebhookApi.md#invoiceV1WebhookPut) | **PUT** /invoice/v1/webhook | Update a webhook |
| [**invoiceV1WebhookhistoryGet**](WebhookApi.md#invoiceV1WebhookhistoryGet) | **GET** /invoice/v1/webhookhistory | List webhook history items |
| [**invoiceV1WebhookhistoryIdGet**](WebhookApi.md#invoiceV1WebhookhistoryIdGet) | **GET** /invoice/v1/webhookhistory/{id} | Get a webhook history item by id |


<a id="invoiceV1WebhookGet"></a>
# **invoiceV1WebhookGet**
> List&lt;WebHook&gt; invoiceV1WebhookGet(page, pageSize)

List webhooks

Webhooks are used to notify external services about write events that occur in the API. You can subscribe to specific events and receive a notification when they occur.

### Example
```java
// Import classes:
import com.invoicetronic.invoice.sdk.ApiClient;
import com.invoicetronic.invoice.sdk.ApiException;
import com.invoicetronic.invoice.sdk.Configuration;
import com.invoicetronic.invoice.sdk.auth.*;
import com.invoicetronic.invoice.sdk.models.*;
import com.invoicetronic.invoice.sdk.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    Integer page = 1; // Integer | Page number.
    Integer pageSize = 100; // Integer | Items per page.
    try {
      List<WebHook> result = apiInstance.invoiceV1WebhookGet(page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#invoiceV1WebhookGet");
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
| **page** | **Integer**| Page number. | [optional] [default to 1] |
| **pageSize** | **Integer**| Items per page. | [optional] [default to 100] |

### Return type

[**List&lt;WebHook&gt;**](WebHook.md)

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

<a id="invoiceV1WebhookIdDelete"></a>
# **invoiceV1WebhookIdDelete**
> WebHook invoiceV1WebhookIdDelete(id)

Delete a webhook by id

Webhooks are used to notify external services about write events that occur in the API. You can subscribe to specific events and receive a notification when they occur.

### Example
```java
// Import classes:
import com.invoicetronic.invoice.sdk.ApiClient;
import com.invoicetronic.invoice.sdk.ApiException;
import com.invoicetronic.invoice.sdk.Configuration;
import com.invoicetronic.invoice.sdk.auth.*;
import com.invoicetronic.invoice.sdk.models.*;
import com.invoicetronic.invoice.sdk.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    Integer id = 56; // Integer | Item id.
    try {
      WebHook result = apiInstance.invoiceV1WebhookIdDelete(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#invoiceV1WebhookIdDelete");
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

[**WebHook**](WebHook.md)

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

<a id="invoiceV1WebhookIdGet"></a>
# **invoiceV1WebhookIdGet**
> WebHook invoiceV1WebhookIdGet(id)

Get a webhook by id

Webhooks are used to notify external services about write events that occur in the API. You can subscribe to specific events and receive a notification when they occur.

### Example
```java
// Import classes:
import com.invoicetronic.invoice.sdk.ApiClient;
import com.invoicetronic.invoice.sdk.ApiException;
import com.invoicetronic.invoice.sdk.Configuration;
import com.invoicetronic.invoice.sdk.auth.*;
import com.invoicetronic.invoice.sdk.models.*;
import com.invoicetronic.invoice.sdk.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    Integer id = 56; // Integer | Item id.
    try {
      WebHook result = apiInstance.invoiceV1WebhookIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#invoiceV1WebhookIdGet");
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

[**WebHook**](WebHook.md)

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

<a id="invoiceV1WebhookPost"></a>
# **invoiceV1WebhookPost**
> WebHook invoiceV1WebhookPost(webHook)

Add a webhook

Webhooks are used to notify external services about write events that occur in the API. You can subscribe to specific events and receive a notification when they occur.

### Example
```java
// Import classes:
import com.invoicetronic.invoice.sdk.ApiClient;
import com.invoicetronic.invoice.sdk.ApiException;
import com.invoicetronic.invoice.sdk.Configuration;
import com.invoicetronic.invoice.sdk.auth.*;
import com.invoicetronic.invoice.sdk.models.*;
import com.invoicetronic.invoice.sdk.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    WebHook webHook = new WebHook(); // WebHook | 
    try {
      WebHook result = apiInstance.invoiceV1WebhookPost(webHook);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#invoiceV1WebhookPost");
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
| **webHook** | [**WebHook**](WebHook.md)|  | |

### Return type

[**WebHook**](WebHook.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **422** | Unprocessable Content |  -  |

<a id="invoiceV1WebhookPut"></a>
# **invoiceV1WebhookPut**
> WebHook invoiceV1WebhookPut(webHook)

Update a webhook

Webhooks are used to notify external services about write events that occur in the API. You can subscribe to specific events and receive a notification when they occur.

### Example
```java
// Import classes:
import com.invoicetronic.invoice.sdk.ApiClient;
import com.invoicetronic.invoice.sdk.ApiException;
import com.invoicetronic.invoice.sdk.Configuration;
import com.invoicetronic.invoice.sdk.auth.*;
import com.invoicetronic.invoice.sdk.models.*;
import com.invoicetronic.invoice.sdk.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    WebHook webHook = new WebHook(); // WebHook | 
    try {
      WebHook result = apiInstance.invoiceV1WebhookPut(webHook);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#invoiceV1WebhookPut");
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
| **webHook** | [**WebHook**](WebHook.md)|  | |

### Return type

[**WebHook**](WebHook.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **422** | Unprocessable Content |  -  |
| **400** | Bad Request |  -  |

<a id="invoiceV1WebhookhistoryGet"></a>
# **invoiceV1WebhookhistoryGet**
> List&lt;WebHookHistory&gt; invoiceV1WebhookhistoryGet(page, pageSize)

List webhook history items

### Example
```java
// Import classes:
import com.invoicetronic.invoice.sdk.ApiClient;
import com.invoicetronic.invoice.sdk.ApiException;
import com.invoicetronic.invoice.sdk.Configuration;
import com.invoicetronic.invoice.sdk.auth.*;
import com.invoicetronic.invoice.sdk.models.*;
import com.invoicetronic.invoice.sdk.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    Integer page = 1; // Integer | Page number.
    Integer pageSize = 100; // Integer | Items per page.
    try {
      List<WebHookHistory> result = apiInstance.invoiceV1WebhookhistoryGet(page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#invoiceV1WebhookhistoryGet");
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
| **page** | **Integer**| Page number. | [optional] [default to 1] |
| **pageSize** | **Integer**| Items per page. | [optional] [default to 100] |

### Return type

[**List&lt;WebHookHistory&gt;**](WebHookHistory.md)

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

<a id="invoiceV1WebhookhistoryIdGet"></a>
# **invoiceV1WebhookhistoryIdGet**
> WebHookHistory invoiceV1WebhookhistoryIdGet(id)

Get a webhook history item by id

### Example
```java
// Import classes:
import com.invoicetronic.invoice.sdk.ApiClient;
import com.invoicetronic.invoice.sdk.ApiException;
import com.invoicetronic.invoice.sdk.Configuration;
import com.invoicetronic.invoice.sdk.auth.*;
import com.invoicetronic.invoice.sdk.models.*;
import com.invoicetronic.invoice.sdk.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    Integer id = 56; // Integer | Item id.
    try {
      WebHookHistory result = apiInstance.invoiceV1WebhookhistoryIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#invoiceV1WebhookhistoryIdGet");
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

[**WebHookHistory**](WebHookHistory.md)

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

