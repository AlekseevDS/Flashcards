package flashcards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number of cards:");
        int numOfCards = Integer.parseInt(scan.nextLine());
        String[] qaString = {"The card #", //0
                "The definition of the card #", //1
                "Print the definition of ", //2
                "\"", //3
                "Correct!", //4
                "Wrong. The right answer is "}; //5
        String[][] storeQa = new String[numOfCards][2];
        for (int i = 0; i < numOfCards; i++) {
            System.out.println(qaString[0] + (i + 1) + ":"); //The card #:
            storeQa[i][0] = scan.nextLine();
            System.out.println(qaString[1] + (i + 1) + ":"); //The definition of the card #:
            storeQa[i][1] = scan.nextLine();
        }
        checkCard(storeQa, qaString);
    }

    public static void checkCard(String [][] inputQa, String[] text) {
        String answer;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < inputQa.length; i++) {
            System.out.println(text[2] + text[3] + inputQa[i][0] + text[3]); //Print the definition of "???":
            answer = scan.nextLine();
            if (answer.equalsIgnoreCase(inputQa[i][1])) {
                System.out.println(text[4]); //Correct!
            } else {
                System.out.println(text[5] + text[3] + inputQa[i][1] + text[3] + ".");
            }
        }
    }
}