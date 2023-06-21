# Malga Java SDK

Documentação Malga API
- API version: 0.5
  - Build date: 2023-06-20T10:56:56.342947-03:00[America/Sao_Paulo]

# Authentication

Os serviços de API da Malga são protegidos através de chaves de acesso. Você pode gerenciar suas chaves de acesso através do seu dashboard.

É importante armazenar suas chaves de maneira privada e segura uma vez que elas possuem privilégios de alteração na sua conta. Não compartilhe suas chaves, não deixe elas fixadas no seu código e nem armazene elas no seu servidor de controle de versão. Recomendamos utilizar variáveis de ambiente secretas para deixar a chave disponível para sua aplicação.

A Autenticação para todos os chamadas da API é feita através de headers HTTP, sendo necessário informar seu identificador de cliente na Malga e a chave secreta de acesso.

## X-Client-ID

Identificador única da sua conta na Malga. Deve ser enviado no header obrigatóriamente em todas as requisições feitas a API.

| Security Scheme Type | API Key |
|-----------------------|-----------|
| Header parameter name | `X-Client-ID` |

## X-Api-Key

Sua chave de acesso a API. Funciona em par com o client-id devendo ser enviado no header obrigatóriamente em todas as requisições feitas a API.

| Security Scheme Type | API Key |
|-----------------------|-----------|
| Header parameter name | `X-Api-Key` |

## Exemplo de requisicão autenticada

```bash
  curl --location --request GET 'https://api.malga.io/v1/' \\
    --header 'X-Client-Id: <YOUR_CLIENT_ID>' \\
    --header 'X-Api-Key: <YOUR_SECRET_KEY>'
```

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
import com.malga.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.malga.io");
    
    // Configure API key authorization: X-Client-ID
    ApiKeyAuth X-Client-ID = (ApiKeyAuth) defaultClient.getAuthentication("X-Client-ID");
    X-Client-ID.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Client-ID.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Api-Key
    ApiKeyAuth X-Api-Key = (ApiKeyAuth) defaultClient.getAuthentication("X-Api-Key");
    X-Api-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Api-Key.setApiKeyPrefix("Token");

    CardsApi apiInstance = new CardsApi(defaultClient);
    Object id = null; // Object | ID do cartão
    try {
      Card result = apiInstance.getCardById(id);
      System.out.println(result);
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
