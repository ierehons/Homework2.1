import java.util.Objects;

public class Cars {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Cars(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        if (color == null || color.length() == 0) {
            this.color = "white";
        }
        if (brand == null || model == null || country == null || brand.length() == 0 || model.length() == 0 || country.length() == 0) {
            this.brand = "default";
            this.model = "default";
            this.country = "default";
        }
        if (year <= 0) {
            this.year = 2000;
        }
    }


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

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + String.format("%.2f", engineVolume) +
                ", color='" + color + '\'' +
                ", year='" + year + '\'' +
                ", country='" + country + '\'' +
                '}';

    }
}


