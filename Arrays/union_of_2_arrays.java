import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        int n1 = a.length;
        int n2 = b.length;
        set<int> st;
        for(int i=0; i< n1; i++){
            st.insert(a[i]);
        }
        for(int i=0; i< n2; i++){
            st.insert(b[i]);
        }
        List<int> temp;
        for(auto it : st){
            temp.push_back(it); 
        }
        return temp;
    }

    public static void main(String args[]){
        int a[] = {1,3,4,6,7,9,3};
        int b[] = {3,4,5,6};

        sortedArray(a, b);
    }
}