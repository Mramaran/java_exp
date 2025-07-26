import java.util.*;

public class exp_3_3 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        System.out.println("Enter integers separated by spaces:");
        try (Scanner scanner = new Scanner(System.in)) {
            String[] input = scanner.nextLine().split("\\s+");
            try {
                for (String s : input) {
                    int num = Integer.parseInt(s);
                    if (!numbers.add(num)) {
                        throw new DuplicateNumberException("Duplicate number found: " + num);
                    }
                }
                System.out.println("All numbers are unique.");
            } catch (DuplicateNumberException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter only integers.");
            }
        }
    }
}

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}
