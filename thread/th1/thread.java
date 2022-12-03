package thread.th1;

class multthread extends Thread{

    @Override
    public void run(){
        for (int i = 1; i <= 3; i++) {
             System.out.println(i);
             try {
                Thread.sleep(1500);
                
             } catch (InterruptedException e) {
                
             }
            
        }
    }
        class thread{
        public static void main(String[] args) {
         //System.out.println("");

        for (int i = 0; i < 4; i++) {
            multthread th1 = new multthread();
            th1.start();

        }
        //multthread th2 = new multthread();  
        //th2.start();
    }
 }
}

    
    

