import java.util.*;
public class LinerSearch{
    public static int linersearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String args[]){
        int number[]={12,10,3,14,15,18,19};
        int key=19;

        int index=linersearch(number,key);
        if(index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("key is found : -"+index);
        }
    }
}