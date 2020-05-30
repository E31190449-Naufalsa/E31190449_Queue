/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31190449_queue;

/**
 *
 * @author naufalsa
 */
public class Runner {
        public static void main(String[] args) {
        Queue q=new Queue();
        q.enQueue(5);
        q.enQueue(2);
        q.enQueue(7);
        
        q.deQueue();
        q.deQueue();
        
        q.enQueue(9);
        q.enQueue(1);
        
        System.out.println(q.isFull());
        
        System.out.println("Size "+q.getSize());
        q.show();
        
    }
}

