import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println(" enter the size of the Array");
        int size=sc.nextInt();
        int [] arr= new int[size];

        /** All Array Element insert one by one */

        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        /** print all Array Element */

        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }


    }
}
