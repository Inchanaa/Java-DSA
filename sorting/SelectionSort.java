import java.util.Scanner;

public class SelectionSort {
    public static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int smalest = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[smalest] > arr[j]){
                    smalest=j;
                }
            }
            int temp = arr[smalest];
            arr[smalest] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int size = sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter the array of  ");
        for(int i=0; i<size;i++){
            arr[i]=sc.nextInt();
            }
            System.out.print("Sorted array is ");
            selection(arr);
            for(int i=0; i<size;i++){
            System.out.print(arr[i]+" ");
            }
    sc.close();
        }
}