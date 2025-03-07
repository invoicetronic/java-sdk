/*
 * Invoicetronic API
 * The [Invoicetronic API][2] is a RESTful service that allows you to send and receive invoices through the Italian [Servizio di Interscambio (SDI)][1], or Interchange Service. The API is designed to be simple and easy to use, abstracting away SDI complexity while providing complete control over the invoice send/receive process. It provides advanced features as encryption at rest, multi-language pre-flight invoice validation, multiple upload formats, webhooks, event logging, client SDKs, and CLI tools.  For more information, see  [Invoicetronic website][2]  [1]: https://www.fatturapa.gov.it/it/sistemainterscambio/cose-il-sdi/ [2]: https://invoicetronic.com/
 *
 * The version of the OpenAPI document: 1
 * Contact: support@invoicetronic.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.invoicetronic.invoice.sdk.api;

import com.invoicetronic.invoice.sdk.ApiCallback;
import com.invoicetronic.invoice.sdk.ApiClient;
import com.invoicetronic.invoice.sdk.ApiException;
import com.invoicetronic.invoice.sdk.ApiResponse;
import com.invoicetronic.invoice.sdk.Configuration;
import com.invoicetronic.invoice.sdk.Pair;
import com.invoicetronic.invoice.sdk.ProgressRequestBody;
import com.invoicetronic.invoice.sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.invoicetronic.invoice.sdk.model.Status;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatusApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StatusApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StatusApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for statusGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call statusGetCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/status";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Basic" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call statusGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return statusGetCall(_callback);

    }

    /**
     * Account status
     * This endpoint is used to know how many operations (invoices + validations) and signatures are left on your account.   When &#x60;signature_left&#x60; is 0, you will receive a &#x60;403 Forbidden&#x60; response if you try to sign an invoice. Likewise, if &#x60;operation_left&#x60; is 0, you will receive a &#x60;403 Forbidden&#x60; response when storing or validating an invoice.  You can raise the limits by purchasing operations and/or signatures from the [Dashboard](https://dashboard.invoicetronic.com).  __Please note__ that these values are not enforced if you are on the Sandbox. See the [API Keys &amp; Sandbox](https://invoicetronic.com/apikeys/) documentation section to learn more about the Sandbox.
     * @return Status
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public Status statusGet() throws ApiException {
        ApiResponse<Status> localVarResp = statusGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Account status
     * This endpoint is used to know how many operations (invoices + validations) and signatures are left on your account.   When &#x60;signature_left&#x60; is 0, you will receive a &#x60;403 Forbidden&#x60; response if you try to sign an invoice. Likewise, if &#x60;operation_left&#x60; is 0, you will receive a &#x60;403 Forbidden&#x60; response when storing or validating an invoice.  You can raise the limits by purchasing operations and/or signatures from the [Dashboard](https://dashboard.invoicetronic.com).  __Please note__ that these values are not enforced if you are on the Sandbox. See the [API Keys &amp; Sandbox](https://invoicetronic.com/apikeys/) documentation section to learn more about the Sandbox.
     * @return ApiResponse&lt;Status&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Status> statusGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = statusGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Status>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Account status (asynchronously)
     * This endpoint is used to know how many operations (invoices + validations) and signatures are left on your account.   When &#x60;signature_left&#x60; is 0, you will receive a &#x60;403 Forbidden&#x60; response if you try to sign an invoice. Likewise, if &#x60;operation_left&#x60; is 0, you will receive a &#x60;403 Forbidden&#x60; response when storing or validating an invoice.  You can raise the limits by purchasing operations and/or signatures from the [Dashboard](https://dashboard.invoicetronic.com).  __Please note__ that these values are not enforced if you are on the Sandbox. See the [API Keys &amp; Sandbox](https://invoicetronic.com/apikeys/) documentation section to learn more about the Sandbox.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call statusGetAsync(final ApiCallback<Status> _callback) throws ApiException {

        okhttp3.Call localVarCall = statusGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Status>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
