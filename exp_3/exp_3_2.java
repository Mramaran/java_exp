import java.util.Scanner;
public class exp_3_2 {
    public static void checkEven(int number) throws Exception {
        if (number % 2 != 0) {
            throw new Exception("Number is odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num;
        try {
            num = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input.");
            sc.close();
            return;
        }
        try {
            checkEven(num); 
            System.out.println("Number is even");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}
