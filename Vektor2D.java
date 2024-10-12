public class Vektor2D {

    private float delX, delY;
    private Punkt anker;

    public Vektor2D(float delX, float delY,
            Punkt anker) {
        this.delX = delX;
        this.delY = delY;
        this.anker = anker;
    }

    public void add(Vektor2D vektor) {
        delX = delX + vektor.delX;
        delY = delY + vektor.delY;
    }

    public float betrag() {
        return ((float) Math.sqrt(delX * delX + delY * delY));
    }

    public static float betragStatic(Vektor2D v) {
        return ((float) Math.sqrt(v.delX * v.delX + v.delY * v.delY));
    }

    public void verschiebeAnker(Vektor2D schieb) {
        anker.verschiebe(schieb.delX, schieb.delY);
    }

    @Override
    public String toString() {
        return "(" + delX + ", " + delY + "), anker: (" + anker.getX() + ", " + anker.getY() + ")";
    }

    void multipliziereMitSkalar(float f) {
        delX = delX * f;
        delY = delY * f;
    }

    static void multipliziereMitSkalarStatic(Vektor2D v, float f){
        v.delX = v.delX * f;
        v.delY = v.delY * f;
    }

    static void printVektorArray(Vektor2D[] arr){
        System.out.println("Array items:");
        for (Vektor2D vektor : arr) {
        System.out.println(vektor);
        }

    }
}