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
import com.malga.client.api.model.FraudAnalysisRequestDeviceOs;
import com.malga.client.api.model.FraudAnalysisRequestDeviceVendorAttributes;
import com.malga.client.api.model.FraudAnalysisRequestDeviceVendorsInner;
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
 * Customer device details
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-21T00:10:35.774518-03:00[America/Sao_Paulo]")
public class FraudAnalysisRequestDevice {
  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private FraudAnalysisRequestDeviceOs os;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_RAM_CAPACITY = "ramCapacity";
  @SerializedName(SERIALIZED_NAME_RAM_CAPACITY)
  private Integer ramCapacity;

  public static final String SERIALIZED_NAME_DISK_CAPACITY = "diskCapacity";
  @SerializedName(SERIALIZED_NAME_DISK_CAPACITY)
  private Integer diskCapacity;

  public static final String SERIALIZED_NAME_FREE_DISK_SPACE = "freeDiskSpace";
  @SerializedName(SERIALIZED_NAME_FREE_DISK_SPACE)
  private Integer freeDiskSpace;

  public static final String SERIALIZED_NAME_RESOLUTION = "resolution";
  @SerializedName(SERIALIZED_NAME_RESOLUTION)
  private Integer resolution;

  public static final String SERIALIZED_NAME_VENDORS = "vendors";
  @SerializedName(SERIALIZED_NAME_VENDORS)
  private List<FraudAnalysisRequestDeviceVendorsInner> vendors = new ArrayList<>();

  public static final String SERIALIZED_NAME_VENDOR_ATTRIBUTES = "vendorAttributes";
  @SerializedName(SERIALIZED_NAME_VENDOR_ATTRIBUTES)
  private FraudAnalysisRequestDeviceVendorAttributes vendorAttributes;

  public FraudAnalysisRequestDevice() {
  }

  public FraudAnalysisRequestDevice os(FraudAnalysisRequestDeviceOs os) {
    
    this.os = os;
    return this;
  }

   /**
   * Get os
   * @return os
  **/
  @javax.annotation.Nullable

  public FraudAnalysisRequestDeviceOs getOs() {
    return os;
  }


  public void setOs(FraudAnalysisRequestDeviceOs os) {
    this.os = os;
  }


  public FraudAnalysisRequestDevice model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * Device model
   * @return model
  **/
  @javax.annotation.Nullable

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public FraudAnalysisRequestDevice ramCapacity(Integer ramCapacity) {
    
    this.ramCapacity = ramCapacity;
    return this;
  }

   /**
   * Device ram capacity
   * @return ramCapacity
  **/
  @javax.annotation.Nullable

  public Integer getRamCapacity() {
    return ramCapacity;
  }


  public void setRamCapacity(Integer ramCapacity) {
    this.ramCapacity = ramCapacity;
  }


  public FraudAnalysisRequestDevice diskCapacity(Integer diskCapacity) {
    
    this.diskCapacity = diskCapacity;
    return this;
  }

   /**
   * Device disk capacity
   * @return diskCapacity
  **/
  @javax.annotation.Nullable

  public Integer getDiskCapacity() {
    return diskCapacity;
  }


  public void setDiskCapacity(Integer diskCapacity) {
    this.diskCapacity = diskCapacity;
  }


  public FraudAnalysisRequestDevice freeDiskSpace(Integer freeDiskSpace) {
    
    this.freeDiskSpace = freeDiskSpace;
    return this;
  }

   /**
   * Device disk space still free
   * @return freeDiskSpace
  **/
  @javax.annotation.Nullable

  public Integer getFreeDiskSpace() {
    return freeDiskSpace;
  }


  public void setFreeDiskSpace(Integer freeDiskSpace) {
    this.freeDiskSpace = freeDiskSpace;
  }


  public FraudAnalysisRequestDevice resolution(Integer resolution) {
    
    this.resolution = resolution;
    return this;
  }

   /**
   * Device resolution
   * @return resolution
  **/
  @javax.annotation.Nullable

  public Integer getResolution() {
    return resolution;
  }


  public void setResolution(Integer resolution) {
    this.resolution = resolution;
  }


  public FraudAnalysisRequestDevice vendors(List<FraudAnalysisRequestDeviceVendorsInner> vendors) {
    
    this.vendors = vendors;
    return this;
  }

  public FraudAnalysisRequestDevice addVendorsItem(FraudAnalysisRequestDeviceVendorsInner vendorsItem) {
    if (this.vendors == null) {
      this.vendors = new ArrayList<>();
    }
    this.vendors.add(vendorsItem);
    return this;
  }

   /**
   * Get vendors
   * @return vendors
  **/
  @javax.annotation.Nullable

  public List<FraudAnalysisRequestDeviceVendorsInner> getVendors() {
    return vendors;
  }


