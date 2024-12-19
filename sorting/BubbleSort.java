package Sorting;

import java.util.Scanner;

public class BubbleSort{
    public static void BubbleSort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int size = sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter the array of size : "+size);
        for(int i=0; i<size;i++){
            arr[i]=sc.nextInt();
            }
            System.out.print("Sorted array is ");
            BubbleSort(arr);
            for(int i=0; i<size;i++){
            System.out.print(arr[i]+" ");
            }
    }
}