import java.util.*;
public class Frist{
    public static int fristoccurrance(int arr[],int key,int i){
        
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return fristoccurrance(arr,key,i+1);
    }
    //Last Occurance
    public static int LastOcuu(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=LastOcuu(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;


    }


    public static void main(String args[]){
        int arr[]={1,3,4,5,7,5};
        // System.out.println("Frist Occurance at the index : "+fristoccurrance(arr,5,0));
        System.out.println("Last Occurance at the index : "+LastOcuu(arr,5,0));

    }
}