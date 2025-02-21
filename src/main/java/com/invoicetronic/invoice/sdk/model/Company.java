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
import java.time.OffsetDateTime;
import java.util.Arrays;
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
 * A company model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T16:10:21.896768Z[Etc/UTC]", comments = "Generator version: 7.11.0")
public class Company implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  @javax.annotation.Nullable
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  @javax.annotation.Nullable
  private Integer version;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nullable
  private Integer userId;

  public static final String SERIALIZED_NAME_VAT = "vat";
  @SerializedName(SERIALIZED_NAME_VAT)
  @javax.annotation.Nonnull
  private String vat;

  public static final String SERIALIZED_NAME_FISCAL_CODE = "fiscal_code";
  @SerializedName(SERIALIZED_NAME_FISCAL_CODE)
  @javax.annotation.Nonnull
  private String fiscalCode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_COUNTER = "counter";
  @SerializedName(SERIALIZED_NAME_COUNTER)
  @javax.annotation.Nullable
  private Integer counter;

  public Company() {
  }

  public Company id(@javax.annotation.Nullable Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier. Leave it at 0 for new records as it will be set automatically.
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }


  public Company created(@javax.annotation.Nullable OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Creation date. It is set automatically.
   * @return created
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(@javax.annotation.Nullable OffsetDateTime created) {
    this.created = created;
  }


  public Company version(@javax.annotation.Nullable Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Row version, for optimistic concurrency. It is set automatically.
   * @return version
   */
  @javax.annotation.Nullable
  public Integer getVersion() {
    return version;
  }

  public void setVersion(@javax.annotation.Nullable Integer version) {
    this.version = version;
  }


  public Company userId(@javax.annotation.Nullable Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * User id.
   * @return userId
   */
  @javax.annotation.Nullable
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(@javax.annotation.Nullable Integer userId) {
    this.userId = userId;
  }


  public Company vat(@javax.annotation.Nonnull String vat) {
    this.vat = vat;
    return this;
  }

  /**
   * Vat number. Must include the country code.
   * @return vat
   */
  @javax.annotation.Nonnull
  public String getVat() {
    return vat;
  }

  public void setVat(@javax.annotation.Nonnull String vat) {
    this.vat = vat;
  }


  public Company fiscalCode(@javax.annotation.Nonnull String fiscalCode) {
    this.fiscalCode = fiscalCode;
    return this;
  }

  /**
   * Fiscal code. In most cases it&#39;s the same as the vat number.
   * @return fiscalCode
   */
  @javax.annotation.Nonnull
  public String getFiscalCode() {
    return fiscalCode;
  }

  public void setFiscalCode(@javax.annotation.Nonnull String fiscalCode) {
    this.fiscalCode = fiscalCode;
  }


  public Company name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public Company counter(@javax.annotation.Nullable Integer counter) {
    this.counter = counter;
    return this;
  }

  /**
   * Holds the last unique value used to generate a XML filename. This is automatically updated by the system   when a raw XML file is uploaded. Normally, you do not need or want to change this value.
   * @return counter
   */
  @javax.annotation.Nullable
  public Integer getCounter() {
    return counter;
  }

  public void setCounter(@javax.annotation.Nullable Integer counter) {
    this.counter = counter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Company company = (Company) o;
    return Objects.equals(this.id, company.id) &&
        Objects.equals(this.created, company.created) &&
        Objects.equals(this.version, company.version) &&
        Objects.equals(this.userId, company.userId) &&
        Objects.equals(this.vat, company.vat) &&
        Objects.equals(this.fiscalCode, company.fiscalCode) &&
        Objects.equals(this.name, company.name) &&
        Objects.equals(this.counter, company.counter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, version, userId, vat, fiscalCode, name, counter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
    sb.append("    fiscalCode: ").append(toIndentedString(fiscalCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    counter: ").append(toIndentedString(counter)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("created");
    openapiFields.add("version");
    openapiFields.add("user_id");
    openapiFields.add("vat");
    openapiFields.add("fiscal_code");
    openapiFields.add("name");
    openapiFields.add("counter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("vat");
    openapiRequiredFields.add("fiscal_code");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Company
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Company.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Company is not found in the empty JSON string", Company.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Company.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Company` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Company.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("vat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vat").toString()));
      }
      if (!jsonObj.get("fiscal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fiscal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fiscal_code").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Company.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Company' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Company> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Company.class));

       return (TypeAdapter<T>) new TypeAdapter<Company>() {
           @Override
           public void write(JsonWriter out, Company value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Company read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Company given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Company
   * @throws IOException if the JSON string is invalid with respect to Company
   */
  public static Company fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Company.class);
  }

  /**
   * Convert an instance of Company to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

