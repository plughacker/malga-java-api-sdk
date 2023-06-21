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
import com.malga.client.api.model.PaymentMethodBoletoFine;
import com.malga.client.api.model.PaymentMethodBoletoInterest;
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
 * PaymentMethodBoleto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-21T00:10:35.774518-03:00[America/Sao_Paulo]")
public class PaymentMethodBoleto {
  /**
   * Boleto charge, the source must be a valid customer.
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

  public static final String SERIALIZED_NAME_INSTRUCTIONS = "instructions";
  @SerializedName(SERIALIZED_NAME_INSTRUCTIONS)
  private String instructions;

  public static final String SERIALIZED_NAME_INTEREST = "interest";
  @SerializedName(SERIALIZED_NAME_INTEREST)
  private PaymentMethodBoletoInterest interest;

  public static final String SERIALIZED_NAME_FINE = "fine";
  @SerializedName(SERIALIZED_NAME_FINE)
  private PaymentMethodBoletoFine fine;

  public PaymentMethodBoleto() {
  }

  public PaymentMethodBoleto paymentType(PaymentTypeEnum paymentType) {
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Boleto charge, the source must be a valid customer.
   * @return paymentType
  **/
  @javax.annotation.Nonnull

  public PaymentTypeEnum getPaymentType() {
    return paymentType;
  }


  public void setPaymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
  }


  public PaymentMethodBoleto expiresDate(String expiresDate) {
    
    this.expiresDate = expiresDate;
    return this;
  }

   /**
   * Boleto due date, ISO-Date, ex 2017-01-31
   * @return expiresDate
  **/
  @javax.annotation.Nullable

  public String getExpiresDate() {
    return expiresDate;
  }


  public void setExpiresDate(String expiresDate) {
    this.expiresDate = expiresDate;
  }


  public PaymentMethodBoleto instructions(String instructions) {
    
    this.instructions = instructions;
    return this;
  }

   /**
   * Boleto instructions field. Maximum 255 characters. Use \\n for line break
   * @return instructions
  **/
  @javax.annotation.Nullable

  public String getInstructions() {
    return instructions;
  }


  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }


  public PaymentMethodBoleto interest(PaymentMethodBoletoInterest interest) {
    
    this.interest = interest;
    return this;
  }

   /**
   * Get interest
   * @return interest
  **/
  @javax.annotation.Nullable

  public PaymentMethodBoletoInterest getInterest() {
    return interest;
  }


  public void setInterest(PaymentMethodBoletoInterest interest) {
    this.interest = interest;
  }


  public PaymentMethodBoleto fine(PaymentMethodBoletoFine fine) {
    
    this.fine = fine;
    return this;
  }

   /**
   * Get fine
   * @return fine
  **/
  @javax.annotation.Nullable

  public PaymentMethodBoletoFine getFine() {
    return fine;
  }


  public void setFine(PaymentMethodBoletoFine fine) {
    this.fine = fine;
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
   * @return the PaymentMethodBoleto instance itself
   */
  public PaymentMethodBoleto putAdditionalProperty(String key, Object value) {
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
    PaymentMethodBoleto paymentMethodBoleto = (PaymentMethodBoleto) o;
    return Objects.equals(this.paymentType, paymentMethodBoleto.paymentType) &&
        Objects.equals(this.expiresDate, paymentMethodBoleto.expiresDate) &&
        Objects.equals(this.instructions, paymentMethodBoleto.instructions) &&
        Objects.equals(this.interest, paymentMethodBoleto.interest) &&
        Objects.equals(this.fine, paymentMethodBoleto.fine)&&
        Objects.equals(this.additionalProperties, paymentMethodBoleto.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentType, expiresDate, instructions, interest, fine, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodBoleto {\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    expiresDate: ").append(toIndentedString(expiresDate)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    interest: ").append(toIndentedString(interest)).append("\n");
    sb.append("    fine: ").append(toIndentedString(fine)).append("\n");
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
    openapiFields.add("instructions");
    openapiFields.add("interest");
    openapiFields.add("fine");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("paymentType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentMethodBoleto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentMethodBoleto.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentMethodBoleto is not found in the empty JSON string", PaymentMethodBoleto.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentMethodBoleto.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("paymentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentType").toString()));
      }
      if ((jsonObj.get("expiresDate") != null && !jsonObj.get("expiresDate").isJsonNull()) && !jsonObj.get("expiresDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiresDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiresDate").toString()));
      }
      if ((jsonObj.get("instructions") != null && !jsonObj.get("instructions").isJsonNull()) && !jsonObj.get("instructions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instructions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instructions").toString()));
      }
      // validate the optional field `interest`
      if (jsonObj.get("interest") != null && !jsonObj.get("interest").isJsonNull()) {
        PaymentMethodBoletoInterest.validateJsonObject(jsonObj.getAsJsonObject("interest"));
      }
      // validate the optional field `fine`
      if (jsonObj.get("fine") != null && !jsonObj.get("fine").isJsonNull()) {
        PaymentMethodBoletoFine.validateJsonObject(jsonObj.getAsJsonObject("fine"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentMethodBoleto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentMethodBoleto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentMethodBoleto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodBoleto.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentMethodBoleto>() {
           @Override
           public void write(JsonWriter out, PaymentMethodBoleto value) throws IOException {
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
           public PaymentMethodBoleto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentMethodBoleto instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaymentMethodBoleto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentMethodBoleto
  * @throws IOException if the JSON string is invalid with respect to PaymentMethodBoleto
  */
  public static PaymentMethodBoleto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentMethodBoleto.class);
  }

 /**
  * Convert an instance of PaymentMethodBoleto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

