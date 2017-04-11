package common_restapi_code;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.JsonObject;

public class restrequest {
	
	public static InputStream[] restRequest(String url, String method,
			String contentType, String acceptType, String body) {
		InputStream response = null;
		InputStream responseError = null;
		HttpURLConnection conn = null;

		try {
			conn = (HttpURLConnection) new URL(url).openConnection();

			conn.setRequestMethod(method);

			conn.setRequestProperty("Content-Type", contentType);
			conn.setRequestProperty("Accept", acceptType);
			conn.setRequestProperty("Content-transfer-encoding", "UTF-8");
			conn.setRequestProperty("user-agent",
					"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.2; .NET CLR 1.0.3705;)");

			conn.setDoInput(true);

			if (body != null) {
				conn.setDoOutput(true);

				 OutputStream output = conn.getOutputStream();
				OutputStreamWriter osWriter = new OutputStreamWriter(
						output, "UTF-8");

				osWriter.write(body);
				osWriter.flush();
				osWriter.close();
				output.close();
			}

			conn.connect();
			conn.disconnect();

			responseError = conn.getErrorStream();
			response = conn.getInputStream();
			
			if (conn.getResponseCode() != 200 && responseError == null) {
				String errorMsg = ("{\"status\":\"Failure\",\"reason\":\"" + conn.getResponseMessage() + "\"}");
				
				responseError = new ByteArrayInputStream(errorMsg.getBytes(StandardCharsets.UTF_8));
			}
		} catch (Exception e1) {
			e1.printStackTrace();
			
			if (responseError == null) {
				String errorMsg = ("{\"status\":\"Failure\",\"reason\":\"" + e1.getLocalizedMessage() + "\"}");
				
				responseError = new ByteArrayInputStream(errorMsg.getBytes(StandardCharsets.UTF_8));
			}
		}

		return Arrays.asList(response, responseError).toArray(
				new InputStream[0]);
	}
	public static JSONObject getJsonObject(InputStream inputStream)
			throws IOException, JSONException {
		JSONObject jsonObject;
		StringBuffer buffer = getStringBuffer(inputStream);
		jsonObject = new JSONObject(buffer.toString());
		return jsonObject;
	}

	public static StringBuffer getStringBuffer(InputStream inputStream)
			throws IOException {
		byte[] returnBytes = new byte[1024];
		StringBuffer buffer = new StringBuffer();
		int length = 0;

		do {
			length = inputStream.read(returnBytes, 0, returnBytes.length);
			if (length > 0) {
				String returnMsg = new String(returnBytes, 0, length, "UTF-8");
				buffer.append(returnMsg);

			}
		} while (length > 0);

		buffer.trimToSize();
		return buffer;
	}

}



