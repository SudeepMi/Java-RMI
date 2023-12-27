import java.rmi.server.*;
import java.rmi.*;



public class Server extends UnicastRemoteObject implements Adder {
    Server() throws RemoteException{
        super();
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }

}