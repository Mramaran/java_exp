import java.util.Scanner;
public class exp_1_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a decimal number:");
        int dec=sc.nextInt();
        String oct=Integer.toOctalString(dec);
        System.out.println("Octal value : "+oct);
        sc.close();
    }
}
