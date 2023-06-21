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
 * transaction requet error details
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-21T00:10:35.774518-03:00[America/Sao_Paulo]")
public class TransactionRequestProviderError {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_DECLINED_CODE = "declinedCode";
  @SerializedName(SERIALIZED_NAME_DECLINED_CODE)
  private String declinedCode;

  public static final String SERIALIZED_NAME_RETRYABLE = "retryable";
  @SerializedName(SERIALIZED_NAME_RETRYABLE)
  private Boolean retryable;

  public static final String SERIALIZED_NAME_NETWORK_DENIED_REASON = "networkDeniedReason";
  @SerializedName(SERIALIZED_NAME_NETWORK_DENIED_REASON)
  private String networkDeniedReason;

  public static final String SERIALIZED_NAME_NETWORK_DENIED_MESSAGE = "networkDeniedMessage";
  @SerializedName(SERIALIZED_NAME_NETWORK_DENIED_MESSAGE)
  private String networkDeniedMessage;

  public TransactionRequestProviderError() {
  }

  public TransactionRequestProviderError message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * error message mapped by Malga that describes declined reason
   * @return message
  **/
  @javax.annotation.Nullable

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public TransactionRequestProviderError declinedCode(String declinedCode) {
    
    this.declinedCode = declinedCode;
    return this;
  }

   /**
   * error code mapped by plyg based in the declined code returned by provider
   * @return declinedCode
  **/
  @javax.annotation.Nullable

  public String getDeclinedCode() {
    return declinedCode;
  }


  public void setDeclinedCode(String declinedCode) {
    this.declinedCode = declinedCode;
  }


  public TransactionRequestProviderError retryable(Boolean retryable) {
    
    this.retryable = retryable;
    return this;
  }

   /**
   * declined code can be or not retried
   * @return retryable
  **/
  @javax.annotation.Nullable

  public Boolean getRetryable() {
    return retryable;
  }


  public void setRetryable(Boolean retryable) {
    this.retryable = retryable;
  }


  public TransactionRequestProviderError networkDeniedReason(String networkDeniedReason) {
    
    this.networkDeniedReason = networkDeniedReason;
    return this;
  }

   /**
   * declined code returned as is from the provider, check in the provider&#39;s documentation
   * @return networkDeniedReason
  **/
  @javax.annotation.Nullable

  public String getNetworkDeniedReason() {
    return networkDeniedReason;
  }


  public void setNetworkDeniedReason(String networkDeniedReason) {
    this.networkDeniedReason = networkDeniedReason;
  }


  public TransactionRequestProviderError networkDeniedMessage(String networkDeniedMessage) {
    
    this.networkDeniedMessage = networkDeniedMessage;
    return this;
  }

   /**
   * declined message returned as is from the provider
   * @return networkDeniedMessage
  **/
  @javax.annotation.Nullable

  public String getNetworkDeniedMessage() {
    return networkDeniedMessage;
  }


  public void setNetworkDeniedMessage(String networkDeniedMessage) {
    this.networkDeniedMessage = networkDeniedMessage;
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
   * @return the TransactionRequestProviderError instance itself
   */
  public TransactionRequestProviderError putAdditionalProperty(String key, Object value) {
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
    TransactionRequestProviderError transactionRequestProviderError = (TransactionRequestProviderError) o;
    return Objects.equals(this.message, transactionRequestProviderError.message) &&
        Objects.equals(this.declinedCode, transactionRequestProviderError.declinedCode) &&
        Objects.equals(this.retryable, transactionRequestProviderError.retryable) &&
        Objects.equals(this.networkDeniedReason, transactionRequestProviderError.networkDeniedReason) &&
        Objects.equals(this.networkDeniedMessage, transactionRequestProviderError.networkDeniedMessage)&&
        Objects.equals(this.additionalProperties, transactionRequestProviderError.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, declinedCode, retryable, networkDeniedReason, networkDeniedMessage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRequestProviderError {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    declinedCode: ").append(toIndentedString(declinedCode)).append("\n");
    sb.append("    retryable: ").append(toIndentedString(retryable)).append("\n");
    sb.append("    networkDeniedReason: ").append(toIndentedString(networkDeniedReason)).append("\n");
    sb.append("    networkDeniedMessage: ").append(toIndentedString(networkDeniedMessage)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("declinedCode");
    openapiFields.add("retryable");
    openapiFields.add("networkDeniedReason");
    openapiFields.add("networkDeniedMessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionRequestProviderError
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TransactionRequestProviderError.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionRequestProviderError is not found in the empty JSON string", TransactionRequestProviderError.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("declinedCode") != null && !jsonObj.get("declinedCode").isJsonNull()) && !jsonObj.get("declinedCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `declinedCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("declinedCode").toString()));
      }
      if ((jsonObj.get("networkDeniedReason") != null && !jsonObj.get("networkDeniedReason").isJsonNull()) && !jsonObj.get("networkDeniedReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `networkDeniedReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("networkDeniedReason").toString()));
      }
      if ((jsonObj.get("networkDeniedMessage") != null && !jsonObj.get("networkDeniedMessage").isJsonNull()) && !jsonObj.get("networkDeniedMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `networkDeniedMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("networkDeniedMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionRequestProviderError.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionRequestProviderError' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionRequestProviderError> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionRequestProviderError.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionRequestProviderError>() {
           @Override
           public void write(JsonWriter out, TransactionRequestProviderError value) throws IOException {
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
           public TransactionRequestProviderError read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TransactionRequestProviderError instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TransactionRequestProviderError given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionRequestProviderError
  * @throws IOException if the JSON string is invalid with respect to TransactionRequestProviderError
  */
  public static TransactionRequestProviderError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionRequestProviderError.class);
  }

 /**
  * Convert an instance of TransactionRequestProviderError to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

