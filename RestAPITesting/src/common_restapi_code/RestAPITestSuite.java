package common_restapi_code;


import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONException;


public class RestAPITestSuite {

	/**
	 * @param args
	 */
	
	static protected String ACCESS_SERVER_URL = "https://dadaccess12qasm.keynote.com:6232/resource";
	static protected String USER_NAME = "kapeel@qatest.com";
	static protected String PASSWORD = "Harmony1";
	static protected String sessionID="";
	static protected int devicemcd=9021;
	static protected String keyString= "[Touch(1278,2244)][Touch(1278,2244)] ";
	static protected String delaytime="5000";
	static protected String AppiumURL=null;
	static protected int projectExecutionId=1;
	static protected String projectExecutionStatus="Pending";
	static protected String ApplicationID;
	static protected String appName = "To Do Reminder";
	static protected String appVersion = "1.4";
	static protected String fileName = "To Do Reminder.apk";
	static protected String appType = "ANDROID_APK";
	static protected String filepath="C:/Users/kmaheshwari/Downloads/To Do Reminder.apk";
	static protected String appclasspath="com.ToDoReminder.gen/com.ToDoReminder.main.SplashScreen";
	
	
	public static void main(String[] args) throws JSONException, InterruptedException, MalformedURLException {
		
		
		
		try{
		establishsession session= new establishsession();
		
		sessionID =session.createSession(ACCESS_SERVER_URL, USER_NAME, PASSWORD);
		if (sessionID == null || sessionID.isEmpty()) {
			System.out.println("Cannot login");
		}
		System.out.println("Session id" + sessionID);
		
		Thread.sleep(3000);
		
		
		//Lock device
		
		String ensembleURL=LockDevice.lockDevice(ACCESS_SERVER_URL, sessionID, devicemcd);
		System.out.println("Ensemble URL " + ensembleURL);
		
		//Add application, get-url , download data
		
		ApplicationID=(Addapplication.addApplication(ACCESS_SERVER_URL,sessionID, appName, appType, appVersion,
				fileName, filepath));
		System.out.println("Application id is "+ ApplicationID);
        /*String urlToDownload = Addapplication.getURL(ACCESS_SERVER_URL,sessionID, appName, appType, appVersion);
        System.out.println("getURL Response " + urlToDownload);
        byte[] d1 = Addapplication.downloadData(urlToDownload);
        // compare with file
        try {
            FileInputStream stream = new FileInputStream(filepath);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            byte [] b2 = new byte[8192];
            int length = 0;
            while((length = stream.read(b2, 0, b2.length)) > 0) {
                outputStream.write(b2, 0, length);
            }
            b2 = outputStream.toByteArray();
            Assert.assertArrayEquals("File data different", d1, b2);
        } catch(Exception e1) {
           e1.printStackTrace();
        }*/
		
		
		
        // Install Application
        
        System.out.println("Application install result "+ Installapplication.installapp(ensembleURL, ApplicationID));
		
        
        //Launch Application
        
        System.out.println("Application is launched "+ LaunchApplication.launchApplication(ensembleURL, appclasspath));
		
		//Sendkey
		
		//Sendkey.Sendkeyparam(ensembleURL,keyString,delaytime);
		
		//Start Appium
		
		
		/*AppiumURL=StartAndStopAppium.startAppium(ACCESS_SERVER_URL, sessionID, devicemcd);
		System.out.println("Launch Appium " + AppiumURL);
		*/
        
        
		//ExecuteAppium script
		
		/*URL url=new URL(AppiumURL);
		url = new URL(url.toString().replaceAll("/appium/", "/appium/capture/"));
		System.out.println("New URL " + url);
		AndroidAppium.testAPI(url.toString());
		iOSAppium.testAPI(url.toString());
	
		iOSAppium.testAPI(AppiumURL);
		AndroidAppium.testAPI(AppiumURL);
		*/
		
		//Stop Appium
		
		//StartAndStopAppium.stopAppium(ACCESS_SERVER_URL, sessionID, devicemcd);
		
		
		//Release device
		
		Thread.sleep(5000);
		
		String releasedevice=ReleaseDevice.releaseDevice(ACCESS_SERVER_URL, sessionID, devicemcd);
				
		
		System.out.println("device is released." +  releasedevice);
		
		//SetExecutionStatus
		
		/*String ExecutionStatus=SetExecutionStatus.setexecutionstatus(ACCESS_SERVER_URL, projectExecutionId, projectExecutionStatus,sessionID);
		
		System.out.println(ExecutionStatus);
		
		//GetPendingExecutions
		String pendingexecutions=GetPendingExecutions.getpendingexeecutions(ACCESS_SERVER_URL);
		
		System.out.println(pendingexecutions);
		*/
		//Log out session
		}
		finally{
		String Logout=establishsession.logoutSession(ACCESS_SERVER_URL, sessionID);
		
		System.out.println(Logout);
		}
	}
		
		
		
	}
	