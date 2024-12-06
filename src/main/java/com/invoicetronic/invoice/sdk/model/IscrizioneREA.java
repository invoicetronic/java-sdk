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
 * IscrizioneREA
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-06T11:17:21.916154Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class IscrizioneREA implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_UFFICIO = "ufficio";
  @SerializedName(SERIALIZED_NAME_UFFICIO)
  @javax.annotation.Nullable
  private String ufficio;

  public static final String SERIALIZED_NAME_NUMERO_REA = "numero_rea";
  @SerializedName(SERIALIZED_NAME_NUMERO_REA)
  @javax.annotation.Nullable
  private String numeroRea;

  public static final String SERIALIZED_NAME_CAPITALE_SOCIALE = "capitale_sociale";
  @SerializedName(SERIALIZED_NAME_CAPITALE_SOCIALE)
  @javax.annotation.Nullable
  private Double capitaleSociale;

  public static final String SERIALIZED_NAME_SOCIO_UNICO = "socio_unico";
  @SerializedName(SERIALIZED_NAME_SOCIO_UNICO)
  @javax.annotation.Nullable
  private String socioUnico;

  public static final String SERIALIZED_NAME_STATO_LIQUIDAZIONE = "stato_liquidazione";
  @SerializedName(SERIALIZED_NAME_STATO_LIQUIDAZIONE)
  @javax.annotation.Nullable
  private String statoLiquidazione;

  public IscrizioneREA() {
  }

  public IscrizioneREA ufficio(@javax.annotation.Nullable String ufficio) {
    this.ufficio = ufficio;
    return this;
  }

  /**
   * Get ufficio
   * @return ufficio
   */
  @javax.annotation.Nullable
  public String getUfficio() {
    return ufficio;
  }

  public void setUfficio(@javax.annotation.Nullable String ufficio) {
    this.ufficio = ufficio;
  }


  public IscrizioneREA numeroRea(@javax.annotation.Nullable String numeroRea) {
    this.numeroRea = numeroRea;
    return this;
  }

  /**
   * Get numeroRea
   * @return numeroRea
   */
  @javax.annotation.Nullable
  public String getNumeroRea() {
    return numeroRea;
  }

  public void setNumeroRea(@javax.annotation.Nullable String numeroRea) {
    this.numeroRea = numeroRea;
  }


  public IscrizioneREA capitaleSociale(@javax.annotation.Nullable Double capitaleSociale) {
    this.capitaleSociale = capitaleSociale;
    return this;
  }

  /**
   * Get capitaleSociale
   * @return capitaleSociale
   */
  @javax.annotation.Nullable
  public Double getCapitaleSociale() {
    return capitaleSociale;
  }

  public void setCapitaleSociale(@javax.annotation.Nullable Double capitaleSociale) {
    this.capitaleSociale = capitaleSociale;
  }


  public IscrizioneREA socioUnico(@javax.annotation.Nullable String socioUnico) {
    this.socioUnico = socioUnico;
    return this;
  }

  /**
   * Get socioUnico
   * @return socioUnico
   */
  @javax.annotation.Nullable
  public String getSocioUnico() {
    return socioUnico;
  }

  public void setSocioUnico(@javax.annotation.Nullable String socioUnico) {
    this.socioUnico = socioUnico;
  }


  public IscrizioneREA statoLiquidazione(@javax.annotation.Nullable String statoLiquidazione) {
    this.statoLiquidazione = statoLiquidazione;
    return this;
  }

  /**
   * Get statoLiquidazione
   * @return statoLiquidazione
   */
  @javax.annotation.Nullable
  public String getStatoLiquidazione() {
    return statoLiquidazione;
  }

  public void setStatoLiquidazione(@javax.annotation.Nullable String statoLiquidazione) {
    this.statoLiquidazione = statoLiquidazione;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscrizioneREA iscrizioneREA = (IscrizioneREA) o;
    return Objects.equals(this.ufficio, iscrizioneREA.ufficio) &&
        Objects.equals(this.numeroRea, iscrizioneREA.numeroRea) &&
        Objects.equals(this.capitaleSociale, iscrizioneREA.capitaleSociale) &&
        Objects.equals(this.socioUnico, iscrizioneREA.socioUnico) &&
        Objects.equals(this.statoLiquidazione, iscrizioneREA.statoLiquidazione);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ufficio, numeroRea, capitaleSociale, socioUnico, statoLiquidazione);
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
    sb.append("class IscrizioneREA {\n");
    sb.append("    ufficio: ").append(toIndentedString(ufficio)).append("\n");
    sb.append("    numeroRea: ").append(toIndentedString(numeroRea)).append("\n");
    sb.append("    capitaleSociale: ").append(toIndentedString(capitaleSociale)).append("\n");
    sb.append("    socioUnico: ").append(toIndentedString(socioUnico)).append("\n");
    sb.append("    statoLiquidazione: ").append(toIndentedString(statoLiquidazione)).append("\n");
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
    openapiFields.add("ufficio");
    openapiFields.add("numero_rea");
    openapiFields.add("capitale_sociale");
    openapiFields.add("socio_unico");
    openapiFields.add("stato_liquidazione");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IscrizioneREA
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IscrizioneREA.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IscrizioneREA is not found in the empty JSON string", IscrizioneREA.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IscrizioneREA.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IscrizioneREA` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ufficio") != null && !jsonObj.get("ufficio").isJsonNull()) && !jsonObj.get("ufficio").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ufficio` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ufficio").toString()));
      }
      if ((jsonObj.get("numero_rea") != null && !jsonObj.get("numero_rea").isJsonNull()) && !jsonObj.get("numero_rea").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numero_rea` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numero_rea").toString()));
      }
      if ((jsonObj.get("socio_unico") != null && !jsonObj.get("socio_unico").isJsonNull()) && !jsonObj.get("socio_unico").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `socio_unico` to be a primitive type in the JSON string but got `%s`", jsonObj.get("socio_unico").toString()));
      }
      if ((jsonObj.get("stato_liquidazione") != null && !jsonObj.get("stato_liquidazione").isJsonNull()) && !jsonObj.get("stato_liquidazione").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stato_liquidazione` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stato_liquidazione").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IscrizioneREA.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IscrizioneREA' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IscrizioneREA> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IscrizioneREA.class));

       return (TypeAdapter<T>) new TypeAdapter<IscrizioneREA>() {
           @Override
           public void write(JsonWriter out, IscrizioneREA value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IscrizioneREA read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IscrizioneREA given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IscrizioneREA
   * @throws IOException if the JSON string is invalid with respect to IscrizioneREA
   */
  public static IscrizioneREA fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IscrizioneREA.class);
  }

  /**
   * Convert an instance of IscrizioneREA to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

