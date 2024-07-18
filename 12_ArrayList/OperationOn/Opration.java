import java.util.*;
public class Opration{
    public static void main(String args[]){
        ArrayList<Integer> c1=new ArrayList<Integer>();
        ArrayList<String> c2=new ArrayList<String>();
        ArrayList<Boolean> c3=new ArrayList<Boolean>();

        //add
        c1.add(15);//0(1)
        c1.add(2);//0(1)
        c1.add(3);//0(1)
        c1.add(4);//0(1)
        System.out.println(c1);

        //get
        int element=c1.get(1);//index
        System.out.println(element);

        //Delete
        int ele=c1.remove(0);
         System.out.println("Remove element at index 0: " + ele);

         //set element at index 0(n)
        int ele2=c1.set(1,30);
        System.out.println("Element add at index 1 :"+ele2);
        System.out.println("Current Array"+c1);

         System.out.println("Contain Ele or not: "+c1.contains(1));
          System.out.println("Contain Ele or not: "+c1.contains(30));



    }
}