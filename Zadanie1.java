/**
 * @author  Mariusz Świerkot
 * @mail mariusz.swierkot@gmail.com
 */

    /** Napisz ciało metody createPicture(int n), która dla dowolnego n > 0 stworzy gotowy do wypisania w konsoli wzór.
             *
             * Przykłady:
             *
             * Dla n = 1 w konsoli powinien pojawić się wzór:
             * 1
             *
             * Dla n = 2 w konsoli powinien pojawić się wzór:
             * 2 2 2
             * 2 1 2
             * 2 2 2
             *
             * Dla n = 3 w konsoli powinien pojawić się wzór:
             * 3 3 3 3 3
             * 3 2 2 2 3
             * 3 2 1 2 3
             * 3 2 2 2 3
             * 3 3 3 3 3
             *
             * Dla n = 4 w konsoli powinien pojawić się wzór:
             * 4 4 4 4 4 4 4
             * 4 3 3 3 3 3 4
             * 4 3 2 2 2 3 4
             * 4 3 2 1 2 3 4
             * 4 3 2 2 2 3 4
             * 4 3 3 3 3 3 4
             * 4 4 4 4 4 4 4
             *
             */
public class Main {
    public static String createPicture(int n) {
        StringBuilder sb = new StringBuilder();
        int z , k , j ;
        z=2*n-2 ;

        for(k=0 ; k<2*n-1 ; k++)
        {
            for(j=0 ; j<2*n-1 ; j++)
            {
                sb = sb.append((k>j)&&(z+1>j) ? n-j : ((k>=n)&&(j<=k) ? k-n+2 : (j>z ? j-n+2 : n-k))) ;
            }
        z-- ;
        sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(createPicture(4));
    }
}
