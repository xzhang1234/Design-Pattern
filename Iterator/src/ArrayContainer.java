/**
 * Created by xiaoyun on 6/2/17.
 */
public class ArrayContainer implements Container {
    private int[] array = {1, 2, 3, 4};

    @Override
    public Iterator iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator {
        private int pos;

        @Override
        public boolean hasNext() {
            if (pos < array.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return array[pos++];
            }
            return null;
        }

    }

}
