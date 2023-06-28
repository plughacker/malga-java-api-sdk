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
import io.malga.model.charges.PaymentMethodBoletoResponse;
import io.malga.model.charges.PaymentMethodCard;
import io.malga.model.charges.PaymentMethodPixResponse;
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

import io.malga.model.charges.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-28T20:17:02.961685-03:00[America/Sao_Paulo]")
public class ChargeResponsePaymentMethod extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ChargeResponsePaymentMethod.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ChargeResponsePaymentMethod.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ChargeResponsePaymentMethod' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PaymentMethodBoletoResponse> adapterPaymentMethodBoletoResponse = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodBoletoResponse.class));
            final TypeAdapter<PaymentMethodCard> adapterPaymentMethodCard = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodCard.class));
            final TypeAdapter<PaymentMethodPixResponse> adapterPaymentMethodPixResponse = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodPixResponse.class));

            return (TypeAdapter<T>) new TypeAdapter<ChargeResponsePaymentMethod>() {
                @Override
                public void write(JsonWriter out, ChargeResponsePaymentMethod value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `PaymentMethodBoletoResponse`
                    if (value.getActualInstance() instanceof PaymentMethodBoletoResponse) {
                        JsonObject obj = adapterPaymentMethodBoletoResponse.toJsonTree((PaymentMethodBoletoResponse)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `PaymentMethodCard`
                    if (value.getActualInstance() instanceof PaymentMethodCard) {
                        JsonObject obj = adapterPaymentMethodCard.toJsonTree((PaymentMethodCard)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `PaymentMethodPixResponse`
                    if (value.getActualInstance() instanceof PaymentMethodPixResponse) {
                        JsonObject obj = adapterPaymentMethodPixResponse.toJsonTree((PaymentMethodPixResponse)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: PaymentMethodBoletoResponse, PaymentMethodCard, PaymentMethodPixResponse");
                }

                @Override
                public ChargeResponsePaymentMethod read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize PaymentMethodBoletoResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PaymentMethodBoletoResponse.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'PaymentMethodBoletoResponse'");
                        ChargeResponsePaymentMethod ret = new ChargeResponsePaymentMethod();
                        ret.setActualInstance(adapterPaymentMethodBoletoResponse.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'PaymentMethodBoletoResponse'", e);
                    }

                    // deserialize PaymentMethodCard
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PaymentMethodCard.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'PaymentMethodCard'");
                        ChargeResponsePaymentMethod ret = new ChargeResponsePaymentMethod();
                        ret.setActualInstance(adapterPaymentMethodCard.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'PaymentMethodCard'", e);
                    }

                    // deserialize PaymentMethodPixResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PaymentMethodPixResponse.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'PaymentMethodPixResponse'");
                        ChargeResponsePaymentMethod ret = new ChargeResponsePaymentMethod();
                        ret.setActualInstance(adapterPaymentMethodPixResponse.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'PaymentMethodPixResponse'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for ChargeResponsePaymentMethod: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ChargeResponsePaymentMethod() {
        super("anyOf", Boolean.FALSE);
    }

    public ChargeResponsePaymentMethod(PaymentMethodBoletoResponse o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ChargeResponsePaymentMethod(PaymentMethodCard o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ChargeResponsePaymentMethod(PaymentMethodPixResponse o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("PaymentMethodBoletoResponse", new GenericType<PaymentMethodBoletoResponse>() {
        });
        schemas.put("PaymentMethodCard", new GenericType<PaymentMethodCard>() {
        });
        schemas.put("PaymentMethodPixResponse", new GenericType<PaymentMethodPixResponse>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ChargeResponsePaymentMethod.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * PaymentMethodBoletoResponse, PaymentMethodCard, PaymentMethodPixResponse
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof PaymentMethodBoletoResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PaymentMethodCard) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PaymentMethodPixResponse) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be PaymentMethodBoletoResponse, PaymentMethodCard, PaymentMethodPixResponse");
    }

    /**
     * Get the actual instance, which can be the following:
     * PaymentMethodBoletoResponse, PaymentMethodCard, PaymentMethodPixResponse
     *
     * @return The actual instance (PaymentMethodBoletoResponse, PaymentMethodCard, PaymentMethodPixResponse)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PaymentMethodBoletoResponse`. If the actual instance is not `PaymentMethodBoletoResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentMethodBoletoResponse`
     * @throws ClassCastException if the instance is not `PaymentMethodBoletoResponse`
     */
    public PaymentMethodBoletoResponse getPaymentMethodBoletoResponse() throws ClassCastException {
        return (PaymentMethodBoletoResponse)super.getActualInstance();
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
     * Get the actual instance of `PaymentMethodPixResponse`. If the actual instance is not `PaymentMethodPixResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentMethodPixResponse`
     * @throws ClassCastException if the instance is not `PaymentMethodPixResponse`
     */
    public PaymentMethodPixResponse getPaymentMethodPixResponse() throws ClassCastException {
        return (PaymentMethodPixResponse)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChargeResponsePaymentMethod
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with PaymentMethodBoletoResponse
    try {
      PaymentMethodBoletoResponse.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with PaymentMethodCard
    try {
      PaymentMethodCard.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with PaymentMethodPixResponse
    try {
      PaymentMethodPixResponse.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for ChargeResponsePaymentMethod with anyOf schemas: PaymentMethodBoletoResponse, PaymentMethodCard, PaymentMethodPixResponse. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of ChargeResponsePaymentMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChargeResponsePaymentMethod
  * @throws IOException if the JSON string is invalid with respect to ChargeResponsePaymentMethod
  */
  public static ChargeResponsePaymentMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChargeResponsePaymentMethod.class);
  }

  public static Gson getGson() {
    return JSON.getGson();
  }

 /**
  * Convert an instance of ChargeResponsePaymentMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

