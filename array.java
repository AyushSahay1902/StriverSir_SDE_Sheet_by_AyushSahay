//contains elements of same data type
//int arr[] = new int[6];
//at the time of declaration globally --> filled with 0's
// at the time of declaration locally --> filed with garbage values
// max size of an array locally --> 10^6 and globally--> 10^7
// array is stored  randommly in memory of the computer
// Brute --> Better --> optimal
//largest element in an array

import java.util.Scanner;

class LargestElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements for the array");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        //for largest element in the array
        int largest = arr[0];
        for(int i=0; i<size; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest element in the array:"+largest);

        //for the second largest element in the array
        int second_largest = -1;
        for(int i=0;i<size; i++){
            if(second_largest < arr[i] && second_largest < largest){
                second_largest = arr[i];
            }
        }
        System.out.println("Second_largest number is: "+second_largest);
        sc.close();
    }
}