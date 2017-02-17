package Module_2.Task_1;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAdapter extends XmlAdapter<String, LocalDate>{

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    @Override
    public String marshal(LocalDate date) throws Exception {
        return date.format(DATE_FORMAT);
    }

    @Override
    public LocalDate unmarshal(String date) throws Exception {
        return LocalDate.parse(date, DATE_FORMAT);
    }
}
