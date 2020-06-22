import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack(){
        this.stack = new LinkedList<>();
    }
    public boolean isEmpty(){
        if (stack.size() == 0){
            return true;
        }else  {
            return false;
        }
    }
    public void push(T e){
        this.stack.addLast(e);
    }
    public T pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeLast();
    }
    public int size(){
        return this.stack.size();
    }


}
