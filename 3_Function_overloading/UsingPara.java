import java.util.*;
public class UsingPara{
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    
    public static void main(String args[]){
        System.out.println(add(5,8));
        System.out.println(add(5,8,5));
    }
}