
//2^n subset

import java.util.*;
public class subset{

    public static void subbset(String str,String ans,int i){//ans for storing value ,i for the detecting index 
    //base case
    if(i==str.length()){
        if(ans.length()==0){
            System.out.println("Null");
        }else{
            System.out.println(ans);
        }
        
        return;
    }
    //kam Recursiong
    //yes choice
    subbset(str,ans+str.charAt(i),i+1);
    //no choice
    subbset(str,ans,i+1);
}
    public static void main(String args[]){
        String str="abc";
        subbset(str,"",0);//initail string is empty
    }
}

//time complexity O(n*2^n)
//space complexity O(n)