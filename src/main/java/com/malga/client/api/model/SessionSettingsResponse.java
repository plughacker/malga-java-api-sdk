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
import com.malga.client.api.model.SessionItemObject;
import com.malga.client.api.model.SessionResponsePaymentMethods;
import com.malga.client.api.model.UserSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * SessionSettingsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-21T21:25:35.057162-03:00[America/Sao_Paulo]")
public class SessionSettingsResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Session status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CREATED("created"),
    
    PAID("paid"),
    
    CANCELED("canceled"),
    
    VOIDED("voided");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_CAPTURE = "capture";
  @SerializedName(SERIALIZED_NAME_CAPTURE)
  private Boolean capture;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchantId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_DUE_DATE = "dueDate";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private String dueDate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_STATEMENT_DESCRIPTOR = "statementDescriptor";
  @SerializedName(SERIALIZED_NAME_STATEMENT_DESCRIPTOR)
  private String statementDescriptor;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<SessionItemObject> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAYMENT_LINK = "paymentLink";
  @SerializedName(SERIALIZED_NAME_PAYMENT_LINK)
  private String paymentLink;

  public static final String SERIALIZED_NAME_PAYMENT_METHODS = "paymentMethods";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHODS)
  private SessionResponsePaymentMethods paymentMethods;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_PUBLIC_KEY = "publicKey";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY)
  private String publicKey;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private UserSettings settings;

  public SessionSettingsResponse() {
  }

  public SessionSettingsResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Session ID
   * @return id
  **/
  @javax.annotation.Nullable

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SessionSettingsResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Session name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SessionSettingsResponse status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Session status
   * @return status
  **/
  @javax.annotation.Nullable

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public SessionSettingsResponse isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Whether the session is active
   * @return isActive
  **/
  @javax.annotation.Nullable

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public SessionSettingsResponse clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Client identification on Malga
   * @return clientId
  **/
  @javax.annotation.Nullable

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public SessionSettingsResponse orderId(String orderId) {
    
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


  public SessionSettingsResponse amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Transaction amount in cents, example 100 to charge R$ 1.00
   * @return amount
  **/
  @javax.annotation.Nullable

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public SessionSettingsResponse currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Currency code to be used in charge, ISO 4217 format (see table of types)
   * @return currency
  **/
  @javax.annotation.Nullable

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public SessionSettingsResponse capture(Boolean capture) {
    
    this.capture = capture;
    return this;
  }

   /**
   * Whether the transaction should be captured automatically
   * @return capture
  **/
  @javax.annotation.Nullable

  public Boolean getCapture() {
    return capture;
  }


  public void setCapture(Boolean capture) {
    this.capture = capture;
  }


  public SessionSettingsResponse merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Merchant identification used in charge
   * @return merchantId
  **/
  @javax.annotation.Nullable

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public SessionSettingsResponse dueDate(String dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Session expiration date
   * @return dueDate
  **/
  @javax.annotation.Nullable

  public String getDueDate() {
    return dueDate;
  }


  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }


  public SessionSettingsResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Session description
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SessionSettingsResponse statementDescriptor(String statementDescriptor) {
    
    this.statementDescriptor = statementDescriptor;
    return this;
  }

   /**
   * Description to be displayed on the buyer&#39;s bank statement
   * @return statementDescriptor
  **/
  @javax.annotation.Nullable

  public String getStatementDescriptor() {
    return statementDescriptor;
  }


  public void setStatementDescriptor(String statementDescriptor) {
    this.statementDescriptor = statementDescriptor;
  }


  public SessionSettingsResponse items(List<SessionItemObject> items) {
    
    this.items = items;
    return this;
  }

  public SessionSettingsResponse addItemsItem(SessionItemObject itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Order items
   * @return items
  **/
  @javax.annotation.Nullable

  public List<SessionItemObject> getItems() {
    return items;
  }


  public void setItems(List<SessionItemObject> items) {
    this.items = items;
  }


  public SessionSettingsResponse paymentLink(String paymentLink) {
    
    this.paymentLink = paymentLink;
    return this;
  }

   /**
   * Link to access Payment Link of this session
   * @return paymentLink
  **/
  @javax.annotation.Nullable

  public String getPaymentLink() {
    return paymentLink;
  }


  public void setPaymentLink(String paymentLink) {
    this.paymentLink = paymentLink;
  }


  public SessionSettingsResponse paymentMethods(SessionResponsePaymentMethods paymentMethods) {
    
    this.paymentMethods = paymentMethods;
    return this;
  }

   /**
   * Get paymentMethods
   * @return paymentMethods
  **/
  @javax.annotation.Nullable

  public SessionResponsePaymentMethods getPaymentMethods() {
    return paymentMethods;
  }


  public void setPaymentMethods(SessionResponsePaymentMethods paymentMethods) {
    this.paymentMethods = paymentMethods;
  }


  public SessionSettingsResponse createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Created date
   * @return createdAt
  **/
  @javax.annotation.Nullable

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public SessionSettingsResponse updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Updated date
   * @return updatedAt
  **/
  @javax.annotation.Nullable

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public SessionSettingsResponse publicKey(String publicKey) {
    
    this.publicKey = publicKey;
    return this;
  }

   /**
   * Access key with limited scope, must be used to pay the session
   * @return publicKey
  **/
  @javax.annotation.Nullable

  public String getPublicKey() {
    return publicKey;
  }


  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  public SessionSettingsResponse settings(UserSettings settings) {
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable

  public UserSettings getSettings() {
    return settings;
  }


  public void setSettings(UserSettings settings) {
    this.settings = settings;
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
   * @return the SessionSettingsResponse instance itself
   */
  public SessionSettingsResponse putAdditionalProperty(String key, Object value) {
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
    SessionSettingsResponse sessionSettingsResponse = (SessionSettingsResponse) o;
    return Objects.equals(this.id, sessionSettingsResponse.id) &&
        Objects.equals(this.name, sessionSettingsResponse.name) &&
        Objects.equals(this.status, sessionSettingsResponse.status) &&
        Objects.equals(this.isActive, sessionSettingsResponse.isActive) &&
        Objects.equals(this.clientId, sessionSettingsResponse.clientId) &&
        Objects.equals(this.orderId, sessionSettingsResponse.orderId) &&
        Objects.equals(this.amount, sessionSettingsResponse.amount) &&
        Objects.equals(this.currency, sessionSettingsResponse.currency) &&
        Objects.equals(this.capture, sessionSettingsResponse.capture) &&
        Objects.equals(this.merchantId, sessionSettingsResponse.merchantId) &&
        Objects.equals(this.dueDate, sessionSettingsResponse.dueDate) &&
        Objects.equals(this.description, sessionSettingsResponse.description) &&
        Objects.equals(this.statementDescriptor, sessionSettingsResponse.statementDescriptor) &&
        Objects.equals(this.items, sessionSettingsResponse.items) &&
        Objects.equals(this.paymentLink, sessionSettingsResponse.paymentLink) &&
        Objects.equals(this.paymentMethods, sessionSettingsResponse.paymentMethods) &&
        Objects.equals(this.createdAt, sessionSettingsResponse.createdAt) &&
        Objects.equals(this.updatedAt, sessionSettingsResponse.updatedAt) &&
        Objects.equals(this.publicKey, sessionSettingsResponse.publicKey) &&
        Objects.equals(this.settings, sessionSettingsResponse.settings)&&
        Objects.equals(this.additionalProperties, sessionSettingsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status, isActive, clientId, orderId, amount, currency, capture, merchantId, dueDate, description, statementDescriptor, items, paymentLink, paymentMethods, createdAt, updatedAt, publicKey, settings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionSettingsResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    capture: ").append(toIndentedString(capture)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    statementDescriptor: ").append(toIndentedString(statementDescriptor)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    paymentLink: ").append(toIndentedString(paymentLink)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("status");
    openapiFields.add("isActive");
    openapiFields.add("clientId");
    openapiFields.add("orderId");
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("capture");
    openapiFields.add("merchantId");
    openapiFields.add("dueDate");
    openapiFields.add("description");
    openapiFields.add("statementDescriptor");
    openapiFields.add("items");
    openapiFields.add("paymentLink");
    openapiFields.add("paymentMethods");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("publicKey");
    openapiFields.add("settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SessionSettingsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SessionSettingsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SessionSettingsResponse is not found in the empty JSON string", SessionSettingsResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("clientId") != null && !jsonObj.get("clientId").isJsonNull()) && !jsonObj.get("clientId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientId").toString()));
      }
      if ((jsonObj.get("orderId") != null && !jsonObj.get("orderId").isJsonNull()) && !jsonObj.get("orderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderId").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("merchantId") != null && !jsonObj.get("merchantId").isJsonNull()) && !jsonObj.get("merchantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantId").toString()));
      }
      if ((jsonObj.get("dueDate") != null && !jsonObj.get("dueDate").isJsonNull()) && !jsonObj.get("dueDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dueDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dueDate").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("statementDescriptor") != null && !jsonObj.get("statementDescriptor").isJsonNull()) && !jsonObj.get("statementDescriptor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statementDescriptor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statementDescriptor").toString()));
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            SessionItemObject.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("paymentLink") != null && !jsonObj.get("paymentLink").isJsonNull()) && !jsonObj.get("paymentLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentLink").toString()));
      }
      // validate the optional field `paymentMethods`
      if (jsonObj.get("paymentMethods") != null && !jsonObj.get("paymentMethods").isJsonNull()) {
        SessionResponsePaymentMethods.validateJsonObject(jsonObj.getAsJsonObject("paymentMethods"));
      }
      if ((jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) && !jsonObj.get("createdAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdAt").toString()));
      }
      if ((jsonObj.get("updatedAt") != null && !jsonObj.get("updatedAt").isJsonNull()) && !jsonObj.get("updatedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updatedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updatedAt").toString()));
      }
      if ((jsonObj.get("publicKey") != null && !jsonObj.get("publicKey").isJsonNull()) && !jsonObj.get("publicKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publicKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SessionSettingsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SessionSettingsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SessionSettingsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SessionSettingsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SessionSettingsResponse>() {
           @Override
           public void write(JsonWriter out, SessionSettingsResponse value) throws IOException {
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
           public SessionSettingsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SessionSettingsResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SessionSettingsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SessionSettingsResponse
  * @throws IOException if the JSON string is invalid with respect to SessionSettingsResponse
  */
  public static SessionSettingsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SessionSettingsResponse.class);
  }

 /**
  * Convert an instance of SessionSettingsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

