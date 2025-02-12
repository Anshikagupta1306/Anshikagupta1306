import java.util.*;
public class multiplymat {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows of first matrix: ");
        int row1=sc.nextInt();
        System.out.println("enter the number of columns of first matrix: ");
        int col1=sc.nextInt();
        System.out.println("enter the number of rows of second matrix: ");
        int row2=sc.nextInt();
        System.out.println("enter the number of columns of second matrix: ");
        int col2=sc.nextInt();

        if (col1 != row2) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }
        
         
        int mat1[][]=new int[row1][col1];
        int mat2[][]=new int[row2][col2];
        int res[][]=new int[row1][col2];

        System.out.println("enter elements of first matrix: ");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                mat1[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter elements of second matrix: ");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                mat2[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                for(int k=0;k<col1;k++){
                    res[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }

        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
