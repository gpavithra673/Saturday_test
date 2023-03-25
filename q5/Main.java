package q5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the size of matrix");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [][] arr1=new int[n][n];
        int [][] arr2=new int[n][n];
        int [][] sum=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