  public void setVendors(List<FraudAnalysisRequestDeviceVendorsInner> vendors) {
    this.vendors = vendors;
  }


  public FraudAnalysisRequestDevice vendorAttributes(FraudAnalysisRequestDeviceVendorAttributes vendorAttributes) {
    
    this.vendorAttributes = vendorAttributes;
    return this;
  }

   /**
   * Get vendorAttributes
   * @return vendorAttributes
  **/
  @javax.annotation.Nullable

  public FraudAnalysisRequestDeviceVendorAttributes getVendorAttributes() {
    return vendorAttributes;
  }


  public void setVendorAttributes(FraudAnalysisRequestDeviceVendorAttributes vendorAttributes) {
    this.vendorAttributes = vendorAttributes;
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
   * @return the FraudAnalysisRequestDevice instance itself
   */
  public FraudAnalysisRequestDevice putAdditionalProperty(String key, Object value) {
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
    FraudAnalysisRequestDevice fraudAnalysisRequestDevice = (FraudAnalysisRequestDevice) o;
    return Objects.equals(this.os, fraudAnalysisRequestDevice.os) &&
        Objects.equals(this.model, fraudAnalysisRequestDevice.model) &&
        Objects.equals(this.ramCapacity, fraudAnalysisRequestDevice.ramCapacity) &&
        Objects.equals(this.diskCapacity, fraudAnalysisRequestDevice.diskCapacity) &&
        Objects.equals(this.freeDiskSpace, fraudAnalysisRequestDevice.freeDiskSpace) &&
        Objects.equals(this.resolution, fraudAnalysisRequestDevice.resolution) &&
        Objects.equals(this.vendors, fraudAnalysisRequestDevice.vendors) &&
        Objects.equals(this.vendorAttributes, fraudAnalysisRequestDevice.vendorAttributes)&&
        Objects.equals(this.additionalProperties, fraudAnalysisRequestDevice.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(os, model, ramCapacity, diskCapacity, freeDiskSpace, resolution, vendors, vendorAttributes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudAnalysisRequestDevice {\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    ramCapacity: ").append(toIndentedString(ramCapacity)).append("\n");
    sb.append("    diskCapacity: ").append(toIndentedString(diskCapacity)).append("\n");
    sb.append("    freeDiskSpace: ").append(toIndentedString(freeDiskSpace)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    vendors: ").append(toIndentedString(vendors)).append("\n");
    sb.append("    vendorAttributes: ").append(toIndentedString(vendorAttributes)).append("\n");
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
    openapiFields.add("os");
    openapiFields.add("model");
    openapiFields.add("ramCapacity");
    openapiFields.add("diskCapacity");
    openapiFields.add("freeDiskSpace");
    openapiFields.add("resolution");
    openapiFields.add("vendors");
    openapiFields.add("vendorAttributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FraudAnalysisRequestDevice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FraudAnalysisRequestDevice.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FraudAnalysisRequestDevice is not found in the empty JSON string", FraudAnalysisRequestDevice.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `os`
      if (jsonObj.get("os") != null && !jsonObj.get("os").isJsonNull()) {
        FraudAnalysisRequestDeviceOs.validateJsonObject(jsonObj.getAsJsonObject("os"));
      }
      if ((jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) && !jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      if (jsonObj.get("vendors") != null && !jsonObj.get("vendors").isJsonNull()) {
        JsonArray jsonArrayvendors = jsonObj.getAsJsonArray("vendors");
        if (jsonArrayvendors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vendors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vendors` to be an array in the JSON string but got `%s`", jsonObj.get("vendors").toString()));
          }

          // validate the optional field `vendors` (array)
          for (int i = 0; i < jsonArrayvendors.size(); i++) {
            FraudAnalysisRequestDeviceVendorsInner.validateJsonObject(jsonArrayvendors.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `vendorAttributes`
      if (jsonObj.get("vendorAttributes") != null && !jsonObj.get("vendorAttributes").isJsonNull()) {
        FraudAnalysisRequestDeviceVendorAttributes.validateJsonObject(jsonObj.getAsJsonObject("vendorAttributes"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FraudAnalysisRequestDevice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FraudAnalysisRequestDevice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FraudAnalysisRequestDevice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FraudAnalysisRequestDevice.class));

       return (TypeAdapter<T>) new TypeAdapter<FraudAnalysisRequestDevice>() {
           @Override
           public void write(JsonWriter out, FraudAnalysisRequestDevice value) throws IOException {
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
           public FraudAnalysisRequestDevice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FraudAnalysisRequestDevice instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FraudAnalysisRequestDevice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FraudAnalysisRequestDevice
  * @throws IOException if the JSON string is invalid with respect to FraudAnalysisRequestDevice
  */
  public static FraudAnalysisRequestDevice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FraudAnalysisRequestDevice.class);
  }

 /**
  * Convert an instance of FraudAnalysisRequestDevice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

