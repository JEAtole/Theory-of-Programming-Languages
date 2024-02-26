import java.util.Scanner;

public class DFA {
    public static void main(String[] args) {

        String state = "q0";
        System.out.print("Enter input: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        for(int x=0; x < input.length(); x++){

            int y = input.charAt(x) - '0';

            if (state.equals("q0") && y==1){
                state = "q0";
            } else if (state.equals("q0") && y==0){
                state = "q1";
            } else if (state. equals("q1") && y == 1) {
                state = "q2";
            } else if (state. equals("q1") && y == 0){
                state = "q1";
            } else if (state. equals("q2") && y == 1){
                state = "q0";
            } else if (state. equals("q2") && y == 0){
                state = "q1";
            } else {
                System.out.println("Invalid input... Exiting Automaton.");
                state = "invalid";
                break;
            }
        }

        if (state.equals("q2")){
            System.out.println("String accepted");
        } else {
            System.out.println("String not accepted.");
        }

        sc.close();

    }
}