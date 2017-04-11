package common_restapi_code;

import java.io.InputStream;

public class GetPendingExecutions {
	
	
	public static String getpendingexeecutions(String serverAddress) {
		try {
			InputStream stream[] = restrequest.restRequest(serverAddress +"/projects" + "/get-pending-executions","GET",
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
