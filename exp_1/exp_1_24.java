import java.util.Scanner;
public class exp_1_24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Octal number:");
        String oct=sc.nextLine();
        int dec=Integer.parseInt(oct,8);
        System.out.println("Decimal Value : "+dec);
        sc.close();
    }
    
}
