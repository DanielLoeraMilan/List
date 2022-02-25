
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;

//Java Collections Framework

public class Main {

    //Generics

    public static void main(String[] args) {
        ArrayList<String> team1 = new ArrayList<>();
        ArrayList<String> team2 = new ArrayList<>();
        ArrayList<String> team3 = new ArrayList<>();

        //ArrayList<LinkedList<Integer>> team4 = new ArrayList<>();

        //Fuertemente tipado

        /*team1.add(3);

        team1.add(new LinkedList());

        team1.add(5.3);*/

        team1.add("Daniel");
        team1.add("Rodrigo");
        team1.add("Javier");

        team2.add(0,"Gerardo");
        team2.add(0,"Miguel");
        team2.add(0,"Sango");

        team3.add(0,"Huizar");

        Iterator<String> iterator;

        iterator = team1.iterator();

        while(iterator.hasNext()) {
            String name=(String) iterator.next();
            System.out.println(name);
        }

        iterator = team2.iterator();

        while(iterator.hasNext()) {
            String name=(String) iterator.next();
            System.out.println(name);
        }

        team1.remove(0);
        team1.add(0,"Alan");
        System.out.println("Team 1 tiene: " + team1.size() + " integrantes");

        iterator = team1.iterator();

        while(iterator.hasNext()) {
            String name=(String) iterator.next();
            System.out.println(name);
        }

        team2.remove(2);
        team2.add(0,"David");
        System.out.println("Team 2 tiene: " + team2.size() + " integrantes");

        iterator = team2.iterator();

        while(iterator.hasNext()) {
            String name=(String) iterator.next();
            System.out.println(name);
        }

        //team3.remove(0);  //Falla si tiene el doble remove
        team3.remove(0); //El elemento no existe pero el programa no debe cerrarse por algún error

        team3.add("Humberto");
        team3.add(0,"Octa");

        System.out.println("Team 3 tiene: " + team3.size() + " integrantes");

        iterator = team3.iterator();

        while(iterator.hasNext()) {
            String name=(String) iterator.next();
            System.out.println(name);
        }

        if(team1.get(1).equals("Rodrigo")){
            team1.set(1, "Luigi");
        }

        System.out.println("Team 1 tiene: " + team1.size() + " integrantes");

        iterator = team1.iterator();

        while(iterator.hasNext()) {
            String name=(String) iterator.next();
            System.out.println(name);
        }
    }

    /*public static void main1(String[] args) {


        LinkedList team1 = new LinkedList();
        LinkedList team2 = new LinkedList();
        LinkedList team3 = new LinkedList();

        System.out.println(LinkedList.getListsCount());

        //LinkedList.getName();
        ArrayList.getName();

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

