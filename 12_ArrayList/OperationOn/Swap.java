import java.util.*;

public class Swap{
    
    public static void Swp(ArrayList<Integer> list,int idx,int idx2){
        int temp=list.get(idx);
        list.set(idx,list.get(idx2));
        list.set(idx2,temp);

    }

    public static void main(String args[]){
    
    ArrayList<Integer> list=new ArrayList<>();
    list.add(2);
    list.add(3);
    list.add(1);
    list.add(5);
    list.add(8);

    int idx=1,idx2=3;
    System.out.println("Before"+list);
    Swp(list,idx,idx2);
    System.out.println("After"+list);


}
}
