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


package io.malga.client.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.malga.client.api.model.PaymentMethodBoleto;
import io.malga.client.api.model.PaymentMethodBoletoFine;
import io.malga.client.api.model.PaymentMethodBoletoInterest;
import io.malga.client.api.model.PaymentMethodCard;
import io.malga.client.api.model.PaymentMethodPix;
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

import io.malga.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-27T15:34:15.656627-03:00[America/Sao_Paulo]")
public class SessionChargeRequestPaymentMethod extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SessionChargeRequestPaymentMethod.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SessionChargeRequestPaymentMethod.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SessionChargeRequestPaymentMethod' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PaymentMethodBoleto> adapterPaymentMethodBoleto = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodBoleto.class));
            final TypeAdapter<PaymentMethodCard> adapterPaymentMethodCard = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodCard.class));
            final TypeAdapter<PaymentMethodPix> adapterPaymentMethodPix = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodPix.class));

            return (TypeAdapter<T>) new TypeAdapter<SessionChargeRequestPaymentMethod>() {
                @Override
                public void write(JsonWriter out, SessionChargeRequestPaymentMethod value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `PaymentMethodBoleto`
                    if (value.getActualInstance() instanceof PaymentMethodBoleto) {
                        JsonObject obj = adapterPaymentMethodBoleto.toJsonTree((PaymentMethodBoleto)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
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

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: PaymentMethodBoleto, PaymentMethodCard, PaymentMethodPix");
                }

                @Override
                public SessionChargeRequestPaymentMethod read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize PaymentMethodBoleto
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PaymentMethodBoleto.validateJsonObject(jsonObject);
                        actualAdapter = adapterPaymentMethodBoleto;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PaymentMethodBoleto'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PaymentMethodBoleto failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PaymentMethodBoleto'", e);
                    }

                    // deserialize PaymentMethodCard
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PaymentMethodCard.validateJsonObject(jsonObject);
                        actualAdapter = adapterPaymentMethodCard;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PaymentMethodCard'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PaymentMethodCard failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PaymentMethodCard'", e);
                    }

                    // deserialize PaymentMethodPix
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PaymentMethodPix.validateJsonObject(jsonObject);
                        actualAdapter = adapterPaymentMethodPix;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PaymentMethodPix'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PaymentMethodPix failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PaymentMethodPix'", e);
                    }

                    if (match == 1) {
                        SessionChargeRequestPaymentMethod ret = new SessionChargeRequestPaymentMethod();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for SessionChargeRequestPaymentMethod: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public SessionChargeRequestPaymentMethod() {
        super("oneOf", Boolean.FALSE);
    }

    public SessionChargeRequestPaymentMethod(PaymentMethodBoleto o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SessionChargeRequestPaymentMethod(PaymentMethodCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SessionChargeRequestPaymentMethod(PaymentMethodPix o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("PaymentMethodBoleto", new GenericType<PaymentMethodBoleto>() {
        });
        schemas.put("PaymentMethodCard", new GenericType<PaymentMethodCard>() {
        });
        schemas.put("PaymentMethodPix", new GenericType<PaymentMethodPix>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return SessionChargeRequestPaymentMethod.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * PaymentMethodBoleto, PaymentMethodCard, PaymentMethodPix
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof PaymentMethodBoleto) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PaymentMethodCard) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PaymentMethodPix) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be PaymentMethodBoleto, PaymentMethodCard, PaymentMethodPix");
    }

    /**
     * Get the actual instance, which can be the following:
     * PaymentMethodBoleto, PaymentMethodCard, PaymentMethodPix
     *
     * @return The actual instance (PaymentMethodBoleto, PaymentMethodCard, PaymentMethodPix)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PaymentMethodBoleto`. If the actual instance is not `PaymentMethodBoleto`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentMethodBoleto`
     * @throws ClassCastException if the instance is not `PaymentMethodBoleto`
     */
    public PaymentMethodBoleto getPaymentMethodBoleto() throws ClassCastException {
        return (PaymentMethodBoleto)super.getActualInstance();
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SessionChargeRequestPaymentMethod
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with PaymentMethodBoleto
    try {
      PaymentMethodBoleto.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PaymentMethodBoleto failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PaymentMethodCard
    try {
      PaymentMethodCard.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PaymentMethodCard failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PaymentMethodPix
    try {
      PaymentMethodPix.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PaymentMethodPix failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for SessionChargeRequestPaymentMethod with oneOf schemas: PaymentMethodBoleto, PaymentMethodCard, PaymentMethodPix. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of SessionChargeRequestPaymentMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SessionChargeRequestPaymentMethod
  * @throws IOException if the JSON string is invalid with respect to SessionChargeRequestPaymentMethod
  */
  public static SessionChargeRequestPaymentMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SessionChargeRequestPaymentMethod.class);
  }

 /**
  * Convert an instance of SessionChargeRequestPaymentMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

