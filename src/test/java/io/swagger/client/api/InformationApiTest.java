/*
 * NeoLoad API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Error;
import io.swagger.client.model.InformationDefinition;
import io.swagger.client.model.RateLimitError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InformationApi
 */
@Ignore
public class InformationApiTest {

    private final InformationApi api = new InformationApi();

    /**
     * Lists information
     *
     * Returns relevant information regarding Neoload Web resources and version.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInformationTest() throws ApiException {
        InformationDefinition response = api.getInformation();

        // TODO: test validations
    }
}
