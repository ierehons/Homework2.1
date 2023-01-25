public class Cars {
    private String brand;
    private String model;
    private String engineVolume;
    private String color;
    private String year;
    private String country;

    public Cars(String brand, String model, String engineVolume, String color, String year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
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

    public String getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(String engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
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
        return "Car{" +
                "Марка='" + brand + '\'' +
                ",  Модель='" + model + '\'' +
                ", Обьёь двигателя в л=" + engineVolume +
                ", Цвет='" + color + '\'' +
                ", Год выпуска=" + year +
                ", Страна сборки='" + country + '\'' +
                '}';
    }
}
