package thread.th1;

public class thread extends Thread{

    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
             System.out.println(i);
             try {
                Thread.sleep(2000);
                
             } catch (InterruptedException e) {
                
             }
            
        }

        class Multithread{
        public static void main(String[] args) {
         //System.out.println("");

        thread th1 = new thread();
        th1.start();
    }
 }
    }

    
    
}
