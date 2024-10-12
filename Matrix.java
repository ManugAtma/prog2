public class Matrix {

    static void printMatrix (float[][]m){

        for (float[] zeile : m) {
            System.out.print("( ");

            for (float value: zeile){
                System.out.print(value + " ");
            }

            System.out.print(")" + '\n');
        }
    }
    
}
