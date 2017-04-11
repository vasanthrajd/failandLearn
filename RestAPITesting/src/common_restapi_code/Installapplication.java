package common_restapi_code;

import java.io.InputStream;
import java.io.StringWriter;
import org.json.JSONObject;

public class Installapplication {

	 public static String  installapp(String ensembleServerURL, String applicationID)
	 {
	 
	 try {
		 JSONObject jsonObject = new JSONObject();
			jsonObject.put("applicationID", applicationID);
			StringWriter writer = new StringWriter();
			writer.write(jsonObject.toString());
         InputStream inputstream[] =
                 restrequest.restRequest(ensembleServerURL+"/"+"install-application",
         				"POST", "application/json", "text/plain",writer.toString());
         if(inputstream != null) {
             return restrequest.getStringBuffer(inputstream[0]).toString();
         }
     } 
	 catch(Exception e1) {
        e1.printStackTrace();
     }
     return null;
 }
			
}
