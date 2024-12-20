import java.util.Scanner;

public class InsertionSort {
    public static void insertion(int arr[]){
        for(int i = 1; i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            // placement
            arr[j+1] = current;
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
            insertion(arr);
            for(int i=0; i<size;i++){
            System.out.print(arr[i]+" ");
            }
    sc.close();
        }
}
