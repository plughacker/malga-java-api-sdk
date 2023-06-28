package io.malga.client.api;

import io.malga.client.ApiClient;
import io.malga.client.Configuration;
import io.malga.client.auth.ApiKeyAuth;
import io.malga.model.cards.TokenRequest;
import io.malga.model.charges.*;
import io.malga.model.customers.CustomerRequest;
import io.malga.model.customers.CustomerRequestAddress;
import io.malga.model.customers.CustomerRequestDocument;

public class BaseApiTest {

    /**
     * Returns a sample ChargeRequest object with full card data
     */
    protected ChargeRequest createCardChargeRequest(){
        SourceTypeCardOneShot cardOneShot = ((new SourceTypeCardOneShot())
                .sourceType("card")
                .card((new SourceTypeCardOneShotCard())
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
    protected TokenRequest createTokenRequest(){
        return (new TokenRequest())
                .cardExpirationDate("12/2025")
                .cardHolderName("John Doe")
                .cardNumber("4929564637987814")
                .cardCvv("410");
    }

    protected ChargeRequest createPixChargeRequest(){
        SourceTypeCustomerOneShotCustomer customer = ((new SourceTypeCustomerOneShotCustomer())
                .address((new SourceTypeCustomerOneShotCustomerAddress())
                        .country("BR")
                        .city("Rio de Janeiro")
                        .complement("should be complement")
                        .district("Leblon")
                        .state("RJ")
                        .street("Rua A")
                        .streetNumber("123")
                        .zipCode("12345678")
                )
                .document((new SourceTypeCustomerOneShotCustomerDocument())
                        .country("BR")
                        .type("cpf")
                        .number("97055503019")
                )
                .email("shouldbe@email.com")
                .name("should be customer name")
                .phoneNumber("21999999999")
        );

        SourceTypeCustomerOneShot customerOneShot = ((new SourceTypeCustomerOneShot())
                .sourceType("customer")
                .customer(customer)
        );

        PaymentMethodPix paymentMethodPix =  (new PaymentMethodPix())
                .paymentType(PaymentMethodPix.PaymentTypeEnum.PIX)
                .expiresIn(3600);

        return (new ChargeRequest())
                .capture(false)
                .statementDescriptor("should be statement descriptor")
                .merchantId(System.getenv("MERCHANT_ID"))
                .amount(1000)
                .orderId("1234567890")
                .paymentSource((new ChargeRequestPaymentSource(customerOneShot)))
                .paymentMethod((new ChargeRequestPaymentMethod(paymentMethodPix)));
    }

    protected ChargeRequest createBoletoChargeRequest(){
        SourceTypeCustomerOneShotCustomer customer = ((new SourceTypeCustomerOneShotCustomer())
                .address((new SourceTypeCustomerOneShotCustomerAddress())
                        .country("BR")
                        .city("Rio de Janeiro")
                        .complement("should be complement")
                        .district("Leblon")
                        .state("RJ")
                        .street("Rua A")
                        .streetNumber("123")
                        .zipCode("12345678")
                )
                .document((new SourceTypeCustomerOneShotCustomerDocument())
                        .country("BR")
                        .type("cpf")
                        .number("97055503019")
                )
                .email("shouldbe@email.com")
                .name("should be customer name")
                .phoneNumber("21999999999")
        );

        SourceTypeCustomerOneShot customerOneShot = ((new SourceTypeCustomerOneShot())
                .sourceType("customer")
                .customer(customer)
        );

        PaymentMethodBoleto paymentMethodBoleto =  ((new PaymentMethodBoleto())
                .paymentType(PaymentMethodBoleto.PaymentTypeEnum.BOLETO)
                .expiresDate("2021-12-31")
                .instructions("should be instructions")
                .interest((new PaymentMethodBoletoInterest())
                        .amount(100)
                        .days(1))
                .fine((new PaymentMethodBoletoFine())
                        .amount(100)
                        .days(1)
                )
        );

        return (new ChargeRequest())
                .capture(false)
                .statementDescriptor("should be statement descriptor")
                .merchantId(System.getenv("MERCHANT_ID"))
                .amount(1000)
                .orderId("1234567890")
                .paymentSource((new ChargeRequestPaymentSource(customerOneShot)))
                .paymentMethod((new ChargeRequestPaymentMethod(paymentMethodBoleto)));
    }

    protected ChargeRequest createCardChargeNotAuthorizedRequest(){
        SourceTypeCardOneShot cardOneShot = ((new SourceTypeCardOneShot())
                .sourceType("card")
                .card((new SourceTypeCardOneShotCard())
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
        return this.getDefaulClientApi(System.getenv("CLIENT_ID"), System.getenv("API_KEY"));
    }

    protected ApiClient getDefaulClientApi(String apiKey){
        return this.getDefaulClientApi(System.getenv("CLIENT_ID"), apiKey);
    }

    protected ApiClient getDefaulClientApi(String clientID, String apiKey){
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox-api.malga.io");

        ApiKeyAuth authClientID = (ApiKeyAuth) defaultClient.getAuthentication("X-Client-ID");
        authClientID.setApiKey(clientID);

        ApiKeyAuth authApiKey = (ApiKeyAuth) defaultClient.getAuthentication("X-Api-Key");
        authApiKey.setApiKey(apiKey);

        return defaultClient;
    }

    protected CustomerRequest getCustomerRequest(){
        CustomerRequest customer = ((new CustomerRequest())
                .address((new CustomerRequestAddress())
                        .country("BR")
                        .city("Rio de Janeiro")
                        .complement("should be complement")
                        .district("Leblon")
                        .state("RJ")
                        .street("Rua A")
                        .streetNumber("123")
                        .zipCode("12345678")
                )
                .document((new CustomerRequestDocument())
                        .country("BR")
                        .type("cpf")
                        .number("97055503019")
                )
                .email("shouldbe@email.com")
                .name("should be customer name")
                .phoneNumber("21999999999")
        );
        return customer;
    }
}
