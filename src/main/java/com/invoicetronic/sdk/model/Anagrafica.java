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
 * Anagrafica
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-18T13:33:56.497374Z[Etc/UTC]", comments = "Generator version: 7.14.0")
public class Anagrafica implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DENOMINAZIONE = "denominazione";
  @SerializedName(SERIALIZED_NAME_DENOMINAZIONE)
  @javax.annotation.Nullable
  private String denominazione;

  public static final String SERIALIZED_NAME_NOME = "nome";
  @SerializedName(SERIALIZED_NAME_NOME)
  @javax.annotation.Nullable
  private String nome;

  public static final String SERIALIZED_NAME_COGNOME = "cognome";
  @SerializedName(SERIALIZED_NAME_COGNOME)
  @javax.annotation.Nullable
  private String cognome;

  public static final String SERIALIZED_NAME_TITOLO = "titolo";
  @SerializedName(SERIALIZED_NAME_TITOLO)
  @javax.annotation.Nullable
  private String titolo;

  public static final String SERIALIZED_NAME_COD_EORI = "cod_eori";
  @SerializedName(SERIALIZED_NAME_COD_EORI)
  @javax.annotation.Nullable
  private String codEori;

  public Anagrafica() {
  }

  public Anagrafica denominazione(@javax.annotation.Nullable String denominazione) {
    this.denominazione = denominazione;
    return this;
  }

  /**
   * Get denominazione
   * @return denominazione
   */
  @javax.annotation.Nullable
  public String getDenominazione() {
    return denominazione;
  }

  public void setDenominazione(@javax.annotation.Nullable String denominazione) {
    this.denominazione = denominazione;
  }


  public Anagrafica nome(@javax.annotation.Nullable String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Get nome
   * @return nome
   */
  @javax.annotation.Nullable
  public String getNome() {
    return nome;
  }

  public void setNome(@javax.annotation.Nullable String nome) {
    this.nome = nome;
  }


  public Anagrafica cognome(@javax.annotation.Nullable String cognome) {
    this.cognome = cognome;
    return this;
  }

  /**
   * Get cognome
   * @return cognome
   */
  @javax.annotation.Nullable
  public String getCognome() {
    return cognome;
  }

  public void setCognome(@javax.annotation.Nullable String cognome) {
    this.cognome = cognome;
  }


  public Anagrafica titolo(@javax.annotation.Nullable String titolo) {
    this.titolo = titolo;
    return this;
  }

  /**
   * Get titolo
   * @return titolo
   */
  @javax.annotation.Nullable
  public String getTitolo() {
    return titolo;
  }

  public void setTitolo(@javax.annotation.Nullable String titolo) {
    this.titolo = titolo;
  }


  public Anagrafica codEori(@javax.annotation.Nullable String codEori) {
    this.codEori = codEori;
    return this;
  }

  /**
   * Get codEori
   * @return codEori
   */
  @javax.annotation.Nullable
  public String getCodEori() {
    return codEori;
  }

  public void setCodEori(@javax.annotation.Nullable String codEori) {
    this.codEori = codEori;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Anagrafica anagrafica = (Anagrafica) o;
    return Objects.equals(this.denominazione, anagrafica.denominazione) &&
        Objects.equals(this.nome, anagrafica.nome) &&
        Objects.equals(this.cognome, anagrafica.cognome) &&
        Objects.equals(this.titolo, anagrafica.titolo) &&
        Objects.equals(this.codEori, anagrafica.codEori);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(denominazione, nome, cognome, titolo, codEori);
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
    sb.append("class Anagrafica {\n");
    sb.append("    denominazione: ").append(toIndentedString(denominazione)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    titolo: ").append(toIndentedString(titolo)).append("\n");
    sb.append("    codEori: ").append(toIndentedString(codEori)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("denominazione", "nome", "cognome", "titolo", "cod_eori"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Anagrafica
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Anagrafica.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Anagrafica is not found in the empty JSON string", Anagrafica.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Anagrafica.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Anagrafica` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("denominazione") != null && !jsonObj.get("denominazione").isJsonNull()) && !jsonObj.get("denominazione").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `denominazione` to be a primitive type in the JSON string but got `%s`", jsonObj.get("denominazione").toString()));
      }
      if ((jsonObj.get("nome") != null && !jsonObj.get("nome").isJsonNull()) && !jsonObj.get("nome").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nome` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nome").toString()));
      }
      if ((jsonObj.get("cognome") != null && !jsonObj.get("cognome").isJsonNull()) && !jsonObj.get("cognome").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cognome` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cognome").toString()));
      }
      if ((jsonObj.get("titolo") != null && !jsonObj.get("titolo").isJsonNull()) && !jsonObj.get("titolo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `titolo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("titolo").toString()));
      }
      if ((jsonObj.get("cod_eori") != null && !jsonObj.get("cod_eori").isJsonNull()) && !jsonObj.get("cod_eori").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cod_eori` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cod_eori").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Anagrafica.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Anagrafica' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Anagrafica> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Anagrafica.class));

       return (TypeAdapter<T>) new TypeAdapter<Anagrafica>() {
           @Override
           public void write(JsonWriter out, Anagrafica value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Anagrafica read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Anagrafica given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Anagrafica
   * @throws IOException if the JSON string is invalid with respect to Anagrafica
   */
  public static Anagrafica fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Anagrafica.class);
  }

  /**
   * Convert an instance of Anagrafica to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

