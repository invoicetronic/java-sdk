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
import com.invoicetronic.sdk.model.Allegati;
import com.invoicetronic.sdk.model.DatiBeniServizi;
import com.invoicetronic.sdk.model.DatiGenerali;
import com.invoicetronic.sdk.model.DatiPagamento;
import com.invoicetronic.sdk.model.DatiVeicoli;
import java.io.IOException;
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
 * FatturaElettronicaBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-18T13:33:56.497374Z[Etc/UTC]", comments = "Generator version: 7.14.0")
public class FatturaElettronicaBody implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATI_GENERALI = "dati_generali";
  @SerializedName(SERIALIZED_NAME_DATI_GENERALI)
  @javax.annotation.Nullable
  private DatiGenerali datiGenerali;

  public static final String SERIALIZED_NAME_DATI_BENI_SERVIZI = "dati_beni_servizi";
  @SerializedName(SERIALIZED_NAME_DATI_BENI_SERVIZI)
  @javax.annotation.Nullable
  private DatiBeniServizi datiBeniServizi;

  public static final String SERIALIZED_NAME_DATI_VEICOLI = "dati_veicoli";
  @SerializedName(SERIALIZED_NAME_DATI_VEICOLI)
  @javax.annotation.Nullable
  private DatiVeicoli datiVeicoli;

  public static final String SERIALIZED_NAME_DATI_PAGAMENTO = "dati_pagamento";
  @SerializedName(SERIALIZED_NAME_DATI_PAGAMENTO)
  @javax.annotation.Nullable
  private List<DatiPagamento> datiPagamento;

  public static final String SERIALIZED_NAME_ALLEGATI = "allegati";
  @SerializedName(SERIALIZED_NAME_ALLEGATI)
  @javax.annotation.Nullable
  private List<Allegati> allegati;

  public FatturaElettronicaBody() {
  }

  public FatturaElettronicaBody datiGenerali(@javax.annotation.Nullable DatiGenerali datiGenerali) {
    this.datiGenerali = datiGenerali;
    return this;
  }

  /**
   * Get datiGenerali
   * @return datiGenerali
   */
  @javax.annotation.Nullable
  public DatiGenerali getDatiGenerali() {
    return datiGenerali;
  }

  public void setDatiGenerali(@javax.annotation.Nullable DatiGenerali datiGenerali) {
    this.datiGenerali = datiGenerali;
  }


  public FatturaElettronicaBody datiBeniServizi(@javax.annotation.Nullable DatiBeniServizi datiBeniServizi) {
    this.datiBeniServizi = datiBeniServizi;
    return this;
  }

  /**
   * Get datiBeniServizi
   * @return datiBeniServizi
   */
  @javax.annotation.Nullable
  public DatiBeniServizi getDatiBeniServizi() {
    return datiBeniServizi;
  }

  public void setDatiBeniServizi(@javax.annotation.Nullable DatiBeniServizi datiBeniServizi) {
    this.datiBeniServizi = datiBeniServizi;
  }


  public FatturaElettronicaBody datiVeicoli(@javax.annotation.Nullable DatiVeicoli datiVeicoli) {
    this.datiVeicoli = datiVeicoli;
    return this;
  }

  /**
   * Get datiVeicoli
   * @return datiVeicoli
   */
  @javax.annotation.Nullable
  public DatiVeicoli getDatiVeicoli() {
    return datiVeicoli;
  }

  public void setDatiVeicoli(@javax.annotation.Nullable DatiVeicoli datiVeicoli) {
    this.datiVeicoli = datiVeicoli;
  }


  public FatturaElettronicaBody datiPagamento(@javax.annotation.Nullable List<DatiPagamento> datiPagamento) {
    this.datiPagamento = datiPagamento;
    return this;
  }

  public FatturaElettronicaBody addDatiPagamentoItem(DatiPagamento datiPagamentoItem) {
    if (this.datiPagamento == null) {
      this.datiPagamento = new ArrayList<>();
    }
    this.datiPagamento.add(datiPagamentoItem);
    return this;
  }

  /**
   * Get datiPagamento
   * @return datiPagamento
   */
  @javax.annotation.Nullable
  public List<DatiPagamento> getDatiPagamento() {
    return datiPagamento;
  }

  public void setDatiPagamento(@javax.annotation.Nullable List<DatiPagamento> datiPagamento) {
    this.datiPagamento = datiPagamento;
  }


  public FatturaElettronicaBody allegati(@javax.annotation.Nullable List<Allegati> allegati) {
    this.allegati = allegati;
    return this;
  }

  public FatturaElettronicaBody addAllegatiItem(Allegati allegatiItem) {
    if (this.allegati == null) {
      this.allegati = new ArrayList<>();
    }
    this.allegati.add(allegatiItem);
    return this;
  }

  /**
   * Get allegati
   * @return allegati
   */
  @javax.annotation.Nullable
  public List<Allegati> getAllegati() {
    return allegati;
  }

  public void setAllegati(@javax.annotation.Nullable List<Allegati> allegati) {
    this.allegati = allegati;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FatturaElettronicaBody fatturaElettronicaBody = (FatturaElettronicaBody) o;
    return Objects.equals(this.datiGenerali, fatturaElettronicaBody.datiGenerali) &&
        Objects.equals(this.datiBeniServizi, fatturaElettronicaBody.datiBeniServizi) &&
        Objects.equals(this.datiVeicoli, fatturaElettronicaBody.datiVeicoli) &&
        Objects.equals(this.datiPagamento, fatturaElettronicaBody.datiPagamento) &&
        Objects.equals(this.allegati, fatturaElettronicaBody.allegati);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(datiGenerali, datiBeniServizi, datiVeicoli, datiPagamento, allegati);
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
    sb.append("class FatturaElettronicaBody {\n");
    sb.append("    datiGenerali: ").append(toIndentedString(datiGenerali)).append("\n");
    sb.append("    datiBeniServizi: ").append(toIndentedString(datiBeniServizi)).append("\n");
    sb.append("    datiVeicoli: ").append(toIndentedString(datiVeicoli)).append("\n");
    sb.append("    datiPagamento: ").append(toIndentedString(datiPagamento)).append("\n");
    sb.append("    allegati: ").append(toIndentedString(allegati)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("dati_generali", "dati_beni_servizi", "dati_veicoli", "dati_pagamento", "allegati"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FatturaElettronicaBody
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FatturaElettronicaBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FatturaElettronicaBody is not found in the empty JSON string", FatturaElettronicaBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FatturaElettronicaBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FatturaElettronicaBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `dati_generali`
      if (jsonObj.get("dati_generali") != null && !jsonObj.get("dati_generali").isJsonNull()) {
        DatiGenerali.validateJsonElement(jsonObj.get("dati_generali"));
      }
      // validate the optional field `dati_beni_servizi`
      if (jsonObj.get("dati_beni_servizi") != null && !jsonObj.get("dati_beni_servizi").isJsonNull()) {
        DatiBeniServizi.validateJsonElement(jsonObj.get("dati_beni_servizi"));
      }
      // validate the optional field `dati_veicoli`
      if (jsonObj.get("dati_veicoli") != null && !jsonObj.get("dati_veicoli").isJsonNull()) {
        DatiVeicoli.validateJsonElement(jsonObj.get("dati_veicoli"));
      }
      if (jsonObj.get("dati_pagamento") != null && !jsonObj.get("dati_pagamento").isJsonNull()) {
        JsonArray jsonArraydatiPagamento = jsonObj.getAsJsonArray("dati_pagamento");
        if (jsonArraydatiPagamento != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dati_pagamento").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dati_pagamento` to be an array in the JSON string but got `%s`", jsonObj.get("dati_pagamento").toString()));
          }

          // validate the optional field `dati_pagamento` (array)
          for (int i = 0; i < jsonArraydatiPagamento.size(); i++) {
            DatiPagamento.validateJsonElement(jsonArraydatiPagamento.get(i));
          };
        }
      }
      if (jsonObj.get("allegati") != null && !jsonObj.get("allegati").isJsonNull()) {
        JsonArray jsonArrayallegati = jsonObj.getAsJsonArray("allegati");
        if (jsonArrayallegati != null) {
          // ensure the json data is an array
          if (!jsonObj.get("allegati").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `allegati` to be an array in the JSON string but got `%s`", jsonObj.get("allegati").toString()));
          }

          // validate the optional field `allegati` (array)
          for (int i = 0; i < jsonArrayallegati.size(); i++) {
            Allegati.validateJsonElement(jsonArrayallegati.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FatturaElettronicaBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FatturaElettronicaBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FatturaElettronicaBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FatturaElettronicaBody.class));

       return (TypeAdapter<T>) new TypeAdapter<FatturaElettronicaBody>() {
           @Override
           public void write(JsonWriter out, FatturaElettronicaBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FatturaElettronicaBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FatturaElettronicaBody given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FatturaElettronicaBody
   * @throws IOException if the JSON string is invalid with respect to FatturaElettronicaBody
   */
  public static FatturaElettronicaBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FatturaElettronicaBody.class);
  }

  /**
   * Convert an instance of FatturaElettronicaBody to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

