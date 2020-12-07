import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<String> dictionary = new HashSet<>();
        Set<String> baseInp = new HashSet<>();

        int numOfDicWords = scan.nextInt();
        for (int i = 0; i < numOfDicWords; i++) { //заполняем словарь
            String dicWord = scan.next();
            dictionary.add(dicWord.toLowerCase());
        }

        int numOfLines = scan.nextInt();
        for (int i = 0; i <= numOfLines; i++) { //заполняем проверяемые строки (слова)
            String inpWord = scan.nextLine();
            String[] words = inpWord.toLowerCase().split(" ");
            baseInp.addAll(Arrays.asList(words));
        }

        Set<String> result = intersect(baseInp, dictionary);
        result.forEach(elem->System.out.println(elem));

    }

    static public Set<String> intersect(Set<String> set1, Set<String> set2){
        set1.removeAll(set2);
        return set1;
    }
}
