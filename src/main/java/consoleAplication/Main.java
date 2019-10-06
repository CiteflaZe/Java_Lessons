package consoleAplication;




import consoleAplication.service.StudentServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("aplicationContext.xml");

        Menu menu = context.getBean("menu", Menu.class);
        menu.menu();
        context.close();
    }
}
