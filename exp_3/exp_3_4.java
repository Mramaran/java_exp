public class exp_3_4 {
    public static void checkVowels(String input) throws Exception {
        if (!input.matches(".*[aeiouAEIOU].*")) {
            throw new Exception("String does not contain vowels.");
        }
        System.out.println("String contains vowels.");
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        try {
            checkVowels(userInput);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
