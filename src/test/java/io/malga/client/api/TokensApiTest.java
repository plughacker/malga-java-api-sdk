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


package io.malga.client.api;

import io.malga.client.ApiException;
import io.malga.model.cards.TokenRequest;
import io.malga.model.cards.TokenResponse;
import io.malga.model.clienttoken.AuthRequest;
import io.malga.model.clienttoken.AuthResponse;
import io.malga.service.cards.TokensApi;
import io.malga.service.clienttoken.ClientTokenApi;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * API tests for TokensApi
 */
public class TokensApiTest extends BaseApiTest{

    /**
     * Create new card token
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTokenTest() throws ApiException {
        ClientTokenApi clientTokenApi = new ClientTokenApi(this.getDefaulClientApi());
        AuthRequest authRequest = ((new AuthRequest())
                .expires(3600)
                .scope(List.of(AuthRequest.ScopeEnum.TOKENS))
        );
        AuthResponse authResponse = clientTokenApi.createClientToken(authRequest);

        TokensApi tokenApi = new TokensApi(this.getDefaulClientApi(authResponse.getPublicKey()));

        TokenRequest tokenRequest = this.createTokenRequest();

        TokenResponse tokenResponse = tokenApi.createToken(tokenRequest);

        assertNotNull(tokenResponse.getTokenId());
    }

}
