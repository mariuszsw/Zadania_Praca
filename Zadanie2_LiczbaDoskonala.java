import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
/**
 * @author  Mariusz Świerkot
 * @mail mariusz.swierkot@gmail.com
 */

/**
 * Liczba doskonała to liczba, której suma dzielników bez niej samej równy jest tej liczbie
 * 6 jest liczbą doskonałą, bo jej dzielniki to: 1,2,3,6 a 1+2+3 = 6
 * 28 jest liczbą doskonałą, bo jej dzielniki to: 1,2,4,7,28 a 1+2+4+7 = 28
 *
 * Zadanie: napisz ciało metody findNPerfectNumbers, która znajdzie n pierwszych liczb doskonałych i zwróci je w postaci listy
 */

public class Main {

    private static boolean isNumberPerfect(int number) {
        return number == IntStream.rangeClosed(1, number / 2)
                .filter(i -> number % i == 0)
                .sum();
    }
    public static ArrayList<Integer> findNPerfectNumbers(int n) {
        return IntStream.range(1, n)
                .filter(Main::isNumberPerfect).boxed().collect(Collectors.toCollection(ArrayList::new));
    }

        public static void main(String[] args) {
            System.out.println(findNPerfectNumbers(1000));
    }



}
