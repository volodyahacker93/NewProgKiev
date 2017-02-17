package Module_2.Task_2;

import java.util.Arrays;

public class JSON {

    private String name;
    private String surname;
    private String[] phones;
    private String[] sites;
    private Address address;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n")
                .append("Surname: ").append(surname).append("\n")
                .append("Phones: ").append(Arrays.toString(phones)).append("\n")
                .append("Sites: ").append(Arrays.toString(sites)).append("\n")
                .append(address).append("\n");

        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public String[] getSites() {
        return sites;
    }

    public void setSites(String[] sites) {
        this.sites = sites;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
