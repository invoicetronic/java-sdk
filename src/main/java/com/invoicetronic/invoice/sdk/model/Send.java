/*
 * Italian eInvoice API
 * The Italian eInvoice API is a RESTful API that allows you to send and receive invoices through the Italian [Servizio di Interscambio (SDI)][1], or Interchange Service. The API is designed by Invoicetronic to be simple and easy to use, abstracting away SDI complexity while providing complete control over the invoice send/receive process. The API also provides advanced features as encryption at rest, invoice validation, multiple upload formats, webhooks, event logging, client SDKs for commonly used languages, and CLI tools.  For more information, see  [Invoicetronic website][2]  [1]: https://www.fatturapa.gov.it/it/sistemainterscambio/cose-il-sdi/ [2]: https://invoicetronic.com/
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
import com.invoicetronic.invoice.sdk.model.Company;
import com.invoicetronic.invoice.sdk.model.DocumentData;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * Send
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-16T15:18:14.239593Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class Send implements Serializable {
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

  /**
   * Whether the payload is Base64 encoded or a plain XML (text).
   */
  @JsonAdapter(EncodingEnum.Adapter.class)
  public enum EncodingEnum {
    XML("Xml"),
    
    BASE64("Base64");

    private String value;

    EncodingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EncodingEnum fromValue(String value) {
      for (EncodingEnum b : EncodingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EncodingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EncodingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EncodingEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EncodingEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EncodingEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ENCODING = "encoding";
  @SerializedName(SERIALIZED_NAME_ENCODING)
  @javax.annotation.Nullable
  private EncodingEnum encoding;

  public static final String SERIALIZED_NAME_META_DATA = "meta_data";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  @javax.annotation.Nullable
  private Map<String, String> metaData;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  @javax.annotation.Nullable
  private Company company;

  public Send() {
  }

  public Send id(@javax.annotation.Nullable Integer id) {
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


  public Send created(@javax.annotation.Nullable OffsetDateTime created) {
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


  public Send version(@javax.annotation.Nullable Integer version) {
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


  public Send userId(@javax.annotation.Nullable Integer userId) {
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


  public Send companyId(@javax.annotation.Nullable Integer companyId) {
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


  public Send committente(@javax.annotation.Nullable String committente) {
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


  public Send prestatore(@javax.annotation.Nullable String prestatore) {
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


  public Send identifier(@javax.annotation.Nullable String identifier) {
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


  public Send fileName(@javax.annotation.Nullable String fileName) {
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


  public Send format(@javax.annotation.Nullable String format) {
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


  public Send payload(@javax.annotation.Nullable String payload) {
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


  public Send lastUpdate(@javax.annotation.Nullable OffsetDateTime lastUpdate) {
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


  public Send dateSent(@javax.annotation.Nullable OffsetDateTime dateSent) {
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


  public Send documents(@javax.annotation.Nullable List<DocumentData> documents) {
    this.documents = documents;
    return this;
  }

  public Send addDocumentsItem(DocumentData documentsItem) {
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


  public Send encoding(@javax.annotation.Nullable EncodingEnum encoding) {
    this.encoding = encoding;
    return this;
  }

  /**
   * Whether the payload is Base64 encoded or a plain XML (text).
   * @return encoding
   */
  @javax.annotation.Nullable
  public EncodingEnum getEncoding() {
    return encoding;
  }

  public void setEncoding(@javax.annotation.Nullable EncodingEnum encoding) {
    this.encoding = encoding;
  }


  public Send metaData(@javax.annotation.Nullable Map<String, String> metaData) {
    this.metaData = metaData;
    return this;
  }

  public Send putMetaDataItem(String key, String metaDataItem) {
    if (this.metaData == null) {
      this.metaData = new HashMap<>();
    }
    this.metaData.put(key, metaDataItem);
    return this;
  }

  /**
   * Optional metadata, as json.
   * @return metaData
   */
  @javax.annotation.Nullable
  public Map<String, String> getMetaData() {
    return metaData;
  }

  public void setMetaData(@javax.annotation.Nullable Map<String, String> metaData) {
    this.metaData = metaData;
  }


  public Send company(@javax.annotation.Nullable Company company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
   */
  @javax.annotation.Nullable
  public Company getCompany() {
    return company;
  }

  public void setCompany(@javax.annotation.Nullable Company company) {
    this.company = company;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Send send = (Send) o;
    return Objects.equals(this.id, send.id) &&
        Objects.equals(this.created, send.created) &&
        Objects.equals(this.version, send.version) &&
        Objects.equals(this.userId, send.userId) &&
        Objects.equals(this.companyId, send.companyId) &&
        Objects.equals(this.committente, send.committente) &&
        Objects.equals(this.prestatore, send.prestatore) &&
        Objects.equals(this.identifier, send.identifier) &&
        Objects.equals(this.fileName, send.fileName) &&
        Objects.equals(this.format, send.format) &&
        Objects.equals(this.payload, send.payload) &&
        Objects.equals(this.lastUpdate, send.lastUpdate) &&
        Objects.equals(this.dateSent, send.dateSent) &&
        Objects.equals(this.documents, send.documents) &&
        Objects.equals(this.encoding, send.encoding) &&
        Objects.equals(this.metaData, send.metaData) &&
        Objects.equals(this.company, send.company);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, version, userId, companyId, committente, prestatore, identifier, fileName, format, payload, lastUpdate, dateSent, documents, encoding, metaData, company);
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
    sb.append("class Send {\n");
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
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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
    openapiFields.add("encoding");
    openapiFields.add("meta_data");
    openapiFields.add("company");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Send
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Send.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Send is not found in the empty JSON string", Send.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Send.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Send` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("encoding") != null && !jsonObj.get("encoding").isJsonNull()) && !jsonObj.get("encoding").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encoding` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encoding").toString()));
      }
      // validate the optional field `encoding`
      if (jsonObj.get("encoding") != null && !jsonObj.get("encoding").isJsonNull()) {
        EncodingEnum.validateJsonElement(jsonObj.get("encoding"));
      }
      // validate the optional field `company`
      if (jsonObj.get("company") != null && !jsonObj.get("company").isJsonNull()) {
        Company.validateJsonElement(jsonObj.get("company"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Send.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Send' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Send> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Send.class));

       return (TypeAdapter<T>) new TypeAdapter<Send>() {
           @Override
           public void write(JsonWriter out, Send value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Send read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Send given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Send
   * @throws IOException if the JSON string is invalid with respect to Send
   */
  public static Send fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Send.class);
  }

  /**
   * Convert an instance of Send to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

