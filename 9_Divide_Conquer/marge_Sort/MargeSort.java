import java.util.*;
public class MargeSort{
    public static void printarry(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
}
    public static void margesort(int arr[],int si,int ei){
        //basecase
        if(si>=ei){
            return;
        }
        
        
        //kaam
        int mid=si+(ei-si)/2;
        margesort(arr,si,mid);//left part
        margesort(arr,mid+1,ei);//Right part
        marge(arr,si,mid,ei);
    }
    public static void marge(int arr[],int si,int mid,int ei){
        //left(0-3)=4 //right(4-6)=3  6-0+1=7
        int temp[]=new int[ei-si+1];
        int i=si;//For the left part
        int j=mid+1;//for the right part
        int k=0;//iterator for the temp values


        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){ // i<j hai to temp main 
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;

        }
        //left part
        //bache hua element to add karna hai array mai
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        //right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //copy arr
        for(k=0,i=si; k<temp.length;k++, i++){
            arr[i]=temp[k];//temp of k ko copy karna hai orignal arry mai
        }
    }

     public static void main(String args[]){
            int arr[]={6,3,4,2,5,8};
            margesort(arr,0,arr.length-1);
            printarry(arr);
        }
}