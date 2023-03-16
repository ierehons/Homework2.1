package transport;

public class TestCars {
    public static void main(String[] args) {
        Car BMV = new Car("bmv",
                "X6",
                2010,
                "Germany",
                "black",
                260,
                3.5,
                "автомат",
                "внедорожник",
                "а564вп111",
                7,
                true,
                new Car.Key(true, false));
        Car.Key key = new Car.Key(true, true);

        System.out.println(BMV);

        Bus Volvo = new Bus("Volvo",
                "mult",
                2009,
                "",
                "зелёный",
                170);
        Bus Zil = new Bus("Zil",
                "автобус",
                1989,
                "Россия",
                "жёлтый",
                160);
        Bus Liaz = new Bus("ЛиАЗ",
                "5256",
                2000,
                "Россия",
                "",
                140);
        System.out.println(Volvo);
        System.out.println(Zil);
        System.out.println(Liaz);

    }
}