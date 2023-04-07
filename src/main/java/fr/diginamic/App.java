package fr.diginamic;
import com.github.lalyos.jfiglet.FigletFont;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Hello world!
 *
 */
public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        LOG.info("Bonjour Slf4J !");
        LOG.info("Implémentation Logback");
        String asciiArt = FigletFont.convertOneLine("hello test");
        System.out.println(asciiArt);
    }
}
