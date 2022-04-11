public class Main {

    public static void main(String[] args) {


        BorderCheckCar borderCheckCar = new BorderCheckCar();
        BorderCheckTruck borderCheckTruck = new BorderCheckTruck();
        Car car = new Car(borderCheckCar);
        Truck truck = new Truck(borderCheckTruck);
        Thread carThread = new Thread(car);
        Thread truckThread = new Thread(truck);
        truckThread.start();
        carThread.start();

    }
}
