package uaslp.objetos.list.linkedlist;

class Node <T> {
    T data;
    Node <T> next;
    Node <T> previous;

    Node (T data){
        this.data=data;
    }

    /*public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }*/
}
