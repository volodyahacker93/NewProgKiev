package Module_2.Task_3;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        try {
            String http = "http://query.yahooapis.com/v1/public/yql?" +
                    "format=xml&q=select*%20from%20yahoo.finance.xchange%20where%20pair%20in%20" +
                    "(\"USDEUR\",\"USDUAH\")&env=store://datatables.org/alltableswithkeys";

            URL url = new URL(http);
            JAXBContext jaxbContext = JAXBContext.newInstance(Query.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Query query = (Query) unmarshaller.unmarshal(url);

            System.out.println(query);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    //ascascascasca
}
