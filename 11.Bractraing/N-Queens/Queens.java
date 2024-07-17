import java.util.*;
public class Queens{
    
    public static boolean isself(char board[][],int row,int col){
        //vertical up
            for(int i=row-1;i>=0;i--){//row kam hote hote 0 tak jayegi
                if(board[i][col]=='Q'){// Agar allready koe Queen baithi hai to return false
                    return false;
                }
            }
        //daigonal left
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //daigonal up
        for(int i=row-1,j=col+1;i>=0 && j<board[0].length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void NQueen(char board[][],int row){
        //base case
        if(row==board.length){
            // printBoard(board);
            count++;
            return;
     }
        //column loop
        for(int j=0;j<board.length;j++){
           if(isself(board,row,j)){
             board[row][j]='Q';//is Row pe main Queen ko bita diya ab 
             NQueen(board,row+1);//ab next row call kiya
             board[row][j]='X';//at the tiime of backtrack remove Queens at current position and make it empty
           }
        }
    }
            //for the Print Board
        public static void printBoard(char board[][]){
            System.out.println("-------------Chess Board---------------");
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board.length;j++){
                    System.out.print(board[i][j]+" ");
                }
                 System.out.println();
        }
    }
    static int count=0;
    public static void main(String args[]){
        int n=4;
        char board[][]=new char[n][n];
        //initialize
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                board[i][j]='X';//at starting all entry are Null
            }
        }
        NQueen(board,0);
        System.out.println("total ways to solve : "+count);

    }
}