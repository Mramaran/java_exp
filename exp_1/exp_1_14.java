public class exp_1_14 {
    public static void main(String[] args) {
        String starLine1 = "* * * * * * ==================================\n";
        String starLine2 = " * * * * *  ==================================\n";
        String stripeLine = "==============================================\n";
        
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0)
                System.out.print(starLine1);
            else
                System.out.print(starLine2);
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(stripeLine);
        }
    }
}
