package Threads1_opg1;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Philip
 */
public class Opgave1 {

    public static void main(String args[]) {
        task1 t1 = new task1();
        t1.start();
        task2 t2 = new task2();
        t2.start();
        task3 t3 = new task3();
        t3.start();
    }
}
