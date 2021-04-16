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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Error;
import io.swagger.client.model.RateLimitError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdministrationOfUsersApi {
    private ApiClient apiClient;

    public AdministrationOfUsersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AdministrationOfUsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for delete1
     * @param login  (required)
     * @param removeFromNeotysSaaSAccount SaaS Account-Admin-only option: Remove the user from your Account on the Neotys user platform (optional, default to false)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call delete1Call(String login, Boolean removeFromNeotysSaaSAccount, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v3/users/{login}"
            .replaceAll("\\{" + "login" + "\\}", apiClient.escapeString(login.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (removeFromNeotysSaaSAccount != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("removeFromNeotysSaaSAccount", removeFromNeotysSaaSAccount));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "NeoloadAuthorizer" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call delete1ValidateBeforeCall(String login, Boolean removeFromNeotysSaaSAccount, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'login' is set
        if (login == null) {
            throw new ApiException("Missing the required parameter 'login' when calling delete1(Async)");
        }
        
        com.squareup.okhttp.Call call = delete1Call(login, removeFromNeotysSaaSAccount, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete a user
     * Delete a user with the specified login
     * @param login  (required)
     * @param removeFromNeotysSaaSAccount SaaS Account-Admin-only option: Remove the user from your Account on the Neotys user platform (optional, default to false)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void delete1(String login, Boolean removeFromNeotysSaaSAccount) throws ApiException {
        delete1WithHttpInfo(login, removeFromNeotysSaaSAccount);
    }

    /**
     * Delete a user
     * Delete a user with the specified login
     * @param login  (required)
     * @param removeFromNeotysSaaSAccount SaaS Account-Admin-only option: Remove the user from your Account on the Neotys user platform (optional, default to false)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> delete1WithHttpInfo(String login, Boolean removeFromNeotysSaaSAccount) throws ApiException {
        com.squareup.okhttp.Call call = delete1ValidateBeforeCall(login, removeFromNeotysSaaSAccount, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a user (asynchronously)
     * Delete a user with the specified login
     * @param login  (required)
     * @param removeFromNeotysSaaSAccount SaaS Account-Admin-only option: Remove the user from your Account on the Neotys user platform (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call delete1Async(String login, Boolean removeFromNeotysSaaSAccount, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = delete1ValidateBeforeCall(login, removeFromNeotysSaaSAccount, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}