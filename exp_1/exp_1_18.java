import java.util.Scanner;
public class exp_1_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a decimal number:");
        int dec=sc.nextInt();
        String bin=Integer.toBinaryString(dec);
        System.out.println("Binary value : "+bin);
        sc.close();
    }
}
