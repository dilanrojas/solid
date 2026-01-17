package dependency.fixed;

public class Main {
    public static void main(String[] args) {
        Engine engine = new GasolinEngine();
        CarOriginal car = new CarOriginal(engine);

        car.startCar();
    }
}
