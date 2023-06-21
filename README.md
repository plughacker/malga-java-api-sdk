# Malga Java SDK

Malga’s API services are protected through access keys.

- API version: 0.5
  - Build date: 2023-06-20T10:56:56.342947-03:00[America/Sao_Paulo]

## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral() 
  }

  dependencies {
     implementation "org.malga:malga-java-api-sdk:0.5"
  }
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.malga.client.ApiClient;
import com.malga.client.ApiException;
import com.malga.client.Configuration;
import com.malga.client.auth.*;
import com.malga.client.models.*;
import com.malga.client.api.ChargesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.malga.io");

    // Configure API key authorization: X-Client-ID
    ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("X-Client-ID");
    clientID.setApiKey("YOUR CLIENT ID");

    // Configure API key authorization: X-Api-Key
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("X-Api-Key");
    apiKey.setApiKey("YOUR API KEY");

    ChargesApi chargesApi = new ChargesApi(defaultClient);

    ChargeRequest chargeRequest = createCardChargeRequest();
    ChargeResponse chargeResponse = chargesApi.charge(chargeRequest);

    SourceTypeCard cardOneShot = ((new SourceTypeCard())
            .sourceType("card")
            .card((new TokenRequest())
                    .cardExpirationDate("12/2025")
                    .cardHolderName("John Doe")
                    .cardNumber("4929564637987814")
                    .cardCvv("410")
            ));

    PaymentMethodCard paymentMethodCard =  (new PaymentMethodCard())
            .paymentType(PaymentMethodCard.PaymentTypeEnum.CREDIT)
            .installments(1);

    ChargeRequest chargeRequest (new ChargeRequest())
            .capture(false)
            .statementDescriptor("should be statement descriptor")
            .merchantId("YOUR MERCHANT ID")
            .amount(1000)
            .orderId("1234567890")
            .capture(false)
            .paymentSource((new ChargeRequestPaymentSource(cardOneShot)))
            .paymentMethod((new ChargeRequestPaymentMethod(paymentMethodCard)));
    
    ChargesApi chargesApi = new ChargesApi(defaultClient);

    try {
      ChargeResponse chargeResponse = chargesApi.charge(chargeRequest);
      System.out.println(chargeResponse);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#getCardById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```


## Documentation for API Endpoints

All URIs are relative to *https://api.malga.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CardsApi* | [**getCardById**](docs/CardsApi.md#getCardById) | **GET** /v1/cards/{id} | Get card details
*CardsApi* | [**getCards**](docs/CardsApi.md#getCards) | **GET** /v1/cards | List cards
*CardsApi* | [**saveCard**](docs/CardsApi.md#saveCard) | **POST** /v1/cards | Create a new card from card token
*ChargesApi* | [**captureCharge**](docs/ChargesApi.md#captureCharge) | **POST** /v1/charges/{id}/capture | Capture pre-authorized charge
*ChargesApi* | [**changeStatusTransaction**](docs/ChargesApi.md#changeStatusTransaction) | **POST** /v1/charges/{id} | Change the status of a charge in the sandbox environment
*ChargesApi* | [**charge**](docs/ChargesApi.md#charge) | **POST** /v1/charges | Create new charge
*ChargesApi* | [**getCharge**](docs/ChargesApi.md#getCharge) | **GET** /v1/charges | List charges
*ChargesApi* | [**getChargeByid**](docs/ChargesApi.md#getChargeByid) | **GET** /v1/charges/{id} | Get charge details
*ChargesApi* | [**refundCharge**](docs/ChargesApi.md#refundCharge) | **POST** /v1/charges/{id}/void | Refund authorized charge
*ClientTokenApi* | [**createAuthToken**](docs/ClientTokenApi.md#createAuthToken) | **POST** /v1/auth | Create public key for client-side integration
*CustomersApi* | [**createCustomer**](docs/CustomersApi.md#createCustomer) | **POST** /v1/customers | Create new customer
*CustomersApi* | [**deleteCustomer**](docs/CustomersApi.md#deleteCustomer) | **DELETE** /v1/customers/{id} | Delete customer
*CustomersApi* | [**getCustomer**](docs/CustomersApi.md#getCustomer) | **GET** /v1/customers/{id} | Get customer details
*CustomersApi* | [**getCustomerCards**](docs/CustomersApi.md#getCustomerCards) | **GET** /v1/customers/{customer_id}/cards | List customer cards
*CustomersApi* | [**linkCard**](docs/CustomersApi.md#linkCard) | **POST** /v1/customers/{customer_id}/cards | Add credit card to customers
*CustomersApi* | [**listCustomers**](docs/CustomersApi.md#listCustomers) | **GET** /v1/customers | List customers
*CustomersApi* | [**updateCustomer**](docs/CustomersApi.md#updateCustomer) | **PATCH** /v1/customers/{id} | Update customer
*MerchantsApi* | [**createMerchant**](docs/MerchantsApi.md#createMerchant) | **POST** /v1/merchants | Create new merchant
*MerchantsApi* | [**deleteMerchant**](docs/MerchantsApi.md#deleteMerchant) | **DELETE** /v1/merchants/{id} | Delete merchant
*MerchantsApi* | [**getMerchantById**](docs/MerchantsApi.md#getMerchantById) | **GET** /v1/merchants/{id} | Get merchant details
*MerchantsApi* | [**listMerchants**](docs/MerchantsApi.md#listMerchants) | **GET** /v1/merchants | List merchants
*SessionsApi* | [**cancelSession**](docs/SessionsApi.md#cancelSession) | **POST** /v1/sessions/{id}/cancel | Cancel session
*SessionsApi* | [**createSession**](docs/SessionsApi.md#createSession) | **POST** /v1/sessions | Create new session
*SessionsApi* | [**getSession**](docs/SessionsApi.md#getSession) | **GET** /v1/sessions/{id} | Get session details
*SessionsApi* | [**getSessionHistory**](docs/SessionsApi.md#getSessionHistory) | **GET** /v1/sessions/{id}/history | Recover session history
*SessionsApi* | [**getSessionWithSettings**](docs/SessionsApi.md#getSessionWithSettings) | **GET** /v1/sessions/{id}/link | Recover session with company settings
*SessionsApi* | [**patchSession**](docs/SessionsApi.md#patchSession) | **PATCH** /v1/sessions/{id} | Update session status
*TokensApi* | [**createToken**](docs/TokensApi.md#createToken) | **POST** /v1/tokens | Create new card token
*WebhooksApi* | [**createWebhook**](docs/WebhooksApi.md#createWebhook) | **POST** /v1/webhooks | Create new webhook
*WebhooksApi* | [**deleteWebhook**](docs/WebhooksApi.md#deleteWebhook) | **DELETE** /v1/webhooks/{id} | Delete webhook
*WebhooksApi* | [**getWebhook**](docs/WebhooksApi.md#getWebhook) | **GET** /v1/webhooks/{id} | Get webhook details
*WebhooksApi* | [**listWebhooks**](docs/WebhooksApi.md#listWebhooks) | **GET** /v1/webhooks | List webhooks
*WebhooksApi* | [**updateWebhook**](docs/WebhooksApi.md#updateWebhook) | **PATCH** /v1/webhooks/{id} | Update webhook


## Documentation for Models

- [Address](docs/Address.md)
- [AuthRequest](docs/AuthRequest.md)
- [AuthResponse](docs/AuthResponse.md)
- [CancelSessionResponse](docs/CancelSessionResponse.md)
- [CaptureRequest](docs/CaptureRequest.md)
- [CardList](docs/CardList.md)
- [CardRequest](docs/CardRequest.md)
- [CardResponse](docs/CardResponse.md)
- [CardResponseCustomer](docs/CardResponseCustomer.md)
- [ChargeList](docs/ChargeList.md)
- [ChargeRequest](docs/ChargeRequest.md)
- [ChargeRequestFraudAnalysis](docs/ChargeRequestFraudAnalysis.md)
- [ChargeRequestPaymentMethod](docs/ChargeRequestPaymentMethod.md)
- [ChargeRequestPaymentSource](docs/ChargeRequestPaymentSource.md)
- [ChargeResponse](docs/ChargeResponse.md)
- [ChargeResponseFraudAnalysisMetadata](docs/ChargeResponseFraudAnalysisMetadata.md)
- [ChargeResponsePaymentMethod](docs/ChargeResponsePaymentMethod.md)
- [ClearsaleOptions](docs/ClearsaleOptions.md)
- [CredentialAdyen](docs/CredentialAdyen.md)
- [CredentialBB](docs/CredentialBB.md)
- [CredentialBS2](docs/CredentialBS2.md)
- [CredentialBS2BOLETO](docs/CredentialBS2BOLETO.md)
- [CredentialBraintree](docs/CredentialBraintree.md)
- [CredentialBraspag](docs/CredentialBraspag.md)
- [CredentialCielo](docs/CredentialCielo.md)
- [CredentialClearsale](docs/CredentialClearsale.md)
- [CredentialGetnet](docs/CredentialGetnet.md)
- [CredentialKlap](docs/CredentialKlap.md)
- [CredentialMercadoPago](docs/CredentialMercadoPago.md)
- [CredentialNuPay](docs/CredentialNuPay.md)
- [CredentialPagSeguro](docs/CredentialPagSeguro.md)
- [CredentialPagarme](docs/CredentialPagarme.md)
- [CredentialRede](docs/CredentialRede.md)
- [CredentialStripe](docs/CredentialStripe.md)
- [CredentialZoop](docs/CredentialZoop.md)
- [CustomerCardList](docs/CustomerCardList.md)
- [CustomerList](docs/CustomerList.md)
- [CustomerRequest](docs/CustomerRequest.md)
- [CustomerResponse](docs/CustomerResponse.md)
- [CustomerResponseAddress](docs/CustomerResponseAddress.md)
- [CustomerResponseDocument](docs/CustomerResponseDocument.md)
- [Document](docs/Document.md)
- [ErrorItem](docs/ErrorItem.md)
- [ErrorMessageResponse](docs/ErrorMessageResponse.md)
- [ErrorResponse](docs/ErrorResponse.md)
- [ErrorResponseError](docs/ErrorResponseError.md)
- [Event](docs/Event.md)
- [FraudAnalysisAddress](docs/FraudAnalysisAddress.md)
- [FraudAnalysisCustomerBrowser](docs/FraudAnalysisCustomerBrowser.md)
- [FraudAnalysisMetadata](docs/FraudAnalysisMetadata.md)
- [FraudAnalysisMetadataCustomer](docs/FraudAnalysisMetadataCustomer.md)
- [FraudAnalysisMetadataCustomerBillingAddress](docs/FraudAnalysisMetadataCustomerBillingAddress.md)
- [FraudAnalysisMetadataCustomerDeliveryAddress](docs/FraudAnalysisMetadataCustomerDeliveryAddress.md)
- [FraudAnalysisRequest](docs/FraudAnalysisRequest.md)
- [FraudAnalysisRequestCart](docs/FraudAnalysisRequestCart.md)
- [FraudAnalysisRequestCartItemsInner](docs/FraudAnalysisRequestCartItemsInner.md)
- [FraudAnalysisRequestCustomer](docs/FraudAnalysisRequestCustomer.md)
- [FraudAnalysisRequestCustomerBillingAddress](docs/FraudAnalysisRequestCustomerBillingAddress.md)
- [FraudAnalysisRequestCustomerBrowser](docs/FraudAnalysisRequestCustomerBrowser.md)
- [FraudAnalysisRequestCustomerDeliveryAddress](docs/FraudAnalysisRequestCustomerDeliveryAddress.md)
- [FraudAnalysisRequestDevice](docs/FraudAnalysisRequestDevice.md)
- [FraudAnalysisRequestDeviceOs](docs/FraudAnalysisRequestDeviceOs.md)
- [FraudAnalysisRequestDeviceVendorAttributes](docs/FraudAnalysisRequestDeviceVendorAttributes.md)
- [FraudAnalysisRequestDeviceVendorsInner](docs/FraudAnalysisRequestDeviceVendorsInner.md)
- [LinkCardRequest](docs/LinkCardRequest.md)
- [MerchantList](docs/MerchantList.md)
- [MerchantRequest](docs/MerchantRequest.md)
- [MerchantResponse](docs/MerchantResponse.md)
- [MetaPagination](docs/MetaPagination.md)
- [NuPayOptions](docs/NuPayOptions.md)
- [PaymentMethodBoleto](docs/PaymentMethodBoleto.md)
- [PaymentMethodBoletoFine](docs/PaymentMethodBoletoFine.md)
- [PaymentMethodBoletoInterest](docs/PaymentMethodBoletoInterest.md)
- [PaymentMethodBoletoResponse](docs/PaymentMethodBoletoResponse.md)
- [PaymentMethodCard](docs/PaymentMethodCard.md)
- [PaymentMethodPix](docs/PaymentMethodPix.md)
- [PaymentMethodPixResponse](docs/PaymentMethodPixResponse.md)
- [ProviderRequest](docs/ProviderRequest.md)
- [ProviderRequestCredentials](docs/ProviderRequestCredentials.md)
- [ProviderRequestOptions](docs/ProviderRequestOptions.md)
- [SessionHistoryItem](docs/SessionHistoryItem.md)
- [SessionItemObject](docs/SessionItemObject.md)
- [SessionPaymentMethodBoleto](docs/SessionPaymentMethodBoleto.md)
- [SessionPaymentMethodBoletoResponse](docs/SessionPaymentMethodBoletoResponse.md)
- [SessionPaymentMethodCard](docs/SessionPaymentMethodCard.md)
- [SessionPaymentMethodPix](docs/SessionPaymentMethodPix.md)
- [SessionPaymentMethodPixResponse](docs/SessionPaymentMethodPixResponse.md)
- [SessionRequest](docs/SessionRequest.md)
- [SessionRequestPaymentMethods](docs/SessionRequestPaymentMethods.md)
- [SessionResponse](docs/SessionResponse.md)
- [SessionResponsePaymentMethods](docs/SessionResponsePaymentMethods.md)
- [SessionSettingsResponse](docs/SessionSettingsResponse.md)
- [SourceTypeCard](docs/SourceTypeCard.md)
- [SourceTypeCustomer](docs/SourceTypeCustomer.md)
- [SourceTypeToken](docs/SourceTypeToken.md)
- [SplitRulesFaresSchema](docs/SplitRulesFaresSchema.md)
- [SplitRulesInner](docs/SplitRulesInner.md)
- [TokenRequest](docs/TokenRequest.md)
- [TokenResponse](docs/TokenResponse.md)
- [TransactionRequest](docs/TransactionRequest.md)
- [TransactionRequestProviderAuthorization](docs/TransactionRequestProviderAuthorization.md)
- [TransactionRequestProviderError](docs/TransactionRequestProviderError.md)
- [UpdateChargeStatusRequest](docs/UpdateChargeStatusRequest.md)
- [UpdateCustomerRequest](docs/UpdateCustomerRequest.md)
- [UpdateSessionResponse](docs/UpdateSessionResponse.md)
- [UserSettings](docs/UserSettings.md)
- [ValidationResponse](docs/ValidationResponse.md)
- [ValidationResponseDetail](docs/ValidationResponseDetail.md)
- [VoidRequest](docs/VoidRequest.md)
- [WebhookList](docs/WebhookList.md)
- [WebhookRequest](docs/WebhookRequest.md)
- [WebhookResponse](docs/WebhookResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### X-Client-ID

- **Type**: API key
- **API key parameter name**: X-Client-Id
- **Location**: HTTP header

### X-Api-Key

- **Type**: API key
- **API key parameter name**: X-Api-Key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

