/*
 * NeoLoad API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
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
import java.io.File;
import io.swagger.client.model.ProjectDefinition;
import io.swagger.client.model.RateLimitError;
import io.swagger.client.model.RunTestDefinition;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RuntimeApi {
    private ApiClient apiClient;

    public RuntimeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RuntimeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getTestsRun
     * @param name The name of the test (required)
     * @param projectId The project Id of the test (required)
     * @param scenarioName The scenario name of the test (required)
     * @param description The description of the test (optional)
     * @param asCode The comma-separated as-code files to use for the test. Those files must be part of the uploaded project. (optional)
     * @param reservationId The reservation identifier to use for the test that can be retrieved from the NeoLoad Web reservation calendar URL. If the reservation mode is enabled and \&quot;reservationId\&quot; value is defined, \&quot;reservationDuration\&quot;, \&quot;reservationWebVUs\&quot; and \&quot;reservationSAPVUs\&quot; values will be ignored, otherwise if the reservation mode is disabled the value will be ignored. (optional)
     * @param reservationDuration The duration of the reservation for the test. If the reservation mode is enabled, this value or \&quot;reservationDuration\&quot;, \&quot;reservationWebVUs\&quot;, \&quot;reservationSAPVUs\&quot; must be defined, otherwise if the reservation mode is disabled the value will be ignored. The value (in seconds) is optional when the reservation mode is enabled and ignored when reservationId value is defined or if the reservation mode is disabled. The default value is the selected scenario duration + 1200 seconds (20 minutes). All reserved resources will be released when the test ends. (optional)
     * @param reservationWebVUs The number of Web Virtual Users to be reserved for the test. The value is optional when the reservation mode is enabled and ignored when \&quot;reservationId\&quot; value is defined or if the reservation mode is disabled. (optional)
     * @param reservationSAPVUs The number of SAP Virtual Users to be reserved for the test. The value is optional when the reservation mode is enabled and ignored when \&quot;reservationId\&quot; value is defined or if the reservation mode is disabled. (optional)
     * @param controllerZoneId The controller zone Id. If empty, the default zone will be used. (optional)
     * @param lgZones The LG zones with the number of the LGs. Example: \&quot;ZoneId1:10,ZoneId2:5\&quot;. If empty, the default zone will be used with one LG. (optional)
     * @param publishTestResult When \&quot;true\&quot; and the project is an collaborative project (other than git) then the test result is published onto the server. If empty, the default value is \&quot;false\&quot;. (optional)
     * @param deleteProjectAfterTest When \&quot;true\&quot; deletes associated test as soon as test result is created. If empty, the default value is \&quot;false\&quot;. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTestsRunCall(String name, String projectId, String scenarioName, String description, String asCode, String reservationId, Long reservationDuration, Integer reservationWebVUs, Integer reservationSAPVUs, String controllerZoneId, String lgZones, Boolean publishTestResult, Boolean deleteProjectAfterTest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/projects/{projectId}/run"
            .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
        if (description != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("description", description));
        if (asCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("asCode", asCode));
        if (scenarioName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("scenarioName", scenarioName));
        if (reservationId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("reservationId", reservationId));
        if (reservationDuration != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("reservationDuration", reservationDuration));
        if (reservationWebVUs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("reservationWebVUs", reservationWebVUs));
        if (reservationSAPVUs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("reservationSAPVUs", reservationSAPVUs));
        if (controllerZoneId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("controllerZoneId", controllerZoneId));
        if (lgZones != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("lgZones", lgZones));
        if (publishTestResult != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("publishTestResult", publishTestResult));
        if (deleteProjectAfterTest != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("deleteProjectAfterTest", deleteProjectAfterTest));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTestsRunValidateBeforeCall(String name, String projectId, String scenarioName, String description, String asCode, String reservationId, Long reservationDuration, Integer reservationWebVUs, Integer reservationSAPVUs, String controllerZoneId, String lgZones, Boolean publishTestResult, Boolean deleteProjectAfterTest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getTestsRun(Async)");
        }
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling getTestsRun(Async)");
        }
        // verify the required parameter 'scenarioName' is set
        if (scenarioName == null) {
            throw new ApiException("Missing the required parameter 'scenarioName' when calling getTestsRun(Async)");
        }
        
        com.squareup.okhttp.Call call = getTestsRunCall(name, projectId, scenarioName, description, asCode, reservationId, reservationDuration, reservationWebVUs, reservationSAPVUs, controllerZoneId, lgZones, publishTestResult, deleteProjectAfterTest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Runs a test
     * Runs a test of the Account according to the method parameters.
     * @param name The name of the test (required)
     * @param projectId The project Id of the test (required)
     * @param scenarioName The scenario name of the test (required)
     * @param description The description of the test (optional)
     * @param asCode The comma-separated as-code files to use for the test. Those files must be part of the uploaded project. (optional)
     * @param reservationId The reservation identifier to use for the test that can be retrieved from the NeoLoad Web reservation calendar URL. If the reservation mode is enabled and \&quot;reservationId\&quot; value is defined, \&quot;reservationDuration\&quot;, \&quot;reservationWebVUs\&quot; and \&quot;reservationSAPVUs\&quot; values will be ignored, otherwise if the reservation mode is disabled the value will be ignored. (optional)
     * @param reservationDuration The duration of the reservation for the test. If the reservation mode is enabled, this value or \&quot;reservationDuration\&quot;, \&quot;reservationWebVUs\&quot;, \&quot;reservationSAPVUs\&quot; must be defined, otherwise if the reservation mode is disabled the value will be ignored. The value (in seconds) is optional when the reservation mode is enabled and ignored when reservationId value is defined or if the reservation mode is disabled. The default value is the selected scenario duration + 1200 seconds (20 minutes). All reserved resources will be released when the test ends. (optional)
     * @param reservationWebVUs The number of Web Virtual Users to be reserved for the test. The value is optional when the reservation mode is enabled and ignored when \&quot;reservationId\&quot; value is defined or if the reservation mode is disabled. (optional)
     * @param reservationSAPVUs The number of SAP Virtual Users to be reserved for the test. The value is optional when the reservation mode is enabled and ignored when \&quot;reservationId\&quot; value is defined or if the reservation mode is disabled. (optional)
     * @param controllerZoneId The controller zone Id. If empty, the default zone will be used. (optional)
     * @param lgZones The LG zones with the number of the LGs. Example: \&quot;ZoneId1:10,ZoneId2:5\&quot;. If empty, the default zone will be used with one LG. (optional)
     * @param publishTestResult When \&quot;true\&quot; and the project is an collaborative project (other than git) then the test result is published onto the server. If empty, the default value is \&quot;false\&quot;. (optional)
     * @param deleteProjectAfterTest When \&quot;true\&quot; deletes associated test as soon as test result is created. If empty, the default value is \&quot;false\&quot;. (optional)
     * @return RunTestDefinition
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RunTestDefinition getTestsRun(String name, String projectId, String scenarioName, String description, String asCode, String reservationId, Long reservationDuration, Integer reservationWebVUs, Integer reservationSAPVUs, String controllerZoneId, String lgZones, Boolean publishTestResult, Boolean deleteProjectAfterTest) throws ApiException {
        ApiResponse<RunTestDefinition> resp = getTestsRunWithHttpInfo(name, projectId, scenarioName, description, asCode, reservationId, reservationDuration, reservationWebVUs, reservationSAPVUs, controllerZoneId, lgZones, publishTestResult, deleteProjectAfterTest);
        return resp.getData();
    }

    /**
     * Runs a test
     * Runs a test of the Account according to the method parameters.
     * @param name The name of the test (required)
     * @param projectId The project Id of the test (required)
     * @param scenarioName The scenario name of the test (required)
     * @param description The description of the test (optional)
     * @param asCode The comma-separated as-code files to use for the test. Those files must be part of the uploaded project. (optional)
     * @param reservationId The reservation identifier to use for the test that can be retrieved from the NeoLoad Web reservation calendar URL. If the reservation mode is enabled and \&quot;reservationId\&quot; value is defined, \&quot;reservationDuration\&quot;, \&quot;reservationWebVUs\&quot; and \&quot;reservationSAPVUs\&quot; values will be ignored, otherwise if the reservation mode is disabled the value will be ignored. (optional)
     * @param reservationDuration The duration of the reservation for the test. If the reservation mode is enabled, this value or \&quot;reservationDuration\&quot;, \&quot;reservationWebVUs\&quot;, \&quot;reservationSAPVUs\&quot; must be defined, otherwise if the reservation mode is disabled the value will be ignored. The value (in seconds) is optional when the reservation mode is enabled and ignored when reservationId value is defined or if the reservation mode is disabled. The default value is the selected scenario duration + 1200 seconds (20 minutes). All reserved resources will be released when the test ends. (optional)
     * @param reservationWebVUs The number of Web Virtual Users to be reserved for the test. The value is optional when the reservation mode is enabled and ignored when \&quot;reservationId\&quot; value is defined or if the reservation mode is disabled. (optional)
     * @param reservationSAPVUs The number of SAP Virtual Users to be reserved for the test. The value is optional when the reservation mode is enabled and ignored when \&quot;reservationId\&quot; value is defined or if the reservation mode is disabled. (optional)
     * @param controllerZoneId The controller zone Id. If empty, the default zone will be used. (optional)
     * @param lgZones The LG zones with the number of the LGs. Example: \&quot;ZoneId1:10,ZoneId2:5\&quot;. If empty, the default zone will be used with one LG. (optional)
     * @param publishTestResult When \&quot;true\&quot; and the project is an collaborative project (other than git) then the test result is published onto the server. If empty, the default value is \&quot;false\&quot;. (optional)
     * @param deleteProjectAfterTest When \&quot;true\&quot; deletes associated test as soon as test result is created. If empty, the default value is \&quot;false\&quot;. (optional)
     * @return ApiResponse&lt;RunTestDefinition&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RunTestDefinition> getTestsRunWithHttpInfo(String name, String projectId, String scenarioName, String description, String asCode, String reservationId, Long reservationDuration, Integer reservationWebVUs, Integer reservationSAPVUs, String controllerZoneId, String lgZones, Boolean publishTestResult, Boolean deleteProjectAfterTest) throws ApiException {
        com.squareup.okhttp.Call call = getTestsRunValidateBeforeCall(name, projectId, scenarioName, description, asCode, reservationId, reservationDuration, reservationWebVUs, reservationSAPVUs, controllerZoneId, lgZones, publishTestResult, deleteProjectAfterTest, null, null);
        Type localVarReturnType = new TypeToken<RunTestDefinition>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Runs a test (asynchronously)
     * Runs a test of the Account according to the method parameters.
     * @param name The name of the test (required)
     * @param projectId The project Id of the test (required)
     * @param scenarioName The scenario name of the test (required)
     * @param description The description of the test (optional)
     * @param asCode The comma-separated as-code files to use for the test. Those files must be part of the uploaded project. (optional)
     * @param reservationId The reservation identifier to use for the test that can be retrieved from the NeoLoad Web reservation calendar URL. If the reservation mode is enabled and \&quot;reservationId\&quot; value is defined, \&quot;reservationDuration\&quot;, \&quot;reservationWebVUs\&quot; and \&quot;reservationSAPVUs\&quot; values will be ignored, otherwise if the reservation mode is disabled the value will be ignored. (optional)
     * @param reservationDuration The duration of the reservation for the test. If the reservation mode is enabled, this value or \&quot;reservationDuration\&quot;, \&quot;reservationWebVUs\&quot;, \&quot;reservationSAPVUs\&quot; must be defined, otherwise if the reservation mode is disabled the value will be ignored. The value (in seconds) is optional when the reservation mode is enabled and ignored when reservationId value is defined or if the reservation mode is disabled. The default value is the selected scenario duration + 1200 seconds (20 minutes). All reserved resources will be released when the test ends. (optional)
     * @param reservationWebVUs The number of Web Virtual Users to be reserved for the test. The value is optional when the reservation mode is enabled and ignored when \&quot;reservationId\&quot; value is defined or if the reservation mode is disabled. (optional)
     * @param reservationSAPVUs The number of SAP Virtual Users to be reserved for the test. The value is optional when the reservation mode is enabled and ignored when \&quot;reservationId\&quot; value is defined or if the reservation mode is disabled. (optional)
     * @param controllerZoneId The controller zone Id. If empty, the default zone will be used. (optional)
     * @param lgZones The LG zones with the number of the LGs. Example: \&quot;ZoneId1:10,ZoneId2:5\&quot;. If empty, the default zone will be used with one LG. (optional)
     * @param publishTestResult When \&quot;true\&quot; and the project is an collaborative project (other than git) then the test result is published onto the server. If empty, the default value is \&quot;false\&quot;. (optional)
     * @param deleteProjectAfterTest When \&quot;true\&quot; deletes associated test as soon as test result is created. If empty, the default value is \&quot;false\&quot;. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTestsRunAsync(String name, String projectId, String scenarioName, String description, String asCode, String reservationId, Long reservationDuration, Integer reservationWebVUs, Integer reservationSAPVUs, String controllerZoneId, String lgZones, Boolean publishTestResult, Boolean deleteProjectAfterTest, final ApiCallback<RunTestDefinition> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTestsRunValidateBeforeCall(name, projectId, scenarioName, description, asCode, reservationId, reservationDuration, reservationWebVUs, reservationSAPVUs, controllerZoneId, lgZones, publishTestResult, deleteProjectAfterTest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RunTestDefinition>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postUploadProject
     * @param file  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUploadProjectCall(File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/projects";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null)
        localVarFormParams.put("file", file);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postUploadProjectValidateBeforeCall(File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling postUploadProject(Async)");
        }
        
        com.squareup.okhttp.Call call = postUploadProjectCall(file, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Uploads a NeoLoad project zip file or a standalone as code file
     * Uploads a NeoLoad project of the account corresponding to the parameters. The maximum size file is 250 MB
     * @param file  (required)
     * @return ProjectDefinition
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProjectDefinition postUploadProject(File file) throws ApiException {
        ApiResponse<ProjectDefinition> resp = postUploadProjectWithHttpInfo(file);
        return resp.getData();
    }

    /**
     * Uploads a NeoLoad project zip file or a standalone as code file
     * Uploads a NeoLoad project of the account corresponding to the parameters. The maximum size file is 250 MB
     * @param file  (required)
     * @return ApiResponse&lt;ProjectDefinition&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProjectDefinition> postUploadProjectWithHttpInfo(File file) throws ApiException {
        com.squareup.okhttp.Call call = postUploadProjectValidateBeforeCall(file, null, null);
        Type localVarReturnType = new TypeToken<ProjectDefinition>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Uploads a NeoLoad project zip file or a standalone as code file (asynchronously)
     * Uploads a NeoLoad project of the account corresponding to the parameters. The maximum size file is 250 MB
     * @param file  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUploadProjectAsync(File file, final ApiCallback<ProjectDefinition> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUploadProjectValidateBeforeCall(file, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProjectDefinition>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
