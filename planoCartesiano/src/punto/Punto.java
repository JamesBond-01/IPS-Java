package punto;

public class Punto {
    private double x;
    private double y;

    public Punto() {
        this(0,0);
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Punto p) {
        return Math.sqrt(Math.pow ((this.x - p.x), 2) + Math.pow ((this.y - p.y), 2));
    }
}
