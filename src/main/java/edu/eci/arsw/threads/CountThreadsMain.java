/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static void main(String a[]){
		
		Thread thread1 = new Thread(new CountThread(0,99));
        Thread thread2 = new Thread(new CountThread(99,199));
        Thread thread3 = new Thread(new CountThread(200,299));
		
		thread1.start();
		thread2.start();
		thread3.start();
    }
    
}
