import java.util.Scanner;
public class exp_1_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary Number : ");
        String bin=sc.nextLine();
        int dec=Integer.parseInt(bin,2);
        System.out.println("Decimal value : "+ dec);
        sc.close();
    }
    
}
