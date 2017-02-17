package Module_2.Task_1;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeAdapter extends XmlAdapter<String, LocalTime>{

    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm");

    @Override
    public String marshal(LocalTime time) throws Exception {
        return time.format(TIME_FORMAT);
    }

    @Override
    public LocalTime unmarshal(String time) throws Exception {
        return LocalTime.parse(time, TIME_FORMAT);
    }
}
