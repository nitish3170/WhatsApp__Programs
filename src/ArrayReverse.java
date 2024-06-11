import java.sql.Array;
import java.util.Scanner;

public class ArrayReverse {
    public static void Reverse(int[] Array){
        int size=Array.length-1;
        int i=0;
        while(i<size){
            int temp=Array[i];
            Array[i]=Array[size];
            Array[size]=temp;
            i++;size--;
        }
        return;
    }

    public static void ArrayPrint(int [] Array) {
        for (int i=0;i<Array.length;i++) {
            System.out.println(Array[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n= sc.nextInt();
        int[] Array=new int[n];
        for(int i=0; i<n;i++){
            Array[i]= sc.nextInt();
        }
        Reverse(Array);
        ArrayPrint(Array);
    }
}
