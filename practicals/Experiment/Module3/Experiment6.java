class DownloadThread extends Thread {
    private String fileName;
    public DownloadThread(String name) {
        this.fileName = name;
    }
    public void run() {
        for (int i = 0; i <= 100; i += 20) {
            System.out.println(fileName + " Downloaded: " + i + "%");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {}
        }
        System.out.println(fileName + " Downloaded: 100%");
    }
}

public class Experiment6 {
    public static void main(String[] args) {
        DownloadThread t1 = new DownloadThread("File1");
        DownloadThread t2 = new DownloadThread("File2");
        t1.start();
        t2.start();
    }
}
