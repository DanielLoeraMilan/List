package uaslp.objetos.list;

import uaslp.objetos.list.exception.NotNullValuesAllowedException;

public interface Set<T> {

    void add(T element) throws NotNullValuesAllowedException;
    void remove(T element);
    boolean contains(T element);
    Iterator<T> iterator();
    int size();
}
