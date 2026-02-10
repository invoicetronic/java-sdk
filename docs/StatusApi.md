# StatusApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**statusGet**](StatusApi.md#statusGet) | **GET** /status | Account status |


<a id="statusGet"></a>
# **statusGet**
> Status statusGet()

Account status

Retrieve the number of operations (invoices + validations) and signatures left on your account.  When &#x60;signature_left&#x60; is 0, you will receive a &#x60;403 Forbidden&#x60; response when trying to sign an invoice. Likewise, if &#x60;operation_left&#x60; is 0, you will receive a &#x60;403 Forbidden&#x60; response when storing or validating an invoice.  You can also check your account status from the [Dashboard](https://dashboard.invoicetronic.com), where you can purchase additional operations and/or signatures.  **Please note** that these values are not enforced if you are on the [Sandbox](https://invoicetronic.com/en/docs/sandbox/).

### Example
```java
// Import classes:
import com.invoicetronic.sdk.ApiClient;
import com.invoicetronic.sdk.ApiException;
import com.invoicetronic.sdk.Configuration;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.models.*;
import com.invoicetronic.sdk.api.StatusApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    StatusApi apiInstance = new StatusApi(defaultClient);
    try {
      Status result = apiInstance.statusGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#statusGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Status**](Status.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

