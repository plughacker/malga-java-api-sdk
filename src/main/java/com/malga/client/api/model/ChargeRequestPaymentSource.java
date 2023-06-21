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
import com.malga.client.api.model.SourceTypeCard;
import com.malga.client.api.model.SourceTypeCustomer;
import com.malga.client.api.model.SourceTypeToken;
import java.io.IOException;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.malga.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-21T11:28:16.780712-03:00[America/Sao_Paulo]")
public class ChargeRequestPaymentSource extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ChargeRequestPaymentSource.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ChargeRequestPaymentSource.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ChargeRequestPaymentSource' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SourceTypeCard> adapterSourceTypeCard = gson.getDelegateAdapter(this, TypeToken.get(SourceTypeCard.class));
            final TypeAdapter<SourceTypeCustomer> adapterSourceTypeCustomer = gson.getDelegateAdapter(this, TypeToken.get(SourceTypeCustomer.class));
            final TypeAdapter<SourceTypeToken> adapterSourceTypeToken = gson.getDelegateAdapter(this, TypeToken.get(SourceTypeToken.class));

            return (TypeAdapter<T>) new TypeAdapter<ChargeRequestPaymentSource>() {
                @Override
                public void write(JsonWriter out, ChargeRequestPaymentSource value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `SourceTypeCard`
                    if (value.getActualInstance() instanceof SourceTypeCard) {
                        JsonObject obj = adapterSourceTypeCard.toJsonTree((SourceTypeCard)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SourceTypeCustomer`
                    if (value.getActualInstance() instanceof SourceTypeCustomer) {
                        JsonObject obj = adapterSourceTypeCustomer.toJsonTree((SourceTypeCustomer)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SourceTypeToken`
                    if (value.getActualInstance() instanceof SourceTypeToken) {
                        JsonObject obj = adapterSourceTypeToken.toJsonTree((SourceTypeToken)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: SourceTypeCard, SourceTypeCustomer, SourceTypeToken");
                }

                @Override
                public ChargeRequestPaymentSource read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize SourceTypeCard
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SourceTypeCard.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'SourceTypeCard'");
                        ChargeRequestPaymentSource ret = new ChargeRequestPaymentSource();
                        ret.setActualInstance(adapterSourceTypeCard.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'SourceTypeCard'", e);
                    }

                    // deserialize SourceTypeCustomer
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SourceTypeCustomer.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'SourceTypeCustomer'");
                        ChargeRequestPaymentSource ret = new ChargeRequestPaymentSource();
                        ret.setActualInstance(adapterSourceTypeCustomer.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'SourceTypeCustomer'", e);
                    }

                    // deserialize SourceTypeToken
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SourceTypeToken.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'SourceTypeToken'");
                        ChargeRequestPaymentSource ret = new ChargeRequestPaymentSource();
                        ret.setActualInstance(adapterSourceTypeToken.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'SourceTypeToken'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for ChargeRequestPaymentSource: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ChargeRequestPaymentSource() {
        super("anyOf", Boolean.FALSE);
    }

    public ChargeRequestPaymentSource(SourceTypeCard o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ChargeRequestPaymentSource(SourceTypeCustomer o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ChargeRequestPaymentSource(SourceTypeToken o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("SourceTypeCard", new GenericType<SourceTypeCard>() {
        });
        schemas.put("SourceTypeCustomer", new GenericType<SourceTypeCustomer>() {
        });
        schemas.put("SourceTypeToken", new GenericType<SourceTypeToken>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ChargeRequestPaymentSource.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * SourceTypeCard, SourceTypeCustomer, SourceTypeToken
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof SourceTypeCard) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SourceTypeCustomer) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SourceTypeToken) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be SourceTypeCard, SourceTypeCustomer, SourceTypeToken");
    }

    /**
     * Get the actual instance, which can be the following:
     * SourceTypeCard, SourceTypeCustomer, SourceTypeToken
     *
     * @return The actual instance (SourceTypeCard, SourceTypeCustomer, SourceTypeToken)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `SourceTypeCard`. If the actual instance is not `SourceTypeCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SourceTypeCard`
     * @throws ClassCastException if the instance is not `SourceTypeCard`
     */
    public SourceTypeCard getSourceTypeCard() throws ClassCastException {
        return (SourceTypeCard)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SourceTypeCustomer`. If the actual instance is not `SourceTypeCustomer`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SourceTypeCustomer`
     * @throws ClassCastException if the instance is not `SourceTypeCustomer`
     */
    public SourceTypeCustomer getSourceTypeCustomer() throws ClassCastException {
        return (SourceTypeCustomer)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SourceTypeToken`. If the actual instance is not `SourceTypeToken`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SourceTypeToken`
     * @throws ClassCastException if the instance is not `SourceTypeToken`
     */
    public SourceTypeToken getSourceTypeToken() throws ClassCastException {
        return (SourceTypeToken)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChargeRequestPaymentSource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with SourceTypeCard
    try {
      SourceTypeCard.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with SourceTypeCustomer
    try {
      SourceTypeCustomer.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with SourceTypeToken
    try {
      SourceTypeToken.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for ChargeRequestPaymentSource with anyOf schemas: SourceTypeCard, SourceTypeCustomer, SourceTypeToken. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of ChargeRequestPaymentSource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChargeRequestPaymentSource
  * @throws IOException if the JSON string is invalid with respect to ChargeRequestPaymentSource
  */
  public static ChargeRequestPaymentSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChargeRequestPaymentSource.class);
  }

 /**
  * Convert an instance of ChargeRequestPaymentSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

