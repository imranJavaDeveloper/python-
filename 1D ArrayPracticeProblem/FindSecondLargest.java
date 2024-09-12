import java.util.Arrays;

public class FindSecondLargest {

    /**Take Array And Sort int Accending Oder And Print Second Largest Element */
    public static int findNumbe(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-2];
        
    }

    public static void main(String args[]){
        
     /**Create Integer Array */
        int [] arr={2,13,4,1,3,6,28};
        System.out.println(findNumbe(arr));


    }


    
}
