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
 * Webhook history.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-18T13:33:56.497374Z[Etc/UTC]", comments = "Generator version: 7.14.0")
public class WebHookHistory implements Serializable {
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

  public static final String SERIALIZED_NAME_WEB_HOOK_ID = "web_hook_id";
  @SerializedName(SERIALIZED_NAME_WEB_HOOK_ID)
  @javax.annotation.Nullable
  private Integer webHookId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nullable
  private Integer userId;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  @javax.annotation.Nullable
  private String event;

  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  @javax.annotation.Nullable
  private Integer statusCode;

  public static final String SERIALIZED_NAME_DATE_TIME = "date_time";
  @SerializedName(SERIALIZED_NAME_DATE_TIME)
  @javax.annotation.Nullable
  private OffsetDateTime dateTime;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  @javax.annotation.Nullable
  private Boolean success;

  public WebHookHistory() {
  }

  public WebHookHistory(
     Boolean success
  ) {
    this();
    this.success = success;
  }

  public WebHookHistory id(@javax.annotation.Nullable Integer id) {
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


  public WebHookHistory created(@javax.annotation.Nullable OffsetDateTime created) {
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


  public WebHookHistory version(@javax.annotation.Nullable Integer version) {
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


  public WebHookHistory webHookId(@javax.annotation.Nullable Integer webHookId) {
    this.webHookId = webHookId;
    return this;
  }

  /**
   * Webhook id.
   * @return webHookId
   */
  @javax.annotation.Nullable
  public Integer getWebHookId() {
    return webHookId;
  }

  public void setWebHookId(@javax.annotation.Nullable Integer webHookId) {
    this.webHookId = webHookId;
  }


  public WebHookHistory userId(@javax.annotation.Nullable Integer userId) {
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


  public WebHookHistory event(@javax.annotation.Nullable String event) {
    this.event = event;
    return this;
  }

  /**
   * Event name.
   * @return event
   */
  @javax.annotation.Nullable
  public String getEvent() {
    return event;
  }

  public void setEvent(@javax.annotation.Nullable String event) {
    this.event = event;
  }


  public WebHookHistory statusCode(@javax.annotation.Nullable Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Status code.
   * @return statusCode
   */
  @javax.annotation.Nullable
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(@javax.annotation.Nullable Integer statusCode) {
    this.statusCode = statusCode;
  }


  public WebHookHistory dateTime(@javax.annotation.Nullable OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Date and time of the request.
   * @return dateTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(@javax.annotation.Nullable OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }


  /**
   * Wether the request was successful.
   * @return success
   */
  @javax.annotation.Nullable
  public Boolean getSuccess() {
    return success;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebHookHistory webHookHistory = (WebHookHistory) o;
    return Objects.equals(this.id, webHookHistory.id) &&
        Objects.equals(this.created, webHookHistory.created) &&
        Objects.equals(this.version, webHookHistory.version) &&
        Objects.equals(this.webHookId, webHookHistory.webHookId) &&
        Objects.equals(this.userId, webHookHistory.userId) &&
        Objects.equals(this.event, webHookHistory.event) &&
        Objects.equals(this.statusCode, webHookHistory.statusCode) &&
        Objects.equals(this.dateTime, webHookHistory.dateTime) &&
        Objects.equals(this.success, webHookHistory.success);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, version, webHookId, userId, event, statusCode, dateTime, success);
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
    sb.append("class WebHookHistory {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    webHookId: ").append(toIndentedString(webHookId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("id", "created", "version", "web_hook_id", "user_id", "event", "status_code", "date_time", "success"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WebHookHistory
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WebHookHistory.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebHookHistory is not found in the empty JSON string", WebHookHistory.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WebHookHistory.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebHookHistory` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("event") != null && !jsonObj.get("event").isJsonNull()) && !jsonObj.get("event").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebHookHistory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebHookHistory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebHookHistory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebHookHistory.class));

       return (TypeAdapter<T>) new TypeAdapter<WebHookHistory>() {
           @Override
           public void write(JsonWriter out, WebHookHistory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebHookHistory read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WebHookHistory given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WebHookHistory
   * @throws IOException if the JSON string is invalid with respect to WebHookHistory
   */
  public static WebHookHistory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebHookHistory.class);
  }

  /**
   * Convert an instance of WebHookHistory to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

