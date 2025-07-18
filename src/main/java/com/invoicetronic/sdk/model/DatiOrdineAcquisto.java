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


package com.invoicetronic.sdk.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

import com.invoicetronic.sdk.JSON;

/**
 * DatiOrdineAcquisto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-18T13:33:56.497374Z[Etc/UTC]", comments = "Generator version: 7.14.0")
public class DatiOrdineAcquisto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RIFERIMENTO_NUMERO_LINEA = "riferimento_numero_linea";
  @SerializedName(SERIALIZED_NAME_RIFERIMENTO_NUMERO_LINEA)
  @javax.annotation.Nullable
  private List<Integer> riferimentoNumeroLinea;

  public static final String SERIALIZED_NAME_ID_DOCUMENTO = "id_documento";
  @SerializedName(SERIALIZED_NAME_ID_DOCUMENTO)
  @javax.annotation.Nullable
  private String idDocumento;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nullable
  private OffsetDateTime data;

  public static final String SERIALIZED_NAME_NUM_ITEM = "num_item";
  @SerializedName(SERIALIZED_NAME_NUM_ITEM)
  @javax.annotation.Nullable
  private String numItem;

  public static final String SERIALIZED_NAME_CODICE_COMMESSA_CONVENZIONE = "codice_commessa_convenzione";
  @SerializedName(SERIALIZED_NAME_CODICE_COMMESSA_CONVENZIONE)
  @javax.annotation.Nullable
  private String codiceCommessaConvenzione;

  public static final String SERIALIZED_NAME_CODICE_CUP = "codice_cup";
  @SerializedName(SERIALIZED_NAME_CODICE_CUP)
  @javax.annotation.Nullable
  private String codiceCup;

  public static final String SERIALIZED_NAME_CODICE_CIG = "codice_cig";
  @SerializedName(SERIALIZED_NAME_CODICE_CIG)
  @javax.annotation.Nullable
  private String codiceCig;

  public DatiOrdineAcquisto() {
  }

  public DatiOrdineAcquisto riferimentoNumeroLinea(@javax.annotation.Nullable List<Integer> riferimentoNumeroLinea) {
    this.riferimentoNumeroLinea = riferimentoNumeroLinea;
    return this;
  }

  public DatiOrdineAcquisto addRiferimentoNumeroLineaItem(Integer riferimentoNumeroLineaItem) {
    if (this.riferimentoNumeroLinea == null) {
      this.riferimentoNumeroLinea = new ArrayList<>();
    }
    this.riferimentoNumeroLinea.add(riferimentoNumeroLineaItem);
    return this;
  }

  /**
   * Get riferimentoNumeroLinea
   * @return riferimentoNumeroLinea
   */
  @javax.annotation.Nullable
  public List<Integer> getRiferimentoNumeroLinea() {
    return riferimentoNumeroLinea;
  }

  public void setRiferimentoNumeroLinea(@javax.annotation.Nullable List<Integer> riferimentoNumeroLinea) {
    this.riferimentoNumeroLinea = riferimentoNumeroLinea;
  }


  public DatiOrdineAcquisto idDocumento(@javax.annotation.Nullable String idDocumento) {
    this.idDocumento = idDocumento;
    return this;
  }

  /**
   * Get idDocumento
   * @return idDocumento
   */
  @javax.annotation.Nullable
  public String getIdDocumento() {
    return idDocumento;
  }

  public void setIdDocumento(@javax.annotation.Nullable String idDocumento) {
    this.idDocumento = idDocumento;
  }


  public DatiOrdineAcquisto data(@javax.annotation.Nullable OffsetDateTime data) {
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


  public DatiOrdineAcquisto numItem(@javax.annotation.Nullable String numItem) {
    this.numItem = numItem;
    return this;
  }

  /**
   * Get numItem
   * @return numItem
   */
  @javax.annotation.Nullable
  public String getNumItem() {
    return numItem;
  }

  public void setNumItem(@javax.annotation.Nullable String numItem) {
    this.numItem = numItem;
  }


  public DatiOrdineAcquisto codiceCommessaConvenzione(@javax.annotation.Nullable String codiceCommessaConvenzione) {
    this.codiceCommessaConvenzione = codiceCommessaConvenzione;
    return this;
  }

  /**
   * Get codiceCommessaConvenzione
   * @return codiceCommessaConvenzione
   */
  @javax.annotation.Nullable
  public String getCodiceCommessaConvenzione() {
    return codiceCommessaConvenzione;
  }

  public void setCodiceCommessaConvenzione(@javax.annotation.Nullable String codiceCommessaConvenzione) {
    this.codiceCommessaConvenzione = codiceCommessaConvenzione;
  }


  public DatiOrdineAcquisto codiceCup(@javax.annotation.Nullable String codiceCup) {
    this.codiceCup = codiceCup;
    return this;
  }

  /**
   * Get codiceCup
   * @return codiceCup
   */
  @javax.annotation.Nullable
  public String getCodiceCup() {
    return codiceCup;
  }

  public void setCodiceCup(@javax.annotation.Nullable String codiceCup) {
    this.codiceCup = codiceCup;
  }


  public DatiOrdineAcquisto codiceCig(@javax.annotation.Nullable String codiceCig) {
    this.codiceCig = codiceCig;
    return this;
  }

  /**
   * Get codiceCig
   * @return codiceCig
   */
  @javax.annotation.Nullable
  public String getCodiceCig() {
    return codiceCig;
  }

  public void setCodiceCig(@javax.annotation.Nullable String codiceCig) {
    this.codiceCig = codiceCig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatiOrdineAcquisto datiOrdineAcquisto = (DatiOrdineAcquisto) o;
    return Objects.equals(this.riferimentoNumeroLinea, datiOrdineAcquisto.riferimentoNumeroLinea) &&
        Objects.equals(this.idDocumento, datiOrdineAcquisto.idDocumento) &&
        Objects.equals(this.data, datiOrdineAcquisto.data) &&
        Objects.equals(this.numItem, datiOrdineAcquisto.numItem) &&
        Objects.equals(this.codiceCommessaConvenzione, datiOrdineAcquisto.codiceCommessaConvenzione) &&
        Objects.equals(this.codiceCup, datiOrdineAcquisto.codiceCup) &&
        Objects.equals(this.codiceCig, datiOrdineAcquisto.codiceCig);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(riferimentoNumeroLinea, idDocumento, data, numItem, codiceCommessaConvenzione, codiceCup, codiceCig);
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
    sb.append("class DatiOrdineAcquisto {\n");
    sb.append("    riferimentoNumeroLinea: ").append(toIndentedString(riferimentoNumeroLinea)).append("\n");
    sb.append("    idDocumento: ").append(toIndentedString(idDocumento)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    numItem: ").append(toIndentedString(numItem)).append("\n");
    sb.append("    codiceCommessaConvenzione: ").append(toIndentedString(codiceCommessaConvenzione)).append("\n");
    sb.append("    codiceCup: ").append(toIndentedString(codiceCup)).append("\n");
    sb.append("    codiceCig: ").append(toIndentedString(codiceCig)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("riferimento_numero_linea", "id_documento", "data", "num_item", "codice_commessa_convenzione", "codice_cup", "codice_cig"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatiOrdineAcquisto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatiOrdineAcquisto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatiOrdineAcquisto is not found in the empty JSON string", DatiOrdineAcquisto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatiOrdineAcquisto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatiOrdineAcquisto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("riferimento_numero_linea") != null && !jsonObj.get("riferimento_numero_linea").isJsonNull() && !jsonObj.get("riferimento_numero_linea").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `riferimento_numero_linea` to be an array in the JSON string but got `%s`", jsonObj.get("riferimento_numero_linea").toString()));
      }
      if ((jsonObj.get("id_documento") != null && !jsonObj.get("id_documento").isJsonNull()) && !jsonObj.get("id_documento").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id_documento` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id_documento").toString()));
      }
      if ((jsonObj.get("num_item") != null && !jsonObj.get("num_item").isJsonNull()) && !jsonObj.get("num_item").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `num_item` to be a primitive type in the JSON string but got `%s`", jsonObj.get("num_item").toString()));
      }
      if ((jsonObj.get("codice_commessa_convenzione") != null && !jsonObj.get("codice_commessa_convenzione").isJsonNull()) && !jsonObj.get("codice_commessa_convenzione").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codice_commessa_convenzione` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codice_commessa_convenzione").toString()));
      }
      if ((jsonObj.get("codice_cup") != null && !jsonObj.get("codice_cup").isJsonNull()) && !jsonObj.get("codice_cup").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codice_cup` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codice_cup").toString()));
      }
      if ((jsonObj.get("codice_cig") != null && !jsonObj.get("codice_cig").isJsonNull()) && !jsonObj.get("codice_cig").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codice_cig` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codice_cig").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatiOrdineAcquisto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatiOrdineAcquisto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatiOrdineAcquisto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatiOrdineAcquisto.class));

       return (TypeAdapter<T>) new TypeAdapter<DatiOrdineAcquisto>() {
           @Override
           public void write(JsonWriter out, DatiOrdineAcquisto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatiOrdineAcquisto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DatiOrdineAcquisto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatiOrdineAcquisto
   * @throws IOException if the JSON string is invalid with respect to DatiOrdineAcquisto
   */
  public static DatiOrdineAcquisto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatiOrdineAcquisto.class);
  }

  /**
   * Convert an instance of DatiOrdineAcquisto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

