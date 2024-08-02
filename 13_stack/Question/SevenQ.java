import java.util.*;
public class SevenQ{
    
   
    public static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //opeing, Operands,Oprator

            //closing
            if(ch==')'){
                int count=0;
                while(s.peek() != '('){
                       s.pop();
                       count++; 
                }
                if(count<1){
                    return true;//dublicate
                }else{
                    s.pop();//opening pair
                }
                
            }   
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str="((a+b))";  //false duplicate exit
        String str2="(a+b)";  //true
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
         }
}