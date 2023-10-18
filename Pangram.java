import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        
        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        
        scanner.close();
    }

    public static boolean isPangram(String input) {
        // Convert the input to lowercase to make it case-insensitive
        input = input.toLowerCase();

        // Create an array to mark the presence of each alphabet letter
        boolean[] isPresent = new boolean[26];

        // Iterate through the input and mark the presence of letters
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                isPresent[c - 'a'] = true;
            }
        }

        // Check if all alphabet letters are present
        for (boolean present : isPresent) {
            if (!present) {
                return false;
            }
        }

        return true;
    }
}
