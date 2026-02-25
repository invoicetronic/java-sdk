# SendApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sendFilePost**](SendApi.md#sendFilePost) | **POST** /send/file | Add an invoice by file |
| [**sendGet**](SendApi.md#sendGet) | **GET** /send | List invoices |
| [**sendIdGet**](SendApi.md#sendIdGet) | **GET** /send/{id} | Get a invoice by id |
| [**sendIdPayloadGet**](SendApi.md#sendIdPayloadGet) | **GET** /send/{id}/payload | Get a send invoice payload by id |
| [**sendIdentifierGet**](SendApi.md#sendIdentifierGet) | **GET** /send/{identifier} | Get a invoice by identifier |
| [**sendJsonPost**](SendApi.md#sendJsonPost) | **POST** /send/json | Add an invoice by json |
| [**sendPost**](SendApi.md#sendPost) | **POST** /send | Add an invoice |
| [**sendValidateFilePost**](SendApi.md#sendValidateFilePost) | **POST** /send/validate/file | Validate an invoice file |
| [**sendValidateJsonPost**](SendApi.md#sendValidateJsonPost) | **POST** /send/validate/json | Validate an invoice by json |
| [**sendValidatePost**](SendApi.md#sendValidatePost) | **POST** /send/validate | Validate an invoice |
| [**sendValidateXmlPost**](SendApi.md#sendValidateXmlPost) | **POST** /send/validate/xml | Validate an invoice by xml |
| [**sendXmlPost**](SendApi.md#sendXmlPost) | **POST** /send/xml | Add an invoice by xml |


<a id="sendFilePost"></a>
# **sendFilePost**
> Send sendFilePost(_file, validate, signature)

Add an invoice by file

Add a new invoice by uploading a file. Supported formats are XML (FatturaPA) and P7M (signed). The invoice will be signed (if requested), validated (if requested), and queued for delivery to SDI. Status updates from SDI will be available in the &#x60;update&#x60; endpoint.  **Send** invoices are outbound sales invoices transmitted to customers through Italy&#39;s SDI (Sistema di Interscambio). Preserved for two years in the live environment and 15 days in the [Sandbox](https://invoicetronic.com/en/docs/sandbox/).  You can also upload invoices via the [Dashboard](https://dashboard.invoicetronic.com).

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.SendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SendApi apiInstance = new SendApi(defaultClient);
    File _file = new File("/path/to/file"); // File | 
    Boolean validate = false; // Boolean | Validate the document first, and reject it on failure.
    String signature = "None"; // String | Whether to digitally sign the document.
    try {
      Send result = apiInstance.sendFilePost(_file, validate, signature);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendApi#sendFilePost");
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
| **_file** | **File**|  | |
| **validate** | **Boolean**| Validate the document first, and reject it on failure. | [optional] [default to false] |
| **signature** | **String**| Whether to digitally sign the document. | [optional] [default to Auto] [enum: None, Apply, Force, Auto] |

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
| **400** | Bad Request |  -  |
| **422** | Unprocessable Content |  -  |

<a id="sendGet"></a>
# **sendGet**
> List&lt;Send&gt; sendGet(companyId, identifier, committente, prestatore, fileName, lastUpdateFrom, lastUpdateTo, dateSentFrom, dateSentTo, documentDateFrom, documentDateTo, documentNumber, includePayload, page, pageSize, sort)

List invoices

Retrieve a paginated list of send invoices. Results can be filtered by various criteria such as company, date ranges, and document number. Returns invoice metadata; set &#x60;include_payload&#x60; to true to include the full invoice content.  **Send** invoices are outbound sales invoices transmitted to customers through Italy&#39;s SDI (Sistema di Interscambio). Preserved for two years in the live environment and 15 days in the [Sandbox](https://invoicetronic.com/en/docs/sandbox/).

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.SendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SendApi apiInstance = new SendApi(defaultClient);
    Integer companyId = 56; // Integer | Company id
    String identifier = "identifier_example"; // String | SDI identifier.
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
      List<Send> result = apiInstance.sendGet(companyId, identifier, committente, prestatore, fileName, lastUpdateFrom, lastUpdateTo, dateSentFrom, dateSentTo, documentDateFrom, documentDateTo, documentNumber, includePayload, page, pageSize, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendApi#sendGet");
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

[**List&lt;Send&gt;**](Send.md)

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

<a id="sendIdGet"></a>
# **sendIdGet**
> Send sendIdGet(id, includePayload)

Get a invoice by id

Retrieve a send invoice by its internal id. The &#x60;id&#x60; is unique and assigned by the system when the invoice is created. Returns invoice metadata; set &#x60;include_payload&#x60; to true to include the full invoice content.  **Send** invoices are outbound sales invoices transmitted to customers through Italy&#39;s SDI (Sistema di Interscambio). Preserved for two years in the live environment and 15 days in the [Sandbox](https://invoicetronic.com/en/docs/sandbox/).

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.SendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SendApi apiInstance = new SendApi(defaultClient);
    Integer id = 56; // Integer | Item id
    Boolean includePayload = false; // Boolean | Include payload in the response. Defaults to false.
    try {
      Send result = apiInstance.sendIdGet(id, includePayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendApi#sendIdGet");
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

<a id="sendIdPayloadGet"></a>
# **sendIdPayloadGet**
> sendIdPayloadGet(id)

Get a send invoice payload by id

Retrieve only the payload of a send invoice, without the full invoice metadata. This is useful when you already have the invoice metadata and only need the XML content.  The response is a &#x60;text/plain&#x60; string, identical to the &#x60;payload&#x60; field returned by the standard GET endpoint with &#x60;include_payload&#x3D;true&#x60;. Depending on how the invoice was originally submitted, the payload may be Base64-encoded or plain XML. 

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.SendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SendApi apiInstance = new SendApi(defaultClient);
    Integer id = 56; // Integer | Item id
    try {
      apiInstance.sendIdPayloadGet(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendApi#sendIdPayloadGet");
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
| **404** | Not Found |  -  |

<a id="sendIdentifierGet"></a>
# **sendIdentifierGet**
> Send sendIdentifierGet(identifier, includePayload)

Get a invoice by identifier

Retrieve a send invoice by its SDI identifier. The &#x60;identifier&#x60; is assigned by the SDI and becomes available after the invoice has been accepted. Returns invoice metadata; set &#x60;include_payload&#x60; to true to include the full invoice content.  **Send** invoices are outbound sales invoices transmitted to customers through Italy&#39;s SDI (Sistema di Interscambio). Preserved for two years in the live environment and 15 days in the [Sandbox](https://invoicetronic.com/en/docs/sandbox/).

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.SendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SendApi apiInstance = new SendApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    Boolean includePayload = false; // Boolean | Include payload in the response. Defaults to false.
    try {
      Send result = apiInstance.sendIdentifierGet(identifier, includePayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendApi#sendIdentifierGet");
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
| **identifier** | **String**|  | |
| **includePayload** | **Boolean**| Include payload in the response. Defaults to false. | [optional] [default to false] |

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
| **400** | Bad Request |  -  |

<a id="sendJsonPost"></a>
# **sendJsonPost**
> Send sendJsonPost(body, validate, signature)

Add an invoice by json

Add a new invoice using a FatturaPA JSON representation. The invoice will be signed (if requested), validated (if requested), and queued for delivery to SDI. Status updates from SDI will be available in the &#x60;update&#x60; endpoint.  **Send** invoices are outbound sales invoices transmitted to customers through Italy&#39;s SDI (Sistema di Interscambio). Preserved for two years in the live environment and 15 days in the [Sandbox](https://invoicetronic.com/en/docs/sandbox/).  You can also upload invoices via the [Dashboard](https://dashboard.invoicetronic.com).

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.SendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SendApi apiInstance = new SendApi(defaultClient);
    Object body = null; // Object | 
    Boolean validate = false; // Boolean | Validate the document first, and reject it on failure.
    String signature = "None"; // String | Whether to digitally sign the document.
    try {
      Send result = apiInstance.sendJsonPost(body, validate, signature);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendApi#sendJsonPost");
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
| **body** | **Object**|  | |
| **validate** | **Boolean**| Validate the document first, and reject it on failure. | [optional] [default to false] |
| **signature** | **String**| Whether to digitally sign the document. | [optional] [default to Auto] [enum: None, Apply, Force, Auto] |

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
| **400** | Bad Request |  -  |
| **422** | Unprocessable Content |  -  |

<a id="sendPost"></a>
# **sendPost**
> Send sendPost(send, validate, signature)

Add an invoice

Add a new invoice using a structured Send object. The invoice will be signed (if requested), validated (if requested), and queued for delivery to SDI. Status updates from SDI will be available in the &#x60;update&#x60; endpoint.  **Send** invoices are outbound sales invoices transmitted to customers through Italy&#39;s SDI (Sistema di Interscambio). Preserved for two years in the live environment and 15 days in the [Sandbox](https://invoicetronic.com/en/docs/sandbox/).  You can also upload invoices via the [Dashboard](https://dashboard.invoicetronic.com).

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.SendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SendApi apiInstance = new SendApi(defaultClient);
    Send send = new Send(); // Send | 
    Boolean validate = false; // Boolean | Validate the document first, and reject it on failure.
    String signature = "None"; // String | Whether to digitally sign the document.
    try {
      Send result = apiInstance.sendPost(send, validate, signature);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendApi#sendPost");
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
| **signature** | **String**| Whether to digitally sign the document. | [optional] [default to Auto] [enum: None, Apply, Force, Auto] |

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
| **400** | Bad Request |  -  |
| **422** | Unprocessable Content |  -  |

<a id="sendValidateFilePost"></a>
# **sendValidateFilePost**
> sendValidateFilePost(_file)

Validate an invoice file

Validate an invoice file without sending it to SDI. Supported formats are XML (FatturaPA) and P7M (signed). Use this to check for errors before actual submission. Returns validation results with any errors found.  **Send** invoices are outbound sales invoices transmitted to customers through Italy&#39;s SDI (Sistema di Interscambio). Preserved for two years in the live environment and 15 days in the [Sandbox](https://invoicetronic.com/en/docs/sandbox/).

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.SendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SendApi apiInstance = new SendApi(defaultClient);
    File _file = new File("/path/to/file"); // File | 
    try {
      apiInstance.sendValidateFilePost(_file);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendApi#sendValidateFilePost");
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
| **_file** | **File**|  | |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **422** | Unprocessable Content |  -  |

<a id="sendValidateJsonPost"></a>
# **sendValidateJsonPost**
> sendValidateJsonPost(body)

Validate an invoice by json

Validate a JSON invoice without sending it to SDI. Use this to check for errors before actual submission. Returns validation results with any errors found.  **Send** invoices are outbound sales invoices transmitted to customers through Italy&#39;s SDI (Sistema di Interscambio). Preserved for two years in the live environment and 15 days in the [Sandbox](https://invoicetronic.com/en/docs/sandbox/).

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.SendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SendApi apiInstance = new SendApi(defaultClient);
    Object body = null; // Object | 
    try {
      apiInstance.sendValidateJsonPost(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendApi#sendValidateJsonPost");
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
| **body** | **Object**|  | |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **422** | Unprocessable Content |  -  |

<a id="sendValidatePost"></a>
# **sendValidatePost**
> sendValidatePost(send)

Validate an invoice

Validate an invoice without sending it to SDI. Use this to check for errors before actual submission. Returns validation results with any errors found.  **Send** invoices are outbound sales invoices transmitted to customers through Italy&#39;s SDI (Sistema di Interscambio). Preserved for two years in the live environment and 15 days in the [Sandbox](https://invoicetronic.com/en/docs/sandbox/).

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.SendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SendApi apiInstance = new SendApi(defaultClient);
    Send send = new Send(); // Send | 
    try {
      apiInstance.sendValidatePost(send);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendApi#sendValidatePost");
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

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **422** | Unprocessable Content |  -  |

<a id="sendValidateXmlPost"></a>
# **sendValidateXmlPost**
> sendValidateXmlPost(body)

Validate an invoice by xml

Validate an XML invoice document without sending it to SDI. Use this to check for errors before actual submission. Returns validation results with any errors found.  **Send** invoices are outbound sales invoices transmitted to customers through Italy&#39;s SDI (Sistema di Interscambio). Preserved for two years in the live environment and 15 days in the [Sandbox](https://invoicetronic.com/en/docs/sandbox/).

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.SendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SendApi apiInstance = new SendApi(defaultClient);
    Object body = null; // Object | 
    try {
      apiInstance.sendValidateXmlPost(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendApi#sendValidateXmlPost");
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
| **body** | **Object**|  | |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **422** | Unprocessable Content |  -  |

<a id="sendXmlPost"></a>
# **sendXmlPost**
> Send sendXmlPost(body, validate, signature)

Add an invoice by xml

Add a new invoice using a raw XML document in FatturaPA format. The invoice will be signed (if requested), validated (if requested), and queued for delivery to SDI. Status updates from SDI will be available in the &#x60;update&#x60; endpoint.  **Send** invoices are outbound sales invoices transmitted to customers through Italy&#39;s SDI (Sistema di Interscambio). Preserved for two years in the live environment and 15 days in the [Sandbox](https://invoicetronic.com/en/docs/sandbox/).  You can also upload invoices via the [Dashboard](https://dashboard.invoicetronic.com).

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.SendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SendApi apiInstance = new SendApi(defaultClient);
    Object body = null; // Object | 
    Boolean validate = false; // Boolean | Validate the document first, and reject it on failure.
    String signature = "None"; // String | Whether to digitally sign the document.
    try {
      Send result = apiInstance.sendXmlPost(body, validate, signature);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendApi#sendXmlPost");
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
| **body** | **Object**|  | |
| **validate** | **Boolean**| Validate the document first, and reject it on failure. | [optional] [default to false] |
| **signature** | **String**| Whether to digitally sign the document. | [optional] [default to Auto] [enum: None, Apply, Force, Auto] |

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
| **400** | Bad Request |  -  |
| **422** | Unprocessable Content |  -  |

