package common_restapi_code;

import java.io.InputStream;
import org.json.JSONObject;

public class SetExecutionStatus {
	
	
			public static String setexecutionstatus(String serverAddress, int projectExecutionId, String projectExecutionStatus, String sessionId ) {
				
				
				
		try {
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("projectExecutionId", projectExecutionId);
			jsonObject.put("projectExecutionStatus",projectExecutionStatus);
			jsonObject.put("sessionId", sessionId);
			InputStream stream[] = restrequest.restRequest(serverAddress +"/projects" + "/set-execution-status","GET",
					"application/json", "text/plain", null);
			if (stream != null) {
				return restrequest.getStringBuffer(stream[0]).toString();
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return null;
	}

}
		
		