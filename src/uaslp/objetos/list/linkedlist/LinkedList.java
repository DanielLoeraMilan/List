package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;

public class LinkedList <T> implements List <T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static int ListCount;

    public LinkedList(){
        ListCount++;
    }

    /*public static String getName(){
        return "LinkedList";
    }*/

    public static int getListsCount(){
        return ListCount;
    }

    public void addAtTail (T data){
        Node<T> node = new Node<>(data);

        if(size == 0){
            head=node;
        }else{
            tail.next=node;
            node.previous=tail;
        }

        tail = node;
        size++;
    }

    public void addAtFront (T data){
        Node<T> node = new Node<>(data);

        if(size == 0){
            tail=node;
        }else {
            head.previous=node;
        }
        node.next=head;
        head=node;

        size++;
    }

    public void remove (int index){
        Node<T> node = findNode(index);

        if(node == null){
            return;
        }

        if(size ==1){
            head = null;
            tail = null;
        } else if(node == head){
            head = node.next;
            if(head != null){
                head.previous = null;
            }
        } else if(node == tail){
            tail = node.previous;
            if(tail != null){
                tail.next = null;
            }
        } else{
            node.previous.next = node.next;
            node.next.previous = node.previous;
        }
        size--;
    }

    public void removeAll (){
        head = null;
        tail=null;
        size=0;

        //System.gc();
    }

    public void setAt (int index, T data){
        Node<T> node = findNode(index);
        //int currentIndex = 0;

        if(node != null){
            node.data=data;
        }
    }

    public T getAt (int index){
        Node<T> node = findNode(index);

        return node == null ? null : node.data;
    }

    /*public void removeAllWithValues(String data){

    }*/

    public int getSize() {
        return size;
    }

    public Iterator<T> getIterator(){
        return new LinkedListIterator<>(head);
    }

    private Node<T> findNode(int index){
        if(index < 0 || index >= size){
            return null;
        }

        Node<T> node = head;
        int currentIndex = 0;

        while(currentIndex != index){
            currentIndex++;
            node = node.next;
        }

        return node;
    }
}
