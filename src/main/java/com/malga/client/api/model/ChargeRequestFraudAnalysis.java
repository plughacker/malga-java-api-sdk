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
import com.malga.client.api.model.FraudAnalysisRequestCart;
import com.malga.client.api.model.FraudAnalysisRequestCustomer;
import com.malga.client.api.model.FraudAnalysisRequestDevice;
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
 * Additional parameters for fraud analysis, required by provider&#39;s anti-fraud
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-21T21:25:35.057162-03:00[America/Sao_Paulo]")
public class ChargeRequestFraudAnalysis {
  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private FraudAnalysisRequestCustomer customer;

  public static final String SERIALIZED_NAME_CART = "cart";
  @SerializedName(SERIALIZED_NAME_CART)
  private FraudAnalysisRequestCart cart;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private FraudAnalysisRequestDevice device;

  public ChargeRequestFraudAnalysis() {
  }

  public ChargeRequestFraudAnalysis customer(FraudAnalysisRequestCustomer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable

  public FraudAnalysisRequestCustomer getCustomer() {
    return customer;
  }


  public void setCustomer(FraudAnalysisRequestCustomer customer) {
    this.customer = customer;
  }


  public ChargeRequestFraudAnalysis cart(FraudAnalysisRequestCart cart) {
    
    this.cart = cart;
    return this;
  }

   /**
   * Get cart
   * @return cart
  **/
  @javax.annotation.Nullable

  public FraudAnalysisRequestCart getCart() {
    return cart;
  }


  public void setCart(FraudAnalysisRequestCart cart) {
    this.cart = cart;
  }


  public ChargeRequestFraudAnalysis device(FraudAnalysisRequestDevice device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable

  public FraudAnalysisRequestDevice getDevice() {
    return device;
  }


  public void setDevice(FraudAnalysisRequestDevice device) {
    this.device = device;
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
   * @return the ChargeRequestFraudAnalysis instance itself
   */
  public ChargeRequestFraudAnalysis putAdditionalProperty(String key, Object value) {
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
    ChargeRequestFraudAnalysis chargeRequestFraudAnalysis = (ChargeRequestFraudAnalysis) o;
    return Objects.equals(this.customer, chargeRequestFraudAnalysis.customer) &&
        Objects.equals(this.cart, chargeRequestFraudAnalysis.cart) &&
        Objects.equals(this.device, chargeRequestFraudAnalysis.device)&&
        Objects.equals(this.additionalProperties, chargeRequestFraudAnalysis.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, cart, device, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeRequestFraudAnalysis {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    cart: ").append(toIndentedString(cart)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
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
    openapiFields.add("customer");
    openapiFields.add("cart");
    openapiFields.add("device");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChargeRequestFraudAnalysis
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ChargeRequestFraudAnalysis.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChargeRequestFraudAnalysis is not found in the empty JSON string", ChargeRequestFraudAnalysis.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `customer`
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) {
        FraudAnalysisRequestCustomer.validateJsonObject(jsonObj.getAsJsonObject("customer"));
      }
      // validate the optional field `cart`
      if (jsonObj.get("cart") != null && !jsonObj.get("cart").isJsonNull()) {
        FraudAnalysisRequestCart.validateJsonObject(jsonObj.getAsJsonObject("cart"));
      }
      // validate the optional field `device`
      if (jsonObj.get("device") != null && !jsonObj.get("device").isJsonNull()) {
        FraudAnalysisRequestDevice.validateJsonObject(jsonObj.getAsJsonObject("device"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChargeRequestFraudAnalysis.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChargeRequestFraudAnalysis' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChargeRequestFraudAnalysis> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChargeRequestFraudAnalysis.class));

       return (TypeAdapter<T>) new TypeAdapter<ChargeRequestFraudAnalysis>() {
           @Override
           public void write(JsonWriter out, ChargeRequestFraudAnalysis value) throws IOException {
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
           public ChargeRequestFraudAnalysis read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ChargeRequestFraudAnalysis instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ChargeRequestFraudAnalysis given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChargeRequestFraudAnalysis
  * @throws IOException if the JSON string is invalid with respect to ChargeRequestFraudAnalysis
  */
  public static ChargeRequestFraudAnalysis fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChargeRequestFraudAnalysis.class);
  }

 /**
  * Convert an instance of ChargeRequestFraudAnalysis to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

