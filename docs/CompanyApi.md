# CompanyApi

All URIs are relative to *https://api.invoicetronic.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**invoiceV1CompanyGet**](CompanyApi.md#invoiceV1CompanyGet) | **GET** /invoice/v1/company | List companies |
| [**invoiceV1CompanyIdDelete**](CompanyApi.md#invoiceV1CompanyIdDelete) | **DELETE** /invoice/v1/company/{id} | Delete a company |
| [**invoiceV1CompanyIdGet**](CompanyApi.md#invoiceV1CompanyIdGet) | **GET** /invoice/v1/company/{id} | Get a company by id |
| [**invoiceV1CompanyPost**](CompanyApi.md#invoiceV1CompanyPost) | **POST** /invoice/v1/company | Add a company |
| [**invoiceV1CompanyPut**](CompanyApi.md#invoiceV1CompanyPut) | **PUT** /invoice/v1/company | Update a company |


<a id="invoiceV1CompanyGet"></a>
# **invoiceV1CompanyGet**
> List&lt;Company&gt; invoiceV1CompanyGet(page, pageSize)

List companies

Companies are the entities that send and receive invoices. At least one company is required in order to send and receive invoices.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import org.openapitools.client.api.CompanyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.invoicetronic.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    CompanyApi apiInstance = new CompanyApi(defaultClient);
    Integer page = 1; // Integer | Page number.
    Integer pageSize = 100; // Integer | Items per page.
    try {
      List<Company> result = apiInstance.invoiceV1CompanyGet(page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#invoiceV1CompanyGet");
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

[**List&lt;Company&gt;**](Company.md)

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

<a id="invoiceV1CompanyIdDelete"></a>
# **invoiceV1CompanyIdDelete**
> Company invoiceV1CompanyIdDelete(id)

Delete a company

Companies are the entities that send and receive invoices. At least one company is required in order to send and receive invoices.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import org.openapitools.client.api.CompanyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.invoicetronic.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    CompanyApi apiInstance = new CompanyApi(defaultClient);
    Integer id = 56; // Integer | Item id.
    try {
      Company result = apiInstance.invoiceV1CompanyIdDelete(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#invoiceV1CompanyIdDelete");
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

[**Company**](Company.md)

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

<a id="invoiceV1CompanyIdGet"></a>
# **invoiceV1CompanyIdGet**
> Company invoiceV1CompanyIdGet(id)

Get a company by id

Companies are the entities that send and receive invoices. At least one company is required in order to send and receive invoices.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import org.openapitools.client.api.CompanyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.invoicetronic.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    CompanyApi apiInstance = new CompanyApi(defaultClient);
    Integer id = 56; // Integer | Item id.
    try {
      Company result = apiInstance.invoiceV1CompanyIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#invoiceV1CompanyIdGet");
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

[**Company**](Company.md)

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

<a id="invoiceV1CompanyPost"></a>
# **invoiceV1CompanyPost**
> Company invoiceV1CompanyPost(company)

Add a company

Companies are the entities that send and receive invoices. At least one company is required in order to send and receive invoices.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import org.openapitools.client.api.CompanyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.invoicetronic.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    CompanyApi apiInstance = new CompanyApi(defaultClient);
    Company company = new Company(); // Company | 
    try {
      Company result = apiInstance.invoiceV1CompanyPost(company);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#invoiceV1CompanyPost");
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
| **company** | [**Company**](Company.md)|  | |

### Return type

[**Company**](Company.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="invoiceV1CompanyPut"></a>
# **invoiceV1CompanyPut**
> Company invoiceV1CompanyPut(company)

Update a company

Companies are the entities that send and receive invoices. At least one company is required in order to send and receive invoices.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import org.openapitools.client.api.CompanyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.invoicetronic.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    CompanyApi apiInstance = new CompanyApi(defaultClient);
    Company company = new Company(); // Company | 
    try {
      Company result = apiInstance.invoiceV1CompanyPut(company);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#invoiceV1CompanyPut");
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
| **company** | [**Company**](Company.md)|  | |

### Return type

[**Company**](Company.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

