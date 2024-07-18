import java.util.*;
public class Reverse{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
            
        }
        System.out.println("max element is "+max);






        //Reverse Array
        /* for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+ " ");
        } */
    }
}