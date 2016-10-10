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
public class StackByLL {
    class ListElement{
        Object[] elements;
        int cap;
        int arrIndex;
        ListElement prevEl;
        
        ListElement() {
            System.out.println("constructor of listEl");
            elements = new Object[100];
            cap = 5;
            System.out.println("cap = "+cap);
            arrIndex = -1;
            prevEl = tail;          
            System.out.println("prevEl -> "+prevEl);
        }
        
        ListElement(int cap){
            System.out.println("constructor of listEl");
            System.out.println("cap = "+cap);
            elements = new Object[cap];
            this.cap = cap;
            arrIndex = -1;
            prevEl = tail;
            System.out.println("prevEl -> "+prevEl);
        }
    }
    ListElement listElement;
    int tos;
    ListElement tail;
    
    StackByLL(){
        System.out.println("constructor of stack");
        tail = null;
        System.out.println("tail = null -> "+tail);
        listElement = new ListElement();
        System.out.println("listElement: -> "+listElement.toString());
        tos = 0;
        System.out.println("tos = "+tos);
        tail = listElement;
        System.out.println("tail: -> "+tail.toString());
    }
    int getSize(){
        System.out.println("Size = "+(tos));
        //System.out.println("tos = "+tos);
        return tos;    
    }
    public void push(Object item){
        if (listElement.arrIndex+1 < tail.cap){
            listElement.elements[++listElement.arrIndex] = item;
            tos++;
        }
        else {
            System.out.println("stackElement is full");
            listElement = new ListElement(tail.cap*2);
            tail = listElement;
            System.out.println("new listElement cap = "+listElement.cap);
            listElement.elements[++listElement.arrIndex] = item;
            tos++;
        }
    }
    public Object pop(){
        if (tos==0) {
            System.out.println("Stack is empty");
            return null;
        }
        
        Object item;
        if (tos==1) {
            item = listElement.elements[listElement.arrIndex];
            listElement.elements[listElement.arrIndex]=null;
            listElement.arrIndex--;
            tos--;
            return item;         
        }
                
        if (listElement.arrIndex != 0) {
            item = listElement.elements[listElement.arrIndex];
            listElement.elements[listElement.arrIndex]=null;
            listElement.arrIndex--;
            tos--;
            return item;
        }
        else {
            item = listElement.elements[listElement.arrIndex];
            tail = listElement.prevEl;
            listElement = tail;
            tos--;
            return item;
        }
    }
      
}
