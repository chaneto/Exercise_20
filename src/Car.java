import java.util.List;

public class Car<T> implements Runnable{

    private BorderCheckCar borderCheckCar;
    private List<String> vechicles;

    public Car(BorderCheckCar borderCheckCar) {
        this.borderCheckCar = borderCheckCar;
    }

    @Override
    public void run() {
        vechicles = List.of("Lada", "Moskvich", "ZAZ", "Trabant", "Varshava", "BMW");
        for (int i = 0; i < vechicles.size(); i++) {
            try {
                System.out.println("(" + Thread.currentThread().getName() + ")" + "- Car: " + vechicles.get(i) + "(check in)");
                this.borderCheckCar.checkInCar();
                System.out.println("(" + Thread.currentThread().getName()+ ")" + "- Car: " + vechicles.get(i) + "(check out)");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
