import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Adder
 */
public interface Adder extends Remote {

   public void add(int a, int b) throws RemoteException;

}