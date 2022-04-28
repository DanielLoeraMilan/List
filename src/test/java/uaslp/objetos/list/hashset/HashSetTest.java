package uaslp.objetos.list.hashset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.list.HashSet.HashSet;
import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotSuchElementException;
import uaslp.objetos.list.linkedlist.LinkedList;

public class HashSetTest {


    @Test
    public void givenANewSet_whenGetSize_thenResultIsZero() {
        //Given
        HashSet<String> set = new HashSet<>();

        //When
        int sizeOfSet = set.size();

        //Then
        Assertions.assertEquals(0,sizeOfSet,"Size of set after creation must be 0");
    }

    @Test
    public void givenANewSet_whenAddAtFrontAnElement_thenSizeIsOne() throws NotNullValuesAllowedException {
        //Given
        HashSet<String> set = new HashSet<>();

        //When
        set.add("Hola");

        //Then
        int size = set.size();

        Assertions.assertEquals(1, size);
        Assertions.assertTrue(set.contains("Hola"));
    }

    @Test
    public void givenANewSetWithOneElement_whenAddAtFrontAnElement_thenSizeIsTwo() throws NotNullValuesAllowedException {
        //Given
        HashSet<String> set = new HashSet<>();

        set.add("Hola");

        //When
        set.add("Mundo");

        //Then
        int size = set.size();

        Assertions.assertEquals(2, size);
        Assertions.assertTrue(set.contains("Hola"));
        Assertions.assertTrue(set.contains("Mundo"));
    }

    @Test
    public void givenANewSetWithOneElement_whenRemove_thenSizeIsZero() throws NotNullValuesAllowedException {
        //Given
        HashSet<String> set = new HashSet<>();

        set.add("Hola");

        //When
        set.remove("Hola");

        //Then
        int size = set.size();

        Assertions.assertEquals(0, size);
    }

    @Test
    public void givenANewSetWithTwoElements_whenRemoveFirstElement_thenSizeIsOne() throws NotNullValuesAllowedException {
        //Given
        HashSet<String> set = new HashSet<>();

        set.add("Hola");
        set.add("Mundo");

        //When
        set.remove("Hola");

        //Then
        int size = set.size();

        Assertions.assertEquals(1, size);
        Assertions.assertTrue(set.contains("Mundo"));
    }

    @Test
    public void givenANewSetWithThreeElements_whenGetIterator_thenIteratorWorksOverAllThreeElements() throws NotNullValuesAllowedException {
        //Given
        HashSet<String> set = new HashSet<>();

        set.add("Adios");
        set.add("Mundo");
        set.add("Cruel");

        //When
        Iterator<String> iterator = set.iterator();

        //Then
        int size = set.size();
        HashSet<String> iterations = new HashSet<>();

        Assertions.assertEquals(3, size);
        Assertions.assertNotNull(iterator);

        Assertions.assertTrue(iterator.hasNext());
        iterations.add(iterator.next());

        Assertions.assertTrue(iterator.hasNext());
        iterations.add(iterator.next());

        Assertions.assertTrue(iterator.hasNext());
        iterations.add(iterator.next());

        Assertions.assertFalse(iterator.hasNext());

        Assertions.assertTrue(set.contains("Adios"));
        Assertions.assertTrue(set.contains("Mundo"));
        Assertions.assertTrue(set.contains("Cruel"));

        Assertions.assertThrows(NotSuchElementException.class, iterator::next);
    }

    @Test
    public void givenANewSetWith300Elements_whenGetIterator_thenReorganize() throws NotNullValuesAllowedException {
        //Given
        HashSet<String> set = new HashSet<>();

        for(int i=0; i<300; i++){
            set.add("I" + i);
        }

        //When
        Iterator<String> iterator = set.iterator();

        //Then
        int size = set.size();
        HashSet<String> iterations = new HashSet<>();

        Assertions.assertEquals(300, size);
        Assertions.assertNotNull(iterator);

        while (iterator.hasNext()){
            iterations.add(iterator.next());
        }

        for (int i=0; i<300; i++){
            Assertions.assertTrue(set.contains("I" + i));
        }
    }

    @Test
    public void givenANewHashSet_whenContainsIsNULL_thenReturnFalse() throws NotNullValuesAllowedException {
        //Given:
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hola");

        //When:

        //Then:
        int size = hashSet.size();

        Assertions.assertEquals(1, size);
        Assertions.assertFalse(hashSet.contains("Mundo"));
    }
}
