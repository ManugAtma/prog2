public class Punkt {
    private float x;
    private float y;

    public Punkt(float u, float v) {
        x = u;
        y = v;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void verschiebe(float vx, float vy) {
        x = vx;
        y = vy;
    }

    @Override
    public String toString() {
        return "Koordinaten: (" + x + ", " + y + ")";
    }
}
