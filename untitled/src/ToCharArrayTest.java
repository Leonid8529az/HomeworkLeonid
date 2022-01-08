import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;

public class ToCharArrayTest {

    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            InputStream inputStream = new FileInputStream("src/misha/michail.properties");
            properties.load(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("year");
    }
}