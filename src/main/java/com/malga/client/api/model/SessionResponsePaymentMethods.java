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
import com.malga.client.api.model.SessionPaymentMethodBoletoResponse;
import com.malga.client.api.model.SessionPaymentMethodCard;
import com.malga.client.api.model.SessionPaymentMethodPixResponse;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-22T19:10:47.032351-03:00[America/Sao_Paulo]")
public class SessionResponsePaymentMethods extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SessionResponsePaymentMethods.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SessionResponsePaymentMethods.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SessionResponsePaymentMethods' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SessionPaymentMethodBoletoResponse> adapterSessionPaymentMethodBoletoResponse = gson.getDelegateAdapter(this, TypeToken.get(SessionPaymentMethodBoletoResponse.class));
            final TypeAdapter<SessionPaymentMethodCard> adapterSessionPaymentMethodCard = gson.getDelegateAdapter(this, TypeToken.get(SessionPaymentMethodCard.class));
            final TypeAdapter<SessionPaymentMethodPixResponse> adapterSessionPaymentMethodPixResponse = gson.getDelegateAdapter(this, TypeToken.get(SessionPaymentMethodPixResponse.class));

            return (TypeAdapter<T>) new TypeAdapter<SessionResponsePaymentMethods>() {
                @Override
                public void write(JsonWriter out, SessionResponsePaymentMethods value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `SessionPaymentMethodBoletoResponse`
                    if (value.getActualInstance() instanceof SessionPaymentMethodBoletoResponse) {
                        JsonObject obj = adapterSessionPaymentMethodBoletoResponse.toJsonTree((SessionPaymentMethodBoletoResponse)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SessionPaymentMethodCard`
                    if (value.getActualInstance() instanceof SessionPaymentMethodCard) {
                        JsonObject obj = adapterSessionPaymentMethodCard.toJsonTree((SessionPaymentMethodCard)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SessionPaymentMethodPixResponse`
                    if (value.getActualInstance() instanceof SessionPaymentMethodPixResponse) {
                        JsonObject obj = adapterSessionPaymentMethodPixResponse.toJsonTree((SessionPaymentMethodPixResponse)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: SessionPaymentMethodBoletoResponse, SessionPaymentMethodCard, SessionPaymentMethodPixResponse");
                }

                @Override
                public SessionResponsePaymentMethods read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize SessionPaymentMethodBoletoResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SessionPaymentMethodBoletoResponse.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'SessionPaymentMethodBoletoResponse'");
                        SessionResponsePaymentMethods ret = new SessionResponsePaymentMethods();
                        ret.setActualInstance(adapterSessionPaymentMethodBoletoResponse.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'SessionPaymentMethodBoletoResponse'", e);
                    }

                    // deserialize SessionPaymentMethodCard
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SessionPaymentMethodCard.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'SessionPaymentMethodCard'");
                        SessionResponsePaymentMethods ret = new SessionResponsePaymentMethods();
                        ret.setActualInstance(adapterSessionPaymentMethodCard.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'SessionPaymentMethodCard'", e);
                    }

                    // deserialize SessionPaymentMethodPixResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SessionPaymentMethodPixResponse.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'SessionPaymentMethodPixResponse'");
                        SessionResponsePaymentMethods ret = new SessionResponsePaymentMethods();
                        ret.setActualInstance(adapterSessionPaymentMethodPixResponse.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'SessionPaymentMethodPixResponse'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for SessionResponsePaymentMethods: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public SessionResponsePaymentMethods() {
        super("anyOf", Boolean.FALSE);
    }

    public SessionResponsePaymentMethods(SessionPaymentMethodBoletoResponse o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SessionResponsePaymentMethods(SessionPaymentMethodCard o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SessionResponsePaymentMethods(SessionPaymentMethodPixResponse o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("SessionPaymentMethodBoletoResponse", new GenericType<SessionPaymentMethodBoletoResponse>() {
        });
        schemas.put("SessionPaymentMethodCard", new GenericType<SessionPaymentMethodCard>() {
        });
        schemas.put("SessionPaymentMethodPixResponse", new GenericType<SessionPaymentMethodPixResponse>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return SessionResponsePaymentMethods.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * SessionPaymentMethodBoletoResponse, SessionPaymentMethodCard, SessionPaymentMethodPixResponse
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof SessionPaymentMethodBoletoResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SessionPaymentMethodCard) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SessionPaymentMethodPixResponse) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be SessionPaymentMethodBoletoResponse, SessionPaymentMethodCard, SessionPaymentMethodPixResponse");
    }

    /**
     * Get the actual instance, which can be the following:
     * SessionPaymentMethodBoletoResponse, SessionPaymentMethodCard, SessionPaymentMethodPixResponse
     *
     * @return The actual instance (SessionPaymentMethodBoletoResponse, SessionPaymentMethodCard, SessionPaymentMethodPixResponse)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `SessionPaymentMethodBoletoResponse`. If the actual instance is not `SessionPaymentMethodBoletoResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SessionPaymentMethodBoletoResponse`
     * @throws ClassCastException if the instance is not `SessionPaymentMethodBoletoResponse`
     */
    public SessionPaymentMethodBoletoResponse getSessionPaymentMethodBoletoResponse() throws ClassCastException {
        return (SessionPaymentMethodBoletoResponse)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SessionPaymentMethodCard`. If the actual instance is not `SessionPaymentMethodCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SessionPaymentMethodCard`
     * @throws ClassCastException if the instance is not `SessionPaymentMethodCard`
     */
    public SessionPaymentMethodCard getSessionPaymentMethodCard() throws ClassCastException {
        return (SessionPaymentMethodCard)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SessionPaymentMethodPixResponse`. If the actual instance is not `SessionPaymentMethodPixResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SessionPaymentMethodPixResponse`
     * @throws ClassCastException if the instance is not `SessionPaymentMethodPixResponse`
     */
    public SessionPaymentMethodPixResponse getSessionPaymentMethodPixResponse() throws ClassCastException {
        return (SessionPaymentMethodPixResponse)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SessionResponsePaymentMethods
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with SessionPaymentMethodBoletoResponse
    try {
      SessionPaymentMethodBoletoResponse.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with SessionPaymentMethodCard
    try {
      SessionPaymentMethodCard.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with SessionPaymentMethodPixResponse
    try {
      SessionPaymentMethodPixResponse.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for SessionResponsePaymentMethods with anyOf schemas: SessionPaymentMethodBoletoResponse, SessionPaymentMethodCard, SessionPaymentMethodPixResponse. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of SessionResponsePaymentMethods given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SessionResponsePaymentMethods
  * @throws IOException if the JSON string is invalid with respect to SessionResponsePaymentMethods
  */
  public static SessionResponsePaymentMethods fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SessionResponsePaymentMethods.class);
  }

 /**
  * Convert an instance of SessionResponsePaymentMethods to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

