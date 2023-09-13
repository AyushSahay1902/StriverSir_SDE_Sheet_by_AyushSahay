package Arrays;

public class Find_element {



    public void Missing_Number(int arr[]){
        int n = arr.length;
        int flag = 1;
        for(int i=1; i<=n; i++){
            for(int j=0; i<n-1; j++){
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
                
            }
            if(flag == 0){
                return;
            }
            
        }
    }
    
    
    public static void main(String[] args){
        int arr[] = {3,0,1};
        Missing_Number M1 = new Missing_Number(arr);
    }
}
