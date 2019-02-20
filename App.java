import java.io.IOException;
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello world");

        try {
            Document doc = Jsoup.connect("http://www.jsoup.org").get();
            org.jsoup.select.Elements links = doc.select("a");

            for (Element e : links) {
                System.out.println(e.attr("abs:href"));
            }

        } catch (IOException ex) {
        }

    }
}
