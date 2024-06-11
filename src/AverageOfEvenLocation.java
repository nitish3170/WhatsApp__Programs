import java.util.Scanner;

public class AverageOfEvenLocation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n= sc.nextInt();
        int[] Array=new int[n];
        for(int i=0; i<n;i++){
            Array[i]= sc.nextInt();
        }
        int sum=0,count=0;
        for (int i=0;i<n;i++){
            if (i%2==0){
                sum+=Array[i];
                count++;
            }
        }
        float average=(float)(sum)/count;
        System.out.printf("Average of element at even locations: %f",average);
    }
}
