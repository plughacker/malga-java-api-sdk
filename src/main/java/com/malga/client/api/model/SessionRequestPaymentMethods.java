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
import com.malga.client.api.model.PaymentMethodBoletoFine;
import com.malga.client.api.model.PaymentMethodBoletoInterest;
import com.malga.client.api.model.PaymentMethodCard;
import com.malga.client.api.model.PaymentMethodPix;
import com.malga.client.api.model.SessionPaymentMethodBoleto;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-21T21:25:35.057162-03:00[America/Sao_Paulo]")
public class SessionRequestPaymentMethods extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SessionRequestPaymentMethods.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SessionRequestPaymentMethods.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SessionRequestPaymentMethods' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PaymentMethodCard> adapterPaymentMethodCard = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodCard.class));
            final TypeAdapter<PaymentMethodPix> adapterPaymentMethodPix = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodPix.class));
            final TypeAdapter<SessionPaymentMethodBoleto> adapterSessionPaymentMethodBoleto = gson.getDelegateAdapter(this, TypeToken.get(SessionPaymentMethodBoleto.class));

            return (TypeAdapter<T>) new TypeAdapter<SessionRequestPaymentMethods>() {
                @Override
                public void write(JsonWriter out, SessionRequestPaymentMethods value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `PaymentMethodCard`
                    if (value.getActualInstance() instanceof PaymentMethodCard) {
                        JsonObject obj = adapterPaymentMethodCard.toJsonTree((PaymentMethodCard)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `PaymentMethodPix`
                    if (value.getActualInstance() instanceof PaymentMethodPix) {
                        JsonObject obj = adapterPaymentMethodPix.toJsonTree((PaymentMethodPix)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SessionPaymentMethodBoleto`
                    if (value.getActualInstance() instanceof SessionPaymentMethodBoleto) {
                        JsonObject obj = adapterSessionPaymentMethodBoleto.toJsonTree((SessionPaymentMethodBoleto)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: PaymentMethodCard, PaymentMethodPix, SessionPaymentMethodBoleto");
                }

                @Override
                public SessionRequestPaymentMethods read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize PaymentMethodCard
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PaymentMethodCard.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'PaymentMethodCard'");
                        SessionRequestPaymentMethods ret = new SessionRequestPaymentMethods();
                        ret.setActualInstance(adapterPaymentMethodCard.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'PaymentMethodCard'", e);
                    }

                    // deserialize PaymentMethodPix
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PaymentMethodPix.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'PaymentMethodPix'");
                        SessionRequestPaymentMethods ret = new SessionRequestPaymentMethods();
                        ret.setActualInstance(adapterPaymentMethodPix.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'PaymentMethodPix'", e);
                    }

                    // deserialize SessionPaymentMethodBoleto
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SessionPaymentMethodBoleto.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'SessionPaymentMethodBoleto'");
                        SessionRequestPaymentMethods ret = new SessionRequestPaymentMethods();
                        ret.setActualInstance(adapterSessionPaymentMethodBoleto.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'SessionPaymentMethodBoleto'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for SessionRequestPaymentMethods: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public SessionRequestPaymentMethods() {
        super("anyOf", Boolean.FALSE);
    }

    public SessionRequestPaymentMethods(PaymentMethodCard o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SessionRequestPaymentMethods(PaymentMethodPix o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SessionRequestPaymentMethods(SessionPaymentMethodBoleto o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("PaymentMethodCard", new GenericType<PaymentMethodCard>() {
        });
        schemas.put("PaymentMethodPix", new GenericType<PaymentMethodPix>() {
        });
        schemas.put("SessionPaymentMethodBoleto", new GenericType<SessionPaymentMethodBoleto>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return SessionRequestPaymentMethods.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * PaymentMethodCard, PaymentMethodPix, SessionPaymentMethodBoleto
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof PaymentMethodCard) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PaymentMethodPix) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SessionPaymentMethodBoleto) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be PaymentMethodCard, PaymentMethodPix, SessionPaymentMethodBoleto");
    }

    /**
     * Get the actual instance, which can be the following:
     * PaymentMethodCard, PaymentMethodPix, SessionPaymentMethodBoleto
     *
     * @return The actual instance (PaymentMethodCard, PaymentMethodPix, SessionPaymentMethodBoleto)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PaymentMethodCard`. If the actual instance is not `PaymentMethodCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentMethodCard`
     * @throws ClassCastException if the instance is not `PaymentMethodCard`
     */
    public PaymentMethodCard getPaymentMethodCard() throws ClassCastException {
        return (PaymentMethodCard)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PaymentMethodPix`. If the actual instance is not `PaymentMethodPix`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentMethodPix`
     * @throws ClassCastException if the instance is not `PaymentMethodPix`
     */
    public PaymentMethodPix getPaymentMethodPix() throws ClassCastException {
        return (PaymentMethodPix)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SessionPaymentMethodBoleto`. If the actual instance is not `SessionPaymentMethodBoleto`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SessionPaymentMethodBoleto`
     * @throws ClassCastException if the instance is not `SessionPaymentMethodBoleto`
     */
    public SessionPaymentMethodBoleto getSessionPaymentMethodBoleto() throws ClassCastException {
        return (SessionPaymentMethodBoleto)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SessionRequestPaymentMethods
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with PaymentMethodCard
    try {
      PaymentMethodCard.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with PaymentMethodPix
    try {
      PaymentMethodPix.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with SessionPaymentMethodBoleto
    try {
      SessionPaymentMethodBoleto.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for SessionRequestPaymentMethods with anyOf schemas: PaymentMethodCard, PaymentMethodPix, SessionPaymentMethodBoleto. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of SessionRequestPaymentMethods given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SessionRequestPaymentMethods
  * @throws IOException if the JSON string is invalid with respect to SessionRequestPaymentMethods
  */
  public static SessionRequestPaymentMethods fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SessionRequestPaymentMethods.class);
  }

 /**
  * Convert an instance of SessionRequestPaymentMethods to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

