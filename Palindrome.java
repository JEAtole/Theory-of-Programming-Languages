import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        while(true){

            System.out.print("\nEnter word/phrase: ");

            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            //remove special characters
            String newInput = input.replaceAll("[^a-zA-Z0-9]", "");

            //make it all lowercase so that it would not be case-sensitive
            newInput = newInput.toLowerCase();

            int x = 0;                          //first pointer
            int y = newInput.length()-1;        //second pointer
            boolean isPalindrome = true;        //result

            while(x < y) {
                if (newInput.charAt(x)==newInput.charAt(y)){
                    x++;
                    y--;
                } else {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome){
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is NOT a palindrome.");
            }

        }
    }
}
