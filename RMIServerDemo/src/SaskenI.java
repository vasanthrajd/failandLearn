import java.rmi.Remote;
import java.rmi.RemoteException;


public interface SaskenI extends Remote {
	public String sayHello(String str) throws RemoteException;
	
	
}
