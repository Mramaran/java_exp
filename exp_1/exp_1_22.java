import java.util.Scanner;
public class exp_1_22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Binary number:");
        String bin=sc.nextLine();
        int dec=Integer.parseInt(bin,2);
        String hex=Integer.toHexString(dec);
        hex=hex.toUpperCase();
        System.out.println("HexaDecimal Value:"+hex);
        sc.close();
    }
}
