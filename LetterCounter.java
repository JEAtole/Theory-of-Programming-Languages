import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        System.out.print("Enter letter: ");
        String letterInput = scanner.nextLine();

        // Convert the letter input to lowercase to make it case-insensitive
        char letter = letterInput.toLowerCase().charAt(0);

        // Count the occurrences of the letter in the sentence
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (currentChar == letter) {
                count++;
            }
        }

        // Display the result
        System.out.printf("The letter '%c' occurred %d time/s.\n", letter, count);

        scanner.close();
    }
}