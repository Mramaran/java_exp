import java.util.Scanner;
public class exp_1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius : ");
        int rad=sc.nextInt();
        float area=(float)(3.14*rad*rad);
        float peri=(float)(2*3.14*rad);
        System.out.println("Area : "+area+"\nPerimeter : "+peri);
        sc.close();
    }
    
    
}
