package common_restapi_code;

import java.io.InputStream;
import java.io.StringWriter;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;

public class LockDevice {

	public static String lockDeviceFailure(String serverAddress, String sessionID, int mcd) {

		try {

			StringWriter writer = createLockDeviceParams(sessionID);
			JSONObject jsonObject;
			InputStream stream[] = restrequest.restRequest(serverAddress + "/device/lock-device/" + mcd, "POST",
					"application/json", "application/json", writer.toString());
			if (stream != null) {
				jsonObject = restrequest.getJsonObject(stream[0]);
				Boolean status = (Boolean) jsonObject.get("success");
				Assert.assertEquals("Status should not be failure", new Boolean("false"), status);
				Object reason = jsonObject.get("reason");
				if (reason instanceof String)
					return (String) reason;
				else
					return "Reason is not specified";

			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return "";
	}

	public static StringWriter createLockDeviceParams(String sessionID) throws JSONException {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("sessionID", sessionID);
		StringWriter writer = new StringWriter();
		jsonObject.write(writer);
		return writer;
	}

	public static String lockDevice(String serverAddress, String sessionID, int mcd) {
		try {
			StringWriter writer = createLockDeviceParams(sessionID);
			InputStream stream[] = restrequest.restRequest(serverAddress + "/device/lock-device/" + mcd, "POST",
					"application/json", "application/json", writer.toString());
			if (stream != null) {
				JSONObject jsonObject = restrequest.getJsonObject(stream[0]);
				Boolean status = (Boolean) jsonObject.get("success");
				Assert.assertEquals("Status should not be failure", new Boolean("true"), status);
				String ensembleURL = (String) jsonObject.get("ensembleServerURL");
				return ensembleURL;

			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return "";
	}

}
