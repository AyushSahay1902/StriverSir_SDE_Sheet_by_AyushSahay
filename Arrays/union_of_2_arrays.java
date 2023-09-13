package Arrays;
import java.util.List;
import java.util.Set;

public class union_of_2_arrays{
    public static List< Integer > sortedArray(int []a, int []b) {
        int n1 = a.length;
        int n2 = b.length;
        Set<Integer> st;
        for(int i=0; i< n1; i++){
            // st.insert(a[i]);
            st.add(a[i]);
        }
        for(int i=0; i< n2; i++){
            // st.insert(b[i]);
            st.add(b[i]);
        }
        List<Integer> temp;
        for(int i=0; i<=st.size(); i++){
            temp.concat(st(i)); 
        }
        return temp;
    }

    private static Object st(int i) {
        return null;
    }

    public static void main(String args[]){
        int a[] = {1,3,4,6,7,9,3};
        int b[] = {3,4,5,6};

        sortedArray(a, b);
    }
}