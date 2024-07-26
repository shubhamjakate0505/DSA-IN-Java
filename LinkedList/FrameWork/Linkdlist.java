import java.util.*;
// import java.util.LinkedList;
public class Linkdlist{
    public static void main(String args[]){
        LinkedList<Integer> l1=new LinkedList<>();
        l1.addFirst(10);
        l1.addFirst(11);
        l1.addFirst(12);
        l1.addLast(9);
        l1.addLast(8);
        System.out.println(l1);
        l1.removeFirst();
        l1.removeLast();
        System.out.println(l1);
  
    }
}