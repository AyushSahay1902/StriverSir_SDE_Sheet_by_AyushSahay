package Arrays;
public class leaders_in_Array {
    
    public void leader(int arr[]){
        boolean leader = true;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > arr[i]){
                    leader = false;
                    break;
                }
            }
        }

        // if(leader == true ){
        //     return 
        // }
    }

    public static void main(String args[]){
        int arr[] = {2,42,45,78,4};

    }
}
