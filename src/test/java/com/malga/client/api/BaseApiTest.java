package com.malga.client.api;

import com.malga.client.ApiClient;
import com.malga.client.Configuration;
import com.malga.client.api.model.*;
import com.malga.client.auth.ApiKeyAuth;

public class BaseApiTest {

    /**
     * Returns a sample ChargeRequest object with full card data
     */
    protected ChargeRequest createCardChargeRequest(){
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

        return (new ChargeRequest())
                .capture(false)
                .statementDescriptor("should be statement descriptor")
                .merchantId(System.getenv("MERCHANT_ID"))
                .amount(1000)
                .orderId("1234567890")
                .paymentSource((new ChargeRequestPaymentSource(cardOneShot)))
                .paymentMethod((new ChargeRequestPaymentMethod(paymentMethodCard)));
    }

    protected ChargeRequest createCardChargeNotAuthorizedRequest(){
        SourceTypeCard cardOneShot = ((new SourceTypeCard())
                .sourceType("card")
                .card((new TokenRequest())
                        .cardExpirationDate("12/2025")
                        .cardHolderName("John Doe")
                        .cardNumber("5314764569829972")
                        .cardCvv("410")
                ));

        PaymentMethodCard paymentMethodCard =  (new PaymentMethodCard())
                .paymentType(PaymentMethodCard.PaymentTypeEnum.CREDIT)
                .installments(1);

        return (new ChargeRequest())
                .capture(false)
                .statementDescriptor("should be statement descriptor")
                .merchantId(System.getenv("MERCHANT_ID"))
                .amount(900)
                .orderId("1234567890")
                .paymentSource((new ChargeRequestPaymentSource(cardOneShot)))
                .paymentMethod((new ChargeRequestPaymentMethod(paymentMethodCard)));
    }

    protected ApiClient getDefaulClientApi(){
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox-api.malga.io");

        ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("X-Client-ID");
        clientID.setApiKey(System.getenv("CLIENT_ID"));

        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("X-Api-Key");
        apiKey.setApiKey(System.getenv("API_KEY"));

        return defaultClient;
    }
}
