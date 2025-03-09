/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackandlinkedlist;

/**
 *
 * @author Sifiso
 */
public class StackAndLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedListStack stack = new LinkedListStack();
        stack.push(12);
        stack.push(14);
        stack.push(40);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        
    }
    
}
