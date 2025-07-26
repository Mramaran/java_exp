import java.util.Scanner;
public class exp_1_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexa decimal Number : ");
        String hex = sc.nextLine();
        int dec = Integer.parseInt(hex,16);
        String oct=Integer.toOctalString(dec);
        System.out.println("Octal value : "+oct);
        sc.close();
    }
}
