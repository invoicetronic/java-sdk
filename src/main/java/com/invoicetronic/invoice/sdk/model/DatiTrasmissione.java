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
import com.invoicetronic.invoice.sdk.model.ContattiTrasmittente;
import com.invoicetronic.invoice.sdk.model.IdTrasmittente;
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
 * DatiTrasmissione
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T14:59:33.789130Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class DatiTrasmissione implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID_TRASMITTENTE = "id_trasmittente";
  @SerializedName(SERIALIZED_NAME_ID_TRASMITTENTE)
  @javax.annotation.Nullable
  private IdTrasmittente idTrasmittente;

  public static final String SERIALIZED_NAME_PROGRESSIVO_INVIO = "progressivo_invio";
  @SerializedName(SERIALIZED_NAME_PROGRESSIVO_INVIO)
  @javax.annotation.Nullable
  private String progressivoInvio;

  public static final String SERIALIZED_NAME_FORMATO_TRASMISSIONE = "formato_trasmissione";
  @SerializedName(SERIALIZED_NAME_FORMATO_TRASMISSIONE)
  @javax.annotation.Nullable
  private String formatoTrasmissione;

  public static final String SERIALIZED_NAME_CODICE_DESTINATARIO = "codice_destinatario";
  @SerializedName(SERIALIZED_NAME_CODICE_DESTINATARIO)
  @javax.annotation.Nullable
  private String codiceDestinatario;

  public static final String SERIALIZED_NAME_CONTATTI_TRASMITTENTE = "contatti_trasmittente";
  @SerializedName(SERIALIZED_NAME_CONTATTI_TRASMITTENTE)
  @javax.annotation.Nullable
  private ContattiTrasmittente contattiTrasmittente;

  public static final String SERIALIZED_NAME_PEC_DESTINATARIO = "pec_destinatario";
  @SerializedName(SERIALIZED_NAME_PEC_DESTINATARIO)
  @javax.annotation.Nullable
  private String pecDestinatario;

  public DatiTrasmissione() {
  }

  public DatiTrasmissione idTrasmittente(@javax.annotation.Nullable IdTrasmittente idTrasmittente) {
    this.idTrasmittente = idTrasmittente;
    return this;
  }

  /**
   * Get idTrasmittente
   * @return idTrasmittente
   */
  @javax.annotation.Nullable
  public IdTrasmittente getIdTrasmittente() {
    return idTrasmittente;
  }

  public void setIdTrasmittente(@javax.annotation.Nullable IdTrasmittente idTrasmittente) {
    this.idTrasmittente = idTrasmittente;
  }


  public DatiTrasmissione progressivoInvio(@javax.annotation.Nullable String progressivoInvio) {
    this.progressivoInvio = progressivoInvio;
    return this;
  }

  /**
   * Get progressivoInvio
   * @return progressivoInvio
   */
  @javax.annotation.Nullable
  public String getProgressivoInvio() {
    return progressivoInvio;
  }

  public void setProgressivoInvio(@javax.annotation.Nullable String progressivoInvio) {
    this.progressivoInvio = progressivoInvio;
  }


  public DatiTrasmissione formatoTrasmissione(@javax.annotation.Nullable String formatoTrasmissione) {
    this.formatoTrasmissione = formatoTrasmissione;
    return this;
  }

  /**
   * Get formatoTrasmissione
   * @return formatoTrasmissione
   */
  @javax.annotation.Nullable
  public String getFormatoTrasmissione() {
    return formatoTrasmissione;
  }

  public void setFormatoTrasmissione(@javax.annotation.Nullable String formatoTrasmissione) {
    this.formatoTrasmissione = formatoTrasmissione;
  }


  public DatiTrasmissione codiceDestinatario(@javax.annotation.Nullable String codiceDestinatario) {
    this.codiceDestinatario = codiceDestinatario;
    return this;
  }

  /**
   * Get codiceDestinatario
   * @return codiceDestinatario
   */
  @javax.annotation.Nullable
  public String getCodiceDestinatario() {
    return codiceDestinatario;
  }

  public void setCodiceDestinatario(@javax.annotation.Nullable String codiceDestinatario) {
    this.codiceDestinatario = codiceDestinatario;
  }


  public DatiTrasmissione contattiTrasmittente(@javax.annotation.Nullable ContattiTrasmittente contattiTrasmittente) {
    this.contattiTrasmittente = contattiTrasmittente;
    return this;
  }

  /**
   * Get contattiTrasmittente
   * @return contattiTrasmittente
   */
  @javax.annotation.Nullable
  public ContattiTrasmittente getContattiTrasmittente() {
    return contattiTrasmittente;
  }

  public void setContattiTrasmittente(@javax.annotation.Nullable ContattiTrasmittente contattiTrasmittente) {
    this.contattiTrasmittente = contattiTrasmittente;
  }


  public DatiTrasmissione pecDestinatario(@javax.annotation.Nullable String pecDestinatario) {
    this.pecDestinatario = pecDestinatario;
    return this;
  }

  /**
   * Get pecDestinatario
   * @return pecDestinatario
   */
  @javax.annotation.Nullable
  public String getPecDestinatario() {
    return pecDestinatario;
  }

  public void setPecDestinatario(@javax.annotation.Nullable String pecDestinatario) {
    this.pecDestinatario = pecDestinatario;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatiTrasmissione datiTrasmissione = (DatiTrasmissione) o;
    return Objects.equals(this.idTrasmittente, datiTrasmissione.idTrasmittente) &&
        Objects.equals(this.progressivoInvio, datiTrasmissione.progressivoInvio) &&
        Objects.equals(this.formatoTrasmissione, datiTrasmissione.formatoTrasmissione) &&
        Objects.equals(this.codiceDestinatario, datiTrasmissione.codiceDestinatario) &&
        Objects.equals(this.contattiTrasmittente, datiTrasmissione.contattiTrasmittente) &&
        Objects.equals(this.pecDestinatario, datiTrasmissione.pecDestinatario);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTrasmittente, progressivoInvio, formatoTrasmissione, codiceDestinatario, contattiTrasmittente, pecDestinatario);
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
    sb.append("class DatiTrasmissione {\n");
    sb.append("    idTrasmittente: ").append(toIndentedString(idTrasmittente)).append("\n");
    sb.append("    progressivoInvio: ").append(toIndentedString(progressivoInvio)).append("\n");
    sb.append("    formatoTrasmissione: ").append(toIndentedString(formatoTrasmissione)).append("\n");
    sb.append("    codiceDestinatario: ").append(toIndentedString(codiceDestinatario)).append("\n");
    sb.append("    contattiTrasmittente: ").append(toIndentedString(contattiTrasmittente)).append("\n");
    sb.append("    pecDestinatario: ").append(toIndentedString(pecDestinatario)).append("\n");
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
    openapiFields.add("id_trasmittente");
    openapiFields.add("progressivo_invio");
    openapiFields.add("formato_trasmissione");
    openapiFields.add("codice_destinatario");
    openapiFields.add("contatti_trasmittente");
    openapiFields.add("pec_destinatario");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatiTrasmissione
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatiTrasmissione.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatiTrasmissione is not found in the empty JSON string", DatiTrasmissione.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatiTrasmissione.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatiTrasmissione` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `id_trasmittente`
      if (jsonObj.get("id_trasmittente") != null && !jsonObj.get("id_trasmittente").isJsonNull()) {
        IdTrasmittente.validateJsonElement(jsonObj.get("id_trasmittente"));
      }
      if ((jsonObj.get("progressivo_invio") != null && !jsonObj.get("progressivo_invio").isJsonNull()) && !jsonObj.get("progressivo_invio").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `progressivo_invio` to be a primitive type in the JSON string but got `%s`", jsonObj.get("progressivo_invio").toString()));
      }
      if ((jsonObj.get("formato_trasmissione") != null && !jsonObj.get("formato_trasmissione").isJsonNull()) && !jsonObj.get("formato_trasmissione").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formato_trasmissione` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formato_trasmissione").toString()));
      }
      if ((jsonObj.get("codice_destinatario") != null && !jsonObj.get("codice_destinatario").isJsonNull()) && !jsonObj.get("codice_destinatario").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codice_destinatario` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codice_destinatario").toString()));
      }
      // validate the optional field `contatti_trasmittente`
      if (jsonObj.get("contatti_trasmittente") != null && !jsonObj.get("contatti_trasmittente").isJsonNull()) {
        ContattiTrasmittente.validateJsonElement(jsonObj.get("contatti_trasmittente"));
      }
      if ((jsonObj.get("pec_destinatario") != null && !jsonObj.get("pec_destinatario").isJsonNull()) && !jsonObj.get("pec_destinatario").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pec_destinatario` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pec_destinatario").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatiTrasmissione.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatiTrasmissione' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatiTrasmissione> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatiTrasmissione.class));

       return (TypeAdapter<T>) new TypeAdapter<DatiTrasmissione>() {
           @Override
           public void write(JsonWriter out, DatiTrasmissione value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatiTrasmissione read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DatiTrasmissione given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatiTrasmissione
   * @throws IOException if the JSON string is invalid with respect to DatiTrasmissione
   */
  public static DatiTrasmissione fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatiTrasmissione.class);
  }

  /**
   * Convert an instance of DatiTrasmissione to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

