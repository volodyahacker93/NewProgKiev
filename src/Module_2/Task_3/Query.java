package Module_2.Task_3;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "query")
@XmlAccessorType(XmlAccessType.FIELD)
public class Query {

    @XmlElementWrapper(name = "results")
    @XmlElement(name = "rate")
    private List<Rate> rates = new ArrayList<>();

    public Query() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(Rate rate : rates) {
            sb.append(rate);
        }

        return sb.toString();
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    public List<Rate> getRates(){
        return rates;
    }
}
