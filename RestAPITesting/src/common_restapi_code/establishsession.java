/**
 * 
 */
package common_restapi_code;

import java.io.InputStream;

import java.io.StringWriter;

import org.json.JSONException;
import org.json.JSONObject;

import org.junit.Assert;

/**
 * @author kmaheshw
 *
 */
public class establishsession {

	public String createSession(String serverAddress, String email, String password) {
		try {
			InputStream[] stream = createSessionParams(serverAddress, email, password);
			JSONObject jsonObject;
			if (stream != null) {
				jsonObject = restrequest.getJsonObject(stream[0]);
				String status = (String) jsonObject.get("status");
				org.junit.Assert.assertEquals("Status should not be failure", "SUCCESS", status.trim());
				String sessionID = (String) jsonObject.get("sessionID");
				return sessionID;
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return null;
	}

	private static String createSessionFail(String serverAddress, String email, String password) {
		try {
			InputStream[] stream = createSessionParams(serverAddress, email, password);
			JSONObject jsonObject;
			if (stream != null) {
				jsonObject = restrequest.getJsonObject(stream[0]);
				String status = (String) jsonObject.get("status");
				Assert.assertEquals("Status should not be failure", "FAILURE", status.trim());
				String reason = (String) jsonObject.get("reason");
				return reason;
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return null;
	}

	protected static InputStream[] createSessionParams(String serverAddress, String email, String password)
			throws JSONException {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("email", email);
		jsonObject.put("password", password);
		StringWriter writer = new StringWriter();
		jsonObject.write(writer);
		return restrequest.restRequest(serverAddress + "/portal/establish-api-session", "POST", "application/json",
				"application/json", writer.toString());
	}

	protected static String logoutSession(String serverAddress, String sessionID) {
		try {
			StringWriter writer = LockDevice.createLockDeviceParams(sessionID);
			InputStream stream[] = restrequest.restRequest(serverAddress + "/portal/logout-api-session", "POST",
					"application/json", "application/json", writer.toString());
			if (stream != null) {
				return restrequest.getStringBuffer(stream[0]).toString();
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return null;

	}
}