# Malga Java SDK

Malga’s API SDK.

- API version: 0.5
- Build date: 2023-06-20T10:56:56.342947-03:00[America/Sao_Paulo]

## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Authentication

Authentication schemes defined for the API:
### X-Client-ID

- **Type**: API key
- **API key parameter name**: X-Client-Id
- **Location**: HTTP header

### X-Api-Key

- **Type**: API key
- **API key parameter name**: X-Api-Key
- **Location**: HTTP header

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

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

