package common_restapi_code;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.StringWriter;

import org.apache.commons.codec.binary.Base64;
import org.json.JSONObject;

public class Addapplication {
	
	public static String addApplication( String serverAddress, String sessionID, String appName, String appType, String appVersion, String fileName, String filePath)
    {
        try {
            JSONObject jsonObject = new JSONObject();
            StringWriter writer = new StringWriter();
            jsonObject.put("isSignApp", "false");
            jsonObject.put("isEnableApp", "false");
            jsonObject.put("appType", appType);
            jsonObject.put("appName", appName);
            jsonObject.put("appVersion", appVersion);
            jsonObject.put("fileName", fileName);
            File file = new File(filePath);
            FileInputStream stream = new FileInputStream(file);
            byte[] fileContent = new byte[8192];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int length = 0;
            while((length = stream.read(fileContent)) > 0) {
                byteArrayOutputStream.write(fileContent, 0, length);
            }
            Base64 base64 = new Base64();
            String fileString = base64.encodeAsString(byteArrayOutputStream.toByteArray());
            jsonObject.put("fileContent", fileString);
            jsonObject.write(writer);
            InputStream inputstream[] =
                    restrequest.restRequest(serverAddress + "/device/" + sessionID + "/" + "add-application",
                        "POST", "application/json", "text/plain", writer.toString());
            if(stream != null) {
                return restrequest.getStringBuffer(inputstream[0]).toString();
            }
        } catch(Exception e1) {
           e1.printStackTrace();
        }
        return null;
    }

public static byte[] downloadData(String downloadURL)
{
    InputStream inputstream[] =
   		 restrequest.restRequest(downloadURL,
                    "GET", "application/text", "application/octet-stream", null);
    try {
        if (inputstream != null) {
            byte[] data = new byte[8192];
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            int length = 0;
            while ((length = inputstream[0].read(data, 0, data.length)) > 0) {
                stream.write(data, 0, length);
            }
            return stream.toByteArray();
        }
    } catch(Exception e1) {
        e1.printStackTrace();
    }
    return null;
}

public static String getURL(String serverAddress,String sessionID, String appName, String appType, String appVersion)
{
    try {
        JSONObject jsonObject = new JSONObject();
        StringWriter writer = new StringWriter();
        jsonObject.put("appType", appType);
        jsonObject.put("appName", appName);
        jsonObject.put("appVersion", appVersion);
        jsonObject.write(writer);
        InputStream inputstream[] =
       		 restrequest.restRequest(serverAddress + "/applications/" + sessionID + "/" + "get-application-url",
                        "POST", "application/json", "application/json", writer.toString());
        if(inputstream!= null) {
            return restrequest.getStringBuffer(inputstream[0]).toString();
        }
    } catch(Exception e1) {
        e1.printStackTrace();
    }
    return null;

}

}
