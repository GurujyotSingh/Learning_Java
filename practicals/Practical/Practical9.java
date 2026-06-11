public class Practical9 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread using Thread class: " + i);
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        });
        
        Runnable r = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread using Runnable: " + i);
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        };
        Thread t2 = new Thread(r);
        
        t1.start();
        t2.start();
    }
}