import java.util.Scanner;
public class exp_1_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a binary number1:");
        String bin1=sc.nextLine();
        System.out.print("Enter a binary number2:");
        String bin2=sc.nextLine();
        int dec1=Integer.parseInt(bin1,2);
        int dec2=Integer.parseInt(bin2,2);
        int res=dec1+dec2;
        String binRes=Integer.toBinaryString(res);
        System.out.println(bin1+"+"+bin2+"="+binRes);
        sc.close();    
    }
    
    
}
