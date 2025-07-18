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
import com.invoicetronic.sdk.model.Anagrafica;
import com.invoicetronic.sdk.model.IdFiscaleIVA;
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

import com.invoicetronic.sdk.JSON;

/**
 * DatiAnagraficiCedentePrestatore
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-18T13:33:56.497374Z[Etc/UTC]", comments = "Generator version: 7.14.0")
public class DatiAnagraficiCedentePrestatore implements Serializable {
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

  public static final String SERIALIZED_NAME_ALBO_PROFESSIONALE = "albo_professionale";
  @SerializedName(SERIALIZED_NAME_ALBO_PROFESSIONALE)
  @javax.annotation.Nullable
  private String alboProfessionale;

  public static final String SERIALIZED_NAME_PROVINCIA_ALBO = "provincia_albo";
  @SerializedName(SERIALIZED_NAME_PROVINCIA_ALBO)
  @javax.annotation.Nullable
  private String provinciaAlbo;

  public static final String SERIALIZED_NAME_NUMERO_ISCRIZIONE_ALBO = "numero_iscrizione_albo";
  @SerializedName(SERIALIZED_NAME_NUMERO_ISCRIZIONE_ALBO)
  @javax.annotation.Nullable
  private String numeroIscrizioneAlbo;

  public static final String SERIALIZED_NAME_DATA_ISCRIZIONE_ALBO = "data_iscrizione_albo";
  @SerializedName(SERIALIZED_NAME_DATA_ISCRIZIONE_ALBO)
  @javax.annotation.Nullable
  private OffsetDateTime dataIscrizioneAlbo;

  public static final String SERIALIZED_NAME_REGIME_FISCALE = "regime_fiscale";
  @SerializedName(SERIALIZED_NAME_REGIME_FISCALE)
  @javax.annotation.Nullable
  private String regimeFiscale;

  public DatiAnagraficiCedentePrestatore() {
  }

  public DatiAnagraficiCedentePrestatore idFiscaleIva(@javax.annotation.Nullable IdFiscaleIVA idFiscaleIva) {
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


  public DatiAnagraficiCedentePrestatore codiceFiscale(@javax.annotation.Nullable String codiceFiscale) {
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


  public DatiAnagraficiCedentePrestatore anagrafica(@javax.annotation.Nullable Anagrafica anagrafica) {
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


  public DatiAnagraficiCedentePrestatore alboProfessionale(@javax.annotation.Nullable String alboProfessionale) {
    this.alboProfessionale = alboProfessionale;
    return this;
  }

  /**
   * Get alboProfessionale
   * @return alboProfessionale
   */
  @javax.annotation.Nullable
  public String getAlboProfessionale() {
    return alboProfessionale;
  }

  public void setAlboProfessionale(@javax.annotation.Nullable String alboProfessionale) {
    this.alboProfessionale = alboProfessionale;
  }


  public DatiAnagraficiCedentePrestatore provinciaAlbo(@javax.annotation.Nullable String provinciaAlbo) {
    this.provinciaAlbo = provinciaAlbo;
    return this;
  }

  /**
   * Get provinciaAlbo
   * @return provinciaAlbo
   */
  @javax.annotation.Nullable
  public String getProvinciaAlbo() {
    return provinciaAlbo;
  }

  public void setProvinciaAlbo(@javax.annotation.Nullable String provinciaAlbo) {
    this.provinciaAlbo = provinciaAlbo;
  }


  public DatiAnagraficiCedentePrestatore numeroIscrizioneAlbo(@javax.annotation.Nullable String numeroIscrizioneAlbo) {
    this.numeroIscrizioneAlbo = numeroIscrizioneAlbo;
    return this;
  }

  /**
   * Get numeroIscrizioneAlbo
   * @return numeroIscrizioneAlbo
   */
  @javax.annotation.Nullable
  public String getNumeroIscrizioneAlbo() {
    return numeroIscrizioneAlbo;
  }

  public void setNumeroIscrizioneAlbo(@javax.annotation.Nullable String numeroIscrizioneAlbo) {
    this.numeroIscrizioneAlbo = numeroIscrizioneAlbo;
  }


  public DatiAnagraficiCedentePrestatore dataIscrizioneAlbo(@javax.annotation.Nullable OffsetDateTime dataIscrizioneAlbo) {
    this.dataIscrizioneAlbo = dataIscrizioneAlbo;
    return this;
  }

  /**
   * Get dataIscrizioneAlbo
   * @return dataIscrizioneAlbo
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDataIscrizioneAlbo() {
    return dataIscrizioneAlbo;
  }

  public void setDataIscrizioneAlbo(@javax.annotation.Nullable OffsetDateTime dataIscrizioneAlbo) {
    this.dataIscrizioneAlbo = dataIscrizioneAlbo;
  }


  public DatiAnagraficiCedentePrestatore regimeFiscale(@javax.annotation.Nullable String regimeFiscale) {
    this.regimeFiscale = regimeFiscale;
    return this;
  }

  /**
   * Get regimeFiscale
   * @return regimeFiscale
   */
  @javax.annotation.Nullable
  public String getRegimeFiscale() {
    return regimeFiscale;
  }

  public void setRegimeFiscale(@javax.annotation.Nullable String regimeFiscale) {
    this.regimeFiscale = regimeFiscale;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatiAnagraficiCedentePrestatore datiAnagraficiCedentePrestatore = (DatiAnagraficiCedentePrestatore) o;
    return Objects.equals(this.idFiscaleIva, datiAnagraficiCedentePrestatore.idFiscaleIva) &&
        Objects.equals(this.codiceFiscale, datiAnagraficiCedentePrestatore.codiceFiscale) &&
        Objects.equals(this.anagrafica, datiAnagraficiCedentePrestatore.anagrafica) &&
        Objects.equals(this.alboProfessionale, datiAnagraficiCedentePrestatore.alboProfessionale) &&
        Objects.equals(this.provinciaAlbo, datiAnagraficiCedentePrestatore.provinciaAlbo) &&
        Objects.equals(this.numeroIscrizioneAlbo, datiAnagraficiCedentePrestatore.numeroIscrizioneAlbo) &&
        Objects.equals(this.dataIscrizioneAlbo, datiAnagraficiCedentePrestatore.dataIscrizioneAlbo) &&
        Objects.equals(this.regimeFiscale, datiAnagraficiCedentePrestatore.regimeFiscale);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(idFiscaleIva, codiceFiscale, anagrafica, alboProfessionale, provinciaAlbo, numeroIscrizioneAlbo, dataIscrizioneAlbo, regimeFiscale);
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
    sb.append("class DatiAnagraficiCedentePrestatore {\n");
    sb.append("    idFiscaleIva: ").append(toIndentedString(idFiscaleIva)).append("\n");
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
    sb.append("    anagrafica: ").append(toIndentedString(anagrafica)).append("\n");
    sb.append("    alboProfessionale: ").append(toIndentedString(alboProfessionale)).append("\n");
    sb.append("    provinciaAlbo: ").append(toIndentedString(provinciaAlbo)).append("\n");
    sb.append("    numeroIscrizioneAlbo: ").append(toIndentedString(numeroIscrizioneAlbo)).append("\n");
    sb.append("    dataIscrizioneAlbo: ").append(toIndentedString(dataIscrizioneAlbo)).append("\n");
    sb.append("    regimeFiscale: ").append(toIndentedString(regimeFiscale)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("id_fiscale_iva", "codice_fiscale", "anagrafica", "albo_professionale", "provincia_albo", "numero_iscrizione_albo", "data_iscrizione_albo", "regime_fiscale"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatiAnagraficiCedentePrestatore
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatiAnagraficiCedentePrestatore.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatiAnagraficiCedentePrestatore is not found in the empty JSON string", DatiAnagraficiCedentePrestatore.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatiAnagraficiCedentePrestatore.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatiAnagraficiCedentePrestatore` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("albo_professionale") != null && !jsonObj.get("albo_professionale").isJsonNull()) && !jsonObj.get("albo_professionale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `albo_professionale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("albo_professionale").toString()));
      }
      if ((jsonObj.get("provincia_albo") != null && !jsonObj.get("provincia_albo").isJsonNull()) && !jsonObj.get("provincia_albo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provincia_albo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provincia_albo").toString()));
      }
      if ((jsonObj.get("numero_iscrizione_albo") != null && !jsonObj.get("numero_iscrizione_albo").isJsonNull()) && !jsonObj.get("numero_iscrizione_albo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numero_iscrizione_albo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numero_iscrizione_albo").toString()));
      }
      if ((jsonObj.get("regime_fiscale") != null && !jsonObj.get("regime_fiscale").isJsonNull()) && !jsonObj.get("regime_fiscale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regime_fiscale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regime_fiscale").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatiAnagraficiCedentePrestatore.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatiAnagraficiCedentePrestatore' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatiAnagraficiCedentePrestatore> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatiAnagraficiCedentePrestatore.class));

       return (TypeAdapter<T>) new TypeAdapter<DatiAnagraficiCedentePrestatore>() {
           @Override
           public void write(JsonWriter out, DatiAnagraficiCedentePrestatore value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatiAnagraficiCedentePrestatore read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DatiAnagraficiCedentePrestatore given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatiAnagraficiCedentePrestatore
   * @throws IOException if the JSON string is invalid with respect to DatiAnagraficiCedentePrestatore
   */
  public static DatiAnagraficiCedentePrestatore fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatiAnagraficiCedentePrestatore.class);
  }

  /**
   * Convert an instance of DatiAnagraficiCedentePrestatore to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

