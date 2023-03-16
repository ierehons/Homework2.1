package transport;

import java.util.Objects;
import java.util.regex.Pattern;

import static transport.ValidateUtils.validateBoolean;
import static transport.ValidateUtils.validateString;

public class Car extends Transport {

    final String bodyType;
    final int numberOfSeats;
    private double engineVolume;

    private String transmission;
    private String registrationNumber;
    private boolean isSummerRubber;

    private Key key;


    // конструктор
    public Car(String brand,
               String model,
               Integer year,
               String country,
               String color,
               Integer speedMax,
               double engineVolume,
        String transmission,
        String bodyType,
        String registrationNumber,
        int numberOfSeats,
        boolean isSummerRubber,
        Key key) {

        super (brand, model, year, country, color, speedMax);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.transmission = validateTransmission(transmission);
        this.bodyType = validateCarParameters(bodyType);
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = validateNumberOfSeats(numberOfSeats);
        this.isSummerRubber = isSummerRubber;
        this.key = key;
    }



    // гетеры и сеттеры


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateEngineVolume(engineVolume);
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = validateTransmission(transmission);
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSummerRubber() {
        return isSummerRubber;
    }

    public void setSummerRubber(boolean summerRubber) {
        isSummerRubber = summerRubber;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Key getKey() {
        return key;
    }

    // замена покрышек от времени года
    public void changeTyres(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            isSummerRubber = false;
        }
        if (month >= 4 && month <= 10) {
            isSummerRubber = true;
        }
    }

    // проверка номера машины
    public String validateCarNumber(String number) {
        if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{3}", number)) {
            return number;
        } else {
            System.out.println("Некорректный номер");
            return "Неверный номер";
        }
    }

    public int validateNumberOfSeats(int numberOfSeats) {
        return numberOfSeats <= 0 ? 4 : numberOfSeats;
    }

    public static String validateCountry(String value) {
        return validateString(value, "Rus");
    }

    public static double validateEngineVolume(double value) {
        return value <= 0 ? 1.5 : value;
    }

    public static String validateCarParameters(String value) {
        return value == null ? "не указано" : value;
    }

    public static String validateTransmission(String value) {
        return validateString(value, "автомат");
    }


    public static class Key {
        private final boolean remoteStart;
        private final boolean keyLassAccess;

        public Key(boolean remoteStart, boolean keyLassAccess) {
            this.remoteStart = validateBoolean(remoteStart);
            this.keyLassAccess = validateBoolean(keyLassAccess);
        }


        @Override
        public String toString() {
            return "Key{" +
                    "remoteStart=" + remoteStart +
                    ", keyLassAccess=" + keyLassAccess +
                    '}';
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return numberOfSeats == car.numberOfSeats && Double.compare(car.engineVolume, engineVolume) == 0 && isSummerRubber == car.isSummerRubber && Objects.equals(bodyType, car.bodyType) && Objects.equals(transmission, car.transmission) && Objects.equals(registrationNumber, car.registrationNumber) && Objects.equals(key, car.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bodyType, numberOfSeats, engineVolume, transmission, registrationNumber, isSummerRubber, key);
    }

    @Override
    public String toString() {
        return "Car{" +
                "bodyType='" + bodyType + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", isSummerRubber=" + isSummerRubber +
                ", key=" + key +
                '}';
    }
}


