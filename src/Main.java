import uaslp.objetos.list.arraylist.ArrayList;
import uaslp.objetos.list.arraylist.ArrayListIterator;
import uaslp.objetos.list.linkedlist.LinkedList;
import uaslp.objetos.list.linkedlist.LinkedListIterator;

public class Main {

    /*static int dato;
    public void setDato(int dato){
        Main.dato=dato;
        System.out.println(dato);
    }

    public int getDato(){
        return dato;
    }*/

    public static void main(String[] args) {
        /*Main main1 = new Main();
        Main main2 = new Main();

        main1.setDato(10);
        main2.setDato(20);

        System.out.println(main1.getDato());
        System.out.println(main2.getDato());*/

        LinkedList team1 = new LinkedList();
        LinkedList team2 = new LinkedList();
        LinkedList team3 = new LinkedList();

        System.out.println(LinkedList.getListsCount());

        team1.addAtTail("Daniel");
        team1.addAtTail("Rodrigo");
        team1.addAtTail("Javier");

        team2.addAtFront("Gerardo");
        team2.addAtFront("Miguel");
        team2.addAtFront("Sango");

        team3.addAtFront("Huizar");

        LinkedListIterator iterator;

        iterator = team1.getIterator();

        while(iterator.hasNext()) {
            String name=iterator.next();
            System.out.println(name);
        }

        iterator = team2.getIterator();

        while(iterator.hasNext()) {
            String name=iterator.next();
            System.out.println(name);
        }

        team1.remove(0);
        team1.addAtFront("Alan");
        System.out.println("Team 1 tiene: " + team1.getSize() + " integrantes");

        iterator = team1.getIterator();

        while(iterator.hasNext()) {
            String name=iterator.next();
            System.out.println(name);
        }

        team2.remove(2);
        team2.addAtFront("David");
        System.out.println("Team 2 tiene: " + team2.getSize() + " integrantes");

        iterator = team2.getIterator();

        while(iterator.hasNext()) {
            String name=iterator.next();
            System.out.println(name);
        }

        team3.remove(0);
        team3.remove(0); //El elemento no existe pero el programa no debe cerrarse por algún error

        team3.addAtTail("Humberto");
        team3.addAtFront("Octa");

        System.out.println("Team 3 tiene: " + team3.getSize() + " integrantes");

        iterator = team3.getIterator();

        while(iterator.hasNext()) {
            String name=iterator.next();
            System.out.println(name);
        }

        if(team1.getAt(1).equals("Rodrigo")){
            team1.setAt(1, "Luigi");
        }

        System.out.println("Team 1 tiene: " + team1.getSize() + " integrantes");

        iterator = team1.getIterator();

        while(iterator.hasNext()) {
            String name=iterator.next();
            System.out.println(name);
        }
    }

    /*public static void mainLinkedList(String[] args) {
        LinkedList team1 = new LinkedList();
        LinkedList team2 = new LinkedList();
        LinkedList team3 = new LinkedList();

        team1.addAtTail("Daniel");
        team1.addAtTail("Rodrigo");
        team1.addAtTail("Javier");

        team2.addAtFront("Gerardo");
        team2.addAtFront("Miguel");
        team2.addAtFront("Sango");

        team3.addAtFront("Huizar");

        LinkedListIterator iterator;

        iterator = team1.getIterator();

        while(iterator.hasNext()) {
            String name=iterator.next();
            System.out.println(name);
        }

        iterator = team2.getIterator();

        while(iterator.hasNext()) {
            String name=iterator.next();
            System.out.println(name);
        }

        team1.remove(0);
        team1.addAtFront("Alan");
        System.out.println("Team 1 tiene: " + team1.getSize() + " integrantes");

        iterator = team1.getIterator();

        while(iterator.hasNext()) {
            String name=iterator.next();
            System.out.println(name);
        }

        team2.remove(2);
        team2.addAtFront("David");
        System.out.println("Team 2 tiene: " + team2.getSize() + " integrantes");

        iterator = team2.getIterator();

        while(iterator.hasNext()) {
            String name=iterator.next();
            System.out.println(name);
        }

        team3.remove(0);
        team3.remove(0); //El elemento no existe pero el programa no debe cerrarse por algún error

        team3.addAtTail("Humberto");
        team3.addAtFront("Octa");

        System.out.println("Team 3 tiene: " + team3.getSize() + " integrantes");

        iterator = team3.getIterator();

        while(iterator.hasNext()) {
            String name=iterator.next();
            System.out.println(name);
        }

        if(team1.getAt(1).equals("Rodrigo")){
            team1.setAt(1, "Luigi");
        }

        System.out.println("Team 1 tiene: " + team1.getSize() + " integrantes");

        iterator = team1.getIterator();

        while(iterator.hasNext()) {
            String name=iterator.next();
            System.out.println(name);
        }
    }*/
}

