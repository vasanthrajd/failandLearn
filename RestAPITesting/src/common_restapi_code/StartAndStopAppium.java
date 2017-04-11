package common_restapi_code;

import java.io.InputStream;

public class StartAndStopAppium {
	
	
	public static String startAppium(String serverAddress,String sessionID, int mcd) {
		try {
			InputStream stream[] = restrequest.restRequest(serverAddress + "/device/"
					+ sessionID + "/start-appium/" + mcd, "GET",
					"application/json", "text/plain", null);
			if (stream != null) {
				return restrequest.getStringBuffer(stream[0]).toString();
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return null;
	}
	
	public static String stopAppium(String serverAddress,String sessionID, int mcd) {
		try {
			InputStream stream[] = restrequest.restRequest(serverAddress + "/device/"
					+ sessionID + "/stop-appium/" + mcd, "GET",
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
