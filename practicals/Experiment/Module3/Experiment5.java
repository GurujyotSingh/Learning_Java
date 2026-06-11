public class Experiment5 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Current Time: " + new java.util.Date().toString().substring(11, 19));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Experiment5 t = new Experiment5();
        t.start();
    }
}
