package Module_2.Task_1;


import javax.xml.bind.*;
import java.io.File;

public class Parser {

    public static <T> void write(String path, T catalog) {
        try {
            File file = new File(path);
            JAXBContext jaxbContext = JAXBContext.newInstance(catalog.getClass());
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(catalog, file);
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
    }

    public static <T> T read(String path) {
        T catalog = null;
        try {
            File file = new File(path);
            JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            catalog = (T) unmarshaller.unmarshal(file);
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }

        return catalog;
    }
}
