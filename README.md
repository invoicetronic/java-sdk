# Java SDK for the Italian Invoicetronic API

The [Invoicetronic API][2] is a RESTful service that allows you to send and receive invoices through the Italian [Servizio di Interscambio (SDI)][1], or Interchange Service. The API is designed to be simple and easy to use, abstracting away SDI complexity while providing complete control over the invoice send/receive process. It provides advanced features as encryption at rest, multi-language pre-flight invoice validation, multiple upload formats, webhooks, event logging, client SDKs, and CLI tools.

For more information, see  [Invoicetronic website][2]

[1]: https://www.fatturapa.gov.it/it/sistemainterscambio/cose-il-sdi/
[2]: https://invoicetronic.com/

- API version: 1

- Build date: 2025-03-07T14:03:32.321851Z[Etc/UTC]

- Generator version: 7.12.0

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.invoicetronic</groupId>
  <artifactId>java-sdk</artifactId>
  <version>1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'java-sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'java-sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.invoicetronic:java-sdk:1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/java-sdk-1.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.invoicetronic.sdk.*;
import com.invoicetronic.sdk.auth.*;
import com.invoicetronic.sdk.model.*;
import com.invoicetronic.sdk.api.CompanyApi;

public class CompanyApiExample {

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

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CompanyApi* | [**companyGet**](docs/CompanyApi.md#companyGet) | **GET** /company | List companies
*CompanyApi* | [**companyIdDelete**](docs/CompanyApi.md#companyIdDelete) | **DELETE** /company/{id} | Delete a company
*CompanyApi* | [**companyIdGet**](docs/CompanyApi.md#companyIdGet) | **GET** /company/{id} | Get a company by id
*CompanyApi* | [**companyPost**](docs/CompanyApi.md#companyPost) | **POST** /company | Add a company
*CompanyApi* | [**companyPut**](docs/CompanyApi.md#companyPut) | **PUT** /company | Update a company
*LogApi* | [**logGet**](docs/LogApi.md#logGet) | **GET** /log | List events
*LogApi* | [**logIdGet**](docs/LogApi.md#logIdGet) | **GET** /log/{id} | Get an event by id
*ReceiveApi* | [**receiveGet**](docs/ReceiveApi.md#receiveGet) | **GET** /receive | List incoming invoices
*ReceiveApi* | [**receiveIdDelete**](docs/ReceiveApi.md#receiveIdDelete) | **DELETE** /receive/{id} | Delete an incoming invoice by id
*ReceiveApi* | [**receiveIdGet**](docs/ReceiveApi.md#receiveIdGet) | **GET** /receive/{id} | Get an incoming invoice by id
*SendApi* | [**sendFilePost**](docs/SendApi.md#sendFilePost) | **POST** /send/file | Add an invoice by file
*SendApi* | [**sendGet**](docs/SendApi.md#sendGet) | **GET** /send | List invoices
*SendApi* | [**sendIdGet**](docs/SendApi.md#sendIdGet) | **GET** /send/{id} | Get a invoice by id
*SendApi* | [**sendJsonPost**](docs/SendApi.md#sendJsonPost) | **POST** /send/json | Add an invoice by json
*SendApi* | [**sendPost**](docs/SendApi.md#sendPost) | **POST** /send | Add an invoice
*SendApi* | [**sendValidateFilesPost**](docs/SendApi.md#sendValidateFilesPost) | **POST** /send/validate/files | Validate an invoice by file
*SendApi* | [**sendValidateJsonPost**](docs/SendApi.md#sendValidateJsonPost) | **POST** /send/validate/json | Validate an invoice by json
*SendApi* | [**sendValidatePost**](docs/SendApi.md#sendValidatePost) | **POST** /send/validate | Validate an invoice
*SendApi* | [**sendValidateXmlPost**](docs/SendApi.md#sendValidateXmlPost) | **POST** /send/validate/xml | Validate an invoice by xml
*SendApi* | [**sendXmlPost**](docs/SendApi.md#sendXmlPost) | **POST** /send/xml | Add an invoice by xml
*StatusApi* | [**statusGet**](docs/StatusApi.md#statusGet) | **GET** /status | Account status
*UpdateApi* | [**updateGet**](docs/UpdateApi.md#updateGet) | **GET** /update | List updates
*UpdateApi* | [**updateIdGet**](docs/UpdateApi.md#updateIdGet) | **GET** /update/{id} | Get an update by id
*WebhookApi* | [**webhookGet**](docs/WebhookApi.md#webhookGet) | **GET** /webhook | List webhooks
*WebhookApi* | [**webhookIdDelete**](docs/WebhookApi.md#webhookIdDelete) | **DELETE** /webhook/{id} | Delete a webhook by id
*WebhookApi* | [**webhookIdGet**](docs/WebhookApi.md#webhookIdGet) | **GET** /webhook/{id} | Get a webhook by id
*WebhookApi* | [**webhookPost**](docs/WebhookApi.md#webhookPost) | **POST** /webhook | Add a webhook
*WebhookApi* | [**webhookPut**](docs/WebhookApi.md#webhookPut) | **PUT** /webhook | Update a webhook
*WebhookApi* | [**webhookhistoryGet**](docs/WebhookApi.md#webhookhistoryGet) | **GET** /webhookhistory | List webhook history items
*WebhookApi* | [**webhookhistoryIdGet**](docs/WebhookApi.md#webhookhistoryIdGet) | **GET** /webhookhistory/{id} | Get a webhook history item by id


## Documentation for Models

 - [Allegati](docs/Allegati.md)
 - [AltriDatiGestionali](docs/AltriDatiGestionali.md)
 - [Anagrafica](docs/Anagrafica.md)
 - [CedentePrestatore](docs/CedentePrestatore.md)
 - [CessionarioCommittente](docs/CessionarioCommittente.md)
 - [CodiceArticolo](docs/CodiceArticolo.md)
 - [Company](docs/Company.md)
 - [Contatti](docs/Contatti.md)
 - [ContattiTrasmittente](docs/ContattiTrasmittente.md)
 - [DatiAnagrafici](docs/DatiAnagrafici.md)
 - [DatiAnagraficiCedentePrestatore](docs/DatiAnagraficiCedentePrestatore.md)
 - [DatiAnagraficiCessionarioCommittente](docs/DatiAnagraficiCessionarioCommittente.md)
 - [DatiAnagraficiVettore](docs/DatiAnagraficiVettore.md)
 - [DatiBeniServizi](docs/DatiBeniServizi.md)
 - [DatiBollo](docs/DatiBollo.md)
 - [DatiCassaPrevidenziale](docs/DatiCassaPrevidenziale.md)
 - [DatiContratto](docs/DatiContratto.md)
 - [DatiConvenzione](docs/DatiConvenzione.md)
 - [DatiDDT](docs/DatiDDT.md)
 - [DatiFattureCollegate](docs/DatiFattureCollegate.md)
 - [DatiGenerali](docs/DatiGenerali.md)
 - [DatiGeneraliDocumento](docs/DatiGeneraliDocumento.md)
 - [DatiOrdineAcquisto](docs/DatiOrdineAcquisto.md)
 - [DatiPagamento](docs/DatiPagamento.md)
 - [DatiRicezione](docs/DatiRicezione.md)
 - [DatiRiepilogo](docs/DatiRiepilogo.md)
 - [DatiRitenuta](docs/DatiRitenuta.md)
 - [DatiSAL](docs/DatiSAL.md)
 - [DatiTrasmissione](docs/DatiTrasmissione.md)
 - [DatiTrasporto](docs/DatiTrasporto.md)
 - [DatiVeicoli](docs/DatiVeicoli.md)
 - [DettaglioLinee](docs/DettaglioLinee.md)
 - [DettaglioPagamento](docs/DettaglioPagamento.md)
 - [DocumentData](docs/DocumentData.md)
 - [Error](docs/Error.md)
 - [Event](docs/Event.md)
 - [FatturaElettronicaBody](docs/FatturaElettronicaBody.md)
 - [FatturaElettronicaHeader](docs/FatturaElettronicaHeader.md)
 - [FatturaOrdinaria](docs/FatturaOrdinaria.md)
 - [FatturaPrincipale](docs/FatturaPrincipale.md)
 - [IdFiscaleIVA](docs/IdFiscaleIVA.md)
 - [IdTrasmittente](docs/IdTrasmittente.md)
 - [IndirizzoResa](docs/IndirizzoResa.md)
 - [IscrizioneREA](docs/IscrizioneREA.md)
 - [ProblemDetails](docs/ProblemDetails.md)
 - [ProblemHttpResult](docs/ProblemHttpResult.md)
 - [RappresentanteFiscale](docs/RappresentanteFiscale.md)
 - [RappresentanteFiscaleCessionarioCommittente](docs/RappresentanteFiscaleCessionarioCommittente.md)
 - [Receive](docs/Receive.md)
 - [ScontoMaggiorazione](docs/ScontoMaggiorazione.md)
 - [SedeCedentePrestatore](docs/SedeCedentePrestatore.md)
 - [SedeCessionarioCommittente](docs/SedeCessionarioCommittente.md)
 - [Send](docs/Send.md)
 - [StabileOrganizzazione](docs/StabileOrganizzazione.md)
 - [Status](docs/Status.md)
 - [TerzoIntermediarioOSoggettoEmittente](docs/TerzoIntermediarioOSoggettoEmittente.md)
 - [Update](docs/Update.md)
 - [WebHook](docs/WebHook.md)
 - [WebHookHistory](docs/WebHookHistory.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="Basic"></a>
### Basic


- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@invoicetronic.com

