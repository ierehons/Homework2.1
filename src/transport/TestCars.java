package transport;

public class TestCars {
    public static void main(String[] args) {
        Car BMV = new Car("BMV",
                "X7",
                3.5,
                "Red",
                2010,
                "null",
                "автомат",
                "Внедорожник",
                "к163ом163",
                7,
                false, new Car.Key(true, true));
        Car.Key key = new Car.Key(true, true);

        System.out.println(BMV);


    }
}