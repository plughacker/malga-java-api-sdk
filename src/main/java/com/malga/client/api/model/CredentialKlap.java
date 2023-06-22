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
 * CredentialKlap
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-21T21:25:35.057162-03:00[America/Sao_Paulo]")
public class CredentialKlap {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    KLAP("KLAP");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_API_KEY = "apiKey";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public static final String SERIALIZED_NAME_COMMERCE_ID = "commerceId";
  @SerializedName(SERIALIZED_NAME_COMMERCE_ID)
  private String commerceId;

  public static final String SERIALIZED_NAME_KEY_COMPONENT1 = "keyComponent1";
  @SerializedName(SERIALIZED_NAME_KEY_COMPONENT1)
  private String keyComponent1;

  public static final String SERIALIZED_NAME_KEY_COMPONENT2 = "keyComponent2";
  @SerializedName(SERIALIZED_NAME_KEY_COMPONENT2)
  private String keyComponent2;

  public CredentialKlap() {
  }

  public CredentialKlap type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CredentialKlap apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * API key of your Klap account
   * @return apiKey
  **/
  @javax.annotation.Nonnull

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public CredentialKlap commerceId(String commerceId) {
    
    this.commerceId = commerceId;
    return this;
  }

   /**
   * Commerce ID of your Klap account
   * @return commerceId
  **/
  @javax.annotation.Nullable

  public String getCommerceId() {
    return commerceId;
  }


  public void setCommerceId(String commerceId) {
    this.commerceId = commerceId;
  }


  public CredentialKlap keyComponent1(String keyComponent1) {
    
    this.keyComponent1 = keyComponent1;
    return this;
  }

   /**
   * Key component 1 of your Klap account
   * @return keyComponent1
  **/
  @javax.annotation.Nonnull

  public String getKeyComponent1() {
    return keyComponent1;
  }


  public void setKeyComponent1(String keyComponent1) {
    this.keyComponent1 = keyComponent1;
  }


  public CredentialKlap keyComponent2(String keyComponent2) {
    
    this.keyComponent2 = keyComponent2;
    return this;
  }

   /**
   * Key component 2 of your Klap account
   * @return keyComponent2
  **/
  @javax.annotation.Nonnull

  public String getKeyComponent2() {
    return keyComponent2;
  }


  public void setKeyComponent2(String keyComponent2) {
    this.keyComponent2 = keyComponent2;
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
   * @return the CredentialKlap instance itself
   */
  public CredentialKlap putAdditionalProperty(String key, Object value) {
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
    CredentialKlap credentialKlap = (CredentialKlap) o;
    return Objects.equals(this.type, credentialKlap.type) &&
        Objects.equals(this.apiKey, credentialKlap.apiKey) &&
        Objects.equals(this.commerceId, credentialKlap.commerceId) &&
        Objects.equals(this.keyComponent1, credentialKlap.keyComponent1) &&
        Objects.equals(this.keyComponent2, credentialKlap.keyComponent2)&&
        Objects.equals(this.additionalProperties, credentialKlap.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, apiKey, commerceId, keyComponent1, keyComponent2, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialKlap {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    commerceId: ").append(toIndentedString(commerceId)).append("\n");
    sb.append("    keyComponent1: ").append(toIndentedString(keyComponent1)).append("\n");
    sb.append("    keyComponent2: ").append(toIndentedString(keyComponent2)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("apiKey");
    openapiFields.add("commerceId");
    openapiFields.add("keyComponent1");
    openapiFields.add("keyComponent2");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("apiKey");
    openapiRequiredFields.add("keyComponent1");
    openapiRequiredFields.add("keyComponent2");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CredentialKlap
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CredentialKlap.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CredentialKlap is not found in the empty JSON string", CredentialKlap.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CredentialKlap.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("apiKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiKey").toString()));
      }
      if ((jsonObj.get("commerceId") != null && !jsonObj.get("commerceId").isJsonNull()) && !jsonObj.get("commerceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commerceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commerceId").toString()));
      }
      if (!jsonObj.get("keyComponent1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyComponent1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyComponent1").toString()));
      }
      if (!jsonObj.get("keyComponent2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyComponent2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyComponent2").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CredentialKlap.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CredentialKlap' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CredentialKlap> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CredentialKlap.class));

       return (TypeAdapter<T>) new TypeAdapter<CredentialKlap>() {
           @Override
           public void write(JsonWriter out, CredentialKlap value) throws IOException {
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
           public CredentialKlap read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CredentialKlap instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CredentialKlap given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CredentialKlap
  * @throws IOException if the JSON string is invalid with respect to CredentialKlap
  */
  public static CredentialKlap fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CredentialKlap.class);
  }

 /**
  * Convert an instance of CredentialKlap to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

