/*
 * Charges
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.malga.model.charges;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.malga.model.charges.ChargeRequestFraudAnalysis;
import io.malga.model.charges.ChargeRequestPaymentMethod;
import io.malga.model.charges.ChargeRequestPaymentSource;
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

import io.malga.model.charges.JSON;

/**
 * ChargeRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-30T13:45:38.593774-03:00[America/Sao_Paulo]")
public class ChargeRequest {
  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchantId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency = "BRL";

  public static final String SERIALIZED_NAME_STATEMENT_DESCRIPTOR = "statementDescriptor";
  @SerializedName(SERIALIZED_NAME_STATEMENT_DESCRIPTOR)
  private String statementDescriptor;

  public static final String SERIALIZED_NAME_CAPTURE = "capture";
  @SerializedName(SERIALIZED_NAME_CAPTURE)
  private Boolean capture;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "paymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private ChargeRequestPaymentMethod paymentMethod;

  public static final String SERIALIZED_NAME_PAYMENT_SOURCE = "paymentSource";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SOURCE)
  private ChargeRequestPaymentSource paymentSource;

  public static final String SERIALIZED_NAME_FRAUD_ANALYSIS = "fraudAnalysis";
  @SerializedName(SERIALIZED_NAME_FRAUD_ANALYSIS)
  private ChargeRequestFraudAnalysis fraudAnalysis;

  public ChargeRequest() {
  }

  public ChargeRequest merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * merchant identification to be used in transaction and define the routing rule.
   * @return merchantId
  **/
  @javax.annotation.Nonnull

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public ChargeRequest amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * transaction amount in cents, example 100 to charge R$ 1.00
   * @return amount
  **/
  @javax.annotation.Nonnull

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public ChargeRequest currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * currency code to be used in charge, ISO 4217 format (see table of types).
   * @return currency
  **/
  @javax.annotation.Nullable

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public ChargeRequest statementDescriptor(String statementDescriptor) {
    
    this.statementDescriptor = statementDescriptor;
    return this;
  }

   /**
   * description to be displayed on the buyer&#39;s bank statement
   * @return statementDescriptor
  **/
  @javax.annotation.Nullable

  public String getStatementDescriptor() {
    return statementDescriptor;
  }


  public void setStatementDescriptor(String statementDescriptor) {
    this.statementDescriptor = statementDescriptor;
  }


  public ChargeRequest capture(Boolean capture) {
    
    this.capture = capture;
    return this;
  }

   /**
   * whether the transaction should be captured automatically
   * @return capture
  **/
  @javax.annotation.Nullable

  public Boolean getCapture() {
    return capture;
  }


  public void setCapture(Boolean capture) {
    this.capture = capture;
  }


  public ChargeRequest orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Unique identification of order in your side to help future conciliation
   * @return orderId
  **/
  @javax.annotation.Nullable

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public ChargeRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Short description to help future conciliation
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ChargeRequest customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Customer identification to help future conciliation
   * @return customerId
  **/
  @javax.annotation.Nullable

  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public ChargeRequest paymentMethod(ChargeRequestPaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nonnull

  public ChargeRequestPaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(ChargeRequestPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public ChargeRequest paymentSource(ChargeRequestPaymentSource paymentSource) {
    
    this.paymentSource = paymentSource;
    return this;
  }

   /**
   * Get paymentSource
   * @return paymentSource
  **/
  @javax.annotation.Nonnull

  public ChargeRequestPaymentSource getPaymentSource() {
    return paymentSource;
  }


  public void setPaymentSource(ChargeRequestPaymentSource paymentSource) {
    this.paymentSource = paymentSource;
  }


  public ChargeRequest fraudAnalysis(ChargeRequestFraudAnalysis fraudAnalysis) {
    
    this.fraudAnalysis = fraudAnalysis;
    return this;
  }

   /**
   * Get fraudAnalysis
   * @return fraudAnalysis
  **/
  @javax.annotation.Nullable

  public ChargeRequestFraudAnalysis getFraudAnalysis() {
    return fraudAnalysis;
  }


  public void setFraudAnalysis(ChargeRequestFraudAnalysis fraudAnalysis) {
    this.fraudAnalysis = fraudAnalysis;
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
   * @return the ChargeRequest instance itself
   */
  public ChargeRequest putAdditionalProperty(String key, Object value) {
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
    ChargeRequest chargeRequest = (ChargeRequest) o;
    return Objects.equals(this.merchantId, chargeRequest.merchantId) &&
        Objects.equals(this.amount, chargeRequest.amount) &&
        Objects.equals(this.currency, chargeRequest.currency) &&
        Objects.equals(this.statementDescriptor, chargeRequest.statementDescriptor) &&
        Objects.equals(this.capture, chargeRequest.capture) &&
        Objects.equals(this.orderId, chargeRequest.orderId) &&
        Objects.equals(this.description, chargeRequest.description) &&
        Objects.equals(this.customerId, chargeRequest.customerId) &&
        Objects.equals(this.paymentMethod, chargeRequest.paymentMethod) &&
        Objects.equals(this.paymentSource, chargeRequest.paymentSource) &&
        Objects.equals(this.fraudAnalysis, chargeRequest.fraudAnalysis)&&
        Objects.equals(this.additionalProperties, chargeRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, amount, currency, statementDescriptor, capture, orderId, description, customerId, paymentMethod, paymentSource, fraudAnalysis, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeRequest {\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    statementDescriptor: ").append(toIndentedString(statementDescriptor)).append("\n");
    sb.append("    capture: ").append(toIndentedString(capture)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentSource: ").append(toIndentedString(paymentSource)).append("\n");
    sb.append("    fraudAnalysis: ").append(toIndentedString(fraudAnalysis)).append("\n");
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
    openapiFields.add("merchantId");
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("statementDescriptor");
    openapiFields.add("capture");
    openapiFields.add("orderId");
    openapiFields.add("description");
    openapiFields.add("customerId");
    openapiFields.add("paymentMethod");
    openapiFields.add("paymentSource");
    openapiFields.add("fraudAnalysis");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("merchantId");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("paymentMethod");
    openapiRequiredFields.add("paymentSource");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChargeRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ChargeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChargeRequest is not found in the empty JSON string", ChargeRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChargeRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("merchantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantId").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("statementDescriptor") != null && !jsonObj.get("statementDescriptor").isJsonNull()) && !jsonObj.get("statementDescriptor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statementDescriptor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statementDescriptor").toString()));
      }
      if ((jsonObj.get("orderId") != null && !jsonObj.get("orderId").isJsonNull()) && !jsonObj.get("orderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderId").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("customerId") != null && !jsonObj.get("customerId").isJsonNull()) && !jsonObj.get("customerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerId").toString()));
      }
      // validate the required field `paymentMethod`
      ChargeRequestPaymentMethod.validateJsonObject(jsonObj.getAsJsonObject("paymentMethod"));
      // validate the required field `paymentSource`
      ChargeRequestPaymentSource.validateJsonObject(jsonObj.getAsJsonObject("paymentSource"));
      // validate the optional field `fraudAnalysis`
      if (jsonObj.get("fraudAnalysis") != null && !jsonObj.get("fraudAnalysis").isJsonNull()) {
        ChargeRequestFraudAnalysis.validateJsonObject(jsonObj.getAsJsonObject("fraudAnalysis"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChargeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChargeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChargeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChargeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ChargeRequest>() {
           @Override
           public void write(JsonWriter out, ChargeRequest value) throws IOException {
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
           public ChargeRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ChargeRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ChargeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChargeRequest
  * @throws IOException if the JSON string is invalid with respect to ChargeRequest
  */
  public static ChargeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChargeRequest.class);
  }

  public static Gson getGson() {
    return JSON.getGson();
  }

/** * Convert an instance of ChargeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

