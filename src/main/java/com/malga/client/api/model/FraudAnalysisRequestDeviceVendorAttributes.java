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
 * Device attributes by vendor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-21T11:28:16.780712-03:00[America/Sao_Paulo]")
public class FraudAnalysisRequestDeviceVendorAttributes {
  public static final String SERIALIZED_NAME_FLASH = "flash";
  @SerializedName(SERIALIZED_NAME_FLASH)
  private Boolean flash;

  public static final String SERIALIZED_NAME_PHONE_CALLS = "phoneCalls";
  @SerializedName(SERIALIZED_NAME_PHONE_CALLS)
  private Boolean phoneCalls;

  public static final String SERIALIZED_NAME_SEND_SMS = "sendSms";
  @SerializedName(SERIALIZED_NAME_SEND_SMS)
  private Boolean sendSms;

  public static final String SERIALIZED_NAME_VIDEO_CAMERA = "videoCamera";
  @SerializedName(SERIALIZED_NAME_VIDEO_CAMERA)
  private Boolean videoCamera;

  public static final String SERIALIZED_NAME_CPU_COUNT = "cpuCount";
  @SerializedName(SERIALIZED_NAME_CPU_COUNT)
  private Integer cpuCount;

  public static final String SERIALIZED_NAME_SIMULATOR = "simulator";
  @SerializedName(SERIALIZED_NAME_SIMULATOR)
  private Boolean simulator;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_IDIOM = "idiom";
  @SerializedName(SERIALIZED_NAME_IDIOM)
  private String idiom;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FAMILY = "family";
  @SerializedName(SERIALIZED_NAME_FAMILY)
  private String family;

  public static final String SERIALIZED_NAME_RETINA_DISPLAY = "retinaDisplay";
  @SerializedName(SERIALIZED_NAME_RETINA_DISPLAY)
  private Boolean retinaDisplay;

  public static final String SERIALIZED_NAME_CAMERA = "camera";
  @SerializedName(SERIALIZED_NAME_CAMERA)
  private Boolean camera;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_FRONT_CAMERA = "frontCamera";
  @SerializedName(SERIALIZED_NAME_FRONT_CAMERA)
  private Boolean frontCamera;

  public FraudAnalysisRequestDeviceVendorAttributes() {
  }

  public FraudAnalysisRequestDeviceVendorAttributes flash(Boolean flash) {
    
    this.flash = flash;
    return this;
  }

   /**
   * Device has flash
   * @return flash
  **/
  @javax.annotation.Nullable

  public Boolean getFlash() {
    return flash;
  }


  public void setFlash(Boolean flash) {
    this.flash = flash;
  }


  public FraudAnalysisRequestDeviceVendorAttributes phoneCalls(Boolean phoneCalls) {
    
    this.phoneCalls = phoneCalls;
    return this;
  }

   /**
   * Device can make phone calls
   * @return phoneCalls
  **/
  @javax.annotation.Nullable

  public Boolean getPhoneCalls() {
    return phoneCalls;
  }


  public void setPhoneCalls(Boolean phoneCalls) {
    this.phoneCalls = phoneCalls;
  }


  public FraudAnalysisRequestDeviceVendorAttributes sendSms(Boolean sendSms) {
    
    this.sendSms = sendSms;
    return this;
  }

   /**
   * Device can send sms
   * @return sendSms
  **/
  @javax.annotation.Nullable

  public Boolean getSendSms() {
    return sendSms;
  }


  public void setSendSms(Boolean sendSms) {
    this.sendSms = sendSms;
  }


  public FraudAnalysisRequestDeviceVendorAttributes videoCamera(Boolean videoCamera) {
    
    this.videoCamera = videoCamera;
    return this;
  }

   /**
   * Device has video camera
   * @return videoCamera
  **/
  @javax.annotation.Nullable

  public Boolean getVideoCamera() {
    return videoCamera;
  }


  public void setVideoCamera(Boolean videoCamera) {
    this.videoCamera = videoCamera;
  }


  public FraudAnalysisRequestDeviceVendorAttributes cpuCount(Integer cpuCount) {
    
    this.cpuCount = cpuCount;
    return this;
  }

   /**
   * Device cpu count
   * @return cpuCount
  **/
  @javax.annotation.Nullable

