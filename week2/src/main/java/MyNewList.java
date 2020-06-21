
import java.util.Arrays;

public class MyNewList<E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyNewList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyNewList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapacity() {
        int newSize = elements.length + DEFAULT_CAPACITY;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bound.");
        } else {
            if (this.size == this.elements.length) {
                ensureCapacity();
            }
            for (int i = this.size - 1; i >= index; i--) {
                this.elements[i + 1] = this.elements[i];
            }
            this.elements[index] = element;
            this.size++;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bound.");
        } else {
            E temp = (E) this.elements[index];
            for (int i = index; i < size - 1; i++) {
                this.elements[i] = this.elements[i + 1];
            }
            this.size--;
            return temp;
        }
    }

    public int size() {
        return this.size;
    }

    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(this.elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(this.elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E element) {
        if (this.size == elements.length) {
            this.ensureCapacity();
        }
        elements[size++] = element;
        return true;
    }

//    public E clone() {
//
//    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bound.");
        } else {
            return (E) this.elements[index];
        }
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}
