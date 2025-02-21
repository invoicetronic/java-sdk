/*
 * Italian eInvoice API v1
 * The [Italian eInvoice API][2] is a RESTful API that allows you to send and receive invoices through the Italian [Servizio di Interscambio (SDI)][1], or Interchange Service. The API is designed by Invoicetronic to be simple and easy to use, abstracting away SDI complexity while providing complete control over the invoice send/receive process. The API also provides advanced features as encryption at rest, invoice validation, multiple upload formats, webhooks, event logging, client SDKs for commonly used languages, and CLI tools.  For more information, see  [Invoicetronic website][2]  [1]: https://www.fatturapa.gov.it/it/sistemainterscambio/cose-il-sdi/ [2]: https://invoicetronic.com/
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
 * IndirizzoResa
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T16:10:21.896768Z[Etc/UTC]", comments = "Generator version: 7.11.0")
public class IndirizzoResa implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_INDIRIZZO = "indirizzo";
  @SerializedName(SERIALIZED_NAME_INDIRIZZO)
  @javax.annotation.Nullable
  private String indirizzo;

  public static final String SERIALIZED_NAME_NUMERO_CIVICO = "numero_civico";
  @SerializedName(SERIALIZED_NAME_NUMERO_CIVICO)
  @javax.annotation.Nullable
  private String numeroCivico;

  public static final String SERIALIZED_NAME_CAP = "cap";
  @SerializedName(SERIALIZED_NAME_CAP)
  @javax.annotation.Nullable
  private String cap;

  public static final String SERIALIZED_NAME_COMUNE = "comune";
  @SerializedName(SERIALIZED_NAME_COMUNE)
  @javax.annotation.Nullable
  private String comune;

  public static final String SERIALIZED_NAME_PROVINCIA = "provincia";
  @SerializedName(SERIALIZED_NAME_PROVINCIA)
  @javax.annotation.Nullable
  private String provincia;

  public static final String SERIALIZED_NAME_NAZIONE = "nazione";
  @SerializedName(SERIALIZED_NAME_NAZIONE)
  @javax.annotation.Nullable
  private String nazione = "IT";

  public IndirizzoResa() {
  }

  public IndirizzoResa indirizzo(@javax.annotation.Nullable String indirizzo) {
    this.indirizzo = indirizzo;
    return this;
  }

  /**
   * Get indirizzo
   * @return indirizzo
   */
  @javax.annotation.Nullable
  public String getIndirizzo() {
    return indirizzo;
  }

  public void setIndirizzo(@javax.annotation.Nullable String indirizzo) {
    this.indirizzo = indirizzo;
  }


  public IndirizzoResa numeroCivico(@javax.annotation.Nullable String numeroCivico) {
    this.numeroCivico = numeroCivico;
    return this;
  }

  /**
   * Get numeroCivico
   * @return numeroCivico
   */
  @javax.annotation.Nullable
  public String getNumeroCivico() {
    return numeroCivico;
  }

  public void setNumeroCivico(@javax.annotation.Nullable String numeroCivico) {
    this.numeroCivico = numeroCivico;
  }


  public IndirizzoResa cap(@javax.annotation.Nullable String cap) {
    this.cap = cap;
    return this;
  }

  /**
   * Get cap
   * @return cap
   */
  @javax.annotation.Nullable
  public String getCap() {
    return cap;
  }

  public void setCap(@javax.annotation.Nullable String cap) {
    this.cap = cap;
  }


  public IndirizzoResa comune(@javax.annotation.Nullable String comune) {
    this.comune = comune;
    return this;
  }

  /**
   * Get comune
   * @return comune
   */
  @javax.annotation.Nullable
  public String getComune() {
    return comune;
  }

  public void setComune(@javax.annotation.Nullable String comune) {
    this.comune = comune;
  }


  public IndirizzoResa provincia(@javax.annotation.Nullable String provincia) {
    this.provincia = provincia;
    return this;
  }

  /**
   * Get provincia
   * @return provincia
   */
  @javax.annotation.Nullable
  public String getProvincia() {
    return provincia;
  }

  public void setProvincia(@javax.annotation.Nullable String provincia) {
    this.provincia = provincia;
  }


  public IndirizzoResa nazione(@javax.annotation.Nullable String nazione) {
    this.nazione = nazione;
    return this;
  }

  /**
   * Get nazione
   * @return nazione
   */
  @javax.annotation.Nullable
  public String getNazione() {
    return nazione;
  }

  public void setNazione(@javax.annotation.Nullable String nazione) {
    this.nazione = nazione;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndirizzoResa indirizzoResa = (IndirizzoResa) o;
    return Objects.equals(this.indirizzo, indirizzoResa.indirizzo) &&
        Objects.equals(this.numeroCivico, indirizzoResa.numeroCivico) &&
        Objects.equals(this.cap, indirizzoResa.cap) &&
        Objects.equals(this.comune, indirizzoResa.comune) &&
        Objects.equals(this.provincia, indirizzoResa.provincia) &&
        Objects.equals(this.nazione, indirizzoResa.nazione);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(indirizzo, numeroCivico, cap, comune, provincia, nazione);
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
    sb.append("class IndirizzoResa {\n");
    sb.append("    indirizzo: ").append(toIndentedString(indirizzo)).append("\n");
    sb.append("    numeroCivico: ").append(toIndentedString(numeroCivico)).append("\n");
    sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
    sb.append("    comune: ").append(toIndentedString(comune)).append("\n");
    sb.append("    provincia: ").append(toIndentedString(provincia)).append("\n");
    sb.append("    nazione: ").append(toIndentedString(nazione)).append("\n");
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
    openapiFields.add("indirizzo");
    openapiFields.add("numero_civico");
    openapiFields.add("cap");
    openapiFields.add("comune");
    openapiFields.add("provincia");
    openapiFields.add("nazione");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IndirizzoResa
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IndirizzoResa.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IndirizzoResa is not found in the empty JSON string", IndirizzoResa.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IndirizzoResa.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IndirizzoResa` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("indirizzo") != null && !jsonObj.get("indirizzo").isJsonNull()) && !jsonObj.get("indirizzo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `indirizzo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("indirizzo").toString()));
      }
      if ((jsonObj.get("numero_civico") != null && !jsonObj.get("numero_civico").isJsonNull()) && !jsonObj.get("numero_civico").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numero_civico` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numero_civico").toString()));
      }
      if ((jsonObj.get("cap") != null && !jsonObj.get("cap").isJsonNull()) && !jsonObj.get("cap").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cap` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cap").toString()));
      }
      if ((jsonObj.get("comune") != null && !jsonObj.get("comune").isJsonNull()) && !jsonObj.get("comune").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comune` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comune").toString()));
      }
      if ((jsonObj.get("provincia") != null && !jsonObj.get("provincia").isJsonNull()) && !jsonObj.get("provincia").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provincia` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provincia").toString()));
      }
      if ((jsonObj.get("nazione") != null && !jsonObj.get("nazione").isJsonNull()) && !jsonObj.get("nazione").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nazione` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nazione").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IndirizzoResa.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IndirizzoResa' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IndirizzoResa> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IndirizzoResa.class));

       return (TypeAdapter<T>) new TypeAdapter<IndirizzoResa>() {
           @Override
           public void write(JsonWriter out, IndirizzoResa value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IndirizzoResa read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IndirizzoResa given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IndirizzoResa
   * @throws IOException if the JSON string is invalid with respect to IndirizzoResa
   */
  public static IndirizzoResa fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IndirizzoResa.class);
  }

  /**
   * Convert an instance of IndirizzoResa to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

