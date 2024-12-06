# SendApi

All URIs are relative to *https://api.invoicetronic.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**invoiceV1SendFilesPost**](SendApi.md#invoiceV1SendFilesPost) | **POST** /invoice/v1/send/files | Add a send invoice by file |
| [**invoiceV1SendGet**](SendApi.md#invoiceV1SendGet) | **GET** /invoice/v1/send | List send invoices |
| [**invoiceV1SendIdGet**](SendApi.md#invoiceV1SendIdGet) | **GET** /invoice/v1/send/{id} | Get a send invoice by id |
| [**invoiceV1SendJsonPost**](SendApi.md#invoiceV1SendJsonPost) | **POST** /invoice/v1/send/json | Add a send invoice by json |
| [**invoiceV1SendPost**](SendApi.md#invoiceV1SendPost) | **POST** /invoice/v1/send | Add a send invoice |
| [**invoiceV1SendXmlPost**](SendApi.md#invoiceV1SendXmlPost) | **POST** /invoice/v1/send/xml | Add a send invoice by xml |


<a id="invoiceV1SendFilesPost"></a>
# **invoiceV1SendFilesPost**
> Send invoiceV1SendFilesPost(files, validate)

Add a send invoice by file

Send invoices are the invoices that are sent to the SDI.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import org.openapitools.client.api.SendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.invoicetronic.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SendApi apiInstance = new SendApi(defaultClient);
    List<File> files = Arrays.asList(); // List<File> | 
    Boolean validate = false; // Boolean | Validate the document first, and reject it on failure.
    try {
      Send result = apiInstance.invoiceV1SendFilesPost(files, validate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendApi#invoiceV1SendFilesPost");
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
| **files** | **List&lt;File&gt;**|  | |
| **validate** | **Boolean**| Validate the document first, and reject it on failure. | [optional] [default to false] |

### Return type

[**Send**](Send.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="invoiceV1SendGet"></a>
# **invoiceV1SendGet**
> List&lt;Send&gt; invoiceV1SendGet(companyId, identifier, committente, prestatore, fileName, lastUpdateFrom, lastUpdateTo, dateSentFrom, dateSentTo, documentDateFrom, documentDateTo, documentNumber, page, pageSize)

List send invoices

test **markdown**.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import org.openapitools.client.api.SendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.invoicetronic.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SendApi apiInstance = new SendApi(defaultClient);
    Integer companyId = 56; // Integer | Company id.
    String identifier = "identifier_example"; // String | SDI identifier.
    String committente = "committente_example"; // String | VAT number or fiscal code.
    String prestatore = "prestatore_example"; // String | VAT number or fiscal code.
    String fileName = "fileName_example"; // String | File name.
    OffsetDateTime lastUpdateFrom = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    OffsetDateTime lastUpdateTo = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    OffsetDateTime dateSentFrom = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    OffsetDateTime dateSentTo = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    OffsetDateTime documentDateFrom = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    OffsetDateTime documentDateTo = OffsetDateTime.now(); // OffsetDateTime | UTC ISO 8601 (2024-11-29T12:34:56Z)
    String documentNumber = "documentNumber_example"; // String | Document number.
    Integer page = 1; // Integer | Page number.
    Integer pageSize = 100; // Integer | Items per page.
    try {
      List<Send> result = apiInstance.invoiceV1SendGet(companyId, identifier, committente, prestatore, fileName, lastUpdateFrom, lastUpdateTo, dateSentFrom, dateSentTo, documentDateFrom, documentDateTo, documentNumber, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendApi#invoiceV1SendGet");
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
| **committente** | **String**| VAT number or fiscal code. | [optional] |
| **prestatore** | **String**| VAT number or fiscal code. | [optional] |
| **fileName** | **String**| File name. | [optional] |
| **lastUpdateFrom** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |
| **lastUpdateTo** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |
| **dateSentFrom** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |
| **dateSentTo** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |
| **documentDateFrom** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |
| **documentDateTo** | **OffsetDateTime**| UTC ISO 8601 (2024-11-29T12:34:56Z) | [optional] |
| **documentNumber** | **String**| Document number. | [optional] |
| **page** | **Integer**| Page number. | [optional] [default to 1] |
| **pageSize** | **Integer**| Items per page. | [optional] [default to 100] |

### Return type

[**List&lt;Send&gt;**](Send.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **400** | Bad Request |  -  |

<a id="invoiceV1SendIdGet"></a>
# **invoiceV1SendIdGet**
> Send invoiceV1SendIdGet(id)

Get a send invoice by id

Send invoices are the invoices that are sent to the SDI.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import org.openapitools.client.api.SendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.invoicetronic.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SendApi apiInstance = new SendApi(defaultClient);
    Integer id = 56; // Integer | Item id.
    try {
      Send result = apiInstance.invoiceV1SendIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendApi#invoiceV1SendIdGet");
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

[**Send**](Send.md)

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

<a id="invoiceV1SendJsonPost"></a>
# **invoiceV1SendJsonPost**
> Send invoiceV1SendJsonPost(fatturaOrdinaria, validate)

Add a send invoice by json

Send invoices are the invoices that are sent to the SDI.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import org.openapitools.client.api.SendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.invoicetronic.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SendApi apiInstance = new SendApi(defaultClient);
    FatturaOrdinaria fatturaOrdinaria = new FatturaOrdinaria(); // FatturaOrdinaria | 
    Boolean validate = false; // Boolean | Validate the document first, and reject it on failure.
    try {
      Send result = apiInstance.invoiceV1SendJsonPost(fatturaOrdinaria, validate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendApi#invoiceV1SendJsonPost");
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
| **fatturaOrdinaria** | [**FatturaOrdinaria**](FatturaOrdinaria.md)|  | |
| **validate** | **Boolean**| Validate the document first, and reject it on failure. | [optional] [default to false] |

### Return type

[**Send**](Send.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="invoiceV1SendPost"></a>
# **invoiceV1SendPost**
> Send invoiceV1SendPost(send, validate)

Add a send invoice

Send invoices are the invoices that are sent to the SDI.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import org.openapitools.client.api.SendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.invoicetronic.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SendApi apiInstance = new SendApi(defaultClient);
    Send send = new Send(); // Send | 
    Boolean validate = false; // Boolean | Validate the document first, and reject it on failure.
    try {
      Send result = apiInstance.invoiceV1SendPost(send, validate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendApi#invoiceV1SendPost");
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
| **send** | [**Send**](Send.md)|  | |
| **validate** | **Boolean**| Validate the document first, and reject it on failure. | [optional] [default to false] |

### Return type

[**Send**](Send.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="invoiceV1SendXmlPost"></a>
# **invoiceV1SendXmlPost**
> Send invoiceV1SendXmlPost(fatturaOrdinaria, validate)

Add a send invoice by xml

Send invoices are the invoices that are sent to the SDI.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import org.openapitools.client.api.SendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.invoicetronic.com");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SendApi apiInstance = new SendApi(defaultClient);
    FatturaOrdinaria fatturaOrdinaria = new FatturaOrdinaria(); // FatturaOrdinaria | 
    Boolean validate = false; // Boolean | Validate the document first, and reject it on failure.
    try {
      Send result = apiInstance.invoiceV1SendXmlPost(fatturaOrdinaria, validate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendApi#invoiceV1SendXmlPost");
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
| **fatturaOrdinaria** | [**FatturaOrdinaria**](FatturaOrdinaria.md)|  | |
| **validate** | **Boolean**| Validate the document first, and reject it on failure. | [optional] [default to false] |

### Return type

[**Send**](Send.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

