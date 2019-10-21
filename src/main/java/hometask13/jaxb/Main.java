package hometask13.jaxb;

import hometask12.Map;

import javax.xml.bind.JAXBException;

public class Main {
    public static void main(String[] args) throws JAXBException {
        JAXBUtil jaxbUtil = new JAXBUtil();
        User user = new User("Jack", "Ripper", 46, "000-44-11-23");

        jaxbUtil.write(user);
        User user2 = jaxbUtil.reader("E:\\Epam_Java\\epam-project-test\\src\\main\\java\\hometask13\\jaxb\\read.xml");

        System.out.println(user2);

    }

}
