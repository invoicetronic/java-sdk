# CompanyApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**companyGet**](CompanyApi.md#companyGet) | **GET** /company | List companies |
| [**companyIdDelete**](CompanyApi.md#companyIdDelete) | **DELETE** /company/{id} | Delete a company |
| [**companyIdGet**](CompanyApi.md#companyIdGet) | **GET** /company/{id} | Get a company by id |
| [**companyPost**](CompanyApi.md#companyPost) | **POST** /company | Add a company |
| [**companyPut**](CompanyApi.md#companyPut) | **PUT** /company | Update a company |


<a id="companyGet"></a>
# **companyGet**
> List&lt;Company&gt; companyGet(page, pageSize, sort)

List companies

Companies are the entities that send and receive invoices. As you send invoices, companies are added as needed (company details are extrapolated). **You can only receive invoices for existing companies, so ensure they exist**.

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.CompanyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    CompanyApi apiInstance = new CompanyApi(defaultClient);
    Integer page = 1; // Integer | Page number. Defaults to 1.
    Integer pageSize = 100; // Integer | Items per page. Defaults to 50. Cannot be greater than 200.
    String sort = "sort_example"; // String | Sort by field. Prefix with '-' for descending order.
    try {
      List<Company> result = apiInstance.companyGet(page, pageSize, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#companyGet");
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
| **400** | Bad Request |  -  |

<a id="companyIdDelete"></a>
# **companyIdDelete**
> Company companyIdDelete(id)

Delete a company

Companies are the entities that send and receive invoices. As you send invoices, companies are added as needed (company details are extrapolated). **You can only receive invoices for existing companies, so ensure they exist**.

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.CompanyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    CompanyApi apiInstance = new CompanyApi(defaultClient);
    Integer id = 56; // Integer | Item id
    try {
      Company result = apiInstance.companyIdDelete(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#companyIdDelete");
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
| **422** | Unprocessable Content |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a id="companyIdGet"></a>
# **companyIdGet**
> Company companyIdGet(id)

Get a company by id

Companies are the entities that send and receive invoices. As you send invoices, companies are added as needed (company details are extrapolated). **You can only receive invoices for existing companies, so ensure they exist**.

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.CompanyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    CompanyApi apiInstance = new CompanyApi(defaultClient);
    Integer id = 56; // Integer | Item id
    try {
      Company result = apiInstance.companyIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#companyIdGet");
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

<a id="companyPost"></a>
# **companyPost**
> Company companyPost(company)

Add a company

Companies are the entities that send and receive invoices. As you send invoices, companies are added as needed (company details are extrapolated). **You can only receive invoices for existing companies, so ensure they exist**.

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.CompanyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    CompanyApi apiInstance = new CompanyApi(defaultClient);
    Company company = new Company(); // Company | 
    try {
      Company result = apiInstance.companyPost(company);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#companyPost");
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
| **400** | Bad Request |  -  |
| **422** | Unprocessable Content |  -  |

<a id="companyPut"></a>
# **companyPut**
> Company companyPut(company)

Update a company

Companies are the entities that send and receive invoices. As you send invoices, companies are added as needed (company details are extrapolated). **You can only receive invoices for existing companies, so ensure they exist**.

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.CompanyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    CompanyApi apiInstance = new CompanyApi(defaultClient);
    Company company = new Company(); // Company | 
    try {
      Company result = apiInstance.companyPut(company);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#companyPut");
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
| **422** | Unprocessable Content |  -  |
| **400** | Bad Request |  -  |

