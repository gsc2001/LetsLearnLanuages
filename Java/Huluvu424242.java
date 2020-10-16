import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Huluvu424242 {

    public static void main(String[] args) {
        System.out.println("Hallo Thomas, gib einen Text ein:");
        try (final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            final String text = reader.readLine();
            System.out.println("Länge des eingegebenen Textes:" + text.length());
        } catch (IOException ex) {
            System.out.println("Entschuldigung hier hab ich Mist programmiert. Mein Fehler:\n" + ex.toString());
        } finally {
            // nicht nötig wegen autoclose reader.close();
        }
    }
}