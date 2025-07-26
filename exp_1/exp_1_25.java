import java.util.Scanner;
public class exp_1_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a octal number : ");
        String octal=sc.nextLine();
        int dec=Integer.parseInt(octal,8);
        String bin=Integer.toBinaryString(dec);
        System.out.println("Binary value : "+bin);
        sc.close();
    }
}
