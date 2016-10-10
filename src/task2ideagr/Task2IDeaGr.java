/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2ideagr;

/**
 *
 * @author Коти
 */
public class Task2IDeaGr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StackByLL a = new StackByLL();
        a.getSize();
        a.pop();
        a.getSize();
        for(int i=0;i<10;i++){
            a.push(i);
            System.out.println(i);
        }
        a.getSize();
        Object item;
        for(int i=0;i<12;i++){
            item = a.pop();
            System.out.print("i ->   ");
            System.out.println(item);
        }
        a.getSize();
        for(int i=0;i<20;i++){
            a.push(i);
            System.out.println(i);
        }
        a.getSize();
        for(int i=0;i<10;i++){
            item = a.pop();
            System.out.print("i ->   ");
            System.out.println(item);
        }
        a.getSize();
        for(int i=0;i<10;i++){
            a.push(i);
            System.out.println(i);
        }
        a.getSize();
    }
    
}
