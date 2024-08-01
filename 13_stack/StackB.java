import java.util.*;
public class StackB{
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        //check wheather stack is empty or not
        public static boolean isempty(){//it return ture if stack is empty
            return list.size()==0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop 
        public static int Pop(){//we have to remove top element
            if(isempty()){//if the stack is empty return true
                return -1;
            }
           int top=list.get(list.size()-1);
           list.remove(list.size()-1);
           return top;

        }

        //peek (Jakana in stack)

        public static int Peek(){
            return list.get(list.size()-1);
        }

    }
    
    
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
       while(!s.isempty()){//till the stack is not empty
        System.out.println(s.Peek());
        s.Pop();

       }
    }
}