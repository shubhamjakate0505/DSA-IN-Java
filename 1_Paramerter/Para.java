import java.util.*;
public class Para{
    public static void para(int a,int b){// formarl Parameter
        int sum=a+b;
        System.out.println("sum is " +sum);
    }
    public static void main(String argc[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Frist Number : ");
        int a=sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b=sc.nextInt();
        para(12,20);
    
    }
}