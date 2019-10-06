package hometask4.remake;

import org.apache.log4j.Logger;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class ConsoleApplication {
    public final static Logger logger = Logger.getLogger(ConsoleApplication.class.getName());

    public static void main(String[] args) throws UnsupportedEncodingException {
//        new Menu().run();
//        ResourceBundle bundle = ResourceBundle.getBundle("text");
//        System.out.println(bundle.getObject("st"));
//
//        bundle = ResourceBundle.getBundle("text", new Locale("ru", "RU"));
//        System.out.println(bundle.getObject("st"));


        try {
            throw new RuntimeException("Logger Test");
        }
        catch (RuntimeException e){
            logger.error("Runtime exception logging test!", e);


        }

    }
}
