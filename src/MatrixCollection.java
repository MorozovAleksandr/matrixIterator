import java.util.Iterator;

public class MatrixCollection implements Iterable<Integer> {
    private final int[][] matrix = new int[3][3];

    public void add(int value, int row, int col) {
        this.matrix[row][col] = value;
    }

    public int get(int row, int col) {
        return this.matrix[row][col];
    }

    public void remove(int row, int col) {
        this.matrix[row][col] = 0;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MatrixIterator();
    }

    private class MatrixIterator implements Iterator<Integer> {
        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < matrix.length * matrix[0].length;
        }

        @Override
        public Integer next() {
            int element = matrix[cursor / matrix[0].length][cursor % matrix[0].length];
            cursor++;

            return element;
        }
    }
}
