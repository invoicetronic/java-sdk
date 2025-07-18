/*
 * Invoicetronic API
 * The [Invoicetronic API][2] is a RESTful service that allows you to send and receive invoices through the Italian [Servizio di Interscambio (SDI)][1], or Interchange Service. The API is designed to be simple and easy to use, abstracting away SDI complexity while providing complete control over the invoice send/receive process. It provides advanced features as encryption at rest, multi-language pre-flight invoice validation, multiple upload formats, webhooks, event logging, client SDKs, and CLI tools.  For more information, see  [Invoicetronic website][2]  [1]: https://www.fatturapa.gov.it/it/sistemainterscambio/cose-il-sdi/ [2]: https://invoicetronic.com/
 *
 * The version of the OpenAPI document: 1
 * Contact: info@invoicetronic.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.invoicetronic.sdk.api;

import com.invoicetronic.sdk.ApiException;
import java.time.OffsetDateTime;
import com.invoicetronic.sdk.model.ProblemHttpResult;
import com.invoicetronic.sdk.model.Update;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UpdateApi
 */
@Disabled
public class UpdateApiTest {

    private final UpdateApi api = new UpdateApi();

    /**
     * List updates
     *
     * Updates are notifications sent by the SDI about the status of invoices you sent.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateGetTest() throws ApiException {
        Integer companyId = null;
        String identifier = null;
        String prestatore = null;
        Boolean unread = null;
        Integer sendId = null;
        String state = null;
        OffsetDateTime lastUpdateFrom = null;
        OffsetDateTime lastUpdateTo = null;
        OffsetDateTime dateSentFrom = null;
        OffsetDateTime dateSentTo = null;
        Integer page = null;
        Integer pageSize = null;
        String sort = null;
        List<Update> response = api.updateGet(companyId, identifier, prestatore, unread, sendId, state, lastUpdateFrom, lastUpdateTo, dateSentFrom, dateSentTo, page, pageSize, sort);
        // TODO: test validations
    }

    /**
     * Get an update by id
     *
     * Updates are notifications sent by the SDI about the status of invoices you sent.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateIdGetTest() throws ApiException {
        Integer id = null;
        Update response = api.updateIdGet(id);
        // TODO: test validations
    }

}
