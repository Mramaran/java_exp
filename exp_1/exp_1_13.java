import java.util.Scanner;
public class exp_1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Lenght : ");
        int l=sc.nextInt();
        System.out.print("Enter the Width : ");
        int b=sc.nextInt();
        int area=l*b;
        int peri=l+l+b+b;
        System.out.println("Area : "+area+"\nPerimeter : "+peri);
        sc.close();
    }
}