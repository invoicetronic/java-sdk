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
 * Allegati
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-06T10:41:12.345404Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class Allegati implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NOME_ATTACHMENT = "nome_attachment";
  @SerializedName(SERIALIZED_NAME_NOME_ATTACHMENT)
  @javax.annotation.Nullable
  private String nomeAttachment;

  public static final String SERIALIZED_NAME_ALGORITMO_COMPRESSIONE = "algoritmo_compressione";
  @SerializedName(SERIALIZED_NAME_ALGORITMO_COMPRESSIONE)
  @javax.annotation.Nullable
  private String algoritmoCompressione;

  public static final String SERIALIZED_NAME_FORMATO_ATTACHMENT = "formato_attachment";
  @SerializedName(SERIALIZED_NAME_FORMATO_ATTACHMENT)
  @javax.annotation.Nullable
  private String formatoAttachment;

  public static final String SERIALIZED_NAME_DESCRIZIONE_ATTACHMENT = "descrizione_attachment";
  @SerializedName(SERIALIZED_NAME_DESCRIZIONE_ATTACHMENT)
  @javax.annotation.Nullable
  private String descrizioneAttachment;

  public static final String SERIALIZED_NAME_ATTACHMENT = "attachment";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT)
  @javax.annotation.Nullable
  private byte[] attachment;

  public Allegati() {
  }

  public Allegati nomeAttachment(@javax.annotation.Nullable String nomeAttachment) {
    this.nomeAttachment = nomeAttachment;
    return this;
  }

  /**
   * Get nomeAttachment
   * @return nomeAttachment
   */
  @javax.annotation.Nullable
  public String getNomeAttachment() {
    return nomeAttachment;
  }

  public void setNomeAttachment(@javax.annotation.Nullable String nomeAttachment) {
    this.nomeAttachment = nomeAttachment;
  }


  public Allegati algoritmoCompressione(@javax.annotation.Nullable String algoritmoCompressione) {
    this.algoritmoCompressione = algoritmoCompressione;
    return this;
  }

  /**
   * Get algoritmoCompressione
   * @return algoritmoCompressione
   */
  @javax.annotation.Nullable
  public String getAlgoritmoCompressione() {
    return algoritmoCompressione;
  }

  public void setAlgoritmoCompressione(@javax.annotation.Nullable String algoritmoCompressione) {
    this.algoritmoCompressione = algoritmoCompressione;
  }


  public Allegati formatoAttachment(@javax.annotation.Nullable String formatoAttachment) {
    this.formatoAttachment = formatoAttachment;
    return this;
  }

  /**
   * Get formatoAttachment
   * @return formatoAttachment
   */
  @javax.annotation.Nullable
  public String getFormatoAttachment() {
    return formatoAttachment;
  }

  public void setFormatoAttachment(@javax.annotation.Nullable String formatoAttachment) {
    this.formatoAttachment = formatoAttachment;
  }


  public Allegati descrizioneAttachment(@javax.annotation.Nullable String descrizioneAttachment) {
    this.descrizioneAttachment = descrizioneAttachment;
    return this;
  }

  /**
   * Get descrizioneAttachment
   * @return descrizioneAttachment
   */
  @javax.annotation.Nullable
  public String getDescrizioneAttachment() {
    return descrizioneAttachment;
  }

  public void setDescrizioneAttachment(@javax.annotation.Nullable String descrizioneAttachment) {
    this.descrizioneAttachment = descrizioneAttachment;
  }


  public Allegati attachment(@javax.annotation.Nullable byte[] attachment) {
    this.attachment = attachment;
    return this;
  }

  /**
   * Get attachment
   * @return attachment
   */
  @javax.annotation.Nullable
  public byte[] getAttachment() {
    return attachment;
  }

  public void setAttachment(@javax.annotation.Nullable byte[] attachment) {
    this.attachment = attachment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Allegati allegati = (Allegati) o;
    return Objects.equals(this.nomeAttachment, allegati.nomeAttachment) &&
        Objects.equals(this.algoritmoCompressione, allegati.algoritmoCompressione) &&
        Objects.equals(this.formatoAttachment, allegati.formatoAttachment) &&
        Objects.equals(this.descrizioneAttachment, allegati.descrizioneAttachment) &&
        Arrays.equals(this.attachment, allegati.attachment);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomeAttachment, algoritmoCompressione, formatoAttachment, descrizioneAttachment, Arrays.hashCode(attachment));
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
    sb.append("class Allegati {\n");
    sb.append("    nomeAttachment: ").append(toIndentedString(nomeAttachment)).append("\n");
    sb.append("    algoritmoCompressione: ").append(toIndentedString(algoritmoCompressione)).append("\n");
    sb.append("    formatoAttachment: ").append(toIndentedString(formatoAttachment)).append("\n");
    sb.append("    descrizioneAttachment: ").append(toIndentedString(descrizioneAttachment)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
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
    openapiFields.add("nome_attachment");
    openapiFields.add("algoritmo_compressione");
    openapiFields.add("formato_attachment");
    openapiFields.add("descrizione_attachment");
    openapiFields.add("attachment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Allegati
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Allegati.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Allegati is not found in the empty JSON string", Allegati.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Allegati.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Allegati` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("nome_attachment") != null && !jsonObj.get("nome_attachment").isJsonNull()) && !jsonObj.get("nome_attachment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nome_attachment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nome_attachment").toString()));
      }
      if ((jsonObj.get("algoritmo_compressione") != null && !jsonObj.get("algoritmo_compressione").isJsonNull()) && !jsonObj.get("algoritmo_compressione").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `algoritmo_compressione` to be a primitive type in the JSON string but got `%s`", jsonObj.get("algoritmo_compressione").toString()));
      }
      if ((jsonObj.get("formato_attachment") != null && !jsonObj.get("formato_attachment").isJsonNull()) && !jsonObj.get("formato_attachment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formato_attachment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formato_attachment").toString()));
      }
      if ((jsonObj.get("descrizione_attachment") != null && !jsonObj.get("descrizione_attachment").isJsonNull()) && !jsonObj.get("descrizione_attachment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descrizione_attachment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descrizione_attachment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Allegati.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Allegati' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Allegati> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Allegati.class));

       return (TypeAdapter<T>) new TypeAdapter<Allegati>() {
           @Override
           public void write(JsonWriter out, Allegati value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Allegati read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Allegati given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Allegati
   * @throws IOException if the JSON string is invalid with respect to Allegati
   */
  public static Allegati fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Allegati.class);
  }

  /**
   * Convert an instance of Allegati to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

