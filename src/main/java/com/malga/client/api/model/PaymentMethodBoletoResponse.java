/*
 * Malga API Documentation
 * # Authentication  Malga’s API services are protected through access keys. 
 *
 * The version of the OpenAPI document: 0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.malga.client.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.malga.client.JSON;

/**
 * PaymentMethodBoletoResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-21T00:10:35.774518-03:00[America/Sao_Paulo]")
public class PaymentMethodBoletoResponse {
  /**
   * método da cobrança via Boleto, o source deve ser um customer válido
   */
  @JsonAdapter(PaymentTypeEnum.Adapter.class)
  public enum PaymentTypeEnum {
    BOLETO("boleto");

    private String value;

    PaymentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentTypeEnum fromValue(String value) {
      for (PaymentTypeEnum b : PaymentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "paymentType";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private PaymentTypeEnum paymentType;

  public static final String SERIALIZED_NAME_EXPIRES_DATE = "expiresDate";
  @SerializedName(SERIALIZED_NAME_EXPIRES_DATE)
  private String expiresDate;

  public static final String SERIALIZED_NAME_BARCODE_DATA = "barcodeData";
  @SerializedName(SERIALIZED_NAME_BARCODE_DATA)
  private String barcodeData;

  public static final String SERIALIZED_NAME_BARCODE_IMAGE_URL = "barcodeImageUrl";
  @SerializedName(SERIALIZED_NAME_BARCODE_IMAGE_URL)
  private String barcodeImageUrl;

  public PaymentMethodBoletoResponse() {
  }

  public PaymentMethodBoletoResponse paymentType(PaymentTypeEnum paymentType) {
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * método da cobrança via Boleto, o source deve ser um customer válido
   * @return paymentType
  **/
  @javax.annotation.Nonnull

  public PaymentTypeEnum getPaymentType() {
    return paymentType;
  }


  public void setPaymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
  }


  public PaymentMethodBoletoResponse expiresDate(String expiresDate) {
    
    this.expiresDate = expiresDate;
    return this;
  }

   /**
   * data de vencimento do boleto em ISO-Date, ex 2017-01-31
   * @return expiresDate
  **/
  @javax.annotation.Nonnull

  public String getExpiresDate() {
    return expiresDate;
  }


  public void setExpiresDate(String expiresDate) {
    this.expiresDate = expiresDate;
  }


  public PaymentMethodBoletoResponse barcodeData(String barcodeData) {
    
    this.barcodeData = barcodeData;
    return this;
  }

   /**
   * código copia e cola do boleto registrado gerado, pronto para pagamento;
   * @return barcodeData
  **/
  @javax.annotation.Nonnull

  public String getBarcodeData() {
    return barcodeData;
  }


  public void setBarcodeData(String barcodeData) {
    this.barcodeData = barcodeData;
  }


  public PaymentMethodBoletoResponse barcodeImageUrl(String barcodeImageUrl) {
    
    this.barcodeImageUrl = barcodeImageUrl;
    return this;
  }

   /**
   * link para download do do boleto registrado gerado, pronto para pagamento;
   * @return barcodeImageUrl
  **/
  @javax.annotation.Nonnull

  public String getBarcodeImageUrl() {
    return barcodeImageUrl;
  }


  public void setBarcodeImageUrl(String barcodeImageUrl) {
    this.barcodeImageUrl = barcodeImageUrl;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the PaymentMethodBoletoResponse instance itself
   */
  public PaymentMethodBoletoResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodBoletoResponse paymentMethodBoletoResponse = (PaymentMethodBoletoResponse) o;
    return Objects.equals(this.paymentType, paymentMethodBoletoResponse.paymentType) &&
        Objects.equals(this.expiresDate, paymentMethodBoletoResponse.expiresDate) &&
        Objects.equals(this.barcodeData, paymentMethodBoletoResponse.barcodeData) &&
        Objects.equals(this.barcodeImageUrl, paymentMethodBoletoResponse.barcodeImageUrl)&&
        Objects.equals(this.additionalProperties, paymentMethodBoletoResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentType, expiresDate, barcodeData, barcodeImageUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodBoletoResponse {\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    expiresDate: ").append(toIndentedString(expiresDate)).append("\n");
    sb.append("    barcodeData: ").append(toIndentedString(barcodeData)).append("\n");
    sb.append("    barcodeImageUrl: ").append(toIndentedString(barcodeImageUrl)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("paymentType");
    openapiFields.add("expiresDate");
    openapiFields.add("barcodeData");
    openapiFields.add("barcodeImageUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("paymentType");
    openapiRequiredFields.add("expiresDate");
    openapiRequiredFields.add("barcodeData");
    openapiRequiredFields.add("barcodeImageUrl");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentMethodBoletoResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentMethodBoletoResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentMethodBoletoResponse is not found in the empty JSON string", PaymentMethodBoletoResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentMethodBoletoResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("paymentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentType").toString()));
      }
      if (!jsonObj.get("expiresDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiresDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiresDate").toString()));
      }
      if (!jsonObj.get("barcodeData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `barcodeData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("barcodeData").toString()));
      }
      if (!jsonObj.get("barcodeImageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `barcodeImageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("barcodeImageUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentMethodBoletoResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentMethodBoletoResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentMethodBoletoResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodBoletoResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentMethodBoletoResponse>() {
           @Override
           public void write(JsonWriter out, PaymentMethodBoletoResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentMethodBoletoResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentMethodBoletoResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentMethodBoletoResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentMethodBoletoResponse
  * @throws IOException if the JSON string is invalid with respect to PaymentMethodBoletoResponse
  */
  public static PaymentMethodBoletoResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentMethodBoletoResponse.class);
  }

 /**
  * Convert an instance of PaymentMethodBoletoResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

