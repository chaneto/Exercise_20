public class BorderCheckCar<T> {

     public synchronized void checkInCar() throws InterruptedException {
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             System.out.println(e.getMessage());
         }
     }

}
