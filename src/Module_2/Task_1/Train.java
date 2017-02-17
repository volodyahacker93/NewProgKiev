package Module_2.Task_1;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@XmlRootElement(name = "train")
@XmlAccessorType(XmlAccessType.FIELD)

public class Train {

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm");

    @XmlAttribute
    private int id;

    @XmlElement
    private String from;

    @XmlElement
    private String to;

    @XmlJavaTypeAdapter(DateAdapter.class)
    private LocalDate date;

    @XmlJavaTypeAdapter(TimeAdapter.class)
    private LocalTime departure;

    public Train() {
    }

    public Train(int id, String from, String to, String date, String departure) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.date = LocalDate.parse(date, DATE_FORMAT);
        this.departure = LocalTime.parse(departure, TIME_FORMAT);
    }

    public Train(int id, String from, String to, LocalDate date, LocalTime departure) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.date = date;
        this.departure = departure;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("№ ").append(id)
                .append(": ").append(from).append(" - ").append(to)
                .append(", date: ").append(date.format(DATE_FORMAT))
                .append(" ").append(departure.format(TIME_FORMAT))
                .append("\r\n");

        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalTime departure) {
        this.departure = departure;
    }
}






