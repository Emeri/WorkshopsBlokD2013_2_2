package workshop6._.SimpleArrayListImplementation;

import java.util.Iterator;

public class MyArrayList<E> implements Iterable<E> {


    private static final int DEFAULT_CAPACITY = 4;

    private int size = 0;

    private Object[] objecten;

    public MyArrayList(){
        objecten = new Object[DEFAULT_CAPACITY];
    }


    public E get(int i){
        return (E)objecten[size];
    }

    public void add(E e){
        if(size == objecten.length){
            reallocate();
        }
        objecten[size] = e;
        size++;

    }

   public int getSize(){
        return size;
    }


    @Override
    public Iterator<E> iterator() {
        Iterator<E> it = new Iterator<E>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size && objecten[currentIndex] != null;
            }

            @Override
            public E next() {
                return (E)objecten[currentIndex++];
            }

            @Override
            public void remove() {

                E elementToShift = (E)objecten[size-1];
                for(int i = size - 1; i != currentIndex - 1; i--){
                    E elementForNextShift = (E)objecten[i - 1];
                    objecten[i - 1] = elementToShift;
                    elementToShift = elementForNextShift;
                }

                size--;
            }
        };
        return it;
    }


   private void reallocate(){
        Object[] reallocated = new Object[size * 2];

        for(int i=0; i< objecten.length; i++){
            reallocated[i] = objecten[i];
        }
        objecten = reallocated;
    }


}
