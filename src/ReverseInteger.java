import java.util.Scanner;
//reverse an integer number
public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        String num=sc.next();
        int len=num.length();
        int num1=Integer.parseInt(num);
        int reversedNumber=0;
        while (num1>0){
            int digit=num1%10;
            reversedNumber=reversedNumber*10+digit;
            num1/=10;
        }
        System.out.printf("Reversed Number: %d",reversedNumber);
    }
}
