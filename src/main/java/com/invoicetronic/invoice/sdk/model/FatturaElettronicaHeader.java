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


package com.invoicetronic.invoice.sdk.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.invoicetronic.invoice.sdk.model.CedentePrestatore;
import com.invoicetronic.invoice.sdk.model.CessionarioCommittente;
import com.invoicetronic.invoice.sdk.model.DatiTrasmissione;
import com.invoicetronic.invoice.sdk.model.RappresentanteFiscale;
import com.invoicetronic.invoice.sdk.model.TerzoIntermediarioOSoggettoEmittente;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.invoicetronic.invoice.sdk.JSON;

/**
 * FatturaElettronicaHeader
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T14:59:33.789130Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class FatturaElettronicaHeader implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATI_TRASMISSIONE = "dati_trasmissione";
  @SerializedName(SERIALIZED_NAME_DATI_TRASMISSIONE)
  @javax.annotation.Nullable
  private DatiTrasmissione datiTrasmissione;

  public static final String SERIALIZED_NAME_CEDENTE_PRESTATORE = "cedente_prestatore";
  @SerializedName(SERIALIZED_NAME_CEDENTE_PRESTATORE)
  @javax.annotation.Nullable
  private CedentePrestatore cedentePrestatore;

  public static final String SERIALIZED_NAME_RAPPRESENTANTE_FISCALE = "RappresentanteFiscale";
  @SerializedName(SERIALIZED_NAME_RAPPRESENTANTE_FISCALE)
  @javax.annotation.Nullable
  private RappresentanteFiscale rappresentanteFiscale;

  public static final String SERIALIZED_NAME_CESSIONARIO_COMMITTENTE = "cessionario_committente";
  @SerializedName(SERIALIZED_NAME_CESSIONARIO_COMMITTENTE)
  @javax.annotation.Nullable
  private CessionarioCommittente cessionarioCommittente;

  public static final String SERIALIZED_NAME_TERZO_INTERMEDIARIO_O_SOGGETTO_EMITTENTE = "terzo_intermediario_o_soggetto_emittente";
  @SerializedName(SERIALIZED_NAME_TERZO_INTERMEDIARIO_O_SOGGETTO_EMITTENTE)
  @javax.annotation.Nullable
  private TerzoIntermediarioOSoggettoEmittente terzoIntermediarioOSoggettoEmittente;

  public static final String SERIALIZED_NAME_SOGGETTO_EMITTENTE = "soggetto_emittente";
  @SerializedName(SERIALIZED_NAME_SOGGETTO_EMITTENTE)
  @javax.annotation.Nullable
  private String soggettoEmittente;

  public FatturaElettronicaHeader() {
  }

  public FatturaElettronicaHeader datiTrasmissione(@javax.annotation.Nullable DatiTrasmissione datiTrasmissione) {
    this.datiTrasmissione = datiTrasmissione;
    return this;
  }

  /**
   * Get datiTrasmissione
   * @return datiTrasmissione
   */
  @javax.annotation.Nullable
  public DatiTrasmissione getDatiTrasmissione() {
    return datiTrasmissione;
  }

  public void setDatiTrasmissione(@javax.annotation.Nullable DatiTrasmissione datiTrasmissione) {
    this.datiTrasmissione = datiTrasmissione;
  }


  public FatturaElettronicaHeader cedentePrestatore(@javax.annotation.Nullable CedentePrestatore cedentePrestatore) {
    this.cedentePrestatore = cedentePrestatore;
    return this;
  }

  /**
   * Get cedentePrestatore
   * @return cedentePrestatore
   */
  @javax.annotation.Nullable
  public CedentePrestatore getCedentePrestatore() {
    return cedentePrestatore;
  }

  public void setCedentePrestatore(@javax.annotation.Nullable CedentePrestatore cedentePrestatore) {
    this.cedentePrestatore = cedentePrestatore;
  }


  public FatturaElettronicaHeader rappresentanteFiscale(@javax.annotation.Nullable RappresentanteFiscale rappresentanteFiscale) {
    this.rappresentanteFiscale = rappresentanteFiscale;
    return this;
  }

  /**
   * Get rappresentanteFiscale
   * @return rappresentanteFiscale
   */
  @javax.annotation.Nullable
  public RappresentanteFiscale getRappresentanteFiscale() {
    return rappresentanteFiscale;
  }

  public void setRappresentanteFiscale(@javax.annotation.Nullable RappresentanteFiscale rappresentanteFiscale) {
    this.rappresentanteFiscale = rappresentanteFiscale;
  }


  public FatturaElettronicaHeader cessionarioCommittente(@javax.annotation.Nullable CessionarioCommittente cessionarioCommittente) {
    this.cessionarioCommittente = cessionarioCommittente;
    return this;
  }

  /**
   * Get cessionarioCommittente
   * @return cessionarioCommittente
   */
  @javax.annotation.Nullable
  public CessionarioCommittente getCessionarioCommittente() {
    return cessionarioCommittente;
  }

  public void setCessionarioCommittente(@javax.annotation.Nullable CessionarioCommittente cessionarioCommittente) {
    this.cessionarioCommittente = cessionarioCommittente;
  }


  public FatturaElettronicaHeader terzoIntermediarioOSoggettoEmittente(@javax.annotation.Nullable TerzoIntermediarioOSoggettoEmittente terzoIntermediarioOSoggettoEmittente) {
    this.terzoIntermediarioOSoggettoEmittente = terzoIntermediarioOSoggettoEmittente;
    return this;
  }

  /**
   * Get terzoIntermediarioOSoggettoEmittente
   * @return terzoIntermediarioOSoggettoEmittente
   */
  @javax.annotation.Nullable
  public TerzoIntermediarioOSoggettoEmittente getTerzoIntermediarioOSoggettoEmittente() {
    return terzoIntermediarioOSoggettoEmittente;
  }

  public void setTerzoIntermediarioOSoggettoEmittente(@javax.annotation.Nullable TerzoIntermediarioOSoggettoEmittente terzoIntermediarioOSoggettoEmittente) {
    this.terzoIntermediarioOSoggettoEmittente = terzoIntermediarioOSoggettoEmittente;
  }


  public FatturaElettronicaHeader soggettoEmittente(@javax.annotation.Nullable String soggettoEmittente) {
    this.soggettoEmittente = soggettoEmittente;
    return this;
  }

  /**
   * Get soggettoEmittente
   * @return soggettoEmittente
   */
  @javax.annotation.Nullable
  public String getSoggettoEmittente() {
    return soggettoEmittente;
  }

  public void setSoggettoEmittente(@javax.annotation.Nullable String soggettoEmittente) {
    this.soggettoEmittente = soggettoEmittente;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FatturaElettronicaHeader fatturaElettronicaHeader = (FatturaElettronicaHeader) o;
    return Objects.equals(this.datiTrasmissione, fatturaElettronicaHeader.datiTrasmissione) &&
        Objects.equals(this.cedentePrestatore, fatturaElettronicaHeader.cedentePrestatore) &&
        Objects.equals(this.rappresentanteFiscale, fatturaElettronicaHeader.rappresentanteFiscale) &&
        Objects.equals(this.cessionarioCommittente, fatturaElettronicaHeader.cessionarioCommittente) &&
        Objects.equals(this.terzoIntermediarioOSoggettoEmittente, fatturaElettronicaHeader.terzoIntermediarioOSoggettoEmittente) &&
        Objects.equals(this.soggettoEmittente, fatturaElettronicaHeader.soggettoEmittente);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(datiTrasmissione, cedentePrestatore, rappresentanteFiscale, cessionarioCommittente, terzoIntermediarioOSoggettoEmittente, soggettoEmittente);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FatturaElettronicaHeader {\n");
    sb.append("    datiTrasmissione: ").append(toIndentedString(datiTrasmissione)).append("\n");
    sb.append("    cedentePrestatore: ").append(toIndentedString(cedentePrestatore)).append("\n");
    sb.append("    rappresentanteFiscale: ").append(toIndentedString(rappresentanteFiscale)).append("\n");
    sb.append("    cessionarioCommittente: ").append(toIndentedString(cessionarioCommittente)).append("\n");
    sb.append("    terzoIntermediarioOSoggettoEmittente: ").append(toIndentedString(terzoIntermediarioOSoggettoEmittente)).append("\n");
    sb.append("    soggettoEmittente: ").append(toIndentedString(soggettoEmittente)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("dati_trasmissione");
    openapiFields.add("cedente_prestatore");
    openapiFields.add("RappresentanteFiscale");
    openapiFields.add("cessionario_committente");
    openapiFields.add("terzo_intermediario_o_soggetto_emittente");
    openapiFields.add("soggetto_emittente");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FatturaElettronicaHeader
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FatturaElettronicaHeader.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FatturaElettronicaHeader is not found in the empty JSON string", FatturaElettronicaHeader.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FatturaElettronicaHeader.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FatturaElettronicaHeader` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `dati_trasmissione`
      if (jsonObj.get("dati_trasmissione") != null && !jsonObj.get("dati_trasmissione").isJsonNull()) {
        DatiTrasmissione.validateJsonElement(jsonObj.get("dati_trasmissione"));
      }
      // validate the optional field `cedente_prestatore`
      if (jsonObj.get("cedente_prestatore") != null && !jsonObj.get("cedente_prestatore").isJsonNull()) {
        CedentePrestatore.validateJsonElement(jsonObj.get("cedente_prestatore"));
      }
      // validate the optional field `RappresentanteFiscale`
      if (jsonObj.get("RappresentanteFiscale") != null && !jsonObj.get("RappresentanteFiscale").isJsonNull()) {
        RappresentanteFiscale.validateJsonElement(jsonObj.get("RappresentanteFiscale"));
      }
      // validate the optional field `cessionario_committente`
      if (jsonObj.get("cessionario_committente") != null && !jsonObj.get("cessionario_committente").isJsonNull()) {
        CessionarioCommittente.validateJsonElement(jsonObj.get("cessionario_committente"));
      }
      // validate the optional field `terzo_intermediario_o_soggetto_emittente`
      if (jsonObj.get("terzo_intermediario_o_soggetto_emittente") != null && !jsonObj.get("terzo_intermediario_o_soggetto_emittente").isJsonNull()) {
        TerzoIntermediarioOSoggettoEmittente.validateJsonElement(jsonObj.get("terzo_intermediario_o_soggetto_emittente"));
      }
      if ((jsonObj.get("soggetto_emittente") != null && !jsonObj.get("soggetto_emittente").isJsonNull()) && !jsonObj.get("soggetto_emittente").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `soggetto_emittente` to be a primitive type in the JSON string but got `%s`", jsonObj.get("soggetto_emittente").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FatturaElettronicaHeader.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FatturaElettronicaHeader' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FatturaElettronicaHeader> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FatturaElettronicaHeader.class));

       return (TypeAdapter<T>) new TypeAdapter<FatturaElettronicaHeader>() {
           @Override
           public void write(JsonWriter out, FatturaElettronicaHeader value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FatturaElettronicaHeader read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FatturaElettronicaHeader given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FatturaElettronicaHeader
   * @throws IOException if the JSON string is invalid with respect to FatturaElettronicaHeader
   */
  public static FatturaElettronicaHeader fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FatturaElettronicaHeader.class);
  }

  /**
   * Convert an instance of FatturaElettronicaHeader to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

