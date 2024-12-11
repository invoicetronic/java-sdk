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
import com.invoicetronic.invoice.sdk.model.Anagrafica;
import com.invoicetronic.invoice.sdk.model.IdFiscaleIVA;
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
 * DatiAnagraficiCessionarioCommittente
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T14:59:33.789130Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class DatiAnagraficiCessionarioCommittente implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID_FISCALE_IVA = "id_fiscale_iva";
  @SerializedName(SERIALIZED_NAME_ID_FISCALE_IVA)
  @javax.annotation.Nullable
  private IdFiscaleIVA idFiscaleIva;

  public static final String SERIALIZED_NAME_CODICE_FISCALE = "codice_fiscale";
  @SerializedName(SERIALIZED_NAME_CODICE_FISCALE)
  @javax.annotation.Nullable
  private String codiceFiscale;

  public static final String SERIALIZED_NAME_ANAGRAFICA = "anagrafica";
  @SerializedName(SERIALIZED_NAME_ANAGRAFICA)
  @javax.annotation.Nullable
  private Anagrafica anagrafica;

  public DatiAnagraficiCessionarioCommittente() {
  }

  public DatiAnagraficiCessionarioCommittente idFiscaleIva(@javax.annotation.Nullable IdFiscaleIVA idFiscaleIva) {
    this.idFiscaleIva = idFiscaleIva;
    return this;
  }

  /**
   * Get idFiscaleIva
   * @return idFiscaleIva
   */
  @javax.annotation.Nullable
  public IdFiscaleIVA getIdFiscaleIva() {
    return idFiscaleIva;
  }

  public void setIdFiscaleIva(@javax.annotation.Nullable IdFiscaleIVA idFiscaleIva) {
    this.idFiscaleIva = idFiscaleIva;
  }


  public DatiAnagraficiCessionarioCommittente codiceFiscale(@javax.annotation.Nullable String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
    return this;
  }

  /**
   * Get codiceFiscale
   * @return codiceFiscale
   */
  @javax.annotation.Nullable
  public String getCodiceFiscale() {
    return codiceFiscale;
  }

  public void setCodiceFiscale(@javax.annotation.Nullable String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }


  public DatiAnagraficiCessionarioCommittente anagrafica(@javax.annotation.Nullable Anagrafica anagrafica) {
    this.anagrafica = anagrafica;
    return this;
  }

  /**
   * Get anagrafica
   * @return anagrafica
   */
  @javax.annotation.Nullable
  public Anagrafica getAnagrafica() {
    return anagrafica;
  }

  public void setAnagrafica(@javax.annotation.Nullable Anagrafica anagrafica) {
    this.anagrafica = anagrafica;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatiAnagraficiCessionarioCommittente datiAnagraficiCessionarioCommittente = (DatiAnagraficiCessionarioCommittente) o;
    return Objects.equals(this.idFiscaleIva, datiAnagraficiCessionarioCommittente.idFiscaleIva) &&
        Objects.equals(this.codiceFiscale, datiAnagraficiCessionarioCommittente.codiceFiscale) &&
        Objects.equals(this.anagrafica, datiAnagraficiCessionarioCommittente.anagrafica);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(idFiscaleIva, codiceFiscale, anagrafica);
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
    sb.append("class DatiAnagraficiCessionarioCommittente {\n");
    sb.append("    idFiscaleIva: ").append(toIndentedString(idFiscaleIva)).append("\n");
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
    sb.append("    anagrafica: ").append(toIndentedString(anagrafica)).append("\n");
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
    openapiFields.add("id_fiscale_iva");
    openapiFields.add("codice_fiscale");
    openapiFields.add("anagrafica");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatiAnagraficiCessionarioCommittente
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatiAnagraficiCessionarioCommittente.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatiAnagraficiCessionarioCommittente is not found in the empty JSON string", DatiAnagraficiCessionarioCommittente.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatiAnagraficiCessionarioCommittente.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatiAnagraficiCessionarioCommittente` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `id_fiscale_iva`
      if (jsonObj.get("id_fiscale_iva") != null && !jsonObj.get("id_fiscale_iva").isJsonNull()) {
        IdFiscaleIVA.validateJsonElement(jsonObj.get("id_fiscale_iva"));
      }
      if ((jsonObj.get("codice_fiscale") != null && !jsonObj.get("codice_fiscale").isJsonNull()) && !jsonObj.get("codice_fiscale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codice_fiscale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codice_fiscale").toString()));
      }
      // validate the optional field `anagrafica`
      if (jsonObj.get("anagrafica") != null && !jsonObj.get("anagrafica").isJsonNull()) {
        Anagrafica.validateJsonElement(jsonObj.get("anagrafica"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatiAnagraficiCessionarioCommittente.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatiAnagraficiCessionarioCommittente' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatiAnagraficiCessionarioCommittente> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatiAnagraficiCessionarioCommittente.class));

       return (TypeAdapter<T>) new TypeAdapter<DatiAnagraficiCessionarioCommittente>() {
           @Override
           public void write(JsonWriter out, DatiAnagraficiCessionarioCommittente value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatiAnagraficiCessionarioCommittente read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DatiAnagraficiCessionarioCommittente given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatiAnagraficiCessionarioCommittente
   * @throws IOException if the JSON string is invalid with respect to DatiAnagraficiCessionarioCommittente
   */
  public static DatiAnagraficiCessionarioCommittente fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatiAnagraficiCessionarioCommittente.class);
  }

  /**
   * Convert an instance of DatiAnagraficiCessionarioCommittente to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

