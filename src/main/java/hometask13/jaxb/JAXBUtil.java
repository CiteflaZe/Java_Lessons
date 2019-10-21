package hometask13.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBUtil {

    public void write(User user) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(User.class);
        Marshaller marshaller = context.createMarshaller();
        File file = new File("E:\\Epam_Java\\epam-project-test\\src\\main\\java\\hometask13\\jaxb\\write.xml");

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(user, file);
        marshaller.marshal(user, System.out);
    }

    public User reader(String filePath) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(User.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        File file = new File(filePath);

        return (User) unmarshaller.unmarshal(file);
    }

}
