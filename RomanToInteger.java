import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.nextLine();
        scanner.close();

        int result = romanToInteger(roman);
        System.out.println("The integer value of " + roman + " is: " + result);
    }

    public static int romanToInteger(String roman) {
        // Create a HashMap to store the values of Roman numerals
        HashMap<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int result = 0;

        for (int i = 0; i < roman.length(); i++) {
            int current = values.get(roman.charAt(i));
            int next = (i + 1 < roman.length()) ? values.get(roman.charAt(i + 1)) : 0;

            if (current < next) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }
}
