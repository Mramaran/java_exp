import java.util.Scanner;

public class exp_1_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hex = sc.nextLine();
        int decimal = Integer.parseInt(hex, 16);
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary Value: " + binary);
       sc.close();
    }
}
