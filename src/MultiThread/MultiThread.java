package MultiThread;

public class MultiThread extends Thread{
    volatile static int i=0;

    @Override
    public void run() {


        for (int t = 0; t < 20; t++) {
            System.out.println("i= " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized public static void main(String[] args) throws InterruptedException {
        new MultiThread().start();
        for(int t=0;t<20;t++){
        i=t;
        i=i+10;
        System.out.println("from main i= "+i);
        Thread.sleep(500);}
    }
}



