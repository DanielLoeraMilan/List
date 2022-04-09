package uaslp.objetos.list.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotValidIndexException;
import uaslp.objetos.list.arraylist.ArrayList;
import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.linkedlist.LinkedList;

public class ArrayListTest {


    @Test
    public void givenANewArray_whenGetSize_thenResultIsZero(){
        //  Given:
        ArrayList<String> array = new ArrayList<>();

        //  When:
        int sizeOfList = array.getSize();

        //  Then:
        Assertions.assertEquals(0, sizeOfList, "Size of list after creation must be zero");
    }

    @Test
    public void givenANewArray_whenGetAt_thenExceptionIsThrown(){
        //  Given:
        ArrayList<String> array = new ArrayList<>();
    }

    @Test
    public void givenANewArray_whenAddAtFrontAnElement_thenSizeIsOne() throws NotNullValuesAllowedException{
        //  Given:
        ArrayList<String> array = new ArrayList<>();


        //  When:
        array.addAtFront("Hola");


        // Then:
        int size = array.getSize();
        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Hola", array.getAt(0));
    }

    @Test
    public void givenANewArray_whenAddAtFrontAnElement_thenSizeIsTwo() throws NotNullValuesAllowedException {
        //  Given:
        ArrayList<String> array = new ArrayList<>();

        array.addAtFront("Hola");

        //  When:
        array.addAtFront("Mundo");


        // Then:
        int size = array.getSize();
        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Mundo", array.getAt(0));
        Assertions.assertEquals("Hola", array.getAt(1));
    }

    @Test
    public void givenANewArray_whenAddAtTailTwoElements_thenSizeIsTwo() throws NotNullValuesAllowedException, NotValidIndexException {
        //  Given:
        ArrayList<String> array = new ArrayList<>(1);
        array.addAtTail("Hola");

        //  When:
        array.addAtTail("Mundo");

        // Then:
        Assertions.assertEquals(2, array.getSize());
    }

    @Test
    public void givenANewArray_whenAddAtTailAnElement_thenSizeIsOne() throws NotNullValuesAllowedException{
        //  Given:
        ArrayList<String> array = new ArrayList<>();


        //  When:
        array.addAtTail("Hola");


        // Then:
        int size = array.getSize();
        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Hola", array.getAt(0));
    }

    @Test
    public void givenANewArray_whenAddAtTailAnElement_thenSizeIsTwo() throws NotNullValuesAllowedException {
        //  Given:
        ArrayList<String> array = new ArrayList<>();

        array.addAtTail("Hola");

        //  When:
        array.addAtTail("Mundo");


        // Then:
        int size = array.getSize();
        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Hola", array.getAt(0));
        Assertions.assertEquals("Mundo", array.getAt(1));
    }

    @Test
    public void givenAnArrayWithOneElement_whenRemove_thenSizeIsZero() throws NotNullValuesAllowedException {
        //  Given:
        ArrayList<String> array = new ArrayList<>();

        array.addAtFront("Hola");

        //  When:
        array.remove(0);

        //  Then:
        int size = array.getSize();

        Assertions.assertEquals(0, size);
    }

    @Test
    public void givenAnArrayWithTwoElements_whenRemoveIndex0_thenSizeIsOne() throws NotNullValuesAllowedException {
        //  Given:
        ArrayList<String> array = new ArrayList<>();

        array.addAtFront("Hola");
        array.addAtTail("Mundo");
        //  When:
        array.remove(0);

        //  Then:
        int size = array.getSize();

        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Mundo", array.getAt(0));
    }

    @Test
    public void givenAnArrayWithTwoElements_whenRemoveIndex1_thenSizeIsOne() throws NotNullValuesAllowedException {
        //  Given:
        ArrayList<String> array = new ArrayList<>();

        array.addAtFront("Hola");
        array.addAtTail("Mundo");
        //  When:
        array.remove(1);

        //  Then:
        int size = array.getSize();

        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Hola", array.getAt(0));
    }

    @Test
    public void givenAnArrayWithThreeElements_whenRemoveElementAtTail_thenSizeIsTwo() throws NotValidIndexException, NotNullValuesAllowedException {
        //  Given:
        ArrayList<String> array = new ArrayList<>();

        array.addAtFront("Adios");
        array.addAtTail("Mundo");
        array.addAtTail("Cruel");

        //  When:
        array.remove(2);

        //  Then:
        int size = array.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Adios", array.getAt(0));
        Assertions.assertEquals("Mundo", array.getAt(1));
    }

    @Test
    public void givenAnArrayWithThreeElements_whenRemoveIndex1_thenSizeIsTwo() throws NotValidIndexException, NotNullValuesAllowedException {
        //  Given:
        ArrayList<String> array = new ArrayList<>();

        array.addAtTail("Mundo");
        array.addAtTail("Cruel");
        array.addAtFront("Adios");
        //  When:
        array.remove(1);

        //  Then:
        int size = array.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Adios", array.getAt(0));
        Assertions.assertEquals("Cruel", array.getAt(1));
    }

    @Test
    public void givenAnArrayWithThreeElements_whenRemoveAll_thenSizeIsZero() throws NotValidIndexException, NotNullValuesAllowedException {
        //  Given:
        ArrayList<String> array = new ArrayList<>();

        array.addAtTail("Mundo");
        array.addAtTail("Cruel");
        array.addAtFront("Adios");
        //  When:
        array.removeAll();

        //  Then:
        int size = array.getSize();

        Assertions.assertEquals(0, size);
    }

    @Test
    public void givenAnArrayWithTwoElements_whenSetAt_thenElementIsModified() throws NotValidIndexException, NotNullValuesAllowedException {
        //  Given:
        ArrayList<String> array = new ArrayList<>();

        array.addAtTail("Mundo");
        array.addAtFront("Adios");
        //  When:
        array.setAt(0, "Hola");

        //  Then:
        int size = array.getSize();

        Assertions.assertEquals(2, size);

        Assertions.assertEquals("Hola", array.getAt(0));
        Assertions.assertEquals("Mundo", array.getAt(1));
    }

    @Test
    public void givenAnArrayWithTwoElements_whenSetAtNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        //  Given:
        ArrayList<String> array = new ArrayList<>();

        array.addAtFront("Hola");
        array.addAtTail("Mundo");

        //  When:
        //  Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class, () -> array.setAt(0, null));
    }

    @Test
    public void givenAnArrayWithTwoElements_whenAddAtFrontNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        //  Given:
        ArrayList<String> array = new ArrayList<>();

        array.addAtFront("Hola");
        array.addAtTail("Mundo");

        //  When:
        //  Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class, () -> array.addAtFront(null));

    }

    @Test
    public void givenAnArrayWithTwoElements_whenAddAtTailNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        //  Given:
        ArrayList<String> array = new ArrayList<>();

        array.addAtFront("Hola");
        array.addAtTail("Mundo");

        //  When:
        //  Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class, () -> array.addAtTail(null));

    }

    @Test
    public void givenAnArrayWithThreeElements_whenSetIterator_thenIteratorWorksOverAllThreeElements() throws NotNullValuesAllowedException {
        //  Given:
        ArrayList<String> array = new ArrayList<>();

        array.addAtFront("Adios");
        array.addAtTail("Mundo");
        array.addAtTail("Cruel");

        //  When:
        Iterator<String> iterator = array.getIterator();

        //  Then:
        int size = array.getSize();

        Assertions.assertEquals(3, size);
        Assertions.assertNotNull(iterator);
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Adios", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Mundo", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Cruel", iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }

}
