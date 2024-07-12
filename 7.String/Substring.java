import java.util.*;
public class Substring{
    public static String sub(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str="Hellow world";
        System.out.println(sub(str,0,4));
    }
}