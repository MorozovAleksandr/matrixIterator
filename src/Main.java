import java.io.FileNotFoundException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        MatrixCollection matrixCollection = new MatrixCollection();

        matrixCollection.add(1, 0, 0);
        matrixCollection.add(1, 1, 1);
        matrixCollection.add(1, 2, 2);

        for (int i : matrixCollection) {
            System.out.println(i);
        }
    }
}
