public class SumOfArray {
    public static void main(String[] args) {
        
/* calculate the sum of all araay element */
int arr[]= {45,25,65,32,45,78,68};
int sum =0;

for(int i=0;i<arr.length-1;i++){
    sum=sum+i;
}

System.out.println("sum :-"+sum);

    }
}