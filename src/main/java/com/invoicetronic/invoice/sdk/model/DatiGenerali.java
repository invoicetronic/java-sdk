/*
 * Invoicetronic API
 * The [Invoicetronic API][2] is a RESTful service that allows you to send and receive invoices through the Italian [Servizio di Interscambio (SDI)][1], or Interchange Service. The API is designed to be simple and easy to use, abstracting away SDI complexity while providing complete control over the invoice send/receive process. It provides advanced features as encryption at rest, multi-language pre-flight invoice validation, multiple upload formats, webhooks, event logging, client SDKs, and CLI tools.  For more information, see  [Invoicetronic website][2]  [1]: https://www.fatturapa.gov.it/it/sistemainterscambio/cose-il-sdi/ [2]: https://invoicetronic.com/
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
import com.invoicetronic.invoice.sdk.model.DatiContratto;
import com.invoicetronic.invoice.sdk.model.DatiConvenzione;
import com.invoicetronic.invoice.sdk.model.DatiDDT;
import com.invoicetronic.invoice.sdk.model.DatiFattureCollegate;
import com.invoicetronic.invoice.sdk.model.DatiGeneraliDocumento;
import com.invoicetronic.invoice.sdk.model.DatiOrdineAcquisto;
import com.invoicetronic.invoice.sdk.model.DatiRicezione;
import com.invoicetronic.invoice.sdk.model.DatiSAL;
import com.invoicetronic.invoice.sdk.model.DatiTrasporto;
import com.invoicetronic.invoice.sdk.model.FatturaPrincipale;
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

import com.invoicetronic.invoice.sdk.JSON;

/**
 * DatiGenerali
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T08:35:17.954315Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class DatiGenerali implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATI_GENERALI_DOCUMENTO = "dati_generali_documento";
  @SerializedName(SERIALIZED_NAME_DATI_GENERALI_DOCUMENTO)
  @javax.annotation.Nullable
  private DatiGeneraliDocumento datiGeneraliDocumento;

  public static final String SERIALIZED_NAME_DATI_ORDINE_ACQUISTO = "dati_ordine_acquisto";
  @SerializedName(SERIALIZED_NAME_DATI_ORDINE_ACQUISTO)
  @javax.annotation.Nullable
  private List<DatiOrdineAcquisto> datiOrdineAcquisto;

  public static final String SERIALIZED_NAME_DATI_CONTRATTO = "dati_contratto";
  @SerializedName(SERIALIZED_NAME_DATI_CONTRATTO)
  @javax.annotation.Nullable
  private List<DatiContratto> datiContratto;

  public static final String SERIALIZED_NAME_DATI_CONVENZIONE = "dati_convenzione";
  @SerializedName(SERIALIZED_NAME_DATI_CONVENZIONE)
  @javax.annotation.Nullable
  private List<DatiConvenzione> datiConvenzione;

  public static final String SERIALIZED_NAME_DATI_RICEZIONE = "dati_ricezione";
  @SerializedName(SERIALIZED_NAME_DATI_RICEZIONE)
  @javax.annotation.Nullable
  private List<DatiRicezione> datiRicezione;

  public static final String SERIALIZED_NAME_DATI_FATTURE_COLLEGATE = "dati_fatture_collegate";
  @SerializedName(SERIALIZED_NAME_DATI_FATTURE_COLLEGATE)
  @javax.annotation.Nullable
  private List<DatiFattureCollegate> datiFattureCollegate;

  public static final String SERIALIZED_NAME_DATI_SAL = "dati_sal";
  @SerializedName(SERIALIZED_NAME_DATI_SAL)
  @javax.annotation.Nullable
  private List<DatiSAL> datiSal;

  public static final String SERIALIZED_NAME_DATI_DDT = "dati_ddt";
  @SerializedName(SERIALIZED_NAME_DATI_DDT)
  @javax.annotation.Nullable
  private List<DatiDDT> datiDdt;

  public static final String SERIALIZED_NAME_DATI_TRASPORTO = "dati_trasporto";
  @SerializedName(SERIALIZED_NAME_DATI_TRASPORTO)
  @javax.annotation.Nullable
  private DatiTrasporto datiTrasporto;

  public static final String SERIALIZED_NAME_FATTURA_PRINCIPALE = "fattura_principale";
  @SerializedName(SERIALIZED_NAME_FATTURA_PRINCIPALE)
  @javax.annotation.Nullable
  private FatturaPrincipale fatturaPrincipale;

  public DatiGenerali() {
  }

  public DatiGenerali datiGeneraliDocumento(@javax.annotation.Nullable DatiGeneraliDocumento datiGeneraliDocumento) {
    this.datiGeneraliDocumento = datiGeneraliDocumento;
    return this;
  }

  /**
   * Get datiGeneraliDocumento
   * @return datiGeneraliDocumento
   */
  @javax.annotation.Nullable
  public DatiGeneraliDocumento getDatiGeneraliDocumento() {
    return datiGeneraliDocumento;
  }

  public void setDatiGeneraliDocumento(@javax.annotation.Nullable DatiGeneraliDocumento datiGeneraliDocumento) {
    this.datiGeneraliDocumento = datiGeneraliDocumento;
  }


  public DatiGenerali datiOrdineAcquisto(@javax.annotation.Nullable List<DatiOrdineAcquisto> datiOrdineAcquisto) {
    this.datiOrdineAcquisto = datiOrdineAcquisto;
    return this;
  }

  public DatiGenerali addDatiOrdineAcquistoItem(DatiOrdineAcquisto datiOrdineAcquistoItem) {
    if (this.datiOrdineAcquisto == null) {
      this.datiOrdineAcquisto = new ArrayList<>();
    }
    this.datiOrdineAcquisto.add(datiOrdineAcquistoItem);
    return this;
  }

  /**
   * Get datiOrdineAcquisto
   * @return datiOrdineAcquisto
   */
  @javax.annotation.Nullable
  public List<DatiOrdineAcquisto> getDatiOrdineAcquisto() {
    return datiOrdineAcquisto;
  }

  public void setDatiOrdineAcquisto(@javax.annotation.Nullable List<DatiOrdineAcquisto> datiOrdineAcquisto) {
    this.datiOrdineAcquisto = datiOrdineAcquisto;
  }


  public DatiGenerali datiContratto(@javax.annotation.Nullable List<DatiContratto> datiContratto) {
    this.datiContratto = datiContratto;
    return this;
  }

  public DatiGenerali addDatiContrattoItem(DatiContratto datiContrattoItem) {
    if (this.datiContratto == null) {
      this.datiContratto = new ArrayList<>();
    }
    this.datiContratto.add(datiContrattoItem);
    return this;
  }

  /**
   * Get datiContratto
   * @return datiContratto
   */
  @javax.annotation.Nullable
  public List<DatiContratto> getDatiContratto() {
    return datiContratto;
  }

  public void setDatiContratto(@javax.annotation.Nullable List<DatiContratto> datiContratto) {
    this.datiContratto = datiContratto;
  }


  public DatiGenerali datiConvenzione(@javax.annotation.Nullable List<DatiConvenzione> datiConvenzione) {
    this.datiConvenzione = datiConvenzione;
    return this;
  }

  public DatiGenerali addDatiConvenzioneItem(DatiConvenzione datiConvenzioneItem) {
    if (this.datiConvenzione == null) {
      this.datiConvenzione = new ArrayList<>();
    }
    this.datiConvenzione.add(datiConvenzioneItem);
    return this;
  }

  /**
   * Get datiConvenzione
   * @return datiConvenzione
   */
  @javax.annotation.Nullable
  public List<DatiConvenzione> getDatiConvenzione() {
    return datiConvenzione;
  }

  public void setDatiConvenzione(@javax.annotation.Nullable List<DatiConvenzione> datiConvenzione) {
    this.datiConvenzione = datiConvenzione;
  }


  public DatiGenerali datiRicezione(@javax.annotation.Nullable List<DatiRicezione> datiRicezione) {
    this.datiRicezione = datiRicezione;
    return this;
  }

  public DatiGenerali addDatiRicezioneItem(DatiRicezione datiRicezioneItem) {
    if (this.datiRicezione == null) {
      this.datiRicezione = new ArrayList<>();
    }
    this.datiRicezione.add(datiRicezioneItem);
    return this;
  }

  /**
   * Get datiRicezione
   * @return datiRicezione
   */
  @javax.annotation.Nullable
  public List<DatiRicezione> getDatiRicezione() {
    return datiRicezione;
  }

  public void setDatiRicezione(@javax.annotation.Nullable List<DatiRicezione> datiRicezione) {
    this.datiRicezione = datiRicezione;
  }


  public DatiGenerali datiFattureCollegate(@javax.annotation.Nullable List<DatiFattureCollegate> datiFattureCollegate) {
    this.datiFattureCollegate = datiFattureCollegate;
    return this;
  }

  public DatiGenerali addDatiFattureCollegateItem(DatiFattureCollegate datiFattureCollegateItem) {
    if (this.datiFattureCollegate == null) {
      this.datiFattureCollegate = new ArrayList<>();
    }
    this.datiFattureCollegate.add(datiFattureCollegateItem);
    return this;
  }

  /**
   * Get datiFattureCollegate
   * @return datiFattureCollegate
   */
  @javax.annotation.Nullable
  public List<DatiFattureCollegate> getDatiFattureCollegate() {
    return datiFattureCollegate;
  }

  public void setDatiFattureCollegate(@javax.annotation.Nullable List<DatiFattureCollegate> datiFattureCollegate) {
    this.datiFattureCollegate = datiFattureCollegate;
  }


  public DatiGenerali datiSal(@javax.annotation.Nullable List<DatiSAL> datiSal) {
    this.datiSal = datiSal;
    return this;
  }

  public DatiGenerali addDatiSalItem(DatiSAL datiSalItem) {
    if (this.datiSal == null) {
      this.datiSal = new ArrayList<>();
    }
    this.datiSal.add(datiSalItem);
    return this;
  }

  /**
   * Get datiSal
   * @return datiSal
   */
  @javax.annotation.Nullable
  public List<DatiSAL> getDatiSal() {
    return datiSal;
  }

  public void setDatiSal(@javax.annotation.Nullable List<DatiSAL> datiSal) {
    this.datiSal = datiSal;
  }


  public DatiGenerali datiDdt(@javax.annotation.Nullable List<DatiDDT> datiDdt) {
    this.datiDdt = datiDdt;
    return this;
  }

  public DatiGenerali addDatiDdtItem(DatiDDT datiDdtItem) {
    if (this.datiDdt == null) {
      this.datiDdt = new ArrayList<>();
    }
    this.datiDdt.add(datiDdtItem);
    return this;
  }

  /**
   * Get datiDdt
   * @return datiDdt
   */
  @javax.annotation.Nullable
  public List<DatiDDT> getDatiDdt() {
    return datiDdt;
  }

  public void setDatiDdt(@javax.annotation.Nullable List<DatiDDT> datiDdt) {
    this.datiDdt = datiDdt;
  }


  public DatiGenerali datiTrasporto(@javax.annotation.Nullable DatiTrasporto datiTrasporto) {
    this.datiTrasporto = datiTrasporto;
    return this;
  }

  /**
   * Get datiTrasporto
   * @return datiTrasporto
   */
  @javax.annotation.Nullable
  public DatiTrasporto getDatiTrasporto() {
    return datiTrasporto;
  }

  public void setDatiTrasporto(@javax.annotation.Nullable DatiTrasporto datiTrasporto) {
    this.datiTrasporto = datiTrasporto;
  }


  public DatiGenerali fatturaPrincipale(@javax.annotation.Nullable FatturaPrincipale fatturaPrincipale) {
    this.fatturaPrincipale = fatturaPrincipale;
    return this;
  }

  /**
   * Get fatturaPrincipale
   * @return fatturaPrincipale
   */
  @javax.annotation.Nullable
  public FatturaPrincipale getFatturaPrincipale() {
    return fatturaPrincipale;
  }

  public void setFatturaPrincipale(@javax.annotation.Nullable FatturaPrincipale fatturaPrincipale) {
    this.fatturaPrincipale = fatturaPrincipale;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatiGenerali datiGenerali = (DatiGenerali) o;
    return Objects.equals(this.datiGeneraliDocumento, datiGenerali.datiGeneraliDocumento) &&
        Objects.equals(this.datiOrdineAcquisto, datiGenerali.datiOrdineAcquisto) &&
        Objects.equals(this.datiContratto, datiGenerali.datiContratto) &&
        Objects.equals(this.datiConvenzione, datiGenerali.datiConvenzione) &&
        Objects.equals(this.datiRicezione, datiGenerali.datiRicezione) &&
        Objects.equals(this.datiFattureCollegate, datiGenerali.datiFattureCollegate) &&
        Objects.equals(this.datiSal, datiGenerali.datiSal) &&
        Objects.equals(this.datiDdt, datiGenerali.datiDdt) &&
        Objects.equals(this.datiTrasporto, datiGenerali.datiTrasporto) &&
        Objects.equals(this.fatturaPrincipale, datiGenerali.fatturaPrincipale);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(datiGeneraliDocumento, datiOrdineAcquisto, datiContratto, datiConvenzione, datiRicezione, datiFattureCollegate, datiSal, datiDdt, datiTrasporto, fatturaPrincipale);
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
    sb.append("class DatiGenerali {\n");
    sb.append("    datiGeneraliDocumento: ").append(toIndentedString(datiGeneraliDocumento)).append("\n");
    sb.append("    datiOrdineAcquisto: ").append(toIndentedString(datiOrdineAcquisto)).append("\n");
    sb.append("    datiContratto: ").append(toIndentedString(datiContratto)).append("\n");
    sb.append("    datiConvenzione: ").append(toIndentedString(datiConvenzione)).append("\n");
    sb.append("    datiRicezione: ").append(toIndentedString(datiRicezione)).append("\n");
    sb.append("    datiFattureCollegate: ").append(toIndentedString(datiFattureCollegate)).append("\n");
    sb.append("    datiSal: ").append(toIndentedString(datiSal)).append("\n");
    sb.append("    datiDdt: ").append(toIndentedString(datiDdt)).append("\n");
    sb.append("    datiTrasporto: ").append(toIndentedString(datiTrasporto)).append("\n");
    sb.append("    fatturaPrincipale: ").append(toIndentedString(fatturaPrincipale)).append("\n");
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
    openapiFields.add("dati_generali_documento");
    openapiFields.add("dati_ordine_acquisto");
    openapiFields.add("dati_contratto");
    openapiFields.add("dati_convenzione");
    openapiFields.add("dati_ricezione");
    openapiFields.add("dati_fatture_collegate");
    openapiFields.add("dati_sal");
    openapiFields.add("dati_ddt");
    openapiFields.add("dati_trasporto");
    openapiFields.add("fattura_principale");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatiGenerali
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatiGenerali.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatiGenerali is not found in the empty JSON string", DatiGenerali.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatiGenerali.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatiGenerali` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `dati_generali_documento`
      if (jsonObj.get("dati_generali_documento") != null && !jsonObj.get("dati_generali_documento").isJsonNull()) {
        DatiGeneraliDocumento.validateJsonElement(jsonObj.get("dati_generali_documento"));
      }
      if (jsonObj.get("dati_ordine_acquisto") != null && !jsonObj.get("dati_ordine_acquisto").isJsonNull()) {
        JsonArray jsonArraydatiOrdineAcquisto = jsonObj.getAsJsonArray("dati_ordine_acquisto");
        if (jsonArraydatiOrdineAcquisto != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dati_ordine_acquisto").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dati_ordine_acquisto` to be an array in the JSON string but got `%s`", jsonObj.get("dati_ordine_acquisto").toString()));
          }

          // validate the optional field `dati_ordine_acquisto` (array)
          for (int i = 0; i < jsonArraydatiOrdineAcquisto.size(); i++) {
            DatiOrdineAcquisto.validateJsonElement(jsonArraydatiOrdineAcquisto.get(i));
          };
        }
      }
      if (jsonObj.get("dati_contratto") != null && !jsonObj.get("dati_contratto").isJsonNull()) {
        JsonArray jsonArraydatiContratto = jsonObj.getAsJsonArray("dati_contratto");
        if (jsonArraydatiContratto != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dati_contratto").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dati_contratto` to be an array in the JSON string but got `%s`", jsonObj.get("dati_contratto").toString()));
          }

          // validate the optional field `dati_contratto` (array)
          for (int i = 0; i < jsonArraydatiContratto.size(); i++) {
            DatiContratto.validateJsonElement(jsonArraydatiContratto.get(i));
          };
        }
      }
      if (jsonObj.get("dati_convenzione") != null && !jsonObj.get("dati_convenzione").isJsonNull()) {
        JsonArray jsonArraydatiConvenzione = jsonObj.getAsJsonArray("dati_convenzione");
        if (jsonArraydatiConvenzione != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dati_convenzione").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dati_convenzione` to be an array in the JSON string but got `%s`", jsonObj.get("dati_convenzione").toString()));
          }

          // validate the optional field `dati_convenzione` (array)
          for (int i = 0; i < jsonArraydatiConvenzione.size(); i++) {
            DatiConvenzione.validateJsonElement(jsonArraydatiConvenzione.get(i));
          };
        }
      }
      if (jsonObj.get("dati_ricezione") != null && !jsonObj.get("dati_ricezione").isJsonNull()) {
        JsonArray jsonArraydatiRicezione = jsonObj.getAsJsonArray("dati_ricezione");
        if (jsonArraydatiRicezione != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dati_ricezione").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dati_ricezione` to be an array in the JSON string but got `%s`", jsonObj.get("dati_ricezione").toString()));
          }

          // validate the optional field `dati_ricezione` (array)
          for (int i = 0; i < jsonArraydatiRicezione.size(); i++) {
            DatiRicezione.validateJsonElement(jsonArraydatiRicezione.get(i));
          };
        }
      }
      if (jsonObj.get("dati_fatture_collegate") != null && !jsonObj.get("dati_fatture_collegate").isJsonNull()) {
        JsonArray jsonArraydatiFattureCollegate = jsonObj.getAsJsonArray("dati_fatture_collegate");
        if (jsonArraydatiFattureCollegate != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dati_fatture_collegate").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dati_fatture_collegate` to be an array in the JSON string but got `%s`", jsonObj.get("dati_fatture_collegate").toString()));
          }

          // validate the optional field `dati_fatture_collegate` (array)
          for (int i = 0; i < jsonArraydatiFattureCollegate.size(); i++) {
            DatiFattureCollegate.validateJsonElement(jsonArraydatiFattureCollegate.get(i));
          };
        }
      }
      if (jsonObj.get("dati_sal") != null && !jsonObj.get("dati_sal").isJsonNull()) {
        JsonArray jsonArraydatiSal = jsonObj.getAsJsonArray("dati_sal");
        if (jsonArraydatiSal != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dati_sal").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dati_sal` to be an array in the JSON string but got `%s`", jsonObj.get("dati_sal").toString()));
          }

          // validate the optional field `dati_sal` (array)
          for (int i = 0; i < jsonArraydatiSal.size(); i++) {
            DatiSAL.validateJsonElement(jsonArraydatiSal.get(i));
          };
        }
      }
      if (jsonObj.get("dati_ddt") != null && !jsonObj.get("dati_ddt").isJsonNull()) {
        JsonArray jsonArraydatiDdt = jsonObj.getAsJsonArray("dati_ddt");
        if (jsonArraydatiDdt != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dati_ddt").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dati_ddt` to be an array in the JSON string but got `%s`", jsonObj.get("dati_ddt").toString()));
          }

          // validate the optional field `dati_ddt` (array)
          for (int i = 0; i < jsonArraydatiDdt.size(); i++) {
            DatiDDT.validateJsonElement(jsonArraydatiDdt.get(i));
          };
        }
      }
      // validate the optional field `dati_trasporto`
      if (jsonObj.get("dati_trasporto") != null && !jsonObj.get("dati_trasporto").isJsonNull()) {
        DatiTrasporto.validateJsonElement(jsonObj.get("dati_trasporto"));
      }
      // validate the optional field `fattura_principale`
      if (jsonObj.get("fattura_principale") != null && !jsonObj.get("fattura_principale").isJsonNull()) {
        FatturaPrincipale.validateJsonElement(jsonObj.get("fattura_principale"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatiGenerali.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatiGenerali' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatiGenerali> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatiGenerali.class));

       return (TypeAdapter<T>) new TypeAdapter<DatiGenerali>() {
           @Override
           public void write(JsonWriter out, DatiGenerali value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatiGenerali read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DatiGenerali given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatiGenerali
   * @throws IOException if the JSON string is invalid with respect to DatiGenerali
   */
  public static DatiGenerali fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatiGenerali.class);
  }

  /**
   * Convert an instance of DatiGenerali to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

