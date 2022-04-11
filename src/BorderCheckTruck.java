import java.util.List;

public class BorderCheckTruck {

    public synchronized void checkInTruck() throws InterruptedException {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
