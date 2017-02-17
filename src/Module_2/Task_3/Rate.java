package Module_2.Task_3;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "rate")
@XmlAccessorType(XmlAccessType.FIELD)
public class Rate {

    @XmlAttribute(name = "id")
    private String id;
    @XmlElement(name = "Name")
    private String name;
    @XmlElement(name = "Rate")
    private double rate;
    @XmlElement(name = "Date")
    private String date;
    @XmlElement(name = "Time")
    private String time;
    @XmlElement(name = "Ask")
    private Double ask;
    @XmlElement(name = "Bid")
    private Double bid;

    public Rate() {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Rate:[");
        sb.append("\n\tId:\t").append(id)
                .append("\n\tName:\t").append(name)
                .append("\n\tRate:\t").append(rate)
                .append("\n\tDate:\t").append(date)
                .append("\n\tTime:\t").append(time)
                .append("\n\tAsk:\t").append(ask)
                .append("\n\tBid:\t").append(bid)
                .append("\n]\n");
        return sb.toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getAsk() {
        return ask;
    }

    public void setAsk(Double ask) {
        this.ask = ask;
    }

    public Double getBid() {
        return bid;
    }

    public void setBid(Double bid) {
        this.bid = bid;
    }
}
