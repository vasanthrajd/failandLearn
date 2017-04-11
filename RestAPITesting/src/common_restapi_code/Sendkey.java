package common_restapi_code;

import java.io.InputStream;
import java.io.StringWriter;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;

public class Sendkey {

	public static InputStream[] Sendkeyparam(String ensembleServerURL, String keyString, String delaytime)
			throws JSONException {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("keyString", keyString);
		jsonObject.put("delayTime", delaytime);
		StringWriter writer = new StringWriter();
		jsonObject.write(writer);
		return restrequest.restRequest(ensembleServerURL + "/send-key", "POST", "application/json", "application/json",
				writer.toString());
	}
}