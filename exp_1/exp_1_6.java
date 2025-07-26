import java.util.Scanner;
public class exp_1_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int num1=sc.nextInt();
        System.out.print("Enter the number 2 : ");
        int num2=sc.nextInt();
        System.out.println("Sum:"+(num1+num2));
        System.out.println("Difference:"+(num1-num2));
        System.out.println("Product:"+(num1*num2));
        System.out.println("Quotient:"+(num1/num2));
        sc.close();
    }
}
