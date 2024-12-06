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
import com.invoicetronic.invoice.sdk.model.DocumentData;
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

import com.invoicetronic.invoice.sdk.JSON;

/**
 * Receive
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-06T11:17:21.916154Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class Receive implements Serializable {
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

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  @javax.annotation.Nullable
  private Integer companyId;

  public static final String SERIALIZED_NAME_COMMITTENTE = "committente";
  @SerializedName(SERIALIZED_NAME_COMMITTENTE)
  @javax.annotation.Nullable
  private String committente;

  public static final String SERIALIZED_NAME_PRESTATORE = "prestatore";
  @SerializedName(SERIALIZED_NAME_PRESTATORE)
  @javax.annotation.Nullable
  private String prestatore;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  @javax.annotation.Nullable
  private String identifier;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  @javax.annotation.Nullable
  private String fileName;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  @javax.annotation.Nullable
  private String format;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  @javax.annotation.Nullable
  private String payload;

  public static final String SERIALIZED_NAME_LAST_UPDATE = "last_update";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE)
  @javax.annotation.Nullable
  private OffsetDateTime lastUpdate;

  public static final String SERIALIZED_NAME_DATE_SENT = "date_sent";
  @SerializedName(SERIALIZED_NAME_DATE_SENT)
  @javax.annotation.Nullable
  private OffsetDateTime dateSent;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  @javax.annotation.Nullable
  private List<DocumentData> documents;

  public static final String SERIALIZED_NAME_IS_READ = "is_read";
  @SerializedName(SERIALIZED_NAME_IS_READ)
  @javax.annotation.Nullable
  private Boolean isRead;

  public Receive() {
  }

  public Receive id(@javax.annotation.Nullable Integer id) {
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


  public Receive created(@javax.annotation.Nullable OffsetDateTime created) {
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


  public Receive version(@javax.annotation.Nullable Integer version) {
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


  public Receive userId(@javax.annotation.Nullable Integer userId) {
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


  public Receive companyId(@javax.annotation.Nullable Integer companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Company id. On send, this is the sender and must be set in advance. On receive, it will be  automatically set based on the recipient&#39;s VAT number. If a matching company is not found, the invoice will be rejected until the company is created.
   * @return companyId
   */
  @javax.annotation.Nullable
  public Integer getCompanyId() {
    return companyId;
  }

  public void setCompanyId(@javax.annotation.Nullable Integer companyId) {
    this.companyId = companyId;
  }


  public Receive committente(@javax.annotation.Nullable String committente) {
    this.committente = committente;
    return this;
  }

  /**
   * VAT number of the Cessionario/Committente (customer). This is automatically set based on the recipient&#39;s VAT number.
   * @return committente
   */
  @javax.annotation.Nullable
  public String getCommittente() {
    return committente;
  }

  public void setCommittente(@javax.annotation.Nullable String committente) {
    this.committente = committente;
  }


  public Receive prestatore(@javax.annotation.Nullable String prestatore) {
    this.prestatore = prestatore;
    return this;
  }

  /**
   * VAT number of the Cedente/Prestatore (vendor). This is automatically set based on the sender&#39;s VAT number.
   * @return prestatore
   */
  @javax.annotation.Nullable
  public String getPrestatore() {
    return prestatore;
  }

  public void setPrestatore(@javax.annotation.Nullable String prestatore) {
    this.prestatore = prestatore;
  }


  public Receive identifier(@javax.annotation.Nullable String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * SDI identifier. This is set by the SDI and is guaranted to be unique within the SDI system.
   * @return identifier
   */
  @javax.annotation.Nullable
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(@javax.annotation.Nullable String identifier) {
    this.identifier = identifier;
  }


  public Receive fileName(@javax.annotation.Nullable String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Xml file name.
   * @return fileName
   */
  @javax.annotation.Nullable
  public String getFileName() {
    return fileName;
  }

  public void setFileName(@javax.annotation.Nullable String fileName) {
    this.fileName = fileName;
  }


  public Receive format(@javax.annotation.Nullable String format) {
    this.format = format;
    return this;
  }

  /**
   * SDI format (FPA12, FPR12, FSM10, ...)
   * @return format
   */
  @javax.annotation.Nullable
  public String getFormat() {
    return format;
  }

  public void setFormat(@javax.annotation.Nullable String format) {
    this.format = format;
  }


  public Receive payload(@javax.annotation.Nullable String payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Xml payloaad. This is the actual xml content, as string. On send, it can be base64 encoded. If it&#39;s not, it will be encoded before sending. It is guaranteed to be cyphered at rest.
   * @return payload
   */
  @javax.annotation.Nullable
  public String getPayload() {
    return payload;
  }

  public void setPayload(@javax.annotation.Nullable String payload) {
    this.payload = payload;
  }


  public Receive lastUpdate(@javax.annotation.Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Last update from SDI.
   * @return lastUpdate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(@javax.annotation.Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }


  public Receive dateSent(@javax.annotation.Nullable OffsetDateTime dateSent) {
    this.dateSent = dateSent;
    return this;
  }

  /**
   * When the invoice was sent to SDI.
   * @return dateSent
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateSent() {
    return dateSent;
  }

  public void setDateSent(@javax.annotation.Nullable OffsetDateTime dateSent) {
    this.dateSent = dateSent;
  }


  public Receive documents(@javax.annotation.Nullable List<DocumentData> documents) {
    this.documents = documents;
    return this;
  }

  public Receive addDocumentsItem(DocumentData documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * The invoices included in the payload. This is set by the system, based on the xml content.
   * @return documents
   */
  @javax.annotation.Nullable
  public List<DocumentData> getDocuments() {
    return documents;
  }

  public void setDocuments(@javax.annotation.Nullable List<DocumentData> documents) {
    this.documents = documents;
  }


  public Receive isRead(@javax.annotation.Nullable Boolean isRead) {
    this.isRead = isRead;
    return this;
  }

  /**
   * Wether the invoice has been read at least once.
   * @return isRead
   */
  @javax.annotation.Nullable
  public Boolean getIsRead() {
    return isRead;
  }

  public void setIsRead(@javax.annotation.Nullable Boolean isRead) {
    this.isRead = isRead;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Receive receive = (Receive) o;
    return Objects.equals(this.id, receive.id) &&
        Objects.equals(this.created, receive.created) &&
        Objects.equals(this.version, receive.version) &&
        Objects.equals(this.userId, receive.userId) &&
        Objects.equals(this.companyId, receive.companyId) &&
        Objects.equals(this.committente, receive.committente) &&
        Objects.equals(this.prestatore, receive.prestatore) &&
        Objects.equals(this.identifier, receive.identifier) &&
        Objects.equals(this.fileName, receive.fileName) &&
        Objects.equals(this.format, receive.format) &&
        Objects.equals(this.payload, receive.payload) &&
        Objects.equals(this.lastUpdate, receive.lastUpdate) &&
        Objects.equals(this.dateSent, receive.dateSent) &&
        Objects.equals(this.documents, receive.documents) &&
        Objects.equals(this.isRead, receive.isRead);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, version, userId, companyId, committente, prestatore, identifier, fileName, format, payload, lastUpdate, dateSent, documents, isRead);
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
    sb.append("class Receive {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    committente: ").append(toIndentedString(committente)).append("\n");
    sb.append("    prestatore: ").append(toIndentedString(prestatore)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    dateSent: ").append(toIndentedString(dateSent)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    isRead: ").append(toIndentedString(isRead)).append("\n");
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
    openapiFields.add("company_id");
    openapiFields.add("committente");
    openapiFields.add("prestatore");
    openapiFields.add("identifier");
    openapiFields.add("file_name");
    openapiFields.add("format");
    openapiFields.add("payload");
    openapiFields.add("last_update");
    openapiFields.add("date_sent");
    openapiFields.add("documents");
    openapiFields.add("is_read");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Receive
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Receive.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Receive is not found in the empty JSON string", Receive.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Receive.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Receive` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("committente") != null && !jsonObj.get("committente").isJsonNull()) && !jsonObj.get("committente").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `committente` to be a primitive type in the JSON string but got `%s`", jsonObj.get("committente").toString()));
      }
      if ((jsonObj.get("prestatore") != null && !jsonObj.get("prestatore").isJsonNull()) && !jsonObj.get("prestatore").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prestatore` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prestatore").toString()));
      }
      if ((jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonNull()) && !jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      if ((jsonObj.get("file_name") != null && !jsonObj.get("file_name").isJsonNull()) && !jsonObj.get("file_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_name").toString()));
      }
      if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      if ((jsonObj.get("payload") != null && !jsonObj.get("payload").isJsonNull()) && !jsonObj.get("payload").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payload` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payload").toString()));
      }
      if (jsonObj.get("documents") != null && !jsonObj.get("documents").isJsonNull()) {
        JsonArray jsonArraydocuments = jsonObj.getAsJsonArray("documents");
        if (jsonArraydocuments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("documents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `documents` to be an array in the JSON string but got `%s`", jsonObj.get("documents").toString()));
          }

          // validate the optional field `documents` (array)
          for (int i = 0; i < jsonArraydocuments.size(); i++) {
            DocumentData.validateJsonElement(jsonArraydocuments.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Receive.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Receive' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Receive> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Receive.class));

       return (TypeAdapter<T>) new TypeAdapter<Receive>() {
           @Override
           public void write(JsonWriter out, Receive value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Receive read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Receive given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Receive
   * @throws IOException if the JSON string is invalid with respect to Receive
   */
  public static Receive fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Receive.class);
  }

  /**
   * Convert an instance of Receive to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

