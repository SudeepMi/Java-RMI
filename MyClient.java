import java.rmi.Naming;
import java.util.Scanner;

public class MyClient{
public static void main(String args[]){
try{
Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/sonoo");
Scanner sc = new Scanner(System.in);
System.err.println("Enter two numbers");
int a = sc.nextInt();
int b = sc.nextInt();
sc.close();
stub.add(a,b);
}catch(Exception e){}
}
}

// letslegalise