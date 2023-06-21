/*
 * Documentação Malga API
 * # Authentication  Os serviços de API da Malga são protegidos através de chaves de acesso. Você pode gerenciar suas chaves de acesso através do seu dashboard.  É importante armazenar suas chaves de maneira privada e segura uma vez que elas possuem privilégios de alteração na sua conta. Não compartilhe suas chaves, não deixe elas fixadas no seu código e nem armazene elas no seu servidor de controle de versão. Recomendamos utilizar variáveis de ambiente secretas para deixar a chave disponível para sua aplicação.  A Autenticação para todos os chamadas da API é feita através de headers HTTP, sendo necessário informar seu identificador de cliente na Malga e a chave secreta de acesso.  ## X-Client-ID  Identificador única da sua conta na Malga. Deve ser enviado no header obrigatóriamente em todas as requisições feitas a API.  | Security Scheme Type | API Key | |-----------------------|-----------| | Header parameter name | `X-Client-ID` |  ## X-Api-Key  Sua chave de acesso a API. Funciona em par com o client-id devendo ser enviado no header obrigatóriamente em todas as requisições feitas a API.  | Security Scheme Type | API Key | |-----------------------|-----------| | Header parameter name | `X-Api-Key` |  ## Exemplo de requisicão autenticada  ```bash   curl --location --request GET 'https://api.malga.io/v1/' \\     --header 'X-Client-Id: <YOUR_CLIENT_ID>' \\     --header 'X-Api-Key: <YOUR_SECRET_KEY>' ``` 
 *
 * The version of the OpenAPI document: 0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.malga.client.api;

import com.malga.client.ApiClient;
import com.malga.client.ApiException;
import com.malga.client.Configuration;
import com.malga.client.api.model.*;
import com.malga.client.auth.ApiKeyAuth;
import org.junit.jupiter.api.Test;

/**
 * API tests for ChargesApi
 */
public class ChargesApiTest {

    /**
     * Returns a sample ChargeRequest object with full card data
     */
    protected ChargeRequest createCardChargeRequest() {
        SourceTypeCardOneShot cardOneShot = (new SourceTypeCardOneShot())
                .sourceType(SourceTypeCardOneShot.SourceTypeEnum.CARD)
                .card((new SourceTypeCardOneShotCard())
                        .cardExpirationDate("12/2025")
                        .cardHolderName("John Doe")
                        .cardNumber("4929564637987814")
                        .cardCvv("410")
                );

        PaymentMethodCard paymentMethodCard =  (new PaymentMethodCard())
                .paymentType(PaymentMethodCard.PaymentTypeEnum.CREDIT)
                .installments(1);

        return (new ChargeRequest())
                .capture(false)
                .statementDescriptor("should be statement descriptor")
                .merchantId("f18eb60d-89cc-419d-a7fc-204a6298421d")
                .amount(1000)
                .paymentSource((new ChargeRequestPaymentSource(cardOneShot)))
                .paymentMethod((new ChargeRequestPaymentMethod(paymentMethodCard)));
    }

    /**
     * Realizar nova cobrança
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void chargeTest() throws ApiException {

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox-api.malga.io");

        ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("X-Client-ID");
        clientID.setApiKey("523afbe7-36dc-4654-9dba-e7167d0e5e2d");

        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("X-Api-Key");
        apiKey.setApiKey("d6a2eeb2-46e3-4f5b-a468-3b526df23a51");

        ChargesApi chargesApi = new ChargesApi(defaultClient);

        ChargeRequest chargeRequest = createCardChargeRequest();
        ChargeResponse response = chargesApi.charge(chargeRequest);

    }

}
