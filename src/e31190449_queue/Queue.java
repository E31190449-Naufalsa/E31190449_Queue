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
public class Queue {
    //Mengidentifikasi Variabel
    int queue[]=new int[5];//nama dari array
    int size;//variabel untuk mengisi array
    int front;//untuk memindahkan awal array
    int rear;//dan gunannya untuk memindahkan akhiran dari array
    
    //Membuat method untuk melakukan enqueue
    public void enQueue(int data){
        //membuat kondisi
        if (!isFull()) {//menyatkan jia queue belum terpenuhi
        queue[rear]=data;//memasukkkan nilai data pada array
        rear=(rear+1)%5;//menentukan akhiran array agar nantinya bisa berubah
        size=size+1;//menambahkan ukuran panjang dari array 
        }
        else//menjelaskan jika kondisi if tidak terpenuhi 
        { 
            
            System.out.println("Queue is Full");//menampilkan  pesan full
        }
    }
    
    //Membuat method deQueue untuk menghapus data
    public int deQueue(){
        int data=queue[front];//menentukan isi dari array
        if (!isEmpty()) {// jika Empty belum terpenuhi
             front=(front+1)%5;//memindahkan posisi awal dari array
             size=size-1;
        }
        else//jika kondisi if tidak terpenuhi
        {
            System.out.println("Queue is Empty");//menampilkan pesan Empty
        }
       
        
        return data;//mengembalikan nilai atu data itu sendiri
    }
    
    //membuat method  show untuk menampilkan data
    public void show(){
        System.out.print("Data Queue : ");//menampilkan pesan Queue
        for (int i = 0; i < size; i++) {//membuat perulangan  untuk menampilkan nilai dari array
            System.out.print(queue[(front+i)%5]+" ");//menampilkan output untuk data pada array
            
        }
        System.out.println("");
        System.out.println("Data Sebelumnya : ");//menampilkan pesan data dari sebelumnya
        
        for (int n : queue) {
            System.out.print(n+" ");
        }
    }
    
    //untuk mengembalikan nilai dari size
    public int getSize(){
        return size; 
    }
    
    //mengidentifikasi jika queue belum full atau penuh
    public boolean isEmpty(){
        return getSize()==0;
    } 
    
     //mengidentifikasi jika queue sudah full
    public boolean isFull(){
        return getSize()==5;
    } 
    
}
