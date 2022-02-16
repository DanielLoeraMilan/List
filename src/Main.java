import uaslp.objetos.list.linkedlist.LinkedList;
import uaslp.objetos.list.linkedlist.LinkedListIterator;

public class Main {

    public static void main(String[] args) {
        LinkedList team1 = new LinkedList();
        LinkedList team2 = new LinkedList();

        team1.addAtTail("Daniel");
        team1.addAtTail("Rodrigo");
        team1.addAtTail("Javier");

        team2.addAtFront("Gerardo");
        team2.addAtFront("Miguel");
        team2.addAtFront("Sango");

        LinkedListIterator iterator;

        iterator = team1.getIterator();

        while(iterator.hasNext()) {
            String name=iterator.next();
            System.out.println(name);
        }
    }
}

