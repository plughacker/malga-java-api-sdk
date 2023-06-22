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
 * information about customer browser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-22T19:10:47.032351-03:00[America/Sao_Paulo]")
public class FraudAnalysisRequestCustomerBrowser {
  public static final String SERIALIZED_NAME_BROWSER_FINGERPRINT = "browserFingerprint";
  @SerializedName(SERIALIZED_NAME_BROWSER_FINGERPRINT)
  private String browserFingerprint;

  public static final String SERIALIZED_NAME_COOKIES_ACCEPTED = "cookiesAccepted";
  @SerializedName(SERIALIZED_NAME_COOKIES_ACCEPTED)
  private Boolean cookiesAccepted;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_HOST_NAME = "hostName";
  @SerializedName(SERIALIZED_NAME_HOST_NAME)
  private String hostName;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ipAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public FraudAnalysisRequestCustomerBrowser() {
  }

  public FraudAnalysisRequestCustomerBrowser browserFingerprint(String browserFingerprint) {
    
    this.browserFingerprint = browserFingerprint;
    return this;
  }

   /**
   * fingerprint id generated by browser
   * @return browserFingerprint
  **/
  @javax.annotation.Nullable

  public String getBrowserFingerprint() {
    return browserFingerprint;
  }


  public void setBrowserFingerprint(String browserFingerprint) {
    this.browserFingerprint = browserFingerprint;
  }


  public FraudAnalysisRequestCustomerBrowser cookiesAccepted(Boolean cookiesAccepted) {
    
    this.cookiesAccepted = cookiesAccepted;
    return this;
  }

   /**
   * indicates if cookies has been accepeted
   * @return cookiesAccepted
  **/
  @javax.annotation.Nullable

  public Boolean getCookiesAccepted() {
    return cookiesAccepted;
  }


  public void setCookiesAccepted(Boolean cookiesAccepted) {
    this.cookiesAccepted = cookiesAccepted;
  }


  public FraudAnalysisRequestCustomerBrowser email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * logged email address
   * @return email
  **/
  @javax.annotation.Nullable

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public FraudAnalysisRequestCustomerBrowser hostName(String hostName) {
    
    this.hostName = hostName;
    return this;
  }

   /**
   * user&#39;s computer hostname
   * @return hostName
  **/
  @javax.annotation.Nullable

  public String getHostName() {
    return hostName;
  }


  public void setHostName(String hostName) {
    this.hostName = hostName;
  }


  public FraudAnalysisRequestCustomerBrowser ipAddress(String ipAddress) {
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * user&#39;s ip address
   * @return ipAddress
  **/
  @javax.annotation.Nullable

  public String getIpAddress() {
    return ipAddress;
  }


  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public FraudAnalysisRequestCustomerBrowser type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * browser&#39;s user-agent
   * @return type
  **/
  @javax.annotation.Nullable

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
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
   * @return the FraudAnalysisRequestCustomerBrowser instance itself
   */
  public FraudAnalysisRequestCustomerBrowser putAdditionalProperty(String key, Object value) {
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
    FraudAnalysisRequestCustomerBrowser fraudAnalysisRequestCustomerBrowser = (FraudAnalysisRequestCustomerBrowser) o;
    return Objects.equals(this.browserFingerprint, fraudAnalysisRequestCustomerBrowser.browserFingerprint) &&
        Objects.equals(this.cookiesAccepted, fraudAnalysisRequestCustomerBrowser.cookiesAccepted) &&
        Objects.equals(this.email, fraudAnalysisRequestCustomerBrowser.email) &&
        Objects.equals(this.hostName, fraudAnalysisRequestCustomerBrowser.hostName) &&
        Objects.equals(this.ipAddress, fraudAnalysisRequestCustomerBrowser.ipAddress) &&
        Objects.equals(this.type, fraudAnalysisRequestCustomerBrowser.type)&&
        Objects.equals(this.additionalProperties, fraudAnalysisRequestCustomerBrowser.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(browserFingerprint, cookiesAccepted, email, hostName, ipAddress, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudAnalysisRequestCustomerBrowser {\n");
    sb.append("    browserFingerprint: ").append(toIndentedString(browserFingerprint)).append("\n");
    sb.append("    cookiesAccepted: ").append(toIndentedString(cookiesAccepted)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("browserFingerprint");
    openapiFields.add("cookiesAccepted");
    openapiFields.add("email");
    openapiFields.add("hostName");
    openapiFields.add("ipAddress");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FraudAnalysisRequestCustomerBrowser
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FraudAnalysisRequestCustomerBrowser.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FraudAnalysisRequestCustomerBrowser is not found in the empty JSON string", FraudAnalysisRequestCustomerBrowser.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("browserFingerprint") != null && !jsonObj.get("browserFingerprint").isJsonNull()) && !jsonObj.get("browserFingerprint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `browserFingerprint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("browserFingerprint").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("hostName") != null && !jsonObj.get("hostName").isJsonNull()) && !jsonObj.get("hostName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostName").toString()));
      }
      if ((jsonObj.get("ipAddress") != null && !jsonObj.get("ipAddress").isJsonNull()) && !jsonObj.get("ipAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipAddress").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FraudAnalysisRequestCustomerBrowser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FraudAnalysisRequestCustomerBrowser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FraudAnalysisRequestCustomerBrowser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FraudAnalysisRequestCustomerBrowser.class));

       return (TypeAdapter<T>) new TypeAdapter<FraudAnalysisRequestCustomerBrowser>() {
           @Override
           public void write(JsonWriter out, FraudAnalysisRequestCustomerBrowser value) throws IOException {
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
           public FraudAnalysisRequestCustomerBrowser read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FraudAnalysisRequestCustomerBrowser instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FraudAnalysisRequestCustomerBrowser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FraudAnalysisRequestCustomerBrowser
  * @throws IOException if the JSON string is invalid with respect to FraudAnalysisRequestCustomerBrowser
  */
  public static FraudAnalysisRequestCustomerBrowser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FraudAnalysisRequestCustomerBrowser.class);
  }

 /**
  * Convert an instance of FraudAnalysisRequestCustomerBrowser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

