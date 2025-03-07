# WebhookApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**webhookGet**](WebhookApi.md#webhookGet) | **GET** /webhook | List webhooks |
| [**webhookIdDelete**](WebhookApi.md#webhookIdDelete) | **DELETE** /webhook/{id} | Delete a webhook by id |
| [**webhookIdGet**](WebhookApi.md#webhookIdGet) | **GET** /webhook/{id} | Get a webhook by id |
| [**webhookPost**](WebhookApi.md#webhookPost) | **POST** /webhook | Add a webhook |
| [**webhookPut**](WebhookApi.md#webhookPut) | **PUT** /webhook | Update a webhook |
| [**webhookhistoryGet**](WebhookApi.md#webhookhistoryGet) | **GET** /webhookhistory | List webhook history items |
| [**webhookhistoryIdGet**](WebhookApi.md#webhookhistoryIdGet) | **GET** /webhookhistory/{id} | Get a webhook history item by id |


<a id="webhookGet"></a>
# **webhookGet**
> List&lt;WebHook&gt; webhookGet(page, pageSize, sort)

List webhooks

Webhooks are used to notify external services about write events that occur in the API. You can subscribe to specific events and receive a notification when they occur.

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    Integer page = 1; // Integer | Page number. Defaults to 1.
    Integer pageSize = 100; // Integer | Items per page. Defaults to 50. Cannot be greater than 200.
    String sort = "sort_example"; // String | Sort by field. Prefix with '-' for descending order.
    try {
      List<WebHook> result = apiInstance.webhookGet(page, pageSize, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#webhookGet");
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
| **page** | **Integer**| Page number. Defaults to 1. | [optional] [default to 1] |
| **pageSize** | **Integer**| Items per page. Defaults to 50. Cannot be greater than 200. | [optional] [default to 100] |
| **sort** | **String**| Sort by field. Prefix with &#39;-&#39; for descending order. | [optional] |

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

<a id="webhookIdDelete"></a>
# **webhookIdDelete**
> WebHook webhookIdDelete(id)

Delete a webhook by id

Webhooks are used to notify external services about write events that occur in the API. You can subscribe to specific events and receive a notification when they occur.

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    Integer id = 56; // Integer | Item id
    try {
      WebHook result = apiInstance.webhookIdDelete(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#webhookIdDelete");
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

<a id="webhookIdGet"></a>
# **webhookIdGet**
> WebHook webhookIdGet(id)

Get a webhook by id

Webhooks are used to notify external services about write events that occur in the API. You can subscribe to specific events and receive a notification when they occur.

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    Integer id = 56; // Integer | Item id
    try {
      WebHook result = apiInstance.webhookIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#webhookIdGet");
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

<a id="webhookPost"></a>
# **webhookPost**
> WebHook webhookPost(webHook)

Add a webhook

Webhooks are used to notify external services about write events that occur in the API. You can subscribe to specific events and receive a notification when they occur.

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.WebhookApi;

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
      WebHook result = apiInstance.webhookPost(webHook);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#webhookPost");
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

<a id="webhookPut"></a>
# **webhookPut**
> WebHook webhookPut(webHook)

Update a webhook

Webhooks are used to notify external services about write events that occur in the API. You can subscribe to specific events and receive a notification when they occur.

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.WebhookApi;

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
      WebHook result = apiInstance.webhookPut(webHook);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#webhookPut");
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

<a id="webhookhistoryGet"></a>
# **webhookhistoryGet**
> List&lt;WebHookHistory&gt; webhookhistoryGet(page, pageSize, sort)

List webhook history items

Webhook history items are stored in the database and can be accessed via the API. They are preserved for 15 in both the live and sandbox environments.

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    Integer page = 1; // Integer | Page number. Defaults to 1.
    Integer pageSize = 100; // Integer | Items per page. Defaults to 50. Cannot be greater than 200.
    String sort = "sort_example"; // String | Sort by field. Prefix with '-' for descending order.
    try {
      List<WebHookHistory> result = apiInstance.webhookhistoryGet(page, pageSize, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#webhookhistoryGet");
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
| **page** | **Integer**| Page number. Defaults to 1. | [optional] [default to 1] |
| **pageSize** | **Integer**| Items per page. Defaults to 50. Cannot be greater than 200. | [optional] [default to 100] |
| **sort** | **String**| Sort by field. Prefix with &#39;-&#39; for descending order. | [optional] |

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

<a id="webhookhistoryIdGet"></a>
# **webhookhistoryIdGet**
> WebHookHistory webhookhistoryIdGet(id)

Get a webhook history item by id

Webhook history items are stored in the database and can be accessed via the API. They are preserved for 15 in both the live and sandbox environments.

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    Integer id = 56; // Integer | Item id
    try {
      WebHookHistory result = apiInstance.webhookhistoryIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#webhookhistoryIdGet");
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

