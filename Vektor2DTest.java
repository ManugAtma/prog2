public class Vektor2DTest {

    public static void main(String[] args) {

        Punkt punkt = new Punkt(5.1f, 4.6f);
        punkt.verschiebe(3f, 3f);
        System.out.println(punkt);

        Vektor2D vektor = new Vektor2D(3f, 5f, punkt);
        System.out.println(vektor);

        System.out.println(vektor.betrag());
        System.out.println(Vektor2D.betragStatic(vektor));

        vektor.multipliziereMitSkalar(2f);
        System.out.println(vektor);

        Vektor2D.multipliziereMitSkalarStatic(vektor, 2f);
        System.out.println(vektor);

        Vektor2D[] arr = { new Vektor2D(2f, 3f, punkt), new Vektor2D(5f, 7f, punkt)};
        Vektor2D.printVektorArray(arr);

        float[][] matrix = { { 1, 2 }, { 11, 22 }, { 42, -3 } };
        Matrix.printMatrix(matrix);

        byte[] byteArr = { 1, -2, -2, -2, -2, 1, 1, 1, 50, 6, 6, 6, 6, 3, 3, 3 };
        byte[] newByteArr = Arrayelement.haeufigstesElem(byteArr);
        for (byte b : newByteArr) {
            System.out.println(b);
        }

    }
}
