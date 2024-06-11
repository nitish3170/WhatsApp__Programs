import java.util.Scanner;

public class EvenLocation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n= sc.nextInt();
        int[] Array=new int[n];
        for(int i=0; i<n;i++){
            Array[i]= sc.nextInt();
        }
        for (int i=0;i<n;i++){
            if (i%2==0){
                System.out.println(Array[i]);
            }
        }
    }
}
