import java.util.*;
public class FourthQ{
    public static void stockSpan(int stocks[],int span[]){
        Stack<Integer> s=new Stack<>();
        span[0]=1;//Frist index ke liye hamesha value 1 Hothi haii.e Frist day
        s.push(0);
        for(int i=1;i<stocks.length;i++){
            int currPrice=stocks[i];//curr price
            //Ye while loop tab tak chalta rahega jab tak ek to mere stack khali nhi hoth ya phir mere curr ke value grater than previus value 
            while(!s.isEmpty() && currPrice>stocks[s.peek()]){//chote ele sub nikalne chahiye
                s.pop();
            }
            //pahile check karte hai chote element nikalte nikale hamara stack khali to nhi hua
            if(s.isEmpty()){
                span[i]=i+1;
            }else{
                int prehigh=s.peek();
                span[i]=i-prehigh;
            }
            s.push(i);
        }
    }



    public static void main(String args[]){
        int stocks[]={100,80,60,70,65,85,100};//stock
        int span[]=new int[stocks.length];//span with stock length
        stockSpan(stocks,span);

        for(int i=0;i<span.length;i++){
            System.out.println(span[i]+" ");
        }
    }

}