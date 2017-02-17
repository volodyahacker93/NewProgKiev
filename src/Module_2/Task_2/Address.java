package Module_2.Task_2;

public class Address {

    private String country;
    private String city;
    private String street;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address: ")
                .append("\n\tCountry: ").append(country)
                .append("\n\tCity: ").append(city)
                .append("\n\tStreet: ").append(street).append("\n");
        return sb.toString();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
