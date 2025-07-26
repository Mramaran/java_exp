import java.util.Scanner;
public class exp_1_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        double x=sc.nextDouble();
        double result = x * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(result);
        sc.close();
    }
}
