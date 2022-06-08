package task12;

import java.util.Objects;

public final class Manufacturer { // klasa nie jest rozszerzalna - nie dziedziczy

    private final String name;
    private final int yearOfSetUp;
    private final String country;

    public Manufacturer(String name, int yearOfSetUp, String country) {
        this.name = name;
        this.yearOfSetUp = yearOfSetUp;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getYearOfSetUp() {
        return yearOfSetUp;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", yearOfSetUp=" + yearOfSetUp +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return yearOfSetUp == that.yearOfSetUp && Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfSetUp, country);
    }
}
