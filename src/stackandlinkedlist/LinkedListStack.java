/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackandlinkedlist;

/**
 *
 * @author Sifiso
 */
public class LinkedListStack {
    class Node{
        int data;
        Node next;
        
        
        
        public Node(int data){
            this.data=data;
            this.next=null;
         }
    }
    
    private Node top;
    
    public LinkedListStack(){
        this.top=null;
    }
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next=top;
        top=newNode;
        System.out.println(data + " pushed onto stack.");
    }
    
   public int pop(){
       if(top==null){
          System.out.println("Stack underflow! No elements to pop.");
            return -1; 
       }
       
       int poppeddata=top.data;
       top=top.next;
       return poppeddata;
   }
   public int peek(){
       if(top==null){
           System.out.println("Stack is empty.");
            return -1; 
       }
       
       return top.data;
   }
   
   
    
}
