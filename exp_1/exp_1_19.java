import java.util.Scanner;
public class exp_1_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal number : ");
        int decimal = sc.nextInt(); // 
        String hex = Integer.toHexString(decimal);
        System.out.println("Hexadecimal number: " + hex.toUpperCase());
        sc.close();
    }
}
