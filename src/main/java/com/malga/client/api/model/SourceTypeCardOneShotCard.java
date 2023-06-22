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
 * SourceTypeCardOneShotCard
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-22T19:10:47.032351-03:00[America/Sao_Paulo]")
public class SourceTypeCardOneShotCard {
  public static final String SERIALIZED_NAME_CARD_HOLDER_NAME = "cardHolderName";
  @SerializedName(SERIALIZED_NAME_CARD_HOLDER_NAME)
  private String cardHolderName;

  public static final String SERIALIZED_NAME_CARD_NUMBER = "cardNumber";
  @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
  private String cardNumber;

  public static final String SERIALIZED_NAME_CARD_CVV = "cardCvv";
  @SerializedName(SERIALIZED_NAME_CARD_CVV)
  private String cardCvv;

  public static final String SERIALIZED_NAME_CARD_EXPIRATION_DATE = "cardExpirationDate";
  @SerializedName(SERIALIZED_NAME_CARD_EXPIRATION_DATE)
  private String cardExpirationDate;

  public SourceTypeCardOneShotCard() {
  }

  public SourceTypeCardOneShotCard cardHolderName(String cardHolderName) {
    
    this.cardHolderName = cardHolderName;
    return this;
  }

   /**
   * Nome do portador do cartão
   * @return cardHolderName
  **/
  @javax.annotation.Nonnull

  public String getCardHolderName() {
    return cardHolderName;
  }


  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }


  public SourceTypeCardOneShotCard cardNumber(String cardNumber) {
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Número do cartão (Sem espaços)
   * @return cardNumber
  **/
  @javax.annotation.Nonnull

  public String getCardNumber() {
    return cardNumber;
  }


  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  public SourceTypeCardOneShotCard cardCvv(String cardCvv) {
    
    this.cardCvv = cardCvv;
    return this;
  }

   /**
   * Código de verificação
   * @return cardCvv
  **/
  @javax.annotation.Nonnull

  public String getCardCvv() {
    return cardCvv;
  }


  public void setCardCvv(String cardCvv) {
    this.cardCvv = cardCvv;
  }


  public SourceTypeCardOneShotCard cardExpirationDate(String cardExpirationDate) {
    
    this.cardExpirationDate = cardExpirationDate;
    return this;
  }

   /**
   * Mês e ano de validade no formato MM/YYYY
   * @return cardExpirationDate
  **/
  @javax.annotation.Nonnull

  public String getCardExpirationDate() {
    return cardExpirationDate;
  }


  public void setCardExpirationDate(String cardExpirationDate) {
    this.cardExpirationDate = cardExpirationDate;
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
   * @return the SourceTypeCardOneShotCard instance itself
   */
  public SourceTypeCardOneShotCard putAdditionalProperty(String key, Object value) {
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
    SourceTypeCardOneShotCard sourceTypeCardOneShotCard = (SourceTypeCardOneShotCard) o;
    return Objects.equals(this.cardHolderName, sourceTypeCardOneShotCard.cardHolderName) &&
        Objects.equals(this.cardNumber, sourceTypeCardOneShotCard.cardNumber) &&
        Objects.equals(this.cardCvv, sourceTypeCardOneShotCard.cardCvv) &&
        Objects.equals(this.cardExpirationDate, sourceTypeCardOneShotCard.cardExpirationDate)&&
        Objects.equals(this.additionalProperties, sourceTypeCardOneShotCard.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardHolderName, cardNumber, cardCvv, cardExpirationDate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceTypeCardOneShotCard {\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardCvv: ").append(toIndentedString(cardCvv)).append("\n");
    sb.append("    cardExpirationDate: ").append(toIndentedString(cardExpirationDate)).append("\n");
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
    openapiFields.add("cardHolderName");
    openapiFields.add("cardNumber");
    openapiFields.add("cardCvv");
    openapiFields.add("cardExpirationDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cardHolderName");
    openapiRequiredFields.add("cardNumber");
    openapiRequiredFields.add("cardCvv");
    openapiRequiredFields.add("cardExpirationDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SourceTypeCardOneShotCard
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SourceTypeCardOneShotCard.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SourceTypeCardOneShotCard is not found in the empty JSON string", SourceTypeCardOneShotCard.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SourceTypeCardOneShotCard.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("cardHolderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardHolderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardHolderName").toString()));
      }
      if (!jsonObj.get("cardNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardNumber").toString()));
      }
      if (!jsonObj.get("cardCvv").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardCvv` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardCvv").toString()));
      }
      if (!jsonObj.get("cardExpirationDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardExpirationDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardExpirationDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SourceTypeCardOneShotCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SourceTypeCardOneShotCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SourceTypeCardOneShotCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SourceTypeCardOneShotCard.class));

       return (TypeAdapter<T>) new TypeAdapter<SourceTypeCardOneShotCard>() {
           @Override
           public void write(JsonWriter out, SourceTypeCardOneShotCard value) throws IOException {
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
           public SourceTypeCardOneShotCard read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SourceTypeCardOneShotCard instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SourceTypeCardOneShotCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SourceTypeCardOneShotCard
  * @throws IOException if the JSON string is invalid with respect to SourceTypeCardOneShotCard
  */
  public static SourceTypeCardOneShotCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SourceTypeCardOneShotCard.class);
  }

 /**
  * Convert an instance of SourceTypeCardOneShotCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

