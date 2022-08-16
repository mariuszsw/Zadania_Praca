import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    /**
     * @author  Mariusz Świerkot
     * @mail mariusz.swierkot@gmail.com
     */

    /**
     * Z publicznego API: https://jsonplaceholder.typicode.com pobierz wszystkie zapisane posty znajdujące się pod adresem
     * https://jsonplaceholder.typicode.com/posts tak by po wywołaniu metody getPosts() można było wypisać wszystkie elementy w konsoli,
     * podobnie jak wypisuje je przeglądarka po wejściu w link.
     *
     * Można skorzystać z dowolnych sposobów pobierania danych z API dostępnych dla języka Java.
     * */

    public static String getPosts() throws IOException {
        URL urlForGetRequest = new URL("https://jsonplaceholder.typicode.com/posts/");
        String readLine = "";
        HttpURLConnection urlConnection = (HttpURLConnection) urlForGetRequest.openConnection();
        urlConnection.setRequestMethod("GET");

        if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(urlConnection.getInputStream()));
            StringBuffer response = new StringBuffer();
            while ((readLine = in.readLine()) != null) {
                response.append(readLine);
            }
            in.close();
            return response.toString();
        } else {
            return "NOT WORKING";        }

    }

    public static void main(String[] args) throws IOException {
        System.out.println(getPosts());
    }

}
