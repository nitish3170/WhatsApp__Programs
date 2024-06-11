import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n= sc.nextInt();
        int[] Array=new int[n];
        for(int i=0; i<n;i++){
            Array[i]= sc.nextInt();
        }
        for (int i=0;i<n;i++){
            if (Array[i]%2==0){
                System.out.printf("Even Number : %d\n",Array[i]);
            }
            else{
                System.out.printf("Odd Number : %d\n",Array[i]);
            }
        }
    }
}
