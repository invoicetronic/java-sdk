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


package com.invoicetronic.invoice.sdk.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * DatiVeicoli
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T08:35:17.954315Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class DatiVeicoli implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nullable
  private OffsetDateTime data;

  public static final String SERIALIZED_NAME_TOTALE_PERCORSO = "totale_percorso";
  @SerializedName(SERIALIZED_NAME_TOTALE_PERCORSO)
  @javax.annotation.Nullable
  private String totalePercorso;

  public DatiVeicoli() {
  }

  public DatiVeicoli data(@javax.annotation.Nullable OffsetDateTime data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nullable
  public OffsetDateTime getData() {
    return data;
  }

  public void setData(@javax.annotation.Nullable OffsetDateTime data) {
    this.data = data;
  }


  public DatiVeicoli totalePercorso(@javax.annotation.Nullable String totalePercorso) {
    this.totalePercorso = totalePercorso;
    return this;
  }

  /**
   * Get totalePercorso
   * @return totalePercorso
   */
  @javax.annotation.Nullable
  public String getTotalePercorso() {
    return totalePercorso;
  }

  public void setTotalePercorso(@javax.annotation.Nullable String totalePercorso) {
    this.totalePercorso = totalePercorso;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatiVeicoli datiVeicoli = (DatiVeicoli) o;
    return Objects.equals(this.data, datiVeicoli.data) &&
        Objects.equals(this.totalePercorso, datiVeicoli.totalePercorso);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, totalePercorso);
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
    sb.append("class DatiVeicoli {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    totalePercorso: ").append(toIndentedString(totalePercorso)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("totale_percorso");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatiVeicoli
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatiVeicoli.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatiVeicoli is not found in the empty JSON string", DatiVeicoli.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatiVeicoli.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatiVeicoli` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("totale_percorso") != null && !jsonObj.get("totale_percorso").isJsonNull()) && !jsonObj.get("totale_percorso").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totale_percorso` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totale_percorso").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatiVeicoli.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatiVeicoli' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatiVeicoli> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatiVeicoli.class));

       return (TypeAdapter<T>) new TypeAdapter<DatiVeicoli>() {
           @Override
           public void write(JsonWriter out, DatiVeicoli value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatiVeicoli read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DatiVeicoli given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatiVeicoli
   * @throws IOException if the JSON string is invalid with respect to DatiVeicoli
   */
  public static DatiVeicoli fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatiVeicoli.class);
  }

  /**
   * Convert an instance of DatiVeicoli to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

