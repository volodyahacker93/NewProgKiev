package Module_2.Task_1;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "trains")
public class Catalog {

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm");

    @XmlElement(name = "train")
    private List<Train> trains = new ArrayList<>();

    public Catalog() {
    }

    public void add(Train train) {
        if(train != null && !trains.contains(train)) {
            trains.add(train);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(Train t : trains) {
            sb.append(t);
        }

        return sb.toString();
    }

    public Catalog filter(LocalDate date, LocalTime fromTime, LocalTime toTime) {
        return filter(this, date, fromTime, toTime);
    }

    public Catalog filter(String date, String fromTime, String toTime) {
        return filter(this, date, fromTime, toTime);
    }

    public static Catalog filter (Catalog catalog, String dateStr, String fromTimeStr, String toTimeStr) {
        LocalDate date = LocalDate.parse(dateStr, DATE_FORMAT);
        LocalTime fromTime = LocalTime.parse(fromTimeStr, TIME_FORMAT);
        LocalTime toTime = LocalTime.parse(toTimeStr, TIME_FORMAT);
        return filter(catalog, date, fromTime, toTime);
    }

    public static Catalog filter(Catalog catalog, LocalDate date, LocalTime fromTime, LocalTime toTime) {
        Catalog newCatalog = new Catalog();
        for(Train t : catalog.trains) {
            if(date.equals(t.getDate()) && fromTime.compareTo(t.getDeparture()) <= 0
                    && toTime.compareTo(t.getDeparture()) >= 0) {
                newCatalog.add(t);
            }
        }

        return newCatalog;
    }
}































