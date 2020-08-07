/**
 * 
 */
package io.swagger.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * @author frodriguez
 *
 * @since 12/06/2020
 */
public class ConfigurationTest {

	public final static String BASE_PATH = "/v3";
	public final static String TOKEN = "";

	public static void initTestApiClient() {
		ApiClient testApiClient = new ApiClient();
		testApiClient.setBasePath(BASE_PATH);
//		testApiClient.setApiKey(TOKEN);
		Configuration.setDefaultApiClient(testApiClient);
	}
	
	@Test
	public void initTestApiClient_shouldCorrectlySetTheTestApiClient() {
		initTestApiClient();
		
		assertNotNull(Configuration.getDefaultApiClient());
		
		assertNotNull(Configuration.getDefaultApiClient().getBasePath());
		assertEquals(BASE_PATH, Configuration.getDefaultApiClient().getBasePath());
	}
}
