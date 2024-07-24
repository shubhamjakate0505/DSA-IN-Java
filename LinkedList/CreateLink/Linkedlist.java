import java.util.*;
public class Linkedlist{
    public static class Node{
        int data;
        Node next;
        public Node(int data){//constractor
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;//initail Zero values
    
    public void addFrist(int data){//method
        //step 1=create new node
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
       
        //setp2= newnode next=head
        newnode.next=head;//link
        //step3=head=head
        head=newnode;
    }
    public void addLast(int data){
        //1.create new node
        Node newnode=new Node(data);
         size++;
        //if head==null than startig and ending node itself 
        if(head==null){
            head=tail=newnode;
            return;
        }
        //
        tail.next=newnode;
        tail=newnode;
    }
    //printing linked list
    public void print(){
        //base case
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){//jab tak head==0 tab tak loop chalega
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //add ele at middle
    public void add(int idx,int data){

        if(idx==0){
            addFrist(data);
            return;
        }
        //create new node
        Node newnode=new Node(data);
         size++;
        Node temp=head;
        int i=0;
        while(i < idx-1){
            temp=temp.next;
            i++;
        }

        //i=idx-1;temp->prev

        newnode.next=temp.next;
        temp.next=newnode;
        
}
    public int RemoveFrist(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
            int val=head.data;
            head=head.next;
            size--;
            return val;
        }

        public int RemoveLast(){
            if(size==0){
                System.out.println("LL is Empty");
                return Integer.MIN_VALUE;
            }else if(size==1){
                int val=head.data;//isko delete karana hai
                head=tail=null;
                size=0;
                return val;
            }   
            //prev=i=size-2
            Node prev=head;
            for(int i=0;i<size-2;i++){
                prev=prev.next;
            }
            //when i'm standing at the idx size-2
            int val=prev.next.data;//tail.data
            prev.next=null;
            tail=prev;
            size--;
            return val;
        }


        public int itrSearch(int key){
            Node temp=head;
            int i=0;
            while(temp!=null){
                if(temp.data==key){
                
                    return i;
                }
                temp=temp.next;
                i++;
            }
            return -1;
        }
        public int helper(Node head,int key){
            //base Case
            if(head==null){
                return -1;
            }
            if(head.data==key){//kay mere head ka deta key ke barabar hai to retun kardu head ka index 
            //head's index always Zero idx
                return 0;
            }
             //baki case mai muje track karna hai. kay helper method head ke next mai dhund pata hai mere key ko 
            int idx=helper(head.next,key);
            //agar nahi dhund paya to mera index -1 ho jayga
            if(idx==-1){
                return -1;
            }
            //agar dhundh liya to muje return karna hai idx+1
            return idx+1;
            }
        public int recursiveSerch(int key){
            return helper(head,key);
        }

        public void reverse(){
            //head ke pahale wali value Null hothi hai hamesha
            Node prev=null;
            //tail ko main curr value karata hu q ki mai reverse kar rahu hu puri linked list
            Node curr=tail=head;//head ki value tail mai assign hua hai tail ki value curr main store hue hai
            Node next;

            while(curr!=null){
                //1 frist step
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=prev;
            }
            //last main muje update karna hoth hai head ko previous mai
            head=prev;
        }

        public void deleteNthfromEnd(int n){
            //size calculation
            int sz=0;
            Node temp=head;
            while(temp!=null){
                temp=temp.next
                sz++;
            }
            if(n==sz){
                head=head.next;//removeFrist
                return;
            }

            //baki cases mai muje sz-n tak pohchna hai
            int i=1;
            int idxToFind=sz-n;
            Node prev =head//index suru hoga head 
            while(i<idxToFind){
                prev=prev.next;
                i++;
            }
            prev.next=prev.next.next;
            return;

        }
    public static void main(String args[]){
        Linkedlist l1=new Linkedlist();
        
        l1.addFrist(2);        
        l1.addFrist(1);      
        l1.addLast(3); 
        l1.addLast(4);
        l1.add(2,9);
        // l1.add(0,12);
        l1.print();
        // l1.RemoveFrist();
        //  l1.print();
        //System.out.println(l1.size);
        // l1.RemoveLast();
        // l1.print();
        l1.reverse();
        l1.print();
        // System.out.println(l1.recursiveSerch(2));
        // System.out.println(l1.recursiveSerch(10));
        

    }
}