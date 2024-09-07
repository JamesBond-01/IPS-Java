package punto;

public class AABB {
    Punto p0;
    Punto p1;

    public AABB() {
        this.p0 = new Punto(0,0);
        this.p1 = new Punto(0,0);
    }

    public void setP0(Punto p0) {
        this.p0 = p0;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public boolean isCollision (AABB object) {
        if(object.p1.getX() < this.p0.getX()) {
            return false;
        } else if(object.p1.getY() > this.p0.getY()) {
            return false;
        } else if(object.p0.getX() > this.p1.getX()) {
            return false;
        } else return !(object.p0.getY() < this.p1.getY());
    }
}
