import java.util.*;
public class BinaryString{
    public static void binarycons(int n,int lastiplacce,String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //kam
        /* if(lastiplacce==0){//last idx 0 hai to renaming strig ke liye call
            //sit 0 on the chair that is lastplace
           binarycons(n-1,0,str.append("0"));
           binarycons(n-1,1,str.append("1"));
        }else{
             binarycons(n-1,0,str.append("0"));
        } */

       //optimized Function

       binarycons(n-1,0,str+"0");
       if(lastiplacce==0){
        binarycons(n-1,1,str+"1");
       }
    }
    
    public static void main(String args[]){
        
        binarycons(3,0,"");


    }
}