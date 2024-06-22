import java.util.*;
public class Problum2{

    public static void incres(int n){
        if(n==10){
            System.out.println(10);
            return;
        }
        System.out.println(n+" ");
        incres(n+1);
    }
    public static void main(String args[]){
       int n=1;
       incres(n);

    }
}