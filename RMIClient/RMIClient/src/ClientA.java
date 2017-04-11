import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class ClientA {
public static void main( String[] args) throws MalformedURLException, RemoteException, NotBoundException {
	SaskenI obj = ( SaskenI) Naming.lookup("rmi://10.51.12.12:1099/sasken");
	System.out.println(obj.sayHello("james"));
}
}
