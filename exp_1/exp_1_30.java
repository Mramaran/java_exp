import java.util.Scanner;
public class exp_1_30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number 1:");
        int num1=sc.nextInt();
        System.out.print("Enter a number 2:");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println(num1+">"+num2);
        }
        else if(num1<num2){
            System.out.println(num1+"<"+num2);
        }
        else{
            System.out.println(num1+"="+num2);
        }
        sc.close();
    }
}
