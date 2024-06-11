import java.util.Scanner;

public class Pallindrome {
    public static int reverse(int num){
        int reversedNumber=0;
        while (num>0){
            int digit=num%10;
            reversedNumber=reversedNumber*10+digit;
            num/=10;
        }
        return reversedNumber;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int reverse=reverse(num);
        if (num==reverse){
            System.out.println("The number is pallindrome.");
        }
        else{
            System.out.println("The number is not pallindrome.");
        }
    }


}
