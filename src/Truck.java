import java.util.List;

public class Truck implements Runnable{

    private BorderCheckTruck borderCheck;
    private List<String> vechicles;

    public Truck(BorderCheckTruck borderCheck) {
        this.borderCheck = borderCheck;
    }

    @Override
    public void run() {
        vechicles = List.of("Man", "Volvo", "Scania", "DAF");
        for (int i = 0; i < vechicles.size(); i++) {
            try {
                System.out.println("(" + Thread.currentThread().getName() + ")" + "- Truck: " + vechicles.get(i) + "(check in)");
                this.borderCheck.checkInTruck();
                System.out.println("(" + Thread.currentThread().getName()+ ")" + "- Truck: " + vechicles.get(i) + "(check out)");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
