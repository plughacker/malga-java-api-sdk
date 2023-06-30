# Malga Java SDK

Malga’s API SDK.

- API version: 0.5
- SDK version: 0.1.0

For more information, refer to our [documentation](https://docs.malga.io/).

## Requirements

Using the API client library requires:

* [Malga test account](https://dashboard.malga.io/)
* [API key](https://docs.malga.io/docs/getting-started/credentials).
* Java 11 or higher
* Maven (3.8.3+)/Gradle (7.2+)

## Authentication

Malga’s API services are protected through access keys. You can manage your access keys through your dashboard.

It is important to store your keys privately and safely since they have modification privileges in your account. Do not share your keys, do not leave them fixed in your code, and do not store them on your version control server. We recommend using secret environment variables to make the key available to your application.

Authentication for all API calls is done through HTTP headers, requiring you to enter your Malga client identifier and secret access key.

## X-Client-ID

| Security Scheme Type | API Key |
|-----------------------|-----------|
| Header parameter name | `X-Client-ID` |

## X-Api-Key

| Security Scheme Type | API Key |
|-----------------------|-----------|
| Header parameter name | `X-Api-Key` |

## Installation

Add this dependency to your project's build file:

```
    <dependency>
        <groupId>io.malga</groupId>
        <artifactId>malga-java-api-sdk</artifactId>
        <version>0.1.0</version>
    </dependency>
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:

import io.malga.client.ApiClient;
import io.malga.client.ApiException;
import io.malga.client.Configuration;
import io.malga.client.models.charge.*;
import io.malga.client.service.charges.ChargesApi;

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

        PaymentMethodCard paymentMethodCard = (new PaymentMethodCard())
                .paymentType(PaymentMethodCard.PaymentTypeEnum.CREDIT)
                .installments(1);

        ChargeRequest chargeRequest(new ChargeRequest())
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

## Support

If you have a feature request, or spotted a bug or a technical problem, [create an issue here](https://github.com/plughacker/malga-java-api-sdk/issues/new/choose).

For other questions, contact our Support Team

## Licence

This repository is available under the [Apache 2 license](https://github.com/plughacker/malga-java-api-sdk/blob/main/LICENSE).