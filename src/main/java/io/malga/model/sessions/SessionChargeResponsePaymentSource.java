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
import io.malga.model.sessions.SourceTypeCard;
import io.malga.model.sessions.SourceTypeCardOneShot;
import io.malga.model.sessions.SourceTypeCardOneShotCard;
import io.malga.model.sessions.SourceTypeCustomer;
import io.malga.model.sessions.SourceTypeCustomerOneShot;
import io.malga.model.sessions.SourceTypeCustomerOneShotCustomer;
import io.malga.model.sessions.SourceTypeToken;
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

import io.malga.model.sessions.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-28T20:17:14.399550-03:00[America/Sao_Paulo]")
public class SessionChargeResponsePaymentSource extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SessionChargeResponsePaymentSource.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SessionChargeResponsePaymentSource.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SessionChargeResponsePaymentSource' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SourceTypeCard> adapterSourceTypeCard = gson.getDelegateAdapter(this, TypeToken.get(SourceTypeCard.class));
            final TypeAdapter<SourceTypeCardOneShot> adapterSourceTypeCardOneShot = gson.getDelegateAdapter(this, TypeToken.get(SourceTypeCardOneShot.class));
            final TypeAdapter<SourceTypeCustomer> adapterSourceTypeCustomer = gson.getDelegateAdapter(this, TypeToken.get(SourceTypeCustomer.class));
            final TypeAdapter<SourceTypeCustomerOneShot> adapterSourceTypeCustomerOneShot = gson.getDelegateAdapter(this, TypeToken.get(SourceTypeCustomerOneShot.class));
            final TypeAdapter<SourceTypeToken> adapterSourceTypeToken = gson.getDelegateAdapter(this, TypeToken.get(SourceTypeToken.class));

            return (TypeAdapter<T>) new TypeAdapter<SessionChargeResponsePaymentSource>() {
                @Override
                public void write(JsonWriter out, SessionChargeResponsePaymentSource value) throws IOException {
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

                    // check if the actual instance is of the type `SourceTypeCardOneShot`
                    if (value.getActualInstance() instanceof SourceTypeCardOneShot) {
                        JsonObject obj = adapterSourceTypeCardOneShot.toJsonTree((SourceTypeCardOneShot)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SourceTypeCustomer`
                    if (value.getActualInstance() instanceof SourceTypeCustomer) {
                        JsonObject obj = adapterSourceTypeCustomer.toJsonTree((SourceTypeCustomer)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SourceTypeCustomerOneShot`
                    if (value.getActualInstance() instanceof SourceTypeCustomerOneShot) {
                        JsonObject obj = adapterSourceTypeCustomerOneShot.toJsonTree((SourceTypeCustomerOneShot)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SourceTypeToken`
                    if (value.getActualInstance() instanceof SourceTypeToken) {
                        JsonObject obj = adapterSourceTypeToken.toJsonTree((SourceTypeToken)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: SourceTypeCard, SourceTypeCardOneShot, SourceTypeCustomer, SourceTypeCustomerOneShot, SourceTypeToken");
                }

                @Override
                public SessionChargeResponsePaymentSource read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize SourceTypeCard
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SourceTypeCard.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'SourceTypeCard'");
                        SessionChargeResponsePaymentSource ret = new SessionChargeResponsePaymentSource();
                        ret.setActualInstance(adapterSourceTypeCard.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'SourceTypeCard'", e);
                    }

                    // deserialize SourceTypeCardOneShot
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SourceTypeCardOneShot.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'SourceTypeCardOneShot'");
                        SessionChargeResponsePaymentSource ret = new SessionChargeResponsePaymentSource();
                        ret.setActualInstance(adapterSourceTypeCardOneShot.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'SourceTypeCardOneShot'", e);
                    }

                    // deserialize SourceTypeCustomer
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SourceTypeCustomer.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'SourceTypeCustomer'");
                        SessionChargeResponsePaymentSource ret = new SessionChargeResponsePaymentSource();
                        ret.setActualInstance(adapterSourceTypeCustomer.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'SourceTypeCustomer'", e);
                    }

                    // deserialize SourceTypeCustomerOneShot
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SourceTypeCustomerOneShot.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'SourceTypeCustomerOneShot'");
                        SessionChargeResponsePaymentSource ret = new SessionChargeResponsePaymentSource();
                        ret.setActualInstance(adapterSourceTypeCustomerOneShot.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'SourceTypeCustomerOneShot'", e);
                    }

                    // deserialize SourceTypeToken
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SourceTypeToken.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'SourceTypeToken'");
                        SessionChargeResponsePaymentSource ret = new SessionChargeResponsePaymentSource();
                        ret.setActualInstance(adapterSourceTypeToken.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'SourceTypeToken'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for SessionChargeResponsePaymentSource: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public SessionChargeResponsePaymentSource() {
        super("anyOf", Boolean.FALSE);
    }

    public SessionChargeResponsePaymentSource(SourceTypeCard o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SessionChargeResponsePaymentSource(SourceTypeCardOneShot o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SessionChargeResponsePaymentSource(SourceTypeCustomer o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SessionChargeResponsePaymentSource(SourceTypeCustomerOneShot o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SessionChargeResponsePaymentSource(SourceTypeToken o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("SourceTypeCard", new GenericType<SourceTypeCard>() {
        });
        schemas.put("SourceTypeCardOneShot", new GenericType<SourceTypeCardOneShot>() {
        });
        schemas.put("SourceTypeCustomer", new GenericType<SourceTypeCustomer>() {
        });
        schemas.put("SourceTypeCustomerOneShot", new GenericType<SourceTypeCustomerOneShot>() {
        });
        schemas.put("SourceTypeToken", new GenericType<SourceTypeToken>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return SessionChargeResponsePaymentSource.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * SourceTypeCard, SourceTypeCardOneShot, SourceTypeCustomer, SourceTypeCustomerOneShot, SourceTypeToken
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

        if (instance instanceof SourceTypeCardOneShot) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SourceTypeCustomer) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SourceTypeCustomerOneShot) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SourceTypeToken) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be SourceTypeCard, SourceTypeCardOneShot, SourceTypeCustomer, SourceTypeCustomerOneShot, SourceTypeToken");
    }

    /**
     * Get the actual instance, which can be the following:
     * SourceTypeCard, SourceTypeCardOneShot, SourceTypeCustomer, SourceTypeCustomerOneShot, SourceTypeToken
     *
     * @return The actual instance (SourceTypeCard, SourceTypeCardOneShot, SourceTypeCustomer, SourceTypeCustomerOneShot, SourceTypeToken)
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
     * Get the actual instance of `SourceTypeCardOneShot`. If the actual instance is not `SourceTypeCardOneShot`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SourceTypeCardOneShot`
     * @throws ClassCastException if the instance is not `SourceTypeCardOneShot`
     */
    public SourceTypeCardOneShot getSourceTypeCardOneShot() throws ClassCastException {
        return (SourceTypeCardOneShot)super.getActualInstance();
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
     * Get the actual instance of `SourceTypeCustomerOneShot`. If the actual instance is not `SourceTypeCustomerOneShot`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SourceTypeCustomerOneShot`
     * @throws ClassCastException if the instance is not `SourceTypeCustomerOneShot`
     */
    public SourceTypeCustomerOneShot getSourceTypeCustomerOneShot() throws ClassCastException {
        return (SourceTypeCustomerOneShot)super.getActualInstance();
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
  * @throws IOException if the JSON Object is invalid with respect to SessionChargeResponsePaymentSource
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
    // validate the json string with SourceTypeCardOneShot
    try {
      SourceTypeCardOneShot.validateJsonObject(jsonObj);
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
    // validate the json string with SourceTypeCustomerOneShot
    try {
      SourceTypeCustomerOneShot.validateJsonObject(jsonObj);
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
      throw new IOException(String.format("The JSON string is invalid for SessionChargeResponsePaymentSource with anyOf schemas: SourceTypeCard, SourceTypeCardOneShot, SourceTypeCustomer, SourceTypeCustomerOneShot, SourceTypeToken. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of SessionChargeResponsePaymentSource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SessionChargeResponsePaymentSource
  * @throws IOException if the JSON string is invalid with respect to SessionChargeResponsePaymentSource
  */
  public static SessionChargeResponsePaymentSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SessionChargeResponsePaymentSource.class);
  }

  public static Gson getGson() {
    return JSON.getGson();
  }

 /**
  * Convert an instance of SessionChargeResponsePaymentSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

