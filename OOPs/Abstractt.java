import java.util.*;
public class Abstractt{
    public static void main(String args[]){
        Horse h1=new Horse();
        h1.walk();
        cat c1=new cat();
        c1.walk();
    }
}
abstract class animal{
    void eat(){
        System.out.println("Eating Something");
    }
    abstract void walk();
}
class Horse extends animal{
   
    void walk(){
        System.out.println("Here we want implementation");
    }
}
class cat extends animal{
    
    void walk(){
        System.out.println("Here we want cat");
    }
}




