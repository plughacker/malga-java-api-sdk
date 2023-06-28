/*
 * Sessions
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.malga.model.sessions;

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

import io.malga.model.sessions.JSON;

/**
 * Endereço de entrega
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-28T18:26:54.583148-03:00[America/Sao_Paulo]")
public class FraudAnalysisMetadataCustomerDeliveryAddress {
  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private String district;

  public static final String SERIALIZED_NAME_ZIP_CODE = "zipCode";
  @SerializedName(SERIALIZED_NAME_ZIP_CODE)
  private String zipCode;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_COMPLEMENT = "complement";
  @SerializedName(SERIALIZED_NAME_COMPLEMENT)
  private String complement;

  public FraudAnalysisMetadataCustomerDeliveryAddress() {
  }

  public FraudAnalysisMetadataCustomerDeliveryAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * formated in ISO 3166-1 alpha-2
   * @return country
  **/
  @javax.annotation.Nullable

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public FraudAnalysisMetadataCustomerDeliveryAddress state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * address state
   * @return state
  **/
  @javax.annotation.Nullable

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public FraudAnalysisMetadataCustomerDeliveryAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * address city
   * @return city
  **/
  @javax.annotation.Nullable

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public FraudAnalysisMetadataCustomerDeliveryAddress district(String district) {
    
    this.district = district;
    return this;
  }

   /**
   * address district or neighboor
   * @return district
  **/
  @javax.annotation.Nullable

  public String getDistrict() {
    return district;
  }


  public void setDistrict(String district) {
    this.district = district;
  }


  public FraudAnalysisMetadataCustomerDeliveryAddress zipCode(String zipCode) {
    
    this.zipCode = zipCode;
    return this;
  }

   /**
   * zip code
   * @return zipCode
  **/
  @javax.annotation.Nullable

  public String getZipCode() {
    return zipCode;
  }


  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  public FraudAnalysisMetadataCustomerDeliveryAddress street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * street address
   * @return street
  **/
  @javax.annotation.Nullable

  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public FraudAnalysisMetadataCustomerDeliveryAddress number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * street number address
   * @return number
  **/
  @javax.annotation.Nullable

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public FraudAnalysisMetadataCustomerDeliveryAddress complement(String complement) {
    
    this.complement = complement;
    return this;
  }

   /**
   * apartament number or address complement
   * @return complement
  **/
  @javax.annotation.Nullable

  public String getComplement() {
    return complement;
  }


  public void setComplement(String complement) {
    this.complement = complement;
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
   * @return the FraudAnalysisMetadataCustomerDeliveryAddress instance itself
   */
  public FraudAnalysisMetadataCustomerDeliveryAddress putAdditionalProperty(String key, Object value) {
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
    FraudAnalysisMetadataCustomerDeliveryAddress fraudAnalysisMetadataCustomerDeliveryAddress = (FraudAnalysisMetadataCustomerDeliveryAddress) o;
    return Objects.equals(this.country, fraudAnalysisMetadataCustomerDeliveryAddress.country) &&
        Objects.equals(this.state, fraudAnalysisMetadataCustomerDeliveryAddress.state) &&
        Objects.equals(this.city, fraudAnalysisMetadataCustomerDeliveryAddress.city) &&
        Objects.equals(this.district, fraudAnalysisMetadataCustomerDeliveryAddress.district) &&
        Objects.equals(this.zipCode, fraudAnalysisMetadataCustomerDeliveryAddress.zipCode) &&
        Objects.equals(this.street, fraudAnalysisMetadataCustomerDeliveryAddress.street) &&
        Objects.equals(this.number, fraudAnalysisMetadataCustomerDeliveryAddress.number) &&
        Objects.equals(this.complement, fraudAnalysisMetadataCustomerDeliveryAddress.complement)&&
        Objects.equals(this.additionalProperties, fraudAnalysisMetadataCustomerDeliveryAddress.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, state, city, district, zipCode, street, number, complement, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudAnalysisMetadataCustomerDeliveryAddress {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    complement: ").append(toIndentedString(complement)).append("\n");
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
    openapiFields.add("country");
    openapiFields.add("state");
    openapiFields.add("city");
    openapiFields.add("district");
    openapiFields.add("zipCode");
    openapiFields.add("street");
    openapiFields.add("number");
    openapiFields.add("complement");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FraudAnalysisMetadataCustomerDeliveryAddress
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FraudAnalysisMetadataCustomerDeliveryAddress.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FraudAnalysisMetadataCustomerDeliveryAddress is not found in the empty JSON string", FraudAnalysisMetadataCustomerDeliveryAddress.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("district") != null && !jsonObj.get("district").isJsonNull()) && !jsonObj.get("district").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `district` to be a primitive type in the JSON string but got `%s`", jsonObj.get("district").toString()));
      }
      if ((jsonObj.get("zipCode") != null && !jsonObj.get("zipCode").isJsonNull()) && !jsonObj.get("zipCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zipCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zipCode").toString()));
      }
      if ((jsonObj.get("street") != null && !jsonObj.get("street").isJsonNull()) && !jsonObj.get("street").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street").toString()));
      }
      if ((jsonObj.get("number") != null && !jsonObj.get("number").isJsonNull()) && !jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      if ((jsonObj.get("complement") != null && !jsonObj.get("complement").isJsonNull()) && !jsonObj.get("complement").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `complement` to be a primitive type in the JSON string but got `%s`", jsonObj.get("complement").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FraudAnalysisMetadataCustomerDeliveryAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FraudAnalysisMetadataCustomerDeliveryAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FraudAnalysisMetadataCustomerDeliveryAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FraudAnalysisMetadataCustomerDeliveryAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<FraudAnalysisMetadataCustomerDeliveryAddress>() {
           @Override
           public void write(JsonWriter out, FraudAnalysisMetadataCustomerDeliveryAddress value) throws IOException {
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
           public FraudAnalysisMetadataCustomerDeliveryAddress read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FraudAnalysisMetadataCustomerDeliveryAddress instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FraudAnalysisMetadataCustomerDeliveryAddress given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FraudAnalysisMetadataCustomerDeliveryAddress
  * @throws IOException if the JSON string is invalid with respect to FraudAnalysisMetadataCustomerDeliveryAddress
  */
  public static FraudAnalysisMetadataCustomerDeliveryAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FraudAnalysisMetadataCustomerDeliveryAddress.class);
  }

  public static Gson getGson() {
    return JSON.getGson();
  }

/** * Convert an instance of FraudAnalysisMetadataCustomerDeliveryAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

