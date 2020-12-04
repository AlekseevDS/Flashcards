import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<String>();

        while (true) {
            String inp = scan.next();
            if (inp.equals("0")) {
                break;
            } else {
                numbers.add(inp);
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            try {
                System.out.println(10 * Integer.parseInt(numbers.get(i))); //парсит, умножает и печатает строку из списка
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + numbers.get(i));
            }
        }
    }
}