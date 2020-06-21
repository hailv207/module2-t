import java.util.Arrays;

public class MyMyList<E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyMyList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyMyList(int capacity) {
        this.elements = new Object[capacity];
    }

    public void add(int index, E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = e;
        size++;
    }

    public void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
}
