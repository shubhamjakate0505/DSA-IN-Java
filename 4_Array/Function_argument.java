import java.util.*;
public class Function_argument{
    public static void update(int marks[]){//pass by refer
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }

    public static void main(String args[]){
    int marks[]={10,20,30};
    update(marks);

    //to print our marks
    for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }


}
}