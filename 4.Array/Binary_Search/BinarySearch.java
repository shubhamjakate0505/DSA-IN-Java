import java.util.*;
public class BinarySearch{
    public static int search(int number[],int key){
        int start=0;
        int end=number.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;

            //comaparisan
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){//right
                start=mid+1;
            }else{//left
                end=mid-1;
            }
            
        }
        return -1;

    }
    
    
    
    public static void main(String args[]){
        int number[]={2,3,14,19,20,22,28,30};
        int key=20;

        System.out.println("Index is "+search(number,key));
    }
}