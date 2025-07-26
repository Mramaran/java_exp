import java.util.Scanner;
public class exp_1_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexa decimal Number : ");
        String hex = sc.nextLine();
        int dec = Integer.parseInt(hex,16);
        System.out.println("Decimal Value : " + dec);
        sc.close();
    }
}
