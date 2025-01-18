import java.util.*;
public class hollowrect {
    public static void rect(int rows,int cols){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(i==1||j==1||j==cols||i==rows){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of rows and cols:");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        rect(rows, cols);
    }
}
