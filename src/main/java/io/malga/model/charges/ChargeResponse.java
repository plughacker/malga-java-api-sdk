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
import io.malga.model.charges.ChargeRequestPaymentSource;
import io.malga.model.charges.ChargeResponseFraudAnalysisMetadata;
import io.malga.model.charges.ChargeResponsePaymentMethod;
import io.malga.model.charges.TransactionRequest;
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

import io.malga.model.charges.JSON;

/**
 * ChargeResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-30T13:45:38.593774-03:00[America/Sao_Paulo]")
public class ChargeResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchantId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_ORIGINAL_AMOUNT = "originalAmount";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_AMOUNT)
  private Integer originalAmount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency = "BRL";

  public static final String SERIALIZED_NAME_STATEMENT_DESCRIPTOR = "statementDescriptor";
  @SerializedName(SERIALIZED_NAME_STATEMENT_DESCRIPTOR)
  private String statementDescriptor;

  public static final String SERIALIZED_NAME_CAPTURE = "capture";
  @SerializedName(SERIALIZED_NAME_CAPTURE)
  private Boolean capture;

  /**
   * charge status on Malga
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("pending"),
    
    PRE_AUTHORIZED("pre_authorized"),
    
    AUTHORIZED("authorized"),
    
    FAILED("failed"),
    
    CANCELED("canceled"),
    
    VOIDED("voided"),
    
    REFUND_PENDING("refund_pending"),
    
    CHARGED_BACK("charged_back");

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

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "paymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private ChargeResponsePaymentMethod paymentMethod;

  public static final String SERIALIZED_NAME_PAYMENT_SOURCE = "paymentSource";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SOURCE)
  private ChargeRequestPaymentSource paymentSource;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_FRAUD_ANALYSIS_METADATA = "fraudAnalysisMetadata";
  @SerializedName(SERIALIZED_NAME_FRAUD_ANALYSIS_METADATA)
  private ChargeResponseFraudAnalysisMetadata fraudAnalysisMetadata;

  public static final String SERIALIZED_NAME_TRANSACTION_REQUESTS = "transactionRequests";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_REQUESTS)
  private List<TransactionRequest> transactionRequests = new ArrayList<>();

  public ChargeResponse() {
  }

  public ChargeResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Charge ID
   * @return id
  **/
  @javax.annotation.Nullable

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ChargeResponse clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * client identification on Malga
   * @return clientId
  **/
  @javax.annotation.Nullable

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public ChargeResponse merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * merchant identification used in charge
   * @return merchantId
  **/
  @javax.annotation.Nullable

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public ChargeResponse customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * customer identification
   * @return customerId
  **/
  @javax.annotation.Nullable

  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public ChargeResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * short description
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ChargeResponse amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * transaction amount in cents, example 100 to charge R$ 1.00
   * @return amount
  **/
  @javax.annotation.Nullable

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public ChargeResponse originalAmount(Integer originalAmount) {
    
    this.originalAmount = originalAmount;
    return this;
  }

   /**
   * transaction orignal amount in cents, example 100 to charge R$ 1.00
   * @return originalAmount
  **/
  @javax.annotation.Nullable

  public Integer getOriginalAmount() {
    return originalAmount;
  }


  public void setOriginalAmount(Integer originalAmount) {
    this.originalAmount = originalAmount;
  }


  public ChargeResponse currency(String currency) {
    
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


  public ChargeResponse statementDescriptor(String statementDescriptor) {
    
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


  public ChargeResponse capture(Boolean capture) {
    
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


  public ChargeResponse status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * charge status on Malga
   * @return status
  **/
  @javax.annotation.Nullable

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ChargeResponse orderId(String orderId) {
    
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


  public ChargeResponse paymentMethod(ChargeResponsePaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable

  public ChargeResponsePaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(ChargeResponsePaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public ChargeResponse paymentSource(ChargeRequestPaymentSource paymentSource) {
    
    this.paymentSource = paymentSource;
    return this;
  }

   /**
   * Get paymentSource
   * @return paymentSource
  **/
  @javax.annotation.Nullable

  public ChargeRequestPaymentSource getPaymentSource() {
    return paymentSource;
  }


  public void setPaymentSource(ChargeRequestPaymentSource paymentSource) {
    this.paymentSource = paymentSource;
  }


  public ChargeResponse createdAt(String createdAt) {
    
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


  public ChargeResponse updatedAt(String updatedAt) {
    
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


  public ChargeResponse fraudAnalysisMetadata(ChargeResponseFraudAnalysisMetadata fraudAnalysisMetadata) {
    
    this.fraudAnalysisMetadata = fraudAnalysisMetadata;
    return this;
  }

   /**
   * Get fraudAnalysisMetadata
   * @return fraudAnalysisMetadata
  **/
  @javax.annotation.Nullable

  public ChargeResponseFraudAnalysisMetadata getFraudAnalysisMetadata() {
    return fraudAnalysisMetadata;
  }


  public void setFraudAnalysisMetadata(ChargeResponseFraudAnalysisMetadata fraudAnalysisMetadata) {
    this.fraudAnalysisMetadata = fraudAnalysisMetadata;
  }


  public ChargeResponse transactionRequests(List<TransactionRequest> transactionRequests) {
    
    this.transactionRequests = transactionRequests;
    return this;
  }

  public ChargeResponse addTransactionRequestsItem(TransactionRequest transactionRequestsItem) {
    if (this.transactionRequests == null) {
      this.transactionRequests = new ArrayList<>();
    }
    this.transactionRequests.add(transactionRequestsItem);
    return this;
  }

   /**
   * Get transactionRequests
   * @return transactionRequests
  **/
  @javax.annotation.Nullable

  public List<TransactionRequest> getTransactionRequests() {
    return transactionRequests;
  }


  public void setTransactionRequests(List<TransactionRequest> transactionRequests) {
    this.transactionRequests = transactionRequests;
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
   * @return the ChargeResponse instance itself
   */
  public ChargeResponse putAdditionalProperty(String key, Object value) {
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
    ChargeResponse chargeResponse = (ChargeResponse) o;
    return Objects.equals(this.id, chargeResponse.id) &&
        Objects.equals(this.clientId, chargeResponse.clientId) &&
        Objects.equals(this.merchantId, chargeResponse.merchantId) &&
        Objects.equals(this.customerId, chargeResponse.customerId) &&
        Objects.equals(this.description, chargeResponse.description) &&
        Objects.equals(this.amount, chargeResponse.amount) &&
        Objects.equals(this.originalAmount, chargeResponse.originalAmount) &&
        Objects.equals(this.currency, chargeResponse.currency) &&
        Objects.equals(this.statementDescriptor, chargeResponse.statementDescriptor) &&
        Objects.equals(this.capture, chargeResponse.capture) &&
        Objects.equals(this.status, chargeResponse.status) &&
        Objects.equals(this.orderId, chargeResponse.orderId) &&
        Objects.equals(this.paymentMethod, chargeResponse.paymentMethod) &&
        Objects.equals(this.paymentSource, chargeResponse.paymentSource) &&
        Objects.equals(this.createdAt, chargeResponse.createdAt) &&
        Objects.equals(this.updatedAt, chargeResponse.updatedAt) &&
        Objects.equals(this.fraudAnalysisMetadata, chargeResponse.fraudAnalysisMetadata) &&
        Objects.equals(this.transactionRequests, chargeResponse.transactionRequests)&&
        Objects.equals(this.additionalProperties, chargeResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, merchantId, customerId, description, amount, originalAmount, currency, statementDescriptor, capture, status, orderId, paymentMethod, paymentSource, createdAt, updatedAt, fraudAnalysisMetadata, transactionRequests, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    statementDescriptor: ").append(toIndentedString(statementDescriptor)).append("\n");
    sb.append("    capture: ").append(toIndentedString(capture)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentSource: ").append(toIndentedString(paymentSource)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    fraudAnalysisMetadata: ").append(toIndentedString(fraudAnalysisMetadata)).append("\n");
    sb.append("    transactionRequests: ").append(toIndentedString(transactionRequests)).append("\n");
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
    openapiFields.add("clientId");
    openapiFields.add("merchantId");
    openapiFields.add("customerId");
    openapiFields.add("description");
    openapiFields.add("amount");
    openapiFields.add("originalAmount");
    openapiFields.add("currency");
    openapiFields.add("statementDescriptor");
    openapiFields.add("capture");
    openapiFields.add("status");
    openapiFields.add("orderId");
    openapiFields.add("paymentMethod");
    openapiFields.add("paymentSource");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("fraudAnalysisMetadata");
    openapiFields.add("transactionRequests");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChargeResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ChargeResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChargeResponse is not found in the empty JSON string", ChargeResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("clientId") != null && !jsonObj.get("clientId").isJsonNull()) && !jsonObj.get("clientId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientId").toString()));
      }
      if ((jsonObj.get("merchantId") != null && !jsonObj.get("merchantId").isJsonNull()) && !jsonObj.get("merchantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantId").toString()));
      }
      if ((jsonObj.get("customerId") != null && !jsonObj.get("customerId").isJsonNull()) && !jsonObj.get("customerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerId").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("statementDescriptor") != null && !jsonObj.get("statementDescriptor").isJsonNull()) && !jsonObj.get("statementDescriptor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statementDescriptor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statementDescriptor").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("orderId") != null && !jsonObj.get("orderId").isJsonNull()) && !jsonObj.get("orderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderId").toString()));
      }
      // validate the optional field `paymentMethod`
      if (jsonObj.get("paymentMethod") != null && !jsonObj.get("paymentMethod").isJsonNull()) {
        ChargeResponsePaymentMethod.validateJsonObject(jsonObj.getAsJsonObject("paymentMethod"));
      }
      // validate the optional field `paymentSource`
      if (jsonObj.get("paymentSource") != null && !jsonObj.get("paymentSource").isJsonNull()) {
        ChargeRequestPaymentSource.validateJsonObject(jsonObj.getAsJsonObject("paymentSource"));
      }
      if ((jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) && !jsonObj.get("createdAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdAt").toString()));
      }
      if ((jsonObj.get("updatedAt") != null && !jsonObj.get("updatedAt").isJsonNull()) && !jsonObj.get("updatedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updatedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updatedAt").toString()));
      }
      // validate the optional field `fraudAnalysisMetadata`
      if (jsonObj.get("fraudAnalysisMetadata") != null && !jsonObj.get("fraudAnalysisMetadata").isJsonNull()) {
        ChargeResponseFraudAnalysisMetadata.validateJsonObject(jsonObj.getAsJsonObject("fraudAnalysisMetadata"));
      }
      if (jsonObj.get("transactionRequests") != null && !jsonObj.get("transactionRequests").isJsonNull()) {
        JsonArray jsonArraytransactionRequests = jsonObj.getAsJsonArray("transactionRequests");
        if (jsonArraytransactionRequests != null) {
          // ensure the json data is an array
          if (!jsonObj.get("transactionRequests").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `transactionRequests` to be an array in the JSON string but got `%s`", jsonObj.get("transactionRequests").toString()));
          }

          // validate the optional field `transactionRequests` (array)
          for (int i = 0; i < jsonArraytransactionRequests.size(); i++) {
            TransactionRequest.validateJsonObject(jsonArraytransactionRequests.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChargeResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChargeResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChargeResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChargeResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ChargeResponse>() {
           @Override
           public void write(JsonWriter out, ChargeResponse value) throws IOException {
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
           public ChargeResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ChargeResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ChargeResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChargeResponse
  * @throws IOException if the JSON string is invalid with respect to ChargeResponse
  */
  public static ChargeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChargeResponse.class);
  }

  public static Gson getGson() {
    return JSON.getGson();
  }

/** * Convert an instance of ChargeResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

