
final class Bike //final class
{
 Bike() // Constructor can not be final , modifier not allowed
{
System.out.println("Bike is created");
}  
    final int speedlimit=90; //final variable 
    final void run() //final method
    {
    System.out.println("running");
    
    
}
}


public class FinalDemo {

    public static void main(String[] args) {
        
        
        
        Bike b=new Bike();  
        b.run();
    }
    
}
