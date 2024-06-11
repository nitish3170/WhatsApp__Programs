import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int len =String.valueOf(num).length();
        int newNum=0;
        int originalNumber=num;
        while (num>0){
            int digit=num%10;
            newNum+=Math.pow(digit,len);
            num/=10;
//            System.out.printf("%d %d",newNum,digit);
        }
        if (originalNumber==newNum){
            System.out.println("The number is Armstrong.");
        }
        else{
            System.out.println("The number is not Armstrong.");
        }
    }
}
