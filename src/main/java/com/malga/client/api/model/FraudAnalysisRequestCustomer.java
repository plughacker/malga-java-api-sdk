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
import com.malga.client.api.model.FraudAnalysisRequestCustomerBillingAddress;
import com.malga.client.api.model.FraudAnalysisRequestCustomerBrowser;
import com.malga.client.api.model.FraudAnalysisRequestCustomerDeliveryAddress;
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
 * customer (payeer) data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-21T11:28:16.780712-03:00[America/Sao_Paulo]")
public class FraudAnalysisRequestCustomer {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_IDENTITY_TYPE = "identityType";
  @SerializedName(SERIALIZED_NAME_IDENTITY_TYPE)
  private String identityType;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  public static final String SERIALIZED_NAME_REGISTRATION_DATE = "registrationDate";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_DATE)
  private String registrationDate;

  public static final String SERIALIZED_NAME_DELIVERY_ADDRESS = "deliveryAddress";
  @SerializedName(SERIALIZED_NAME_DELIVERY_ADDRESS)
  private FraudAnalysisRequestCustomerDeliveryAddress deliveryAddress;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private FraudAnalysisRequestCustomerBillingAddress billingAddress;

  public static final String SERIALIZED_NAME_BROWSER = "browser";
  @SerializedName(SERIALIZED_NAME_BROWSER)
  private FraudAnalysisRequestCustomerBrowser browser;

  public FraudAnalysisRequestCustomer() {
  }

  public FraudAnalysisRequestCustomer name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * customer name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FraudAnalysisRequestCustomer email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * customer email
   * @return email
  **/
  @javax.annotation.Nullable

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public FraudAnalysisRequestCustomer phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * customer phone number
   * @return phone
  **/
  @javax.annotation.Nullable

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public FraudAnalysisRequestCustomer identityType(String identityType) {
    
    this.identityType = identityType;
    return this;
  }

   /**
   * document type, see table of types
   * @return identityType
  **/
  @javax.annotation.Nullable

  public String getIdentityType() {
    return identityType;
  }


  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }


  public FraudAnalysisRequestCustomer identity(String identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * document number
   * @return identity
  **/
  @javax.annotation.Nullable

  public String getIdentity() {
    return identity;
  }


  public void setIdentity(String identity) {
    this.identity = identity;
  }


  public FraudAnalysisRequestCustomer registrationDate(String registrationDate) {
    
    this.registrationDate = registrationDate;
    return this;
  }

   /**
   * customer registration date
   * @return registrationDate
  **/
  @javax.annotation.Nullable

  public String getRegistrationDate() {
    return registrationDate;
  }


  public void setRegistrationDate(String registrationDate) {
    this.registrationDate = registrationDate;
  }


  public FraudAnalysisRequestCustomer deliveryAddress(FraudAnalysisRequestCustomerDeliveryAddress deliveryAddress) {
    
    this.deliveryAddress = deliveryAddress;
    return this;
  }

   /**
   * Get deliveryAddress
   * @return deliveryAddress
  **/
  @javax.annotation.Nullable

  public FraudAnalysisRequestCustomerDeliveryAddress getDeliveryAddress() {
    return deliveryAddress;
  }


  public void setDeliveryAddress(FraudAnalysisRequestCustomerDeliveryAddress deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }


  public FraudAnalysisRequestCustomer billingAddress(FraudAnalysisRequestCustomerBillingAddress billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable

  public FraudAnalysisRequestCustomerBillingAddress getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(FraudAnalysisRequestCustomerBillingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }


  public FraudAnalysisRequestCustomer browser(FraudAnalysisRequestCustomerBrowser browser) {
    
    this.browser = browser;
    return this;
  }

   /**
   * Get browser
   * @return browser
  **/
  @javax.annotation.Nullable

  public FraudAnalysisRequestCustomerBrowser getBrowser() {
    return browser;
  }


  public void setBrowser(FraudAnalysisRequestCustomerBrowser browser) {
    this.browser = browser;
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
   * @return the FraudAnalysisRequestCustomer instance itself
   */
  public FraudAnalysisRequestCustomer putAdditionalProperty(String key, Object value) {
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
    FraudAnalysisRequestCustomer fraudAnalysisRequestCustomer = (FraudAnalysisRequestCustomer) o;
    return Objects.equals(this.name, fraudAnalysisRequestCustomer.name) &&
        Objects.equals(this.email, fraudAnalysisRequestCustomer.email) &&
        Objects.equals(this.phone, fraudAnalysisRequestCustomer.phone) &&
        Objects.equals(this.identityType, fraudAnalysisRequestCustomer.identityType) &&
        Objects.equals(this.identity, fraudAnalysisRequestCustomer.identity) &&
        Objects.equals(this.registrationDate, fraudAnalysisRequestCustomer.registrationDate) &&
        Objects.equals(this.deliveryAddress, fraudAnalysisRequestCustomer.deliveryAddress) &&
        Objects.equals(this.billingAddress, fraudAnalysisRequestCustomer.billingAddress) &&
        Objects.equals(this.browser, fraudAnalysisRequestCustomer.browser)&&
        Objects.equals(this.additionalProperties, fraudAnalysisRequestCustomer.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, phone, identityType, identity, registrationDate, deliveryAddress, billingAddress, browser, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudAnalysisRequestCustomer {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("email");
    openapiFields.add("phone");
    openapiFields.add("identityType");
    openapiFields.add("identity");
    openapiFields.add("registrationDate");
    openapiFields.add("deliveryAddress");
    openapiFields.add("billingAddress");
    openapiFields.add("browser");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FraudAnalysisRequestCustomer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FraudAnalysisRequestCustomer.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FraudAnalysisRequestCustomer is not found in the empty JSON string", FraudAnalysisRequestCustomer.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("identityType") != null && !jsonObj.get("identityType").isJsonNull()) && !jsonObj.get("identityType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identityType").toString()));
      }
      if ((jsonObj.get("identity") != null && !jsonObj.get("identity").isJsonNull()) && !jsonObj.get("identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity").toString()));
      }
      if ((jsonObj.get("registrationDate") != null && !jsonObj.get("registrationDate").isJsonNull()) && !jsonObj.get("registrationDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registrationDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrationDate").toString()));
      }
      // validate the optional field `deliveryAddress`
      if (jsonObj.get("deliveryAddress") != null && !jsonObj.get("deliveryAddress").isJsonNull()) {
        FraudAnalysisRequestCustomerDeliveryAddress.validateJsonObject(jsonObj.getAsJsonObject("deliveryAddress"));
      }
      // validate the optional field `billingAddress`
      if (jsonObj.get("billingAddress") != null && !jsonObj.get("billingAddress").isJsonNull()) {
        FraudAnalysisRequestCustomerBillingAddress.validateJsonObject(jsonObj.getAsJsonObject("billingAddress"));
      }
      // validate the optional field `browser`
      if (jsonObj.get("browser") != null && !jsonObj.get("browser").isJsonNull()) {
        FraudAnalysisRequestCustomerBrowser.validateJsonObject(jsonObj.getAsJsonObject("browser"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FraudAnalysisRequestCustomer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FraudAnalysisRequestCustomer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FraudAnalysisRequestCustomer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FraudAnalysisRequestCustomer.class));

       return (TypeAdapter<T>) new TypeAdapter<FraudAnalysisRequestCustomer>() {
           @Override
           public void write(JsonWriter out, FraudAnalysisRequestCustomer value) throws IOException {
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
           public FraudAnalysisRequestCustomer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FraudAnalysisRequestCustomer instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FraudAnalysisRequestCustomer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FraudAnalysisRequestCustomer
  * @throws IOException if the JSON string is invalid with respect to FraudAnalysisRequestCustomer
  */
  public static FraudAnalysisRequestCustomer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FraudAnalysisRequestCustomer.class);
  }

 /**
  * Convert an instance of FraudAnalysisRequestCustomer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

