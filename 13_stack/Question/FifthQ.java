import java.util.*;
public class FifthQ{
    public static void main(String args[]){
        int arr[]={6,8,0,1,3}  ;
        Stack<Integer> s=new Stack<>();
        int nxtGreater[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            //1 while
            //jab tak mere stack khali nhi ho jata ya phir arr[s.peek()]<=arr[i]
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();//index ko pop karna hai
            }
            
            //2 if else

            if(s.isEmpty()){//agar mera stack empty hotha hai pura to
              nxtGreater[i]=-1;  
            }else{
                nxtGreater[i]=arr[s.peek()];
            }

            //push in s
            s.push(i);
        } 
        for(int i=0;i<nxtGreater.length;i++){
            System.out.print(nxtGreater[i] +" ");
        }
        System.out.println();
    }
}