import java.util.Scanner;

public class exp_1_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first binary number: ");
        String bin1 = sc.nextLine();

        System.out.print("Enter second binary number: ");
        String bin2 = sc.nextLine();

        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2,2);

        int product = num1 * num2;

        String result = Integer.toBinaryString(product);

        System.out.println("Product of the two binary numbers: " + result);
        sc.close();
    }
}
