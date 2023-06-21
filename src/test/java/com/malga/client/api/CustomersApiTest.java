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


package com.malga.client.api;

import com.malga.client.ApiException;
import com.malga.client.api.model.CustomerCardList;
import com.malga.client.api.model.CustomerList;
import com.malga.client.api.model.CustomerRequest;
import com.malga.client.api.model.CustomerResponse;
import com.malga.client.api.model.ErrorResponse;
import com.malga.client.api.model.LinkCardRequest;
import com.malga.client.api.model.UpdateCustomerRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomersApi
 */
@Disabled
public class CustomersApiTest {

    private final CustomersApi api = new CustomersApi();

    /**
     * Create new customer
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCustomerTest() throws ApiException {
        CustomerRequest customerRequest = null;
        api.createCustomer(customerRequest);
        // TODO: test validations
    }

    /**
     * Delete customer
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCustomerTest() throws ApiException {
        String id = null;
        api.deleteCustomer(id);
        // TODO: test validations
    }

    /**
     * Get customer details
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomerTest() throws ApiException {
        String id = null;
        CustomerResponse response = api.getCustomer(id);
        // TODO: test validations
    }

    /**
     * List customer cards
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomerCardsTest() throws ApiException {
        String customerId = null;
        CustomerCardList response = api.getCustomerCards(customerId);
        // TODO: test validations
    }

    /**
     * Add credit card to customers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void linkCardTest() throws ApiException {
        String customerId = null;
        LinkCardRequest linkCardRequest = null;
        api.linkCard(customerId, linkCardRequest);
        // TODO: test validations
    }

    /**
     * List customers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCustomersTest() throws ApiException {
        String page = null;
        String limit = null;
        String sort = null;
        String id = null;
        String documentType = null;
        String documentNumber = null;
        CustomerList response = api.listCustomers(page, limit, sort, id, documentType, documentNumber);
        // TODO: test validations
    }

    /**
     * Update customer
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCustomerTest() throws ApiException {
        String id = null;
        UpdateCustomerRequest updateCustomerRequest = null;
        api.updateCustomer(id, updateCustomerRequest);
        // TODO: test validations
    }

}
