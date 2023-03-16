package transport;

import java.util.Objects;

import static transport.ValidateUtils.validateString;

public class Transport {
    private String brand;
    private String model;
    private int year;
    private String country;
    private String color;
    private int speedMax;

    //constructor
    public Transport(String brand,
                     String model,
                     int year,
                     String country,
                     String color,
                     int speedMax) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.year = year;
        this.country = country;
        this.color = validateColor(color);
        this.speedMax =validateSpeedMax (speedMax);
    }

    public static String validateCarParameters (String value) {return value == null ? "не указано" : value;}
    public static int validateSpeedMax (Integer value) {return value == null || value<=0 ? 200 : value;}

    public static String validateColor(String value) {
        return validateString(value, "Белый");
    }

    //getter & setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = validateColor(color);
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(int speedMax) {
        this.speedMax = validateSpeedMax(speedMax);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return year == transport.year && speedMax == transport.speedMax && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(country, transport.country) && Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, country, color, speedMax);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", speedMax=" + speedMax +
                '}';
    }
}
