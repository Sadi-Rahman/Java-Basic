package thread.th3;

class Threading extends Thread{
    @Override
    public void run() {
        try {
             System.out.println("Thread" + Thread.currentThread().getId() + "Running");
        } catch (Exception e) {
             System.out.println("Exception"); 
        }   
    }

}

public class Multithread {
    public static void main(String[] args) {
        int n =5;
        for (int i = 0; i < n; i++) {
            Threading obj = new Threading();
            obj.start();
        }
    }
    
}
