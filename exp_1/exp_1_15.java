import java.util.Scanner;
public class exp_1_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the NUmber 1 : ");
        int num1=sc.nextInt();
        System.out.print("Enter the Number 2 : ");
        int num2=sc.nextInt();
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("numbers after swapping : "+"\nNumber 1 : " + num1 +"\nNumber 2 : " + num2);
        sc.close();
    }
}
