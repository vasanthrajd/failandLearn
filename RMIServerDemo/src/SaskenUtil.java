import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;


public class SaskenUtil {
	public static void main ( String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
		SaskenService obj= new SaskenService();
		Naming.bind("system", obj);		// instance is de
		System.out.println(" Server Ready..");
		
	}
}
