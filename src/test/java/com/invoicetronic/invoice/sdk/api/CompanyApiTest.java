/*
 * Italian eInvoice API
 * The Italian eInvoice API is a RESTful API that allows you to send and receive invoices through the Italian [Servizio di Interscambio (SDI)][1], or Interchange Service. The API is designed by Invoicetronic to be simple and easy to use, abstracting away SDI complexity while still providing complete control over the invoice send/receive process. The API also provides advanced features and a rich toolchain, such as invoice validation, multiple upload methods, webhooks, event logs, CORS support, client SDKs for commonly used languages, and CLI tools.  For more information, see  [Invoicetronic website][2]  [1]: https://www.fatturapa.gov.it/it/sistemainterscambio/cose-il-sdi/ [2]: https://invoicetronic.com/
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@invoicetronic.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.invoicetronic.invoice.sdk.api;

import com.invoicetronic.invoice.sdk.ApiException;
import com.invoicetronic.invoice.sdk.model.Company;
import com.invoicetronic.invoice.sdk.model.ProblemHttpResult;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CompanyApi
 */
@Disabled
public class CompanyApiTest {

    private final CompanyApi api = new CompanyApi();

    /**
     * List companies
     *
     * Companies are the entities that send and receive invoices. At least one company is required in order to send and receive invoices.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void invoiceV1CompanyGetTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        List<Company> response = api.invoiceV1CompanyGet(page, pageSize);
        // TODO: test validations
    }

    /**
     * Delete a company
     *
     * Companies are the entities that send and receive invoices. At least one company is required in order to send and receive invoices.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void invoiceV1CompanyIdDeleteTest() throws ApiException {
        Integer id = null;
        Company response = api.invoiceV1CompanyIdDelete(id);
        // TODO: test validations
    }

    /**
     * Get a company by id
     *
     * Companies are the entities that send and receive invoices. At least one company is required in order to send and receive invoices.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void invoiceV1CompanyIdGetTest() throws ApiException {
        Integer id = null;
        Company response = api.invoiceV1CompanyIdGet(id);
        // TODO: test validations
    }

    /**
     * Add a company
     *
     * Companies are the entities that send and receive invoices. At least one company is required in order to send and receive invoices.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void invoiceV1CompanyPostTest() throws ApiException {
        Company company = null;
        Company response = api.invoiceV1CompanyPost(company);
        // TODO: test validations
    }

    /**
     * Update a company
     *
     * Companies are the entities that send and receive invoices. At least one company is required in order to send and receive invoices.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void invoiceV1CompanyPutTest() throws ApiException {
        Company company = null;
        Company response = api.invoiceV1CompanyPut(company);
        // TODO: test validations
    }

}
