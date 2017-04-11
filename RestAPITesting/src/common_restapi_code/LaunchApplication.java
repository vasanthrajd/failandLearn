package common_restapi_code;

import java.io.InputStream;
import java.io.StringWriter;
import org.json.JSONObject;

public class LaunchApplication {

	public static String launchApplication(String ensembleServerURL, String appclasspath) {
		try {
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("appClassPath", appclasspath);
			StringWriter writer = new StringWriter();
			jsonObject.write(writer);
			InputStream stream[] = restrequest.restRequest(ensembleServerURL + "/launch-application", "POST",
					"application/json", "text/plain", writer.toString());
			if (stream != null) {
				return restrequest.getStringBuffer(stream[0]).toString();
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return null;
	}

}
