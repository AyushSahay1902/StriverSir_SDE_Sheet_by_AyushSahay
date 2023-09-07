package Arrays;
import java.util.*;

public class Left_rotate {
    public static void main(System args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array of size 5:");
        int arr[] = new int[5];
        int temp = arr[0];
        for(int i=0; i< 5; i++){
            arr[i-1] = arr[i];
        }
        arr[4] = temp;

        sc.close();
    }
}
