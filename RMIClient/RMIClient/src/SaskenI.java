import java.rmi.Remote;
import java.rmi.RemoteException;


public interface SaskenI extends Remote {		// Holds the reference of the remote
	public String sayHello(String str) throws RemoteException;
	
	
}
