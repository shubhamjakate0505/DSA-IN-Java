import java.util.*;
public class FibnacciSeries{
    public static int Fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1=Fib(n-1);
        int fnm2=Fib(n-2);
        int fn=fnm1+fnm2;
        return fn;
    


    }

    
    
    public static void main(String args[]){
        System.out.println(Fib(5));
    }
}