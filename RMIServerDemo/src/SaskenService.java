import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class SaskenService extends UnicastRemoteObject implements SaskenI{

	public SaskenService() throws RemoteException{
		
	}
	
	@Override
	public String sayHello(String str) throws RemoteException {
		// TODO Auto-generated method stub
		return "Sasken Welcomes" + str;
	}
	
	
}
