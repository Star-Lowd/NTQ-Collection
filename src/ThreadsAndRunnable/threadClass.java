/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsAndRunnable;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Star Blazh
 */
public class threadClass extends Thread{

    private long sleepTime = 0;
    Thread th ;
    public threadClass() {
        sleepTime = 1000;
    }

    public threadClass(long sleepTime, Thread th) {
        this.sleepTime = sleepTime;
        this.th = th;
    }
    @Override
    public void run() {
//        th.start();
         while (true){
             
             try {
                 System.out.println("Sleep Time :"+sleepTime);
                 
                 this.sleepTime -= 10;
                 if (sleepTime <= 0)
                 {
                     this.stop();
                 }
                
                 Thread.sleep(sleepTime);
             } catch (InterruptedException ex) {
                 Logger.getLogger(threadClass.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
    }
    
    public static void main(String[] args) throws InterruptedException {
        threadClass th1 = new threadClass(3000,null);
        th1.start();
        threadClass th2 = new threadClass(2000,null);
        th2.start();
        threadClass th3 = new threadClass(500, null);
        th3.start();
    }
}
