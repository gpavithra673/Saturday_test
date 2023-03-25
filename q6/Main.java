package q6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of array elements");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] arr=new int[n];
        int [] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr1[i]=arr[i];
            System.out.print(arr1[i]+" ");
        }

    }
}
