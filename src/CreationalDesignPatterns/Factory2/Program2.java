package CreationalDesignPatterns.Factory2;

public class Program2 {
    public static void main(String[] args) {
        CarFactory carFactory = createCarFactory("Toyota");
        Car car = carFactory.createCar();
        car.drive();
    }

    static CarFactory createCarFactory (String plant){
        switch (plant){
            case "Toyota":
                return new ToyotaFactory();
            case "Honda":
                return new HondaFactory();
            case "Bmw":
                return new BmwFactory();
            default:
                throw new RuntimeException("HOLY SHIT");
        }

    }
}