  public Integer getCpuCount() {
    return cpuCount;
  }


  public void setCpuCount(Integer cpuCount) {
    this.cpuCount = cpuCount;
  }


  public FraudAnalysisRequestDeviceVendorAttributes simulator(Boolean simulator) {
    
    this.simulator = simulator;
    return this;
  }

   /**
   * Device has simulator
   * @return simulator
  **/
  @javax.annotation.Nullable

  public Boolean getSimulator() {
    return simulator;
  }


  public void setSimulator(Boolean simulator) {
    this.simulator = simulator;
  }


  public FraudAnalysisRequestDeviceVendorAttributes language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Device language
   * @return language
  **/
  @javax.annotation.Nullable

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public FraudAnalysisRequestDeviceVendorAttributes idiom(String idiom) {
    
    this.idiom = idiom;
    return this;
  }

   /**
   * Device idiom
   * @return idiom
  **/
  @javax.annotation.Nullable

  public String getIdiom() {
    return idiom;
  }


  public void setIdiom(String idiom) {
    this.idiom = idiom;
  }


  public FraudAnalysisRequestDeviceVendorAttributes platform(String platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * System platform
   * @return platform
  **/
  @javax.annotation.Nullable

  public String getPlatform() {
    return platform;
  }


  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public FraudAnalysisRequestDeviceVendorAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Device name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FraudAnalysisRequestDeviceVendorAttributes family(String family) {
    
    this.family = family;
    return this;
  }

   /**
   * Device family
   * @return family
  **/
  @javax.annotation.Nullable

  public String getFamily() {
    return family;
  }


  public void setFamily(String family) {
    this.family = family;
  }


  public FraudAnalysisRequestDeviceVendorAttributes retinaDisplay(Boolean retinaDisplay) {
    
    this.retinaDisplay = retinaDisplay;
    return this;
  }

   /**
   * Device has retina display
   * @return retinaDisplay
  **/
  @javax.annotation.Nullable

  public Boolean getRetinaDisplay() {
    return retinaDisplay;
  }


  public void setRetinaDisplay(Boolean retinaDisplay) {
    this.retinaDisplay = retinaDisplay;
  }


  public FraudAnalysisRequestDeviceVendorAttributes camera(Boolean camera) {
    
    this.camera = camera;
    return this;
  }

   /**
   * Device has camera
   * @return camera
  **/
  @javax.annotation.Nullable

  public Boolean getCamera() {
    return camera;
  }


  public void setCamera(Boolean camera) {
    this.camera = camera;
  }


  public FraudAnalysisRequestDeviceVendorAttributes model(String model) {
    
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


  public FraudAnalysisRequestDeviceVendorAttributes frontCamera(Boolean frontCamera) {
    
    this.frontCamera = frontCamera;
    return this;
  }

   /**
   * Device has front camera
   * @return frontCamera
  **/
  @javax.annotation.Nullable

  public Boolean getFrontCamera() {
    return frontCamera;
  }


  public void setFrontCamera(Boolean frontCamera) {
    this.frontCamera = frontCamera;
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
   * @return the FraudAnalysisRequestDeviceVendorAttributes instance itself
   */
  public FraudAnalysisRequestDeviceVendorAttributes putAdditionalProperty(String key, Object value) {
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
    FraudAnalysisRequestDeviceVendorAttributes fraudAnalysisRequestDeviceVendorAttributes = (FraudAnalysisRequestDeviceVendorAttributes) o;
    return Objects.equals(this.flash, fraudAnalysisRequestDeviceVendorAttributes.flash) &&
        Objects.equals(this.phoneCalls, fraudAnalysisRequestDeviceVendorAttributes.phoneCalls) &&
        Objects.equals(this.sendSms, fraudAnalysisRequestDeviceVendorAttributes.sendSms) &&
        Objects.equals(this.videoCamera, fraudAnalysisRequestDeviceVendorAttributes.videoCamera) &&
        Objects.equals(this.cpuCount, fraudAnalysisRequestDeviceVendorAttributes.cpuCount) &&
        Objects.equals(this.simulator, fraudAnalysisRequestDeviceVendorAttributes.simulator) &&
        Objects.equals(this.language, fraudAnalysisRequestDeviceVendorAttributes.language) &&
        Objects.equals(this.idiom, fraudAnalysisRequestDeviceVendorAttributes.idiom) &&
        Objects.equals(this.platform, fraudAnalysisRequestDeviceVendorAttributes.platform) &&
        Objects.equals(this.name, fraudAnalysisRequestDeviceVendorAttributes.name) &&
        Objects.equals(this.family, fraudAnalysisRequestDeviceVendorAttributes.family) &&
        Objects.equals(this.retinaDisplay, fraudAnalysisRequestDeviceVendorAttributes.retinaDisplay) &&
        Objects.equals(this.camera, fraudAnalysisRequestDeviceVendorAttributes.camera) &&
        Objects.equals(this.model, fraudAnalysisRequestDeviceVendorAttributes.model) &&
        Objects.equals(this.frontCamera, fraudAnalysisRequestDeviceVendorAttributes.frontCamera)&&
        Objects.equals(this.additionalProperties, fraudAnalysisRequestDeviceVendorAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flash, phoneCalls, sendSms, videoCamera, cpuCount, simulator, language, idiom, platform, name, family, retinaDisplay, camera, model, frontCamera, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudAnalysisRequestDeviceVendorAttributes {\n");
    sb.append("    flash: ").append(toIndentedString(flash)).append("\n");
    sb.append("    phoneCalls: ").append(toIndentedString(phoneCalls)).append("\n");
    sb.append("    sendSms: ").append(toIndentedString(sendSms)).append("\n");
    sb.append("    videoCamera: ").append(toIndentedString(videoCamera)).append("\n");
    sb.append("    cpuCount: ").append(toIndentedString(cpuCount)).append("\n");
    sb.append("    simulator: ").append(toIndentedString(simulator)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    idiom: ").append(toIndentedString(idiom)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    retinaDisplay: ").append(toIndentedString(retinaDisplay)).append("\n");
    sb.append("    camera: ").append(toIndentedString(camera)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    frontCamera: ").append(toIndentedString(frontCamera)).append("\n");
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
    openapiFields.add("flash");
    openapiFields.add("phoneCalls");
    openapiFields.add("sendSms");
    openapiFields.add("videoCamera");
    openapiFields.add("cpuCount");
    openapiFields.add("simulator");
    openapiFields.add("language");
    openapiFields.add("idiom");
    openapiFields.add("platform");
    openapiFields.add("name");
    openapiFields.add("family");
    openapiFields.add("retinaDisplay");
    openapiFields.add("camera");
    openapiFields.add("model");
    openapiFields.add("frontCamera");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FraudAnalysisRequestDeviceVendorAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FraudAnalysisRequestDeviceVendorAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FraudAnalysisRequestDeviceVendorAttributes is not found in the empty JSON string", FraudAnalysisRequestDeviceVendorAttributes.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("idiom") != null && !jsonObj.get("idiom").isJsonNull()) && !jsonObj.get("idiom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idiom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idiom").toString()));
      }
      if ((jsonObj.get("platform") != null && !jsonObj.get("platform").isJsonNull()) && !jsonObj.get("platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("family") != null && !jsonObj.get("family").isJsonNull()) && !jsonObj.get("family").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `family` to be a primitive type in the JSON string but got `%s`", jsonObj.get("family").toString()));
      }
      if ((jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) && !jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FraudAnalysisRequestDeviceVendorAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FraudAnalysisRequestDeviceVendorAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FraudAnalysisRequestDeviceVendorAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FraudAnalysisRequestDeviceVendorAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<FraudAnalysisRequestDeviceVendorAttributes>() {
           @Override
           public void write(JsonWriter out, FraudAnalysisRequestDeviceVendorAttributes value) throws IOException {
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
           public FraudAnalysisRequestDeviceVendorAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FraudAnalysisRequestDeviceVendorAttributes instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FraudAnalysisRequestDeviceVendorAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FraudAnalysisRequestDeviceVendorAttributes
  * @throws IOException if the JSON string is invalid with respect to FraudAnalysisRequestDeviceVendorAttributes
  */
  public static FraudAnalysisRequestDeviceVendorAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FraudAnalysisRequestDeviceVendorAttributes.class);
  }

 /**
  * Convert an instance of FraudAnalysisRequestDeviceVendorAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

