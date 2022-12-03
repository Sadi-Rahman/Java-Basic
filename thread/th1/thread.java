package thread.th1;

class multthread extends Thread{

    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
             System.out.println(i);
             try {
                Thread.sleep(2000);
                
             } catch (InterruptedException e) {
                
             }
            
        }
    }
        class thread{
        public static void main(String[] args) {
         //System.out.println("");

        multthread th1 = new multthread();
        th1.start();
    }
 }
}

    
    

