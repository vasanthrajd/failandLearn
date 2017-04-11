package common_restapi_code;

import java.io.InputStream;
import java.io.StringWriter;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;

public class ReleaseDevice {

	public static String ReleaseDeviceFailure(String serverAddress, String sessionID, int mcd) {

		try {

			StringWriter writer = releaseDeviceParams(sessionID);
			JSONObject jsonObject;
			InputStream stream[] = restrequest.restRequest(serverAddress + "/device/release-device/" + mcd, "POST",
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

	public static StringWriter releaseDeviceParams(String sessionID) throws JSONException {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("sessionID", sessionID);
		StringWriter writer = new StringWriter();
		jsonObject.write(writer);
		return writer;
	}

	public static String releaseDevice(String serverAddress, String sessionID, int mcd) {
		try {
			StringWriter writer = releaseDeviceParams(sessionID);
			InputStream stream[] = restrequest.restRequest(serverAddress + "/device/release-device/" + mcd, "POST",
					"application/json", "application/json", writer.toString());
			if (stream != null && stream.length == 2) {

				if (stream[1] == null) {
					String outputText = restrequest.getStringBuffer(stream[0]).toString();

					try {
						JSONObject jsonObject = restrequest.getJsonObject(stream[0]);

						Boolean status = (Boolean) jsonObject.get("success");
						Assert.assertEquals("Status should not be failure", new Boolean("true"), status);
						String ensembleURL = (String) jsonObject.get("ensembleServerURL");

						return ensembleURL;
					} catch (JSONException e) {
						System.err.println(outputText);
					}
					return outputText;
				} else {
					String text = restrequest.getStringBuffer(stream[1]).toString();

					System.err.println(text);
				}

			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return "";
	}
}
