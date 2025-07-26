import java.util.Scanner;
public class exp_1_26 { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Octal number:");
        String oct=sc.nextLine();
        int dec=Integer.parseInt(oct,8);
        String hex=Integer.toHexString(dec);
        System.out.println("Hexadecimal Value:"+hex);
        sc.close();
    }
}