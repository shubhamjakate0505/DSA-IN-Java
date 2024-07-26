import java.util.*;
public class Linkedlist{
   
//  -------------------------Node-----------------------------------  
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
//   --------------------------------------AddFrist---------------------------------  
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

// -------------------------------------------Print------------------------------------
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


//    ----------------------------------------AddElementFrist-------------------------------- 
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
// ----------------------------------------removeFirst-------------------------------- 
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

// ---------------------------------------------search key---------------------------
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
// -------------------------------------------------------deleteNTh Node---------------------------------------------
        public void deleteNthfromEnd(int n){
            //size calculation
            int sz=0;
            Node temp=head;
            while(temp!=null){
                temp=temp.next;
                sz++;
            }
            if(n==sz){
                head=head.next;//removeFrist
                return;
            }

            //baki cases mai muje sz-n tak pohchna hai
            int i=1;
            int idxToFind=sz-n;
            Node prev =head;//index suru hoga head 
            while(i<idxToFind){
                prev=prev.next;
                i++;
            }
            prev.next=prev.next.next;
            return;

        }

// -----------------------------------------------Check pendulam--------------------------------------

    //Slow-fast Technics helper function
    public Node findMid(Node head){
    Node slow=head;//it take 1 steps at a time
    Node fast=head;//it take 2 steps at a time

    while(fast!=null && fast.next !=null){
        slow=slow.next;//1
        fast=fast.next.next;//2
    }
    return slow;
    }

    public boolean checkpalindrom(){
        if(head==null || head.next== null){//agar mari linked list khali hai or 1st node hai to return true karo
            return true;
        }
            //step1-find mid
            Node midNode=findMid(head);//middle node mil jayegi
            //step2-reverse 2nd half
            Node prev=null;
            Node curr=midNode;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
        Node right=prev;//right half head
        Node left=head;
        //step3-check left half &right half
        while(right!=null){ 
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    // ------------------------------------------------------------------------------------------------------
    public boolean isCycle(){
        Node slow=head;//head pointer start with head
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;//Cycle Exit
            }
        }
        return false;//Cycle Doesn't exit
    }

// -------------------------------------------------------------------------------------------------------
    public static void removecycle(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;//cycle find out
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //find meeting point        
            slow=head;
            Node prev=null;//jab loop khatm ho jayega tb last node ki value store ho jayegi prev mai
            while(slow!=fast){//jab tak mere slow ki value fast tak nhi hothi
            prev=fast;
            slow=slow.next;
            fast=fast.next;
            }

        //remove cycle->last.next=null
        prev.next=null;
    }
// ---------------------------------mearge sort-------------------------------------------------------------
//head ka mid chahiye
    private Node getmid(Node head){
            Node slow=head;
            Node fast=head.next;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;//my mid
    }

    private Node mearge(Node head1,Node head2){
            Node mergeLL=new Node(-1);//New linked list with dumy node -1
            Node temp=mergeLL;//temp which point to head of my mergeLL
        while(head1!=null && head1!=null){//jab tak dono null nahi hothe tab tak loop chalega
            if(head1.data<=head2.data){
                temp.next=head1;//temp ke andar store kar du head1 ki value
                head1=head1.next;//update head1 to head1.next
                temp=temp.next;//update temp to temp.next
            }else {
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
            while(head1!=null){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
             while(head2!=null){
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
            return mergeLL.next;
          } 
          public void Zigzag(){
            //find mid
            Node slow=head;
            Node fast=head.next;
            while(fast!=null && fast.next !=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            Node mid=slow;


            //reverse 2nd half

            Node curr=mid.next;
            mid.next=null;
            Node prev=null;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;

            }
            Node left=head;
            Node right=prev;
            Node nextL,nextR;
            //alter merge
            while(left !=null && right != null){//jab take mera next null nhi hoth or right null nhi hotha tab tak
                nextL=left.next;
                left.next=right;
                nextR=right.next;
                right.next=nextL;


                left=nextL;
                right=nextR;
            }
          }


    public Node margeSort(Node head){
        //base case
        if(head==null || head.next==null){
            //head ki value null ho jaye ya head.next ki value null ho jaye
            //in that case my linkedlist already sorted us time muje return head karnar hai
            return head;
        }

        //Findmid
        Node mid=getmid(head);
        //left and right ms

        Node righthead=mid.next;//right half ka head that will be my mid ka next
        mid.next=null;//mid ka next becomes null
        Node newleft=margeSort(head);//Call For head which is my left half
        Node newRight=margeSort(righthead);//call for righthead which is my right half

        //merge

        return mearge(newleft,newRight);
    }


// ------------------------------------------------------------------------------------------------------------
    public static void main(String args[]){
         Linkedlist l1=new Linkedlist();
        
        // l1.addFrist(2);        
        // l1.addFrist(1);      
        // l1.addLast(3); 
        // l1.addLast(4);
        // l1.add(2,9); 
        // l1.add(0,12);
        // l1.print();
        // l1.RemoveFrist();
        //  l1.print();
        //System.out.println(l1.size);
        // l1.RemoveLast();
        // l1.print();
        // l1.reverse();
        // l1.print();
        // System.out.println(l1.checkpalindrom());
        // l1.deleteNthfromEnd(3);
        // l1.print();
        // System.out.println(l1.recursiveSerch(2));
        // System.out.println(l1.recursiveSerch(10));
        // LinkedList<Integer> ll=new LinkedList<>();   
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
       
       
        l1.print();
        l1.Zigzag();
        // System.out.println(ll);
        // l1.head=l1.margeSort(l1.head);
        l1.print();
        // System.out.println(ll);


    }
}