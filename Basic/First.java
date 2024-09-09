public class First {

    public static  void main(String args[]){

        /** Array declaration */
        int [] arr= new int[5];

        /** Array initialization */
        arr[0]=87;
        arr[1]=82;
        arr[2]=63;
        arr[3]=24;
        arr[4]=14;

        /** print all value */

        /** System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);*/


      /** print all value using the for loop */

      for (int i=0;i< arr.length;i++){
          System.out.println(arr[i]);
      }
    }
    
}
