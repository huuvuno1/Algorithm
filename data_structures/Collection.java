package data_structures;

public interface Collection<E> {
    void forEach(Consumer<E> action);
    boolean isEmpty();
    int size();
    void remove(E element);
    void removeAll(E element);
    boolean contains(E element);
    void clear();
}
