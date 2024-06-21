import java.util.*;
import java.lang.*;
public class BinTODec{
    public static void Bintodec(int bin){
        int pow=0;
        int dec=0;

        while(bin>0){
            int lastdigit=bin%10;
            dec= dec + (lastdigit*(int)math.pow(2,pow));
            pow++;
            bin=bin/10;
        }
        System.out.println("Decemal no of"+bin+" " +dec);
    }
    
    
    public static void main(String args[]){
        Bintodec(101);
    }
}