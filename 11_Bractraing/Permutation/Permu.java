//n! combination

import java.util.*;
public class Permu{
    public static void getchoice(String str,String Ans){
        //base
        if(str.length()==0){
            System.out.println(Ans);
            return;
        }

        //kam Recurion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //curr element ko remove karna hai
            //abcde => ab+de="abde" 
            String Newstr=str.substring(0,i)+str.substring(i+1);//curr value remove here 
            getchoice(Newstr,Ans+curr);
        }


    }

    public static void main(String args[]){
        String str="abc";
        getchoice(str,"");
    }
}