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
 * CredentialBB
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-22T19:10:47.032351-03:00[America/Sao_Paulo]")
public class CredentialBB {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BB("BB");

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

  public static final String SERIALIZED_NAME_AUTH_BASIC = "authBasic";
  @SerializedName(SERIALIZED_NAME_AUTH_BASIC)
  private String authBasic;

  public static final String SERIALIZED_NAME_DEV_APP_KEY = "devAppKey";
  @SerializedName(SERIALIZED_NAME_DEV_APP_KEY)
  private String devAppKey;

  public static final String SERIALIZED_NAME_PIX_KEY = "pixKey";
  @SerializedName(SERIALIZED_NAME_PIX_KEY)
  private String pixKey;

  public CredentialBB() {
  }

  public CredentialBB type(TypeEnum type) {
    
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


  public CredentialBB authBasic(String authBasic) {
    
    this.authBasic = authBasic;
    return this;
  }

   /**
   * Credencial de uso da sua conta no Banco do Brasil
   * @return authBasic
  **/
  @javax.annotation.Nonnull

  public String getAuthBasic() {
    return authBasic;
  }


  public void setAuthBasic(String authBasic) {
    this.authBasic = authBasic;
  }


  public CredentialBB devAppKey(String devAppKey) {
    
    this.devAppKey = devAppKey;
    return this;
  }

   /**
   * Credencial de uso da sua conta no Banco do Brasil
   * @return devAppKey
  **/
  @javax.annotation.Nonnull

  public String getDevAppKey() {
    return devAppKey;
  }


  public void setDevAppKey(String devAppKey) {
    this.devAppKey = devAppKey;
  }


  public CredentialBB pixKey(String pixKey) {
    
    this.pixKey = pixKey;
    return this;
  }

   /**
   * Chave Pix da da sua conta no Banco do Brasil
   * @return pixKey
  **/
  @javax.annotation.Nonnull

  public String getPixKey() {
    return pixKey;
  }


  public void setPixKey(String pixKey) {
    this.pixKey = pixKey;
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
   * @return the CredentialBB instance itself
   */
  public CredentialBB putAdditionalProperty(String key, Object value) {
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
    CredentialBB credentialBB = (CredentialBB) o;
    return Objects.equals(this.type, credentialBB.type) &&
        Objects.equals(this.authBasic, credentialBB.authBasic) &&
        Objects.equals(this.devAppKey, credentialBB.devAppKey) &&
        Objects.equals(this.pixKey, credentialBB.pixKey)&&
        Objects.equals(this.additionalProperties, credentialBB.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, authBasic, devAppKey, pixKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialBB {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    authBasic: ").append(toIndentedString(authBasic)).append("\n");
    sb.append("    devAppKey: ").append(toIndentedString(devAppKey)).append("\n");
    sb.append("    pixKey: ").append(toIndentedString(pixKey)).append("\n");
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
    openapiFields.add("authBasic");
    openapiFields.add("devAppKey");
    openapiFields.add("pixKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("authBasic");
    openapiRequiredFields.add("devAppKey");
    openapiRequiredFields.add("pixKey");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CredentialBB
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CredentialBB.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CredentialBB is not found in the empty JSON string", CredentialBB.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CredentialBB.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("authBasic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authBasic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authBasic").toString()));
      }
      if (!jsonObj.get("devAppKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `devAppKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("devAppKey").toString()));
      }
      if (!jsonObj.get("pixKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pixKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pixKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CredentialBB.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CredentialBB' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CredentialBB> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CredentialBB.class));

       return (TypeAdapter<T>) new TypeAdapter<CredentialBB>() {
           @Override
           public void write(JsonWriter out, CredentialBB value) throws IOException {
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
           public CredentialBB read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CredentialBB instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CredentialBB given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CredentialBB
  * @throws IOException if the JSON string is invalid with respect to CredentialBB
  */
  public static CredentialBB fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CredentialBB.class);
  }

 /**
  * Convert an instance of CredentialBB to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

